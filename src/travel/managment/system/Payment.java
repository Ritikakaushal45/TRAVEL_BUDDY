package travel.managment.system;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Payment extends JFrame{
    public Payment(String username){

        setLayout(null);
        setBounds(250, 100, 800, 600);

        JLabel label=new JLabel("Pay using Paytm");
        label.setFont(new Font("Times New Roman", Font.BOLD, 40));
        label.setBounds(50, 20, 350, 45);
        add(label);

        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icon/paytm.jpg"));
        Image i8 = i7.getImage().getScaledInstance(750, 480, Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel l4 = new JLabel(i9);
        l4.setBounds(10, 80, 750, 480);
        add(l4);

        JButton pay = new JButton("Pay");
        pay.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Paytm(username).setVisible(true);
            }
        });
        pay.setBounds(420, 20, 80, 40);
        add(pay);

        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(510, 20, 80, 40);
        add(back);

        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

    }

    public static void main(String[] args){
        new Payment("").setVisible(true);
    }
}
