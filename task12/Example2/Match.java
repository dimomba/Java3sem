package Example2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Match extends JFrame {
    private JPanel p;
    private JTextField textField1;
    private JLabel labelRes;
    private JButton button1;
    private JButton button2;
    private JLabel labelLast;
    private JLabel labelWin;

    public Match() {
        Button b = new Button();
        button1.setBackground(Color.RED);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.incMilan();
                labelRes.setText("Result: " + b.getGoalsMilan() + " X " + b.getGoalsReal());
                labelLast.setText("Last scorer: " + b.getLast());
                labelWin.setText("Winner: " + b.getWin());
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b.incReal();
                labelRes.setText("Result: " + b.getGoalsMilan() + " X " + b.getGoalsReal());
                labelLast.setText("Last scorer: " + b.getLast());
                labelWin.setText("Winner: " + b.getWin());
            }
        });
    }

    public static void main(String[] args) {
        Match frame = new Match();
        frame.setContentPane(frame.p);
        frame.setTitle("AC Milan VS Real Madrid");
        frame.setSize(450, 240);
        frame.setLocation(550, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
