package travel.managment.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{
    private JPanel panel;
    private JTextField textField;
    private JPasswordField passwordField;
    private JButton b1,b2,b3;
    public Login() {

        setBackground(new Color(255, 255, 255));
        setBounds(270, 100, 770, 450);

        panel = new JPanel();
        panel.setBackground(Color.WHITE);
        setContentPane(panel);
        panel.setLayout(null);

        JLabel l1 = new JLabel("Username : ");
        l1.setBounds(400, 100, 150, 30);
        panel.add(l1);

        JLabel l2 = new JLabel("Password : ");
        l2.setBounds(400, 150, 150, 30);
        panel.add(l2);

        textField = new JTextField();
        textField.setBounds(500, 100, 160, 30);
        panel.add(textField);

        passwordField = new JPasswordField();
        passwordField.setBounds(500, 150, 160, 30);
        panel.add(passwordField);

        JLabel l3 = new JLabel("");
        l3.setBounds(550, 200, 50, 40);
        panel.add(l3);

        JLabel l4 = new JLabel("");
        l4.setBounds(600, 200, 50, 40);
        panel.add(l3);

        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image i1 = c1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);


        JLabel l6 = new JLabel(i2);
        l6.setBounds(15, 80, 250, 250);
        add(l6);


        b1 = new JButton("Login");
        b1.addActionListener(this);

        b1.setForeground(new Color(46, 139, 87));
        b1.setBackground(new Color(176, 224, 230));
        b1.setBounds(410, 200, 113, 25);
        panel.add(b1);

        b2 = new JButton("SignUp");
        b2.addActionListener(this);

        b2.setForeground(new Color(139, 69, 19));
        b2.setBackground(new Color(255, 235, 205));
        b2.setBounds(530, 200, 113, 25);
        panel.add(b2);

        b3 = new JButton("Forgot Password");
        b3.addActionListener(this);

        b3.setForeground(new Color(205, 92, 92));
        b3.setBackground(new Color(253, 245, 230));
        b3.setBounds(430, 250, 179, 25);
        panel.add(b3);

        JLabel l5 = new JLabel("Trouble in Login?");
        l5.setFont(new Font("Tohoma", Font.ITALIC, 15));
        l5.setForeground(new Color(255, 0, 0));
        l5.setBounds(450, 285, 120, 18);
        panel.add(l5);

        JPanel panel2 = new JPanel();
        panel2.setBackground(new Color(225, 225, 255));
        panel2.setBounds(300, 30, 440, 350);
        panel.add(panel2);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            Boolean status = false;
            try {
                Conn con = new Conn();
                String sql = "select * from account where username=? and password=?";
                PreparedStatement st = con.c.prepareStatement(sql);

                st.setString(1, textField.getText());
                st.setString(2, passwordField.getText());

                ResultSet rs = st.executeQuery();
                if (rs.next()) {
                    this.setVisible(false);
                    new Loading(textField.getText()).setVisible(true);
                } else
                    JOptionPane.showMessageDialog(null, "Invalid Login or Password!");

            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if(ae.getSource() == b2){
            setVisible(false);
            Signup su = new Signup();
            su.setVisible(true);
        }
        if(ae.getSource() == b3){
            setVisible(false);
            ForgotPassword forgot = new ForgotPassword();
            forgot.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login().setVisible(true);
    }
}
