package travel.managment.system;
import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class UpdateCustomer extends JFrame {
    Connection conn = null;
    PreparedStatement pst = null;
    private JPanel contentPane;
    private JTextField t1,t3,t4,t5,t6,t8,tfid;
    JComboBox comboBox;
    JRadioButton r1,r2,r3;
    Choice c1;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    UpdateCustomer frame = new UpdateCustomer("");
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public UpdateCustomer(String username) throws SQLException {
        System.out.println(username);
        setBounds(300, 100, 850, 550);
        contentPane = new JPanel();
        setContentPane(contentPane);
        contentPane.setLayout(null);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/update.png"));
        Image i3 = i1.getImage().getScaledInstance(300, 350,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(460,80,300,350);
        add(l1);

        JLabel lblName = new JLabel("UPDATE CUSTOMER FORM");
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblName.setBounds(250, 3, 380, 53);
        contentPane.add(lblName);

        JLabel l3 = new JLabel("Username :");
        l3.setBounds(35, 70, 200, 14);
        contentPane.add(l3);

        JLabel t7 = new JLabel();
        t7.setBounds(271, 70, 150, 20);
        contentPane.add(t7);

        JLabel lblId = new JLabel("ID :");
        lblId.setBounds(35, 110, 200, 14);
        contentPane.add(lblId);


        comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
        comboBox.setBounds(271, 110, 150, 20);
        contentPane.add(comboBox);
       /* tfid = new JTextField();
        tfid.setBounds(271, 110, 150, 20);
        contentPane.add(tfid);
        tfid.setColumns(10);*/

        JLabel l2 = new JLabel("Number :");
        l2.setBounds(35, 150, 200, 14);
        contentPane.add(l2);

        t1 = new JTextField();
        t1.setBounds(271, 150, 150, 20);
        contentPane.add(t1);
        t1.setColumns(10);

        JLabel lblName_1 = new JLabel("Name :");
        lblName_1.setBounds(35, 190, 200, 14);
        contentPane.add(lblName_1);

        JLabel t2 = new JLabel();
        t2.setBounds(271, 190, 150, 20);
        contentPane.add(t2);


        JLabel lblGender = new JLabel("Gender :");
        lblGender.setBounds(35, 230, 200, 14);
        contentPane.add(lblGender);

        JLabel tgender = new JLabel();
        tgender.setBounds(271, 230, 150, 20);
        contentPane.add(tgender);



        JLabel lblCountry = new JLabel("Country :");
        lblCountry.setBounds(35, 270, 200, 14);
        contentPane.add(lblCountry);

        t3 = new JTextField();
        t3.setBounds(271, 270, 150, 20);
        contentPane.add(t3);
        t3.setColumns(10);

        JLabel lblReserveRoomNumber = new JLabel("Permanent Address :");
        lblReserveRoomNumber.setBounds(35, 310, 200, 14);
        contentPane.add(lblReserveRoomNumber);

        t5 = new JTextField();
        t5.setBounds(271, 310, 150, 20);
        contentPane.add(t5);
        t5.setColumns(10);

        JLabel lblCheckInStatus = new JLabel("Phone :");
        lblCheckInStatus.setBounds(35, 350, 200, 14);
        contentPane.add(lblCheckInStatus);

        t6 = new JTextField();
        t6.setBounds(271, 350, 150, 20);
        contentPane.add(t6);
        t6.setColumns(10);

        JLabel lblDeposite = new JLabel("Email :");
        lblDeposite.setBounds(35, 390, 200, 14);
        contentPane.add(lblDeposite);

        t8 = new JTextField();
        t8.setBounds(271, 390, 150, 20);
        contentPane.add(t8);
        t8.setColumns(10);


        try{
            Conn c = new Conn();
            ResultSet rs = c.s.executeQuery("select * from customer where username = '"+username+"'");
            while(rs.next()){
                t7.setText(rs.getString("username"));
                t2.setText(rs.getString("name"));
                tgender.setText(rs.getString("gender"));
                //.setText(rs.getString("id"));
                t1.setText(rs.getString("number"));
                t3.setText(rs.getString("country"));
                t5.setText(rs.getString("address"));
                t6.setText(rs.getString("phone"));
                t8.setText(rs.getString("email"));
            }
        }catch(Exception e){ }



        JButton btnNewButton = new JButton("Update");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Conn c = new Conn();



                try{
                    String s9 = t7.getText(); //username
                    String s1 = (String)comboBox.getSelectedItem();
                    String s2 =  t1.getText();
                    String s3 =  t2.getText();
                   String s4 =  tgender.getText();
                    String s5 =  t3.getText();
                    String s7 =  t5.getText();  //address
                    String s8 =  t6.getText();
                    String s10 = t8.getText(); //email

                    String q1 = "update customer set id='"+s1+"',number='"+s2+"',name='"+s3+"',gender='"+s4+"',country='"+s5+"',address='"+s7+"',phone='"+s8+"',email='"+s10+"' where username='"+s9+"'";
                    c.s.executeUpdate(q1);

                    JOptionPane.showMessageDialog(null, "Customer Updated Successfully");
                    setVisible(false);
                }catch(SQLException e1){
                    System.out.println(e1.getMessage());
                }
                catch(NumberFormatException s){
                    JOptionPane.showMessageDialog(null, "Please enter a valid Number");
                }
            }
        });
        btnNewButton.setBounds(100, 430, 120, 30);
        btnNewButton.setBackground(Color.BLACK);
        btnNewButton.setForeground(Color.WHITE);
        contentPane.add(btnNewButton);

        JButton btnExit = new JButton("Back");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        btnExit.setBounds(260, 430, 120, 30);
        btnExit.setBackground(Color.BLACK);
        btnExit.setForeground(Color.WHITE);
        contentPane.add(btnExit);

        getContentPane().setBackground(Color.WHITE);
    }
}
