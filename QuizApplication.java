//MALII STEPHEN MUUNGAMI
//CT100/G/22156/24
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class QuizApplication extends JFrame implements ActionListener {

    private JLabel questionLabel, scoreLabel;
    private JRadioButton opt1,opt2,opt3,opt4;
    private ButtonGroup group;
    private JButton nextBtn;

    private JProgressBar timerBar;
    private Timer timer;

    private int time = 60;
    private int questionIndex = 0;
    private int score = 0;

    // Questions array
    private String[][] questions = {
            {"Java is a ___ language?","Programming","Cooking","Music","Sport","Programming"},
            {"Keyword to create object?","new","make","class","obj","new"},
            {"Java runs on?","JVM","CPU","RAM","OS","JVM"},
            {"Extension of Java file?","java","txt","doc","html","java"},
            {"GUI library?","Swing","SQL","HTML","CSS","Swing"}
    };

    public QuizApplication(){

        setTitle("Java Quiz");
        setSize(500,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        questionLabel = new JLabel();
        add(questionLabel,BorderLayout.NORTH);

        // Options
        opt1 = new JRadioButton();
        opt2 = new JRadioButton();
        opt3 = new JRadioButton();
        opt4 = new JRadioButton();

        group = new ButtonGroup();
        group.add(opt1); group.add(opt2);
        group.add(opt3); group.add(opt4);

        JPanel options = new JPanel(new GridLayout(4,1));
        options.add(opt1); options.add(opt2);
        options.add(opt3); options.add(opt4);

        add(options,BorderLayout.CENTER);

        // Bottom panel
        nextBtn = new JButton("Next");
        nextBtn.addActionListener(this);

        scoreLabel = new JLabel("Score: 0");

        timerBar = new JProgressBar(0,60);
        timerBar.setValue(60);

        JPanel bottom = new JPanel(new GridLayout(1,3));
        bottom.add(scoreLabel);
        bottom.add(timerBar);
        bottom.add(nextBtn);

        add(bottom,BorderLayout.SOUTH);

        loadQuestion();

        // Timer
        timer = new Timer(1000, e -> {
            time--;
            timerBar.setValue(time);

            if(time==0){
                nextQuestion();
            }
        });

        timer.start();
        setVisible(true);
    }

    // Load question
    private void loadQuestion(){

        if(questionIndex >= questions.length){

            timer.stop();

            int option = JOptionPane.showConfirmDialog(
                    this,
                    "Quiz Finished!\nScore: "+score+"\nRestart?",
                    "Result",
                    JOptionPane.YES_NO_OPTION
            );

            if(option == JOptionPane.YES_OPTION){
                questionIndex = 0;
                score = 0;
                loadQuestion();
                timer.start();
            }
            return;
        }

        questionLabel.setText(questions[questionIndex][0]);

        opt1.setText(questions[questionIndex][1]);
        opt2.setText(questions[questionIndex][2]);
        opt3.setText(questions[questionIndex][3]);
        opt4.setText(questions[questionIndex][4]);

        group.clearSelection();

        time = 60;
        timerBar.setValue(60);
    }

    // Move to next question
    private void nextQuestion(){

        String answer = questions[questionIndex][5];

        if(opt1.isSelected() && opt1.getText().equals(answer)) score++;
        if(opt2.isSelected() && opt2.getText().equals(answer)) score++;
        if(opt3.isSelected() && opt3.getText().equals(answer)) score++;
        if(opt4.isSelected() && opt4.getText().equals(answer)) score++;

        scoreLabel.setText("Score: "+score);

        questionIndex++;
        loadQuestion();
    }

    public void actionPerformed(ActionEvent e){
        nextQuestion();
    }

    public static void main(String[] args){
        new QuizApplication();
    }
}
