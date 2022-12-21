package task24x3;

import java.awt.Color;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Gui extends JFrame {
    IDocument currentDocument;
    ICreateDocument fabricDocument;

    public Gui() {
        super("Gui");
        this.setSize(700, 300);
        this.setLocation(400, 250);

        this.fabricDocument = new CreateTextDocument();
        JTextArea textArea = new JTextArea();
        this.add(textArea);
        JMenuBar menuBarMain = new JMenuBar();
        menuBarMain.setBackground(Color.WHITE);
        JMenu menuFile = new JMenu("File");
        JMenuItem itemNew = new JMenuItem("New");
        JMenuItem itemOpen = new JMenuItem("Open");
        JMenuItem itemSave = new JMenuItem("Save");
        JMenuItem itemExit = new JMenuItem("Exit");
        menuFile.add(itemNew);
        menuFile.add(itemOpen);
        menuFile.add(itemSave);
        menuFile.add(itemExit);
        menuBarMain.add(menuFile);
        this.setJMenuBar(menuBarMain);
        itemNew.addActionListener((e) -> {
            textArea.setText("");
            String stDocumentName = JOptionPane.showInputDialog("Название документа:");
            if (!stDocumentName.equals("")) {
                this.currentDocument = this.fabricDocument.CreateNew(stDocumentName, (new Random()).nextInt(1, 100));
            }
        });
        itemOpen.addActionListener((e) -> {
            String documentName = JOptionPane.showInputDialog("Название документа:");
            if (documentName != null) {
                this.currentDocument = this.fabricDocument.CreateOpen(documentName);
                textArea.setText(this.currentDocument.getContent());
            }
        });
        itemSave.addActionListener((e) -> {
            JOptionPane.showMessageDialog(this.getContentPane(), "Документ сохранен");
            this.currentDocument.setContent(textArea.getText().toString());
            //textArea.setText("");
        });
        itemExit.addActionListener((e) -> {
            this.dispose();
        });
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Gui();
    }
}