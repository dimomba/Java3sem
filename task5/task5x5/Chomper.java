package task5x5;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class Chomper {

    public static void main(String[] args){
        Image[] frames = {
                Toolkit.getDefaultToolkit().getImage("C:/Users/Dmitry/Downloads/bloggif_frames_gif/frame-01.gif"),
                Toolkit.getDefaultToolkit().getImage("C:/Users/Dmitry/Downloads/bloggif_frames_gif/frame-02.gif"),
                Toolkit.getDefaultToolkit().getImage("C:/Users/Dmitry/Downloads/bloggif_frames_gif/frame-03.gif")
        };
        Runnable r = new Runnable() {

            @Override
            public void run() {
                JPanel gui = new JPanel(new BorderLayout());

                JLabel animation = new JLabel(new ImageIcon(frames[0]));
                gui.add(animation, BorderLayout.CENTER);

                ActionListener animate = new ActionListener() {
                    private int index = 0;
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (index < frames.length - 1) {
                            index++;
                        }
                        else {
                            index = 0;
                        }
                        animation.setIcon(new ImageIcon(frames[index]));
                    }
                };
                Timer timer = new Timer(200, animate);

                JToggleButton b = new JToggleButton("Start/Stop");
                ActionListener startStop = new ActionListener() {

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (b.isSelected()) {
                            timer.start();
                        }
                        else {
                            timer.stop();
                        }
                    }
                };
                b.addActionListener(startStop);
                gui.add(b, BorderLayout.PAGE_END);

                JOptionPane.showMessageDialog(null, gui);
            }
        };
        SwingUtilities.invokeLater(r);
    }
}