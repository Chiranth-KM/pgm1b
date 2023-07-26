package LABpack;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class gui {
    gui()
    {
        JFrame jfrm=new JFrame("Employee details");
        jfrm.setSize(500,500);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jfrm.setVisible(true);
        GridLayout g=new GridLayout(5,2);
        jfrm.setLayout(g);

        JPanel p1=new JPanel();
        JPanel p2=new JPanel();
        JPanel p3=new JPanel();
        JPanel p4=new JPanel();
        JPanel p5=new JPanel();
        JPanel p6=new JPanel();
        JPanel p7=new JPanel();
        JPanel p8=new JPanel();
        JPanel p9=new JPanel();
        JPanel p10=new JPanel();


        JLabel l1=new JLabel("Employee ID");
        p1.add(l1);
        TextField t1=new TextField();
        t1.setPreferredSize(new Dimension(200,30));
        p2.add(t1);

        JLabel l2=new JLabel("Employee Name");
        p3.add(l2);
        TextField t2=new TextField();
        t2.setPreferredSize(new Dimension(200,30));
        p4.add(t2);

        JLabel l3=new JLabel("Date-of-Birth");
        p5.add(l3);
        TextField t3=new TextField();
        t3.setPreferredSize(new Dimension(200,30));
        p6.add(t3);

        JLabel l4=new JLabel("Date-of-Join");
        p7.add(l4);
        TextField t4=new TextField();
        t4.setPreferredSize(new Dimension(200,30));
        p8.add(t4);

        JButton submit= new JButton("Submit");
        p9.add(submit);

        JButton clear= new JButton("Clear");
        p10.add(clear);

        jfrm.add(p1);
        jfrm.add(p2);
        jfrm.add(p3);
        jfrm.add(p4);
        jfrm.add(p5);
        jfrm.add(p6);
        jfrm.add(p7);
        jfrm.add(p8);
        jfrm.add(p9);
        jfrm.add(p10);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File file=new File("Employee.txt");
                try
                {
                    FileWriter fw=new FileWriter(file.getAbsoluteFile(),true);
                    String a= t1.getText();
                    String b= t2.getText();
                    String c= t3.getText();
                    String d= t4.getText();

                    fw.write("ID:"+a+'\n'+"Name:"+b+'\n'+"DOJ:"+d+'\n'+"DOB:"+c+'\n');
                    fw.close();

                    System.out.println("ID:"+a+'\n'+"Name:"+b+'\n'+"DOJ:"+d+'\n'+"DOB:"+c+'\n');
                }
                catch (IOException e1)
                {
                    System.out.println("Some error occoured"+e1);
                }
            }
        });

        clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("");
                t2.setText(null);
                t3.setText(null);
                t4.setText(null);

            }
        });


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                    new gui();
            }
        });
    }
}
