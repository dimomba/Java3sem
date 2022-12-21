package task15x2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tester
{
    public static void main(String[] args) {
        String[] optionsToChoose = {"---Choose the country---", "Australia", "China", "England", "Russia"};
        String[] info = {"", "The area of Australia is 7.692.024 km^2", "The area of China is 9.590.000 km^2",
                        "The area of England is 133.396 km^2", "The area of Russia is 17.098.246 km^2"};
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComboBox<String> jComboBox = new JComboBox<>(optionsToChoose);
        jComboBox.setBounds(110, 30, 180, 30);

        JLabel jLabel = new JLabel();
        jLabel.setBounds(110, 100, 400, 20);

        frame.add(jComboBox);
        frame.add(jLabel);

        frame.setLayout(null);
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setLocation(500, 200);

        jComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel.setText(info[jComboBox.getSelectedIndex()]);
            }
        });
    }
}