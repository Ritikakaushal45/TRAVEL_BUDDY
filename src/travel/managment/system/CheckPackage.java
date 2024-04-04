package travel.managment.system;

import java.sql.*;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class CheckPackage extends JFrame{

    public static void main(String[] args) {
        new CheckPackage().setVisible(true);
    }

    CheckPackage() {
        setBounds(230, 70, 900, 600);
        setVisible(true);
        String[] package1 = new String[]{"package2.png","GOLD PACKAGE","6 days and 7 Nights", "Airport Assistance at Aiport", "Half Day City Tour", "Welcome drinks on Arrival", "Daily Buffet", "Full Day 3 Island Cruise", "English Speaking Guide", "BOOK NOW", "Summer Special", "Rs 12000 only"};
        String[] package2 = new String[]{"package3.jpg","SILVER PACKAGE","4 days and 3 Nights", "Toll Free and Entrance Free Tickets", "Meet and Greet at Aiport", "Welcome drinks on Arrival", "Night Safari", "Full Day 3 Island Cruise", "Cruise with Dinner", "BOOK NOW", "Winter Special", "Rs 25000 only"};
        String[] package3 = new String[]{"package1.jpg","BRONZE PACKAGE","6 days and 5 Nights", "Return Airfare", "Free Clubbing, Horse Riding", "Welcome drinks on Arrival", "Daily Buffet", "Stay in 5 Star Hotel", "BBQ Dinner", "BOOK NOW", "Winter Special", "Rs 32000 only"};

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel p1 = createPackage(package1);
        tabbedPane.addTab("Package 1", null, p1);

        JPanel p2 = createPackage(package2);
        tabbedPane.addTab("Package 2", null, p2);

        JPanel p3 = createPackage(package3);
        tabbedPane.addTab("Package 3", null, p3);

        add(tabbedPane, BorderLayout.CENTER);
    }

    public JPanel createPackage(String[] pack){
        JPanel p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.WHITE);


        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icon/"+pack[0]));
        Image i3 = i1.getImage().getScaledInstance(450, 270,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i3);
        JLabel l1 = new JLabel(i2);
        l1.setBounds(350,100,500,300);
        p1.add(l1);

        JLabel lblName = new JLabel(pack[1]);
        lblName.setFont(new Font("Times New Roman", Font.PLAIN, 30));
        lblName.setBounds(300, 5, 300, 53);
        p1.add(lblName);

        JLabel l3 = new JLabel(pack[2]);
        l3.setForeground(Color.RED);
        l3.setFont(new Font("Arial", Font.PLAIN, 18));
        l3.setBounds(35, 100, 250, 20);
        p1.add(l3);

        JLabel lblId = new JLabel(pack[3]);
        lblId.setForeground(Color.BLUE);
        lblId.setFont(new Font("Arial", Font.PLAIN, 18));
        lblId.setBounds(35, 140, 300, 20);
        p1.add(lblId);

        JLabel l2 = new JLabel(pack[4]);
        l2.setForeground(Color.RED);
        l2.setFont(new Font("Arial", Font.PLAIN, 18));
        l2.setBounds(35, 180, 350, 20);
        p1.add(l2);

        JLabel lblName_1 = new JLabel(pack[5]);
        lblName_1.setForeground(Color.BLUE);
        lblName_1.setFont(new Font("Arial", Font.PLAIN, 18));
        lblName_1.setBounds(35, 220, 250, 20);
        p1.add(lblName_1);

        JLabel lblGender = new JLabel(pack[6]);
        lblGender.setForeground(Color.RED);
        lblGender.setFont(new Font("Arial", Font.PLAIN, 18));
        lblGender.setBounds(35, 260, 250, 20);
        p1.add(lblGender);

        JLabel lblCountry = new JLabel(pack[7]);
        lblCountry.setForeground(Color.BLUE);
        lblCountry.setFont(new Font("Arial", Font.PLAIN, 18));
        lblCountry.setBounds(35, 300, 250, 20);
        p1.add(lblCountry);

        JLabel lblReserveRoomNumber = new JLabel(pack[8]);
        lblReserveRoomNumber.setForeground(Color.RED);
        lblReserveRoomNumber.setFont(new Font("Arial", Font.PLAIN, 18));
        lblReserveRoomNumber.setBounds(35, 340, 250, 20);
        p1.add(lblReserveRoomNumber);


        JLabel lblDeposite = new JLabel(pack[10]);
        lblDeposite.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        lblDeposite.setBounds(35, 460, 400, 40);
        p1.add(lblDeposite);

        JLabel la1 = new JLabel(pack[11]);
        la1.setForeground(Color.RED);
        la1.setFont(new Font("Yu Mincho", Font.PLAIN, 30));
        la1.setBounds(600, 460, 400, 40);
        p1.add(la1);

        return p1;
    }
}
