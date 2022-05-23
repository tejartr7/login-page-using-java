package com.company;

import java.awt.event.*;
import java.util.Objects;
import javax.swing.*;
public class button {
static void k()
{

}
    public static void main(String[] args) {
       // String name;

        JFrame f=new JFrame("Button Example");
        final JTextField tf=new JTextField();
        JLabel s=new JLabel("enter your name");
s.setBounds(0,50,150,20);
      tf.setBounds(100,50, 100,25);

        final JTextField p=new JTextField();
        JLabel a=new JLabel("password");
        a.setBounds(0,90,150,20);
        p.setBounds(100,90, 100,25);

        JButton n=new JButton("login");
        JTextArea sai=new JTextArea();
        sai.setBounds(105,170,150,30);
        sai.setVisible(false);
        n.setBounds(105,130,150,30);
        n.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(tf.getText());
                System.out.println(p.getText());
                if(Objects.equals(tf.getText(), "sai") && Objects.equals(p.getText(), "sai@2003"))
                {


                    sai.setVisible(true);
                    sai.setLayout(null);
                    sai.setText("correct password");
                    f.add(sai);

                  try {
                        Thread.sleep(1000);
                        f.remove(a);
                      System.out.println(("all conntents are removed"));
                    } catch (InterruptedException ex) {
                        ex.printStackTrace();
                    }
                    //   sai.setVisible(true);
                }
                else
                {  System.out.println(tf.getText());
                      System.out.println(p.getText());

                    sai.setText("wrong password");
                    sai.setVisible(true);
                    sai.setLayout(null);
                    f.add(sai);


                }
            }
        }));
        //f.add(b);
        f.add(tf);

        f.add(n);
        f.add(s);
        f.add(p);f.add(a);
       // f.add(v);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
       // f.pack();
        //f.setLocationRelativeTo(null);
       // f.setVisible(true);
    }
}