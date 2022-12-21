package task16x1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.TimeUnit;

public class Tester {
    static int counter = 0;
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jButton = new JButton("Enter");
        jButton.setBounds(150, 100, 90, 20);

        JLabel jLabel = new JLabel("Введите число от 0 до 20: ");
        jLabel.setBounds(100, 20, 400, 40);

        frame.add(jLabel);
        frame.add(jButton);

        JTextField textArea = new JTextField();
        textArea.setBounds(150, 60, 100, 20);

        frame.add(textArea);
        frame.setLayout(null);
        frame.setBounds(500, 250, 500, 250);
        frame.setVisible(true);


        String answer = "16";

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                String s = textArea.getText();
                if (s.equals(answer)) {
                    jButton.setVisible(false);
                    jLabel.setText("Вы угадали!!!");
                    textArea.setEditable(false);
                }
                else if (counter < 3)
                    jLabel.setText("Количество оставшихся попыток: " + (3-counter));
                else if (counter >= 3 & counter < 6)
                {
                    int ansInt = Integer.parseInt(answer);
                    int tryingInt = Integer.parseInt(s);
                    if (ansInt < tryingInt)
                        jLabel.setText("Введенное число больше ответа. Количество попыток: " + (6-counter));
                    else
                        jLabel.setText("Введенное число меньше ответа. Количество попыток: " + (6-counter));
                }
                else {
                    jButton.setVisible(false);
                    jLabel.setText("Вам не удалось угадать. Правильный ответ: " + answer);
                    textArea.setEditable(false);
                }
            }
        });

    }
}