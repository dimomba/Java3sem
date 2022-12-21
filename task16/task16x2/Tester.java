package task16x2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Tester {
    JFrame frame = new JFrame();
    JMenuItem blue = new JMenuItem("Синий");
    JMenuItem red = new JMenuItem("Красный");
    JMenuItem black = new JMenuItem("Черный");
    JMenuItem tnr = new JMenuItem("Times New Roman");
    JMenuItem msss = new JMenuItem("MS Sans Serif");
    JMenuItem cn = new JMenuItem("Courier New");
    JTextArea textArea = new JTextArea("texttexttexttexttexttexttexttexttext");
    void display() {
        frame.setBounds(500, 200, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu color = new JMenu("Цвет");

        color.add(blue);
        color.add(red);
        color.add(black);

        JMenu style = new JMenu("Стиль");

        style.add(tnr);
        style.add(msss);
        style.add(cn);


        ButtonAction ba = new ButtonAction();
        blue.addActionListener(ba);
        red.addActionListener(ba);
        black.addActionListener(ba);
        tnr.addActionListener(ba);
        msss.addActionListener(ba);
        cn.addActionListener(ba);

        menuBar.add(color);
        menuBar.add(style);

        textArea.setFont(new Font("Verdana", Font.PLAIN, 16));
        textArea.setEditable(false);
        frame.add(textArea);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }

    class ButtonAction implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Object obj = e.getSource();
            if (obj == blue)
                textArea.setForeground(Color.BLUE);
            else if (obj == red)
                textArea.setForeground(Color.RED);
            else if (obj == black)
                textArea.setForeground(Color.BLACK);
            else if (obj == tnr)
                textArea.setFont(new Font("Times New Roman", Font.PLAIN, 16));
            else if (obj == msss)
                textArea.setFont(new Font("MS Sans Serif", Font.PLAIN, 16));
            else if (obj == cn)
                textArea.setFont(new Font("Courier New", Font.PLAIN, 16));
        }
    }

    public static void main(String[] args) {
        Tester tester = new Tester();
        tester.display();
    }
}
