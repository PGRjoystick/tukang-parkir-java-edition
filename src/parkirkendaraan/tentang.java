package parkirkendaraan;

import java.awt.ComponentOrientation;
import java.awt.Color;
import java.awt.Dimension;
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
import javax.swing.SwingConstants;



public class tentang extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//inisialisasi variabel koordinat
	int mousepX;
	int mousepY;
	
    public tentang() {
    	setTitle("Tukang Parkir v2.2 - Tentang");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(tentang.class.getResource("/UI/Logo.png")));
    	getContentPane().setBackground(new Color(0, 0, 51));
    	

    	getContentPane().setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
    	setUndecorated(true);
        initComponents();
        
    }



    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        btnExit = new javax.swing.JButton();
        btnExit.setIcon(new ImageIcon(tentang.class.getResource("/UI/exit.png")));
        btnExit.setHideActionText(true);
        btnExit.setBackground(new Color(102, 204, 153));
        // esekusi utama jika program ditutup
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	//panggilan aksi tombol exit
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit);
        btnExit.setBounds(489, 0, 16, 18);
        
        JButton button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		setState(ICONIFIED);
        	}
        });
        button.setIcon(new ImageIcon(tentang.class.getResource("/UI/minimize.png")));
        button.setHideActionText(true);
        button.setBackground(new Color(102, 204, 153));
        button.setBounds(468, 0, 16, 18);
        getContentPane().add(button);
        
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
        lblNewLabel.setIcon(new ImageIcon(tentang.class.getResource("/UI/Frame Bar.png")));
        lblNewLabel.setBounds(0, 0, 505, 18);
        getContentPane().add(lblNewLabel);
        
        JLabel lblTukangParkirV_1 = new JLabel("TUKANG PARKIR V2.2");
        lblTukangParkirV_1.setForeground(Color.WHITE);
        lblTukangParkirV_1.setFont(new Font("Google Sans", Font.BOLD, 20));
        lblTukangParkirV_1.setBounds(206, 29, 213, 27);
        getContentPane().add(lblTukangParkirV_1);
        
        JLabel label_1 = new JLabel("Proudly Present By");
        label_1.setForeground(Color.WHITE);
        label_1.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_1.setBounds(244, 97, 138, 18);
        getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("KELOMPOK 3");
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("Google Sans", Font.BOLD, 20));
        label_2.setBounds(244, 126, 138, 27);
        getContentPane().add(label_2);
        
        JLabel label_3 = new JLabel("Singgih Pratama (PGRjoystick)");
        label_3.setForeground(Color.WHITE);
        label_3.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_3.setBounds(10, 168, 218, 18);
        getContentPane().add(label_3);
        
        JLabel label_4 = new JLabel("Muhamad Khairavi");
        label_4.setForeground(Color.WHITE);
        label_4.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_4.setBounds(10, 185, 133, 18);
        getContentPane().add(label_4);
        
        JLabel label_5 = new JLabel("Ahmad Dodo Purnama");
        label_5.setForeground(Color.WHITE);
        label_5.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_5.setBounds(10, 202, 160, 18);
        getContentPane().add(label_5);
        
        JLabel label_6 = new JLabel("Ahmad Nur Asia Jamil");
        label_6.setForeground(Color.WHITE);
        label_6.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_6.setBounds(10, 219, 160, 18);
        getContentPane().add(label_6);
        
        JLabel label_7 = new JLabel("Unin Saputra");
        label_7.setForeground(Color.WHITE);
        label_7.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_7.setBounds(10, 237, 160, 18);
        getContentPane().add(label_7);
        
        JLabel label_8 = new JLabel("Core Developer & UI Designer");
        label_8.setForeground(Color.WHITE);
        label_8.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_8.setBounds(266, 168, 218, 18);
        getContentPane().add(label_8);
        
        JLabel lblDebugger = new JLabel("Debugger");
        lblDebugger.setForeground(Color.WHITE);
        lblDebugger.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblDebugger.setBounds(266, 185, 196, 18);
        getContentPane().add(lblDebugger);
        
        JLabel label_10 = new JLabel("Documentary");
        label_10.setForeground(Color.WHITE);
        label_10.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_10.setBounds(266, 202, 103, 18);
        getContentPane().add(label_10);
        
        JLabel label_11 = new JLabel("UX Tester");
        label_11.setForeground(Color.WHITE);
        label_11.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_11.setBounds(266, 219, 103, 18);
        getContentPane().add(label_11);
        
        JLabel lblDocumentary = new JLabel("Documentary");
        lblDocumentary.setForeground(Color.WHITE);
        lblDocumentary.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblDocumentary.setBounds(266, 237, 103, 18);
        getContentPane().add(lblDocumentary);
        
        JLabel label_13 = new JLabel("Compiled using Eclipse IDE");
        label_13.setForeground(Color.WHITE);
        label_13.setFont(new Font("Google Sans", Font.BOLD, 15));
        label_13.setBounds(216, 68, 196, 18);
        getContentPane().add(label_13);
        
        JLabel label_14 = new JLabel("Thanks to");
        label_14.setForeground(Color.WHITE);
        label_14.setFont(new Font("Google Sans", Font.BOLD, 20));
        label_14.setBounds(40, 266, 103, 27);
        getContentPane().add(label_14);
        
        JLabel lblTuhanYme = new JLabel("Tuhan YME");
        lblTuhanYme.setForeground(Color.WHITE);
        lblTuhanYme.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblTuhanYme.setBounds(10, 304, 218, 18);
        getContentPane().add(lblTuhanYme);
        
        JLabel lblKeduaOrangTua = new JLabel("Kedua Orang Tua");
        lblKeduaOrangTua.setForeground(Color.WHITE);
        lblKeduaOrangTua.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblKeduaOrangTua.setBounds(10, 321, 133, 18);
        getContentPane().add(lblKeduaOrangTua);
        
        JLabel lblDosenPbg = new JLabel("Dosen PBO");
        lblDosenPbg.setForeground(Color.WHITE);
        lblDosenPbg.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblDosenPbg.setBounds(10, 338, 160, 18);
        getContentPane().add(lblDosenPbg);
        
        JLabel lblSackOverflow = new JLabel("Stack Overflow");
        lblSackOverflow.setForeground(Color.WHITE);
        lblSackOverflow.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblSackOverflow.setBounds(10, 355, 160, 18);
        getContentPane().add(lblSackOverflow);
        
        JLabel lblRedditrjava = new JLabel("Reddit /r/java");
        lblRedditrjava.setForeground(Color.WHITE);
        lblRedditrjava.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblRedditrjava.setBounds(10, 373, 160, 18);
        getContentPane().add(lblRedditrjava);
        
        JLabel lblSololearn = new JLabel("SoloLearn");
        lblSololearn.setForeground(Color.WHITE);
        lblSololearn.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblSololearn.setBounds(10, 390, 160, 18);
        getContentPane().add(lblSololearn);
        
        JLabel lblGithub = new JLabel("Github");
        lblGithub.setForeground(Color.WHITE);
        lblGithub.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblGithub.setBounds(10, 407, 160, 18);
        getContentPane().add(lblGithub);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon(tentang.class.getResource("/UI/Logo.png")));
        lblNewLabel_1.setBounds(14, 28, 124, 125);
        getContentPane().add(lblNewLabel_1);
        
        JButton btnTutup = new JButton("Tutup");
        btnTutup.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		dispose();
        	}
        });
        btnTutup.setBounds(395, 386, 89, 39);
        getContentPane().add(btnTutup);
        
        JLabel lblCopyright = new JLabel("Copyright \u00A9 2019 by Kelompok 3");
        lblCopyright.setForeground(Color.WHITE);
        lblCopyright.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblCopyright.setBounds(220, 304, 233, 18);
        getContentPane().add(lblCopyright);
        
        JLabel lblAllRightsReserved = new JLabel("All Rights Reserved");
        lblAllRightsReserved.setHorizontalAlignment(SwingConstants.CENTER);
        lblAllRightsReserved.setForeground(Color.WHITE);
        lblAllRightsReserved.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblAllRightsReserved.setBounds(220, 321, 233, 18);
        getContentPane().add(lblAllRightsReserved);
        
        JLabel lblAppVersion = new JLabel("App Version 2.2 Build 151219");
        lblAppVersion.setHorizontalAlignment(SwingConstants.CENTER);
        lblAppVersion.setForeground(Color.WHITE);
        lblAppVersion.setFont(new Font("Google Sans", Font.BOLD, 15));
        lblAppVersion.setBounds(220, 341, 233, 18);
        getContentPane().add(lblAppVersion);
        
        JLabel lblNewLabel_2 = new JLabel("");
        lblNewLabel_2.setIcon(new ImageIcon(tentang.class.getResource("/UI/Frame Bar.png")));
        lblNewLabel_2.setBounds(0, 159, 505, 6);
        getContentPane().add(lblNewLabel_2);

        setSize(new Dimension(505, 440));
        setLocationRelativeTo(null);
    }


    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    	this.dispose();
    }

    



    public static void main(String args[]) {


        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tentang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tentang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private JLabel lblNewLabel;
    private JLabel lblTukangParkirV;
}
