package travel.managment.system;

//import net.proteanit.sql.DbUtils;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
public class ViewCustomer extends JFrame{
    JButton back;

    ViewCustomer(String username){
        setBounds(250, 40, 900, 680);
        getContentPane().setBackground(Color.white);
        setLayout(null);

        JLabel lblName = new JLabel("VIEW CUSTOMER DETAILS");
        lblName.setFont(new Font("Times New Roman", Font.BOLD, 25));
        lblName.setBounds(250, 0, 380, 53);
        add(lblName);

        JLabel lblusername=new JLabel("username");
        lblusername.setBounds(40,60,150,25);
        add(lblusername);

        JLabel  labelusername= new JLabel();
        labelusername.setBounds(220,60,150,25);
        add(labelusername);

        JLabel lblid=new JLabel("id");
        lblid.setBounds(40,120,150,25);
        add(lblid);

        JLabel  labelid = new JLabel();
        labelid.setBounds(220,120,150,25);
        add(labelid);

        JLabel lblnumber=new JLabel("number");
        lblnumber.setBounds(40,180,150,25);
        add(lblnumber);

        JLabel  labelnumber= new JLabel();
        labelnumber.setBounds(220,180,150,25);
        add(labelnumber);

        JLabel lblname=new JLabel("name");
        lblname.setBounds(40,240,150,25);
        add(lblname);

        JLabel  labelname= new JLabel();
        labelname.setBounds(220,240,150,25);
        add(labelname);

        JLabel lblgender=new JLabel("gender");
        lblgender.setBounds(40,300,150,25);
        add(lblgender);

        JLabel  labelgender= new JLabel();
        labelgender.setBounds(220,300,150,25);
        add(labelgender);

        JLabel lblcountry=new JLabel("country");
        lblcountry.setBounds(500,60,150,25);
        add(lblcountry);

        JLabel  labelcountry= new JLabel();
        labelcountry.setBounds(690,60,150,25);
        add(labelcountry);

        JLabel lbladdress=new JLabel("address");
        lbladdress.setBounds(500,120,150,25);
        add(lbladdress);

        JLabel  labeladdress= new JLabel();
        labeladdress.setBounds(690,120,150,25);
        add(labeladdress);

        JLabel lblphone=new JLabel("phone");
        lblphone.setBounds(500,180,150,25);
        add(lblphone);

        JLabel  labelphone= new JLabel();
        labelphone.setBounds(690,180,150,25);
        add(labelphone);

        JLabel lblemail=new JLabel("email");
        lblemail.setBounds(500,240,150,25);
        add(lblemail);

        JLabel  labelemail= new JLabel();
        labelemail.setBounds(690,240,150,25);
        add(labelemail);

        back= new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(350,350,100,25);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        add(back);

        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/viewall.jpg"));
        Image i3 = i1.getImage().getScaledInstance(500, 250,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(-30,400,500,250);
        add(l1);

        ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icon/viewall.jpg"));
        Image i5 = i4.getImage().getScaledInstance(500, 250,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel l2 = new JLabel(i6);
        l2.setBounds(430,400,500,250);
        add(l2);

        try{
            Conn conn=new Conn();
            String query="select * from customer where username = '"+username+"'";
            ResultSet rs=conn.s.executeQuery(query);
            while(rs.next()){
                labelusername.setText(rs.getString("username"));
                labelid.setText(rs.getString("id"));
                labelnumber.setText(rs.getString("number"));
                labelname.setText(rs.getString("name"));
                labelgender.setText(rs.getString("gender"));
                labelcountry.setText(rs.getString("country"));
                labeladdress.setText(rs.getString("address"));
                labelphone.setText(rs.getString("phone"));
                labelemail.setText(rs.getString("email"));
            }
        }
        catch(Exception e){

        }

        setVisible(true);
     }

     public void actionPerformed(ActionEvent ae){
        setVisible(false);
     }
    public static void main(String[] args) {
        new ViewCustomer("");
    }

}
