package task15x3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tester {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setBounds(500, 200, 400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        JMenuBar menuBar = new JMenuBar();

        JMenu file = new JMenu("Файл");
        JMenuItem save = new JMenuItem("Сохранить");
        JMenuItem leave = new JMenuItem("Выйти");
        file.add(save);
        file.add(leave);

        JMenu edit = new JMenu("Правка");
        JMenuItem copy = new JMenuItem("Копировать");
        JMenuItem cut = new JMenuItem("Вырезать");
        JMenuItem paste = new JMenuItem("Вставить");
        edit.add(copy);
        edit.add(cut);
        edit.add(paste);

        JMenu help = new JMenu("Справка");

        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);

        JPanel panel = new JPanel(new GridLayout());
        JButton btn1 = new JButton("Кнопка 1");
        JButton btn2 = new JButton("Кнопка 2");
        panel.add(btn1);
        panel.add(btn2);
        frame.add(panel, BorderLayout.NORTH);

        JTextArea textArea = new JTextArea("Здесь вы можете напечатать текст.");
        frame.add(textArea);

        frame.setJMenuBar(menuBar);
        frame.setVisible(true);
    }
}
