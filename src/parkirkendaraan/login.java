package parkirkendaraan;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.awt.ComponentOrientation;
import java.awt.Color;
import java.awt.Dimension;
import parkirkendaraan.*;

import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;


import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;



/**
 *
 * @author PGRjoystick
 */
@SuppressWarnings("unused")
public class login extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * Creates new form login
     */
	//inisialisasi variabel koordinat
	int mousepX;
	int mousepY;
	
	//ambil nilai user dari jtextfield
	public String getUserlogin() {
    	String str = txtUsername.getText();
		return str;
	}
	//object window untuk class login
    public login() {
    	setTitle("Tukang Parkir v2.2 - Login");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(login.class.getResource("/UI/Logo.png")));
    	getContentPane().setBackground(new Color(0, 0, 51));
    	

    	getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    	setUndecorated(true);
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
   // @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        txtUsername = new javax.swing.JTextField();
        txtUsername.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//esekusi tombol login jika tombol enter di tekan
        		if (e.getSource()==txtUsername){
        			btnLogin.doClick();
        		}
        	}
        });
        btnExit = new javax.swing.JButton();
        btnExit.setIcon(new ImageIcon(login.class.getResource("/UI/exit.png")));
        btnExit.setHideActionText(true);
        btnExit.setBackground(new Color(102, 204, 153));
       // btnSignUp = new javax.swing.JButton();
        btnLogin = new javax.swing.JButton();
        btnLogin.setBorderPainted(false);
        txtPassword = new javax.swing.JPasswordField();
        txtPassword.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		//esekusi tombol login jika tombol enter di tekan
        		if (e.getSource()==txtPassword){
        			btnLogin.doClick();
        		}
        	}
        });
        // esekusi utama jika program ditutup
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        //deklarasi tombol tombol dan UI
        getContentPane().add(txtUsername);
        txtUsername.setBounds(210, 68, 175, 30);
        
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//panggilan aksi tombol exit
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(409, 0, 16, 18);

        //Tombol Sign up
        /* btnSignUp.setText("Sign Up");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        getContentPane().add(btnSignUp);
        btnSignUp.setBounds(230, 230, 78, 30); */

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//panggilan aksi tombol exit
                btnLoginActionPerformed(evt);
            }
        });
        
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		setState(ICONIFIED);
        	}
        });
        button.setIcon(new ImageIcon(login.class.getResource("/UI/minimize.png")));
        button.setHideActionText(true);
        button.setBackground(new Color(102, 204, 153));
        button.setBounds(388, 0, 16, 18);
        getContentPane().add(button);
        getContentPane().add(btnLogin);
        btnLogin.setBounds(307, 163, 78, 30);
        getContentPane().add(txtPassword);
        txtPassword.setBounds(210, 109, 175, 30);
        
        lblNewLabel = new JLabel("");
        //fungsi drag window manual untuk jframe tipe undecorated
        lblNewLabel.addMouseListener(new MouseAdapter() {
        	@Override
        	// esekusi ambil data koordinat mouse jika border window di tekan oleh mouse
        	public void mousePressed(MouseEvent e) {
        		mousepX = e.getX();
        		mousepY = e.getY();
        	}
        });
        lblNewLabel.addMouseMotionListener(new MouseMotionAdapter() {
        	@Override
        	// esekusi pindah posisi sesuai gerakan mouse jika di tekan dan tahan
        	public void mouseDragged(MouseEvent arg0) {
        		// esekusi ambil data koordinat window
        		int cordX = arg0.getXOnScreen();
        		int cordY = arg0.getYOnScreen();
        		// esekusi pindah posisi
        		setLocation(cordX-mousepX, cordY-mousepY);
        	}
        });
        
        lblTukangParkirV = new JLabel("Tukang Parkir v2.2");
        lblTukangParkirV.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
        lblTukangParkirV.setForeground(Color.WHITE);
        lblTukangParkirV.setBounds(10, 0, 103, 18);
        getContentPane().add(lblTukangParkirV);
        lblNewLabel.setIcon(new ImageIcon(login.class.getResource("/UI/Frame Bar.png")));
        lblNewLabel.setBounds(0, 0, 425, 18);
        getContentPane().add(lblNewLabel);
        
        lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(login.class.getResource("/UI/Logo.png")));
        lblNewLabel_1.setBounds(30, 49, 132, 124);
        getContentPane().add(lblNewLabel_1);
        
        lblLoginUntukMelanjutkan = new JLabel("LOGIN UNTUK MELANJUTKAN");
        lblLoginUntukMelanjutkan.setAutoscrolls(true);
        lblLoginUntukMelanjutkan.setFont(new Font("Roboto", Font.PLAIN, 16));
        lblLoginUntukMelanjutkan.setForeground(Color.WHITE);
        lblLoginUntukMelanjutkan.setBounds(172, 39, 224, 18);
        getContentPane().add(lblLoginUntukMelanjutkan);
        
        label = new JLabel("");
        label.setIcon(new ImageIcon(login.class.getResource("/UI/User.png")));
        label.setBounds(172, 68, 28, 30);
        getContentPane().add(label);
        
        lblTukangParkiranV = new JLabel("TUKANG PARKIR v2.2");
        lblTukangParkiranV.setForeground(Color.WHITE);
        lblTukangParkiranV.setFont(new Font("Roboto", Font.PLAIN, 16));
        lblTukangParkiranV.setBounds(20, 181, 160, 28);
        getContentPane().add(lblTukangParkiranV);
        
        label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(login.class.getResource("/UI/Pass.png")));
        label_1.setBounds(172, 109, 28, 30);
        getContentPane().add(label_1);
        
        JButton btnTentang = new JButton();
        btnTentang.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new tentang().setVisible(true);
        	}
        });
        btnTentang.setText("Tentang");
        btnTentang.setBorderPainted(false);
        btnTentang.setBounds(185, 163, 89, 30);
        getContentPane().add(btnTentang);

        setSize(new Dimension(425, 220));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    	System.exit(ABORT);
    }//GEN-LAST:event_btnExitActionPerformed

    
    //Fitur Sign up
   /* private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        String username = txtUsername.getText();
        String password = txtPassword.getText();
        
        try{
            try(Statement statement = (Statement) file_koneksi.GetConnection().createStatement()){
                statement.executeUpdate("insert into petugas(username, password)VALUES('"+username+"','"+password+"');");
            }
            JOptionPane.showMessageDialog(null,"Selamat! anda berhasil Sign Up!");
        } catch(Exception e){
            JOptionPane.showMessageDialog(null,"Kesalahan SQL tak di ketahui");}
    }//GEN-LAST:event_btnSignUpActionPerformed */
    //deklarasi percobaan login
    int attempt = 0;
    //esekusi tombol login
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
    	//deklarasi fungsi koneksi SQL
        Connection connection;
        PreparedStatement ps;
        
        try{
        	//koneksi ke SQL
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_parkir?zeroDateTimeBehavior=convertToNull","root","");
            ps= connection.prepareStatement("SELECT * FROM `petugas` WHERE username = ? AND password = ?");
            ps.setString(1,txtUsername.getText());
            ps.setString(2, new String (txtPassword.getPassword()));
            //proses esekusi perintah untuk SQL
            ResultSet result = ps.executeQuery();
            //jika hasil statement SQL "Next"
            if(result.next()){
                //String username = txtUsername.getText();
            	//buka class menu
            	new menu(this,true).setVisible(true);
                //sembunyikan window login
                this.setVisible(false);
            //jika hasil statement SQL bukan "Next"
            } else {
            	//jika percobaan login sudah 5 kali
            	if(attempt==4) {
            		JOptionPane.showMessageDialog(rootPane, "Terlalu Banyak upaya Login, Program akan Keluar.");
            		//Hentikan Program
            		System.exit(ABORT);
            	}
            	//jika percobaan login belum 5 kali
            	else{
            		JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah!");
            		//hapus nilai di dalam user pass
            		txtPassword.setText("");
                    txtUsername.requestFocus();
                    //tambahkan jumlah percobaan
                    attempt++;
            	}
            } 
        //jika terjadi error dengan SQL
        } catch(SQLException ex) {
                JOptionPane.showMessageDialog(rootPane,"Kesalahan SQL tak di ketahui");
            }
    }//GEN-LAST:event_btnLoginActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      
        /*try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        /*java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });*/
    	java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                login dialog = new login();
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                
                dialog.setVisible(true);
                
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    private JLabel lblNewLabel;
    private JLabel lblNewLabel_1;
    private JLabel lblLoginUntukMelanjutkan;
    private JLabel label;
    private JLabel lblTukangParkiranV;
    private JLabel label_1;
    private JLabel lblTukangParkirV;
}
