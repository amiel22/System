import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.FileReader;
public class Sample extends JFrame {

    public Sample() {
        initComponents();
    }
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        stnumlbl1 = new javax.swing.JLabel();
        logintypelbl1 = new javax.swing.JLabel();
        stnum1 = new javax.swing.JTextField();
        passfield1 = new javax.swing.JPasswordField();
        logintype1 = new javax.swing.JComboBox<>();
        passlbl1 = new javax.swing.JLabel();
        loginbtn = new javax.swing.JButton();
        clicklbl = new javax.swing.JLabel();
        click = new javax.swing.JButton();
        Font bigText = new Font("Courier New", Font.BOLD, 48);
        Font labels = new Font("Courier New", Font.BOLD, 14);
        click.setOpaque(false);
        click.setContentAreaFilled(false);
        click.setBorderPainted(true);
        JFrame frame = new JFrame("Registration");
        JPanel panel = new JPanel();
        JLabel title = new JLabel("Create an Account");
        JLabel accnt = new JLabel("Account Details: ");
        String data[][]={{}};    
        String column[]={"Name","Student Number","Course", "Year"};     
        JLabel namelbl = new JLabel("Name: ");
        JTextField nametxtfield = new JTextField(20);
        JLabel stnumlbl = new JLabel("Student Numer: ");
        JTextField stnumtxtfield = new JTextField(20);
        JLabel passlbl = new JLabel("Password: ");
        JPasswordField passfield = new JPasswordField(20);
        JLabel courselbl = new JLabel("Confirm Password: ");
        JComboBox <String> coursecombo = new JComboBox<>(new String[]{"Bachelor of Science in Information Technology", "Bachelor of Science in Computer Science", "Bachelor of Science in Information System, Bachelor of Science in Hotel Management"});
        JLabel logintypelbl = new JLabel("Login Type: ");
        JComboBox <String> logintypecombo = new JComboBox<>(new String[]{"Student", "Admin"});
        JLabel yearlbl = new JLabel("Year: ");
        JComboBox <String> yearcombo = new JComboBox<>(new String[]{"1st Year", "2nd Year", "3rd Year", "4th Year"});
        JButton submitbtn = new JButton("Submit");
        JButton confirmbtn = new JButton("Confirm");
        JButton cancelbtn = new JButton("Cancel");
        JTable table = new JTable(data,column);
        JLabel logo = new JLabel(new ImageIcon("logo.png"));

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("STUDENT INFORMATION SYSTEM");
        setResizable(false);

        jLabel2.setFont(bigText); // NOI18N
        jLabel2.setText("Login");

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\amiel\\OneDrive\\Documents\\NetBeansProjects\\Negro\\src\\logo.png")); // NOI18N

        stnumlbl1.setFont(labels); // NOI18N
        stnumlbl1.setText("Student Number:");

        logintypelbl1.setFont(labels); // NOI18N
        logintypelbl1.setText("Login type:");

        stnum1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                stnum1ActionPerformed(evt);
            }
        });

        logintype1.setFont(labels); // NOI18N
        logintype1.setModel(new DefaultComboBoxModel<>(new String[] { "Admin", "Student" }));

        passlbl1.setFont(labels); // NOI18N
        passlbl1.setText("Password:");

        loginbtn.setFont(labels); // NOI18N
        loginbtn.setText("Login");
        loginbtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });

        clicklbl.setFont(labels); // NOI18N
        clicklbl.setText("Not Registered Yet?");

        click.setText("Click here");
        click.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                Registerrr reg = new Registerrr();
                reg.show();
                dispose();
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(0, 103, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(stnumlbl1).addComponent(logintypelbl1,GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE).addComponent(passlbl1, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)).addGap(81, 81, 81).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(stnum1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE).addComponent(passfield1, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 179, GroupLayout.PREFERRED_SIZE))).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(clicklbl).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(click).addComponent(logintype1, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)).addGap(17, 17, 17))).addGap(76, 76, 76)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addComponent(loginbtn).addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 155, GroupLayout.PREFERRED_SIZE)).addGap(164, 164, 164)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 327,GroupLayout.PREFERRED_SIZE).addGap(111, 111, 111)))));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addGap(16, 16, 16).addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 166, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 67,GroupLayout.PREFERRED_SIZE).addGap(128, 128, 128)).addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup().addGap(134, 134, 134).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(stnum1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addComponent(stnumlbl1)).addGap(51, 51, 51))).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING, false).addGroup(jPanel1Layout.createSequentialGroup().addComponent(passfield1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE).addGap(74, 74, 74)).addGroup(jPanel1Layout.createSequentialGroup().addComponent(passlbl1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(logintypelbl1, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE).addComponent(logintype1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))).addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE).addComponent(loginbtn).addGap(41, 41, 41).addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE).addComponent(click).addComponent(clicklbl)).addGap(35, 35, 35)));

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void stnum1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_stnum1ActionPerformed
        
    }//GEN-LAST:event_stnum1ActionPerformed

    private void loginbtnActionPerformed(ActionEvent evt) {                                         
       String stnum = stnum1.getText();
       char [] pass = passfield1.getPassword();
         String password = new String(pass);
         try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\New folder\\Student.txt"));
            String line = br.readLine();
            while(line != null){
                String [] data = line.split(",");
                if(data[0].equals(stnum) && data[1].equals(password)){
                    JOptionPane.showMessageDialog(null, "Login Successful");
                    Main main = new Main();
                    main.show();
                    this.dispose();
                    break;
                }
                line = br.readLine();
            }
         } catch (Exception e) {
            // TODO: handle exception
         }
    }

    private void clickActionPerformed(ActionEvent evt) {                                      
        Registerrr reg = new Registerrr();
        reg.show();
    }


    public static void main(String args[]) {

        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                   UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sample.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sample().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton click;
    private javax.swing.JLabel clicklbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton loginbtn;
    private javax.swing.JComboBox<String> logintype1;
    private javax.swing.JLabel logintypelbl1;
    private javax.swing.JPasswordField passfield1;
    private javax.swing.JLabel passlbl1;
    private javax.swing.JTextField stnum1;
    private javax.swing.JLabel stnumlbl1;
    // End of variables declaration//GEN-END:variables
}
