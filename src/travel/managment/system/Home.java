package travel.managment.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {
    String username;
    JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,deletePersonalDetails, bookpackage,viewpackage, viewhotels,bookhotel, viewbookedhotel,destinations,payments,calculators,notepad,about;
    public static void main(String[] args) {
        new Home("");
    }

    public Home(String username) {
        this.username=username;
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);
        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(18,121,131));
        //p1.setBackground(Color.PINK);
        p1.setBounds(0,0,1600,65);
        add(p1);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/logo1.jpg"));
        Image i2=i1.getImage().getScaledInstance(65,65,Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(3,3,65,65);
        p1.add(icon);

        JLabel heading=new JLabel("DASHBOARD");
        heading.setBounds(100,10,300,40);
        heading.setForeground(Color.white);
        heading.setFont(new Font("Times New Roman",Font.BOLD,30));
        p1.add(heading);

        JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(18,121,131));
        p2.setBounds(0,65,300,900);
        add(p2);

        addPersonalDetails=new JButton("Add Personal Details");
        addPersonalDetails.setBounds(0,0,300,43);
        addPersonalDetails.setBackground(new Color(18,121,131));
        addPersonalDetails.setForeground(Color.white);
        addPersonalDetails.setFont(new Font("Calibri",Font.PLAIN,25));
        addPersonalDetails.setMargin(new Insets(0,0,0,60));
        addPersonalDetails.addActionListener(this);
        p2.add(addPersonalDetails);

        updatePersonalDetails=new JButton("Update Personal Details");
        updatePersonalDetails.setBounds(0,43,300,43);
        updatePersonalDetails.setBackground(new Color(18,121,131));
        updatePersonalDetails.setForeground(Color.white);
        updatePersonalDetails.setFont(new Font("Calibri",Font.PLAIN,25));
        updatePersonalDetails.setMargin(new Insets(0,0,0,30));
        updatePersonalDetails.addActionListener(this);
        p2.add(updatePersonalDetails);

        viewPersonalDetails=new JButton("View Details");
        viewPersonalDetails.setBounds(0,86,300,43);
        viewPersonalDetails.setBackground(new Color(18,121,131));
        viewPersonalDetails.setForeground(Color.white);
        viewPersonalDetails.setFont(new Font("Calibri",Font.PLAIN,25));
        viewPersonalDetails.setMargin(new Insets(0,0,0,145));
        viewPersonalDetails.addActionListener(this);
        p2.add(viewPersonalDetails);

        deletePersonalDetails=new JButton("Delete Personal Details");
        deletePersonalDetails.setBounds(0,129,300,43);
        deletePersonalDetails.setBackground(new Color(18,121,131));
        deletePersonalDetails.setForeground(Color.white);
        deletePersonalDetails.setFont(new Font("Calibri",Font.PLAIN,25));
        deletePersonalDetails.setMargin(new Insets(0,0,0,40));
        deletePersonalDetails.addActionListener(this);
        p2.add(deletePersonalDetails);

        checkpackages=new JButton("Check Packages");
        checkpackages.setBounds(0,172,300,43);
        checkpackages.setBackground(new Color(18,121,131));
        checkpackages.setForeground(Color.white);
        checkpackages.setFont(new Font("Calibri",Font.PLAIN,25));
        checkpackages.setMargin(new Insets(0,0,0,110));
        checkpackages.addActionListener(this);
        p2.add(checkpackages);

        bookpackage=new JButton("Book Packages");
        bookpackage.setBounds(0,215,300,43);
        bookpackage.setBackground(new Color(18,121,131));
        bookpackage.setForeground(Color.white);
        bookpackage.setFont(new Font("Calibri",Font.PLAIN,25));
        bookpackage.setMargin(new Insets(0,0,0,120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);

        viewpackage=new JButton("View Packages");
        viewpackage.setBounds(0,258,300,43);
        viewpackage.setBackground(new Color(18,121,131));
        viewpackage.setForeground(Color.white);
        viewpackage.setFont(new Font("Calibri",Font.PLAIN,25));
        viewpackage.setMargin(new Insets(0,0,0,120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);

        viewhotels=new JButton("View Hotels");
        viewhotels.setBounds(0,301,300,43);
        viewhotels.setBackground(new Color(18,121,131));
        viewhotels.setForeground(Color.white);
        viewhotels.setFont(new Font("Calibri",Font.PLAIN,25));
        viewhotels.setMargin(new Insets(0,0,0,145));
        viewhotels.addActionListener(this);
        p2.add(viewhotels);

        bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0,344,300,43);
        bookhotel.setBackground(new Color(18,121,131));
        bookhotel.setForeground(Color.white);
        bookhotel.setFont(new Font("Calibri",Font.PLAIN,25));
        bookhotel.setMargin(new Insets(0,0,0,155));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);

        viewbookedhotel=new JButton("View Booked Hotel");
        viewbookedhotel.setBounds(0,387,300,43);
        viewbookedhotel.setBackground(new Color(18,121,131));
        viewbookedhotel.setForeground(Color.white);
        viewbookedhotel.setFont(new Font("Calibri",Font.PLAIN,25));
        viewbookedhotel.setMargin(new Insets(0,0,0,75));
        viewbookedhotel.addActionListener(this);
        p2.add(viewbookedhotel);


        destinations=new JButton("Destinations");
        destinations.setBounds(0,430,300,43);
        destinations.setBackground(new Color(18,121,131));
        destinations.setForeground(Color.white);
        destinations.setFont(new Font("Calibri",Font.PLAIN,25));
        destinations.setMargin(new Insets(0,0,0,140));
        destinations.addActionListener(this);
        p2.add(destinations);

        payments=new JButton("Payment");
        payments.setBounds(0,473,300,43);
        payments.setBackground(new Color(18,121,131));
        payments.setForeground(Color.white);
        payments.setFont(new Font("Calibri",Font.PLAIN,25));
        payments.setMargin(new Insets(0,0,0,175));
        payments.addActionListener(this);
        p2.add(payments);

        calculators=new JButton("Calculators");
        calculators.setBounds(0,516,300,43);
        calculators.setBackground(new Color(18,121,131));
        calculators.setForeground(Color.white);
        calculators.setFont(new Font("Calibri",Font.PLAIN,25));
        calculators.setMargin(new Insets(0,0,0,155));
        calculators.addActionListener(this);
        p2.add(calculators);

        notepad=new JButton("Notepad");
        notepad.setBounds(0,559,300,43);
        notepad.setBackground(new Color(18,121,131));
        notepad.setForeground(Color.white);
        notepad.setFont(new Font("Calibri",Font.PLAIN,25));
        notepad.setMargin(new Insets(0,0,0,175));
        notepad.addActionListener(this);
        p2.add(notepad);

        about=new JButton("About");
        about.setBounds(0,602,300,43);
        about.setBackground(new Color(18,121,131));
        about.setForeground(Color.white);
        about.setFont(new Font("Calibri",Font.PLAIN,25));
        about.setMargin(new Insets(0,0,0,200));
        p2.add(about);

        ImageIcon i4= new ImageIcon(ClassLoader.getSystemResource("icon/Splash.jpg"));
        Image i5 = i4.getImage().getScaledInstance(1070, 670,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel NewLabel = new JLabel(i6);
        NewLabel.setBounds(300, 40, 1070, 670);
        add(NewLabel);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {

        try{
            if(ae.getSource()==addPersonalDetails){
                new AddCustomer(username).setVisible(true);
            } else if (ae.getSource()==viewPersonalDetails) {
                new ViewCustomer(username).setVisible(true);
            } else if (ae.getSource()==updatePersonalDetails) {
                new UpdateCustomer(username).setVisible(true);
            } else if (ae.getSource()==deletePersonalDetails) {
                new DeleteCustomer(username).setVisible(true);
            }else if (ae.getSource()==checkpackages) {
                new CheckPackage().setVisible(true);
            }else if (ae.getSource()==bookpackage) {
                new BookPackage(username).setVisible(true);
            }else if (ae.getSource()==viewpackage) {
                new ViewPackage(username).setVisible(true);
            }else if (ae.getSource()==viewhotels) {
                new CheckHotels().setVisible(true);
            }else if (ae.getSource()==bookhotel) {
                new BookHotel(username).setVisible(true);
            }else if (ae.getSource()==viewbookedhotel) {
                new ViewBookedHotel(username).setVisible(true);
            }else if (ae.getSource()==destinations) {
                new Destination().setVisible(true);
            }else if (ae.getSource()==payments) {
                new Payment(username).setVisible(true);
            } else if (ae.getSource()==notepad) {
                Runtime.getRuntime().exec("notepad.exe");
            } else if (ae.getSource()==calculators) {
                Runtime.getRuntime().exec("calc.exe");
            }

        }catch(Exception e){}
       // JButton addPersonalDetails,viewPersonalDetails,updatePersonalDetails,checkpackages,deletePersonalDetails, bookpackage,viewpackage,
             //   viewhotels,bookhotel, viewbookedhotel,destinations,payments,calculators,notepad,about;

    }

}
