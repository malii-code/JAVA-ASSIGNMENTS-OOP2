//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JavaQuiz extends JFrame implements ActionListener {
    JLabel lblQuestion, lblTimer, lblScore;
    JRadioButton[] options = new JRadioButton[4];
    ButtonGroup group;
    JButton btnNext;
    int currentQ = 0, score = 0, timeLeft = 60;
    Timer timer;

    String[][] questions = {
        {"What is Java?", "Language", "Coffee", "Both", "None", "2"},
        {"Is Java OOP?", "Yes", "No", "Maybe", "None", "0"}
        // Add more questions here...
    };

    public JavaQuiz() {
        setTitle("Java Quiz");
        setSize(400, 300);
        setLayout(new GridLayout(7, 1));

        lblQuestion = new JLabel();
        lblTimer = new JLabel("Time left: 60");
        lblScore = new JLabel("Score: 0");
        group = new ButtonGroup();

        add(lblTimer);
        add(lblQuestion);
        for(int i=0; i<4; i++) {
            options[i] = new JRadioButton();
            group.add(options[i]);
            add(options[i]);
        }
        btnNext = new JButton("Next Question");
        btnNext.addActionListener(this);
        add(btnNext);

        loadQuestion();
        
        // Swing Timer: fires every 1000ms (1 second)
        timer = new Timer(1000, e -> {
            timeLeft--;
            lblTimer.setText("Time left: " + timeLeft);
            if(timeLeft <= 0) btnNext.doClick();
        });
        timer.start();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    void loadQuestion() {
        if(currentQ < questions.length) {
            lblQuestion.setText(questions[currentQ][0]);
            for(int i=0; i<4; i++) options[i].setText(questions[currentQ][i+1]);
            timeLeft = 60;
        } else {
            timer.stop();
            JOptionPane.showMessageDialog(this, "Quiz Over! Final Score: " + score);
            System.exit(0);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Validation: check if answer is correct
        int correctIdx = Integer.parseInt(questions[currentQ][5]);
        if(options[correctIdx].isSelected()) score++;
        lblScore.setText("Score: " + score);
        currentQ++;
        loadQuestion();
    }

    public static void main(String[] args) { new JavaQuiz(); }
}
