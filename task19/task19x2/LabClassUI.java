package task19x2;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.util.ArrayList;

public class LabClassUI extends JFrame {

    private ArrayList<Student> students;
    private JTable studTable;

    public LabClassUI(ArrayList<Student> students){
        // base
        super("Students");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500, 250);
        setLocationRelativeTo(null);

        this.students = students;

        // Buttons
        JPanel pN = new JPanel(new FlowLayout());

        JButton findStudentBtn = new JButton("Search");

        pN.add(findStudentBtn);

        findStudentBtn.addActionListener(e->{
            try{
                findBtnClicked();
            }
            catch (EmptyStringException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
            catch (StudentNotFoundException ex){
                JOptionPane.showMessageDialog(this, ex.getMessage());
            }
        });

        // JTable
        Object[] headers = new String[] {"ФИО", "Возраст", "Группа", "Средний балл"};
        Object [][] startStudents = new String[students.size()][4];
        for(int i = 0; i < students.size(); i++){
            startStudents[i][0] = students.get(i).getFio();
            startStudents[i][1] = ((Integer)(students.get(i).getAge())).toString();
            startStudents[i][2] = ((Integer)(students.get(i).getGroupNum())).toString();
            startStudents[i][3] = ((Integer)(students.get(i).getAvgPoint())).toString();
        }
        studTable = new JTable( new DefaultTableModel(startStudents, headers)){
            @Override
            public boolean isCellEditable(int x, int y){
                return false;
            }
        };

        JTableHeader header = studTable.getTableHeader();
        header.setReorderingAllowed(false);
        header.setResizingAllowed(false);



        // Adding comps
        getContentPane().add(new JScrollPane(studTable), BorderLayout.CENTER);

        getContentPane().add(pN, BorderLayout.NORTH);

        setVisible(true);
    }


    private void findBtnClicked() throws StudentNotFoundException {
        String s = JOptionPane.showInputDialog("Введите ФИО:");
        for(int i = 0; i < students.size(); i++){
            if(students.get(i).getFio().equals(s)){
                JOptionPane.showMessageDialog(this, "Студент: "+ students.get(i).toString());
                return;
            }
        }
        if (s.equals(""))
            throw new EmptyStringException();
        throw new StudentNotFoundException(s);
    }
}