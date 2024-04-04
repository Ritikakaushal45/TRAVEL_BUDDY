package travel.managment.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Paytm extends JFrame{
    JLabel l10;
    Paytm(String username){
        setLayout(null);
        setBounds(250, 100, 800, 600);

        JLabel la2 = new JLabel("amount :");
        la2.setBounds(10, 20, 200, 20);
        la2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        add(la2);

        l10 = new JLabel();
        l10.setBounds(150, 20, 200, 20);
        l10.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        add(l10);

        Conn c = new Conn();
        try{
            String query="select * from bookhotel where username = '"+username+"'";
            ResultSet rs = c.s.executeQuery(query);
            while(rs.next()){
                l10.setText(rs.getString("prize"));
            }
            rs.close();
        }catch(SQLException e){}

        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        add(back);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open UPI app
                try {
                    URI uri = new URI("upi://pay?pa=receiver@upi&pn=Receiver&am=10&cu=INR");
                    Desktop.getDesktop().browse(uri);
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Successful", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Failed", "Payment Status", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        payButton.setBounds(500, 20, 80, 40);
        add(payButton);
    }
    public static void main(String[] args) {
        new Paytm("").setVisible(true);
    }
       // JEditorPane j = new JEditorPane();
        //j.setEditable(false);

       /* try {
            j.setPage("https://paytm.com/rent-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));

        JLabel la2 = new JLabel("amount :");
        la2.setBounds(10, 20, 200, 20);
        la2.setFont(new Font("Times New Roman", Font.PLAIN, 25));
        j.add(la2);

        JLabel l10 = new JLabel();
        l10.setBounds(150, 0, 200, 20);
        j.add(l10);

        Conn c = new Conn();
        try{
            ResultSet rs = c.s.executeQuery("select * from bookhotel where username = '"+username+"'");
            while(rs.next()){
                l10.setText(rs.getString("prize"));
            }
            rs.close();
        }catch(SQLException e){}

        JButton back=new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        j.add(back);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open UPI app
                try {
                    URI uri = new URI("upi://pay?pa=receiver@upi&pn=Receiver&am=10&cu=INR");
                    Desktop.getDesktop().browse(uri);
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Successful", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Failed", "Payment Status", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        payButton.setBounds(500, 20, 80, 40);
       // getContentPane().add(payButton);
        j.add(payButton);

        setSize(800,600);
        setLocation(250,100);
        setVisible(true);
    }
    public static void main(String[] args){
        new Paytm("").setVisible(true);
    }
       JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
            j.setPage("https://paytm.com/rent-payment");
        } catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800, 600));

        JButton back = new JButton("Back");
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        back.setBounds(610, 20, 80, 40);
        getContentPane().add(back);

        JButton payButton = new JButton("Pay");
        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Open UPI app
                try {
                    URI uri = new URI("https://paytm.com/rent-payment");
                    Desktop.getDesktop().browse(uri);
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Successful", "Payment Status", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException | URISyntaxException ex) {
                    ex.printStackTrace();
                    JOptionPane.showMessageDialog(Paytm.this, "Payment Failed", "Payment Status", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        payButton.setBounds(500, 20, 80, 40);
        getContentPane().add(payButton);

        setSize(800, 600);
        setLocation(250, 100);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Paytm().setVisible(true);
    }*/
}
//upi://pay?pa=receiver@upi&pn=Receiver&am=10&cu=INR