package task15x4;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class Tester extends JFrame implements ActionListener {
    String s0, s1, s2;
    static JFrame frame;
    static JTextField text;
    Tester() {s0 = s1 = s2 = "";}

    public static void main(String args[])
    {
        frame = new JFrame("Simple calculator");
        frame.setLayout(new BorderLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        Tester c = new Tester();

        text = new JTextField();
        text.setSize(300, 20);
        text.setEditable(false);

        JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, plusbtn, minusbtn, splitbtn, multiplybtn, pointbtn, equal;
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        equal = new JButton("=");
        plusbtn = new JButton("+");
        minusbtn = new JButton("-");
        splitbtn = new JButton("/");
        multiplybtn = new JButton("*");
        pointbtn = new JButton(".");

        JPanel p = new JPanel(new GridLayout(4,4));

        minusbtn.addActionListener(c);
        splitbtn.addActionListener(c);
        plusbtn.addActionListener(c);
        multiplybtn.addActionListener(c);
        b9.addActionListener(c);
        b8.addActionListener(c);
        b7.addActionListener(c);
        b6.addActionListener(c);
        b5.addActionListener(c);
        b4.addActionListener(c);
        b3.addActionListener(c);
        b2.addActionListener(c);
        b1.addActionListener(c);
        b0.addActionListener(c);
        pointbtn.addActionListener(c);
        equal.addActionListener(c);

        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(splitbtn);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(multiplybtn);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(minusbtn);
        p.add(b0);
        p.add(pointbtn);
        p.add(b0);
        p.add(pointbtn);
        p.add(equal);
        p.add(plusbtn);

        frame.add(text, BorderLayout.NORTH);
        frame.add(p);

        frame.setSize(300, 180);
        frame.setLocation(500, 200);
        frame.setVisible(true);

    }
    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if ((s.charAt(0) >= '0' && s.charAt(0) <= '9') || s.charAt(0) == '.')
        {
            if (!s1.equals(""))
                s2 += s;
            else
                s0 += s;
            text.setText(s0 + s1 + s2);
        }
        else if (s.charAt(0) == '=')
        {
            double res;
            if (s1.equals("+"))
                res = (Double.parseDouble(s0) + Double.parseDouble(s2));
            else if (s1.equals("-"))
                res = (Double.parseDouble(s0) - Double.parseDouble(s2));
            else if (s1.equals("/"))
                res = (Double.parseDouble(s0) / Double.parseDouble(s2));
            else
                res = (Double.parseDouble(s0) * Double.parseDouble(s2));
            text.setText(s0 + s1 + s2 + "=" + res);
            s0 = Double.toString(res);
            s1 = s2 = "";
        }
        else
        {
            if (s1.equals("") || s2.equals(""))
                s1 = s;
            else
            {
                double res;
                if (s1.equals("+"))
                    res = (Double.parseDouble(s0) + Double.parseDouble(s2));
                else if (s1.equals("-"))
                    res = (Double.parseDouble(s0) - Double.parseDouble(s2));
                else if (s1.equals("/"))
                    res = (Double.parseDouble(s0) / Double.parseDouble(s2));
                else
                    res = (Double.parseDouble(s0) * Double.parseDouble(s2));

                s0 = Double.toString(res);
                s1 = s;
                s2 = "";
            }
            text.setText(s0 + s1 + s2);
        }
    }
}