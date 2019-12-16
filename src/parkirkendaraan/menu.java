package parkirkendaraan;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.SwingConstants;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JList;


public class menu extends javax.swing.JFrame /*implements tampil*/   {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	DefaultTableModel masukmotor, masukmobil, keluar, laporan;
    koneksi konek = new koneksi();
    int mousepX;
	int mousepY;
	Timer updateTimer;
	int DELAY = 100;
	
    public menu(java.awt.Frame parent, boolean modal) {

    	setLocationByPlatform(true);
    	setIconImage(Toolkit.getDefaultToolkit().getImage(menu.class.getResource("/UI/Logo.png")));
    	setPreferredSize(new Dimension(700, 630));
    	setUndecorated(true);
    	getContentPane().setBackground(new Color(0, 0, 51));
//      super(parent, modal);
        konek.koneksi();
        initComponents();
        getContentPane().setLayout(null);

	 getContentPane().add(jTabbedPane1);
	pnKeluar = new javax.swing.JPanel();
	
	pnKeluar.setBackground(new Color(0, 0, 51));
	jScrollPane2 = new javax.swing.JScrollPane();
	jScrollPane2.setBounds(10, 222, 655, 264);
	tbKeluar = new javax.swing.JTable();
	jLabel4 = new javax.swing.JLabel();
	jLabel4.setBounds(28, 11, 54, 14);
	jLabel4.setForeground(Color.WHITE);
	jLabel5 = new javax.swing.JLabel();
	jLabel5.setBounds(28, 46, 54, 14);
	jLabel5.setForeground(Color.WHITE);
	jLabel6 = new javax.swing.JLabel();
	jLabel6.setBounds(28, 80, 54, 14);
	jLabel6.setForeground(Color.WHITE);
	jLabel7 = new javax.swing.JLabel();
	jLabel7.setBounds(28, 118, 69, 14);
	jLabel7.setForeground(Color.WHITE);
	jLabel8 = new javax.swing.JLabel();
	jLabel8.setBounds(433, 116, 68, 14);
	jLabel8.setForeground(Color.WHITE);
	jLabel9 = new javax.swing.JLabel();
	jLabel9.setBounds(28, 156, 69, 14);
	jLabel9.setForeground(Color.WHITE);
	jLabel10 = new javax.swing.JLabel();
	jLabel10.setBounds(433, 154, 68, 14);
	jLabel10.setForeground(Color.WHITE);
	jLabel11 = new javax.swing.JLabel();
	jLabel11.setBounds(28, 193, 79, 14);
	jLabel11.setForeground(Color.WHITE);
	txtKNoPol = new javax.swing.JTextField();
	txtKNoPol.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
	if (e.getSource()==txtKNoPol){
		btnCari.doClick();
		}
	}	
	});
                                                                                        
	txtKNoPol.setBounds(117, 11, 224, 27);
	txtKNoTiket = new javax.swing.JTextField();
	txtKNoTiket.setBounds(117, 44, 224, 27);
	txtKJenis = new javax.swing.JTextField();
	txtKJenis.setBounds(117, 78, 224, 27);
	txtKTglMasuk = new javax.swing.JTextField();
	txtKTglMasuk.setBounds(117, 116, 224, 27);
	txtKJamMasuk = new javax.swing.JTextField();
	txtKJamMasuk.setBounds(519, 116, 146, 27);
	txtKDurasiH = new javax.swing.JTextField();
	txtKDurasiH.setBounds(117, 154, 224, 26);
	txtKDurasiJ = new javax.swing.JTextField();
	txtKDurasiJ.setBounds(519, 154, 146, 26);
	txtKBiaya = new javax.swing.JTextField();
	txtKBiaya.setBounds(117, 191, 224, 26);
	btnCari = new javax.swing.JButton();
	btnCari.setBounds(519, 10, 146, 28);
	btnKeluar = new javax.swing.JButton();
	btnKeluar.setBounds(519, 78, 146, 27);
	txtKBiayaAkhir = new javax.swing.JTextField();
	txtKBiayaAkhir.setBounds(519, 191, 146, 26);
	jLabel12 = new javax.swing.JLabel();
	jLabel12.setBounds(433, 191, 68, 14);
	jLabel12.setForeground(Color.WHITE);
	btnClear = new javax.swing.JButton();
	btnClear.setBounds(519, 44, 146, 27);
	                                                                                        
	tbKeluar.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"No. Tiket", "No. Pol", "Jenis", "Tgl Masuk", "Tgl Keluar", "Jam Keluar", "Biaya"
		}
	));
	jScrollPane2.setViewportView(tbKeluar);
	jLabel4.setText("No. Pol");
	jLabel5.setText("No. Tiket");
	jLabel6.setText("Jenis");
	jLabel7.setText("Tgl Masuk");
	jLabel8.setText("Jam Masuk");
	jLabel9.setText("Durasi Hari");
	jLabel10.setText("Durasi Jam");
	jLabel11.setText("Biaya Parkir");
	txtKNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
		public void keyTyped(java.awt.event.KeyEvent evt) {
			txtKNoPolKeyTyped(evt);
		}
	});
	txtKNoTiket.setEditable(false);
	txtKJenis.setEditable(false);
	txtKTglMasuk.setEditable(false);
	txtKJamMasuk.setEditable(false);
	txtKDurasiH.setEditable(false);
	txtKDurasiJ.setEditable(false);
	txtKBiaya.setEditable(false);
	btnCari.setText("Cari");
	btnCari.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnCariActionPerformed(evt);
		}
	});
	btnKeluar.setText("Keluar Parkiran");
	btnKeluar.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnKeluarActionPerformed(evt);
		}
	});
	txtKBiayaAkhir.setEditable(false);
	jLabel12.setText("Biaya Akhir");
	btnClear.setText("Bersihkan");
	btnClear.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnClearActionPerformed(evt);
		}
	});
        
        JPanel pnDasbor = new JPanel();
        pnDasbor.addComponentListener(new ComponentAdapter() {
        	@Override
        	public void componentShown(ComponentEvent arg0) {
        		cek_dasbor();
        	}
        });
        pnDasbor.setBackground(new Color(0, 0, 51));
        pnDasbor.setName("");
        jTabbedPane1.addTab("Dasbor", null, pnDasbor, null);
        pnDasbor.setLayout(null);
        
        JLabel lblJumlahKendaraanSedang = new JLabel("Jumlah Kendaraan Sedang Parkir");
        lblJumlahKendaraanSedang.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblJumlahKendaraanSedang.setForeground(Color.WHITE);
        lblJumlahKendaraanSedang.setBounds(33, 53, 294, 28);
        pnDasbor.add(lblJumlahKendaraanSedang);
        
        
        
        txtLiveParkir = new JTextField();
        txtLiveParkir.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtLiveParkir.setEditable(false);
        txtLiveParkir.setBounds(495, 53, 156, 28);
        pnDasbor.add(txtLiveParkir);
        txtLiveParkir.setColumns(10);
        
        JLabel lblJumlahKendaraanSudah = new JLabel("Total Kendaraan Parkir");
        lblJumlahKendaraanSudah.setForeground(Color.WHITE);
        lblJumlahKendaraanSudah.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblJumlahKendaraanSudah.setBounds(33, 91, 294, 28);
        pnDasbor.add(lblJumlahKendaraanSudah);
        
        txtTotalParkir = new JTextField();
        txtTotalParkir.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtTotalParkir.setEditable(false);
        txtTotalParkir.setColumns(10);
        txtTotalParkir.setBounds(495, 92, 156, 28);
        pnDasbor.add(txtTotalParkir);
        
        lblTotalPendapatan = new JLabel("Total Pendapatan");
        lblTotalPendapatan.setForeground(Color.WHITE);
        lblTotalPendapatan.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTotalPendapatan.setBounds(33, 134, 294, 28);
        pnDasbor.add(lblTotalPendapatan);
        
        txtPendapatan = new JTextField();
        txtPendapatan.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtPendapatan.setEditable(false);
        txtPendapatan.setColumns(10);
        txtPendapatan.setBounds(495, 131, 156, 31);
        pnDasbor.add(txtPendapatan);
        
        lblSelamatDatang = new JLabel();
        lblSelamatDatang.setText("Selamat Datang");
        lblSelamatDatang.setForeground(Color.WHITE);
        lblSelamatDatang.setFont(new Font("Dialog", Font.BOLD, 24));
        lblSelamatDatang.setBounds(249, 11, 179, 31);
        pnDasbor.add(lblSelamatDatang);
        
        lblWaktu = new JLabel("Waktu");
        lblWaktu.setForeground(Color.WHITE);
        lblWaktu.setFont(new Font("Dialog", Font.BOLD, 20));
        lblWaktu.setBounds(468, 354, 72, 28);
        pnDasbor.add(lblWaktu);
        
        lblTime = new JLabel("00:00:00");
        lblTime.setHorizontalAlignment(SwingConstants.CENTER);
        lblTime.setForeground(Color.WHITE);
        lblTime.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTime.setBounds(352, 345, 113, 49);
        pnDasbor.add(lblTime);
        
        lblDate = new JLabel("Xxx, 00 Xxx 0000");
        lblDate.setHorizontalAlignment(SwingConstants.CENTER);
        lblDate.setForeground(Color.WHITE);
        lblDate.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblDate.setBounds(372, 380, 189, 49);
        pnDasbor.add(lblDate);
        
        label_1 = new JLabel("");
        label_1.setIcon(new ImageIcon(menu.class.getResource("/UI/Logo.png")));
        label_1.setBounds(10, 362, 124, 124);
        pnDasbor.add(label_1);
        
        JLabel label_2 = new JLabel("");
        label_2.setIcon(new ImageIcon(menu.class.getResource("/UI/BG.png")));
        label_2.setBounds(252, 362, 424, 124);
        pnDasbor.add(label_2);
        
        JLabel lblMeme = new JLabel("Pendapatan Hari ini");
        lblMeme.setForeground(Color.WHITE);
        lblMeme.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblMeme.setBounds(33, 173, 294, 28);
        pnDasbor.add(lblMeme);
        
        txtLahanMotorAvail = new JTextField();
        txtLahanMotorAvail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtLahanMotorAvail.setEditable(false);
        txtLahanMotorAvail.setColumns(10);
        txtLahanMotorAvail.setBounds(495, 215, 156, 31);
        pnDasbor.add(txtLahanMotorAvail);
        
        txtPendapatanToday = new JTextField();
        txtPendapatanToday.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtPendapatanToday.setEditable(false);
        txtPendapatanToday.setColumns(10);
        txtPendapatanToday.setBounds(495, 173, 156, 31);
        pnDasbor.add(txtPendapatanToday);
        
        lblLahanMotorTersedia = new JLabel("Lahan Motor Tersedia");
        lblLahanMotorTersedia.setForeground(Color.WHITE);
        lblLahanMotorTersedia.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblLahanMotorTersedia.setBounds(33, 215, 294, 28);
        pnDasbor.add(lblLahanMotorTersedia);
        
        txtTotalParkirToday = new JTextField();
        txtTotalParkirToday.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtTotalParkirToday.setEditable(false);
        txtTotalParkirToday.setColumns(10);
        txtTotalParkirToday.setBounds(495, 257, 156, 31);
        pnDasbor.add(txtTotalParkirToday);
        
        lblTotalKendaraanParkir = new JLabel("Total Kendaraan Parkir hari ini");
        lblTotalKendaraanParkir.setForeground(Color.WHITE);
        lblTotalKendaraanParkir.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblTotalKendaraanParkir.setBounds(33, 257, 294, 28);
        pnDasbor.add(lblTotalKendaraanParkir);
        
        txtLahanMobilAvail = new JTextField();
        txtLahanMobilAvail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        txtLahanMobilAvail.setEditable(false);
        txtLahanMobilAvail.setColumns(10);
        txtLahanMobilAvail.setBounds(495, 299, 156, 31);
        pnDasbor.add(txtLahanMobilAvail);
        
        lblLahanMobilTersedia = new JLabel("Lahan Mobil Tersedia");
        lblLahanMobilTersedia.setForeground(Color.WHITE);
        lblLahanMobilTersedia.setFont(new Font("Tahoma", Font.PLAIN, 20));
        lblLahanMobilTersedia.setBounds(33, 296, 294, 28);
        pnDasbor.add(lblLahanMobilTersedia);
	
	pnMasuk = new javax.swing.JPanel();
	
	pnMasuk.setBackground(new Color(0, 0, 51));
	jLabel1 = new javax.swing.JLabel();
	jLabel1.setForeground(Color.WHITE);
	jLabel2 = new javax.swing.JLabel();
	jLabel2.setForeground(Color.WHITE);
	txtNoPol = new javax.swing.JTextField();
	txtNoPol.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource()==txtNoPol){
	        btnSimpan.doClick();
	        }
		}
	});
	cbJenis = new javax.swing.JComboBox<>();
	btnSimpan = new javax.swing.JButton();
	jScrollPane1 = new javax.swing.JScrollPane();
	tbMasukMotor = new javax.swing.JTable();
	jLabel1.setText("No. Pol");
	jLabel2.setText("Jenis");
	txtNoPol.addKeyListener(new java.awt.event.KeyAdapter() {
		public void keyTyped(java.awt.event.KeyEvent evt) {
			txtNoPolKeyTyped(evt);
		}
	});
	
	cbJenis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Pilih Jenis Kendaraan-", "Motor", "Mobil" }));
	btnSimpan.setText("Simpan");
	btnSimpan.addActionListener(new java.awt.event.ActionListener() {
		public void actionPerformed(java.awt.event.ActionEvent evt) {
			btnSimpanActionPerformed(evt);
		}
	});
	
	        tbMasukMotor.setModel(new javax.swing.table.DefaultTableModel(
	        		new Object [][] {
	        			
	        		},
	        		new String [] {
	        				"No. Tiket", "No. Pol", "Tgl Masuk", "Jam Masuk"
	        		}
	        		));
	        jScrollPane1.setViewportView(tbMasukMotor);
	        
	        JLabel lblLahanParkir = new JLabel("Lahan Motor");
	        lblLahanParkir.setForeground(Color.WHITE);
	        
	        
	        
	        
	        JButton btnUbahLahan = new JButton("Ubah Lahan");
	        btnUbahLahan.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		String updLahanMotor = txtLahanMotor.getText();
	        		String updLahanMobil = txtLahanMobil.getText();
	        		String sql = "UPDATE setparkir SET lahan_motor='"+updLahanMotor+"', lahan_mobil='"+updLahanMobil+"' "
	                        + "WHERE ID=1";
	                try{
	                    konek.st = konek.conn.createStatement();
	                    konek.st.execute(sql);
	                }
	                catch (SQLException e){
	                    JOptionPane.showMessageDialog(txtLahanMotor, "Lahan Gagal diubah. "+e);
	                    return;
	                }
	                JOptionPane.showMessageDialog(txtLahanMotor, "Lahan Berhasil diubah.");
	        	}
	        });
	        
	        txtLahanMotor = new JTextField();
	        txtLahanMotor.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent e) {
	        		if (e.getSource()==txtLahanMotor){
	        			btnUbahLahan.doClick();
	        	        }
	        	}
	        });
	        txtLahanMotor.setColumns(10);
	        
	        JButton btnHapus = new JButton();
	        btnHapus.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	                int barismotor = tbMasukMotor.getSelectedRow();
	                int barismobil = tbMasukMobil.getSelectedRow();
	                if (barismotor != -1) {
	                	try {
	                		konek.st = konek.conn.createStatement();
	                		String id = tbMasukMotor.getValueAt(barismotor, 0).toString();
	                		String query = "DELETE FROM parkirmasuk WHERE no_tiket='"+id+"'";
	                		int status = konek.st.executeUpdate(query);
	                		if (status == 1) {
	                			JOptionPane.showMessageDialog(btnHapus, "Data Berhasil dihapus");
	                		}
	                		else {
	                			JOptionPane.showMessageDialog(btnHapus, "Data Gagal dihapus");
	                		}
	                			
	                	} catch (Exception e) {
	                		JOptionPane.showMessageDialog(btnHapus, "Gagal Hapus Data "+e);
	                	}
	                } else if(barismobil != -1) {
	                	try {
	                		konek.st = konek.conn.createStatement();
	                		String id = tbMasukMobil.getValueAt(barismobil, 0).toString();
	                		String query = "DELETE FROM parkirmasuk WHERE no_tiket='"+id+"'";
	                		int status = konek.st.executeUpdate(query);
	                		if (status == 1) {
	                			JOptionPane.showMessageDialog(btnHapus, "Data Berhasil dihapus");
	                		}
	                		else {
	                			JOptionPane.showMessageDialog(btnHapus, "Data Gagal dihapus");
	                		}
	                			
	                	} catch (Exception e) {
	                		JOptionPane.showMessageDialog(btnHapus, "Gagal Hapus Data "+e);
	                	}
	                } else {
	                	JOptionPane.showMessageDialog(btnHapus, "Pilih Data Terlebih Dahulu");
	                }
	                
	                resetAll();
	                tampil_masuk_motor();
	                tampil_masuk_mobil();
	                tampil_keluar();
	                tampil_laporan();
	        	}
	        });
	        btnHapus.setText("Hapus");
	        
	        JScrollPane scrollPane_1 = new JScrollPane();
	        
	        txtLahanMobil = new JTextField();
	        txtLahanMobil.addActionListener(new ActionListener() {
	        	public void actionPerformed(ActionEvent arg0) {
	        		if (arg0.getSource()==txtLahanMobil){
	        			btnUbahLahan.doClick();
	        	        }
	        	}
	        });
	        txtLahanMobil.setColumns(10);
	        
	        lblLahanMobil = new JLabel("Lahan Mobil");
	        lblLahanMobil.setForeground(Color.WHITE);
	        
	        lblMobil = new JLabel();
	        lblMobil.setText("Mobil");
	        lblMobil.setHorizontalAlignment(SwingConstants.CENTER);
	        lblMobil.setForeground(Color.WHITE);
	        lblMobil.setFont(new Font("Dialog", Font.BOLD, 24));
	        
	        lblMotor = new JLabel();
	        lblMotor.setText("Motor");
	        lblMotor.setHorizontalAlignment(SwingConstants.CENTER);
	        lblMotor.setForeground(Color.WHITE);
	        lblMotor.setFont(new Font("Dialog", Font.BOLD, 24));
	        
     
	        
	        javax.swing.GroupLayout gl_pnMasuk = new javax.swing.GroupLayout(pnMasuk);
	        gl_pnMasuk.setHorizontalGroup(
	        	gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_pnMasuk.createSequentialGroup()
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        					.addGroup(gl_pnMasuk.createSequentialGroup()
	        						.addGap(19)
	        						.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING, false)
	        							.addGroup(gl_pnMasuk.createSequentialGroup()
	        								.addComponent(jLabel2)
	        								.addGap(33))
	        							.addGroup(gl_pnMasuk.createSequentialGroup()
	        								.addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        								.addPreferredGap(ComponentPlacement.RELATED)))
	        						.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING, false)
	        							.addGroup(gl_pnMasuk.createSequentialGroup()
	        								.addComponent(btnSimpan)
	        								.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        								.addComponent(btnHapus, GroupLayout.PREFERRED_SIZE, 77, GroupLayout.PREFERRED_SIZE))
	        							.addComponent(cbJenis, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	        							.addComponent(txtNoPol, GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)))
	        					.addGroup(gl_pnMasuk.createSequentialGroup()
	        						.addContainerGap()
	        						.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 330, Short.MAX_VALUE)))
	        				.addGroup(Alignment.TRAILING, gl_pnMasuk.createSequentialGroup()
	        					.addContainerGap()
	        					.addComponent(lblMotor, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
	        					.addGap(43)))
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        					.addGroup(gl_pnMasuk.createSequentialGroup()
	        						.addPreferredGap(ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
	        						.addGroup(gl_pnMasuk.createParallelGroup(Alignment.TRAILING, false)
	        							.addComponent(btnUbahLahan, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)
	        							.addGroup(gl_pnMasuk.createSequentialGroup()
	        								.addGroup(gl_pnMasuk.createParallelGroup(Alignment.TRAILING)
	        									.addComponent(lblLahanParkir, Alignment.LEADING)
	        									.addComponent(lblLahanMobil, GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE))
	        								.addGap(18)
	        								.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING, false)
	        									.addComponent(txtLahanMobil, 0, 0, Short.MAX_VALUE)
	        									.addComponent(txtLahanMotor, GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE))))
	        						.addGap(29))
	        					.addGroup(gl_pnMasuk.createSequentialGroup()
	        						.addPreferredGap(ComponentPlacement.UNRELATED)
	        						.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 315, GroupLayout.PREFERRED_SIZE)
	        						.addContainerGap()))
	        				.addGroup(gl_pnMasuk.createSequentialGroup()
	        					.addGap(41)
	        					.addComponent(lblMobil, GroupLayout.PREFERRED_SIZE, 250, GroupLayout.PREFERRED_SIZE)
	        					.addContainerGap())))
	        );
	        gl_pnMasuk.setVerticalGroup(
	        	gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_pnMasuk.createSequentialGroup()
	        			.addGap(25)
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        				.addComponent(jLabel1)
	        				.addGroup(gl_pnMasuk.createSequentialGroup()
	        					.addGap(1)
	        					.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        						.addComponent(txtNoPol, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(txtLahanMotor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        						.addComponent(lblLahanParkir))))
	        			.addPreferredGap(ComponentPlacement.UNRELATED)
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.LEADING)
	        				.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        					.addComponent(jLabel2)
	        					.addComponent(cbJenis, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        				.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        					.addComponent(txtLahanMobil, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
	        					.addComponent(lblLahanMobil)))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(btnSimpan)
	        				.addComponent(btnHapus)
	        				.addComponent(btnUbahLahan))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblMotor, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(lblMobil, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
	        			.addPreferredGap(ComponentPlacement.RELATED)
	        			.addGroup(gl_pnMasuk.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)
	        				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE))
	        			.addContainerGap())
	        );
	        
	        tbMasukMobil = new JTable();
	        tbMasukMobil.setModel(new DefaultTableModel(
	        		new Object[][] {
	        		},
	        		new String[] {
	        				"No. Tiket", "No. Pol", "Tgl Masuk", "Jam Masuk"
	        		}
	        	));
	        scrollPane_1.setViewportView(tbMasukMobil);
	       // scrollPane_1.setColumnHeaderView(tbMasukMobil);
	        pnMasuk.setLayout(gl_pnMasuk);
	        
	jTabbedPane1.addTab("Parkir Masuk", pnMasuk);
	jTabbedPane1.addTab("Parkir Keluar", pnKeluar);
	pnKeluar.setLayout(null);
	pnKeluar.add(jLabel4);
	pnKeluar.add(jLabel5);
	pnKeluar.add(jLabel6);
	pnKeluar.add(txtKJenis);
	pnKeluar.add(txtKNoTiket);
	pnKeluar.add(txtKNoPol);
	pnKeluar.add(btnKeluar);
	pnKeluar.add(btnCari);
	pnKeluar.add(btnClear);
	pnKeluar.add(jLabel11);
	pnKeluar.add(jLabel7);
	pnKeluar.add(jLabel9);
	pnKeluar.add(txtKTglMasuk);
	pnKeluar.add(txtKDurasiH);
	pnKeluar.add(txtKBiaya);
	pnKeluar.add(jLabel10);
	pnKeluar.add(jLabel8);
	pnKeluar.add(jLabel12);
	pnKeluar.add(txtKDurasiJ);
	pnKeluar.add(txtKJamMasuk);
	pnKeluar.add(txtKBiayaAkhir);
	pnKeluar.add(jScrollPane2);
	
	/*btnHapus_1 = new JButton();
	btnHapus_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			int baris = tbKeluar.getSelectedRow();
            if (baris != -1) {
            	try {
            		konek.st = konek.conn.createStatement();
            		String id = tbKeluar.getValueAt(baris, 0).toString();
            		String query = "DELETE FROM parkirmasuk WHERE no_tiket='"+id+"'";
            		int status = konek.st.executeUpdate(query);
            		if (status == 1) {
            			JOptionPane.showMessageDialog(btnHapus, "Data Berhasil dihapus");
            		}
            		else {
            			JOptionPane.showMessageDialog(btnHapus, "Data Gagal dihapus");
            		}
            			
            	} catch (Exception e) {
            		JOptionPane.showMessageDialog(btnHapus, "Gagal ambil data ea"+e);
            	}
            } else {
            	JOptionPane.showMessageDialog(btnHapus, "Pilih Data Terlebih Dahulu");
            }
            
            resetAll();
            tampil_masuk_motor();
            tampil_masuk_mobil();
            tampil_keluar();
            tampil_laporan();
		}
	});
	btnHapus_1.setText("Hapus");
	btnHapus_1.setBounds(426, 10, 79, 28);
	jPanel1.add(btnHapus_1);*/
	
	JPanel pnLaporan = new JPanel();
	pnLaporan.addComponentListener(new ComponentAdapter() {
		@Override
		public void componentShown(ComponentEvent arg0) {
			cek_dasbor();
		}
	});
	pnLaporan.setBackground(new Color(0, 0, 51));
	jTabbedPane1.addTab("Laporan", null, pnLaporan, null);
	pnLaporan.setLayout(null);
	
	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(10, 59, 655, 427);
	pnLaporan.add(scrollPane);
	
	tbLaporan = new JTable();
	tbLaporan.setModel(new DefaultTableModel(
		new Object[][] {
		},
		new String[] {
			"No. Laporan", "Tanggal", "Jam", "Total Kendaraan", "Total Pendapatan"
		}
	));

	scrollPane.setViewportView(tbLaporan);
	
	lblRekapLaporanParkir = new JLabel();
	lblRekapLaporanParkir.setHorizontalAlignment(SwingConstants.CENTER);
	lblRekapLaporanParkir.setText("Rekap Laporan Parkir");
	lblRekapLaporanParkir.setForeground(Color.WHITE);
	lblRekapLaporanParkir.setFont(new Font("Dialog", Font.BOLD, 24));
	lblRekapLaporanParkir.setBounds(204, 17, 268, 31);
	pnLaporan.add(lblRekapLaporanParkir);
	
	JButton btnNewButton = new JButton("Buat Laporan");
	btnNewButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			System.out.println(lblbiaya1.getText());
			int total_biaya = Integer.parseInt(lblbiaya1.getText());
			int total_kendaraan = Integer.parseInt(txtTotalParkirToday.getText());
			String sql = "INSERT INTO laporan(tanggal,jam,total_biaya,jumlah_kendaraan)"
                    + "VALUES(CURDATE(),CURTIME(),'"+total_biaya+"','"+total_kendaraan+"')";
			try {
				konek.st = konek.conn.createStatement();
				konek.st.execute(sql);
			}
			catch (SQLException e) {
				JOptionPane.showMessageDialog(btnNewButton, "Data gagal disimpan"+e);
				return;
			}
			JOptionPane.showMessageDialog(btnNewButton, "Data berhasil disimpan");
			resetAll();
	        tampil_masuk_motor();
	        tampil_masuk_mobil();
	        tampil_keluar();
	        tampil_laporan();
	        System.out.println();
		}
	});
	btnNewButton.setBounds(544, 25, 121, 23);
	pnLaporan.add(btnNewButton);
	
	JButton btnHapusLaporan = new JButton("Hapus Laporan");
	btnHapusLaporan.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			int baris = tbLaporan.getSelectedRow();
			if (baris != -1) {
				try {
					konek.st = konek.conn.createStatement();
					String id = tbLaporan.getValueAt(baris, 0).toString();
					String query = "DELETE FROM laporan WHERE no_laporan='"+id+"'";
					int status = konek.st.executeUpdate(query);
					if (status == 1) {
						JOptionPane.showMessageDialog(btnHapusLaporan, "Data Berhasil dihapus");
					} else {
						JOptionPane.showMessageDialog(btnHapusLaporan, "Data Gagal dihapus");
					}
				} catch (Exception e) {
						JOptionPane.showMessageDialog(btnHapusLaporan, "Data Gagal dihapus "+e);
				}
			} else {
				JOptionPane.showMessageDialog(btnHapusLaporan, "Pilih Data Terlebih Dahulu");
			}
			resetAll();
            tampil_masuk_motor();
            tampil_masuk_mobil();
            tampil_keluar();
            tampil_laporan();
		}
	});
	btnHapusLaporan.setBounds(10, 25, 121, 23);
	pnLaporan.add(btnHapusLaporan);
        cek_lahan_motor();
        cek_lahan_mobil();
        getContentPane().add(lblTukangParkirV);
        getContentPane().add(button);
        getContentPane().add(button_1);
        getContentPane().add(label);
        getContentPane().add(jLabel3);
        
        btnTentang = new JButton("Tentang");
        btnTentang.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new tentang().setVisible(true);
        	}
        });
        btnTentang.setBounds(608, 61, 82, 23);
        getContentPane().add(btnTentang);
        
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		new login().setVisible(true);
                dispose();
        	}
        });
        btnLogout.setBounds(10, 62, 73, 23);
        getContentPane().add(btnLogout);
        tampil_masuk_motor();
        tampil_masuk_mobil();
        tampil_keluar();
        tampil_laporan();
    }

    private void initComponents() {

        lblbiaya = new javax.swing.JLabel();
        lblbiaya1 = new javax.swing.JLabel();

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane1.setBounds(10, 95, 680, 525);
        jLabel3 = new javax.swing.JLabel();
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setBounds(212, 52, 268, 31);
        jLabel3.setForeground(Color.WHITE);

        lblbiaya.setText("jLabel13");
        lblbiaya1.setText("jLabel13");


        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tukang Parkir v2.2 - Menu Parkir");
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        jLabel3.setText("Tukang Parkir v2.2");
        
        button = new JButton();
        button.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		System.exit(ABORT);
        	}
        });
        button.setBounds(684, 0, 16, 18);
        button.setIcon(new ImageIcon(menu.class.getResource("/UI/exit.png")));
        button.setHideActionText(true);
        button.setBackground(new Color(102, 204, 153));
        
        button_1 = new JButton();
        button_1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		setState(ICONIFIED);
        	}
        });
        button_1.setIcon(new ImageIcon(menu.class.getResource("/UI/minimize.png")));
        button_1.setBounds(663, 0, 16, 18);
        button_1.setHideActionText(true);
        button_1.setBackground(new Color(102, 204, 153));
        
        label = new JLabel("");
        label.addMouseMotionListener(new MouseMotionAdapter() {
        	@Override
        	public void mouseDragged(MouseEvent arg0) {
        		int cordX = arg0.getXOnScreen();
        		int cordY = arg0.getYOnScreen();
        		setLocation(cordX-mousepX, cordY-mousepY);
        	}
        });
        label.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mousePressed(MouseEvent e) {
        		mousepX = e.getX();
        		mousepY = e.getY();
        	}
        });
        label.setBounds(0, 0, 700, 18);
        label.setIcon(new ImageIcon(menu.class.getResource("/UI/Frame Bar.png")));
        
        lblTukangParkirV = new JLabel("Tukang Parkir v2.2");
        lblTukangParkirV.setBounds(10, 0, 103, 18);
        lblTukangParkirV.setForeground(Color.WHITE);
        lblTukangParkirV.setFont(new Font("Roboto Medium", Font.PLAIN, 12));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoPolKeyTyped
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtNoPolKeyTyped

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
    	int lahanTerpakaiMotor = tbMasukMotor.getRowCount();
    	int lahanTerpakaiMobil = tbMasukMobil.getRowCount();
    	String STLahanMotor = txtLahanMotor.getText();
    	String STLahanMobil = txtLahanMobil.getText();
    	int JumlahLahanMotor = Integer.parseInt(STLahanMotor);
    	int JumlahLahanMobil = Integer.parseInt(STLahanMobil);
        if (txtNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nomor polisi belum diisi!");
        } else if (cbJenis.getSelectedItem().equals("-Pilih Jenis Kendaraan-")) {
            JOptionPane.showMessageDialog(this, "Jenis kendaraan belum dipilih"); 
        } else if (cbJenis.getSelectedItem().equals("Motor")) {
        	if(lahanTerpakaiMotor > JumlahLahanMotor || lahanTerpakaiMotor == JumlahLahanMotor) {
        		JOptionPane.showMessageDialog(this, "Lahan Sudah Penuh.");
        	} else {
        		esekusi_masuk();
        	}
        } else {
        	if(lahanTerpakaiMobil > JumlahLahanMobil || lahanTerpakaiMobil == JumlahLahanMobil) {
        		JOptionPane.showMessageDialog(this, "Lahan Sudah Penuh.");
            } else {
            	esekusi_masuk();
            }
        }

        resetAll();
        tampil_masuk_motor();
        tampil_masuk_mobil();
        tampil_keluar();
        tampil_laporan();
    }//GEN-LAST:event_btnSimpanActionPerformed
    
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty())
            JOptionPane.showMessageDialog(this, "No. Pol masih kosong!");
        else {
            DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
            DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
            formatRp.setCurrencySymbol("Rp ");
            formatRp.setMonetaryDecimalSeparator(',');
            formatRp.setGroupingSeparator('.');
            rupiah.setDecimalFormatSymbols(formatRp);

            String sql = "SELECT *, DATEDIFF(CURDATE(), tgl_masuk) durasi_hari, (TIME_FORMAT(CURTIME(),'%H')-TIME_FORMAT(jam_masuk, '%H')) durasi_jam "
                    + "FROM parkirmasuk WHERE no_pol='"+txtKNoPol.getText()+"' AND biaya=0";
            try
            {
                konek.st = konek.conn.createStatement();
                konek.rs = konek.st.executeQuery(sql);
            } catch (SQLException ex){
                JOptionPane.showMessageDialog(this, "Kesalahan tidak diketahui"+ex);
            }
            int size=0;
            try {
                while (konek.rs.next()){
                    size++;
                    txtKNoTiket.setText(konek.rs.getString("no_tiket"));
                    txtKJenis.setText(konek.rs.getString("jenis"));
                    txtKTglMasuk.setText(konek.rs.getString("tgl_masuk"));
                    txtKJamMasuk.setText(konek.rs.getString("jam_masuk"));
                    int hari = Integer.parseInt(konek.rs.getString("durasi_hari"));
                    int jam = Integer.parseInt(konek.rs.getString("durasi_jam"));
                    int biaya, biaya_akhir, biayainap;
                    System.out.println(konek.rs.getString("durasi_jam"));
                    if(txtKJenis.getText().equals("Mobil")){
                        txtKBiaya.setText(rupiah.format(5000));
                        biaya = 5000;
                        biayainap = 50000;
                    } else {
                        txtKBiaya.setText(rupiah.format(2000));
                        biaya = 2000;
                        biayainap = 25000;
                    }
                    
                    if(hari>0){
                        txtKDurasiH.setText(""+hari+" hari");
                        txtKDurasiJ.setText("-");
                        biaya_akhir = biaya + (biayainap*hari);
                        txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                        lblbiaya.setText(""+biaya_akhir);
                    }
                    else{ 
                        if(txtKJenis.getText().equals("Mobil")) {
                        	txtKDurasiH.setText("0 hari");
                            txtKDurasiJ.setText(konek.rs.getString("durasi_jam")+" jam");
                            biaya_akhir = biaya + (1000*jam);
                            txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                            lblbiaya.setText(""+biaya_akhir);
                        }
                        else {
                        	txtKDurasiH.setText("0 hari");
                            txtKDurasiJ.setText(konek.rs.getString("durasi_jam")+" jam");
                            biaya_akhir = biaya + (500*jam);
                            txtKBiayaAkhir.setText(rupiah.format(biaya_akhir));
                            lblbiaya.setText(""+biaya_akhir);
                        }
                    	
                    }

                 }
                if(size==0)
                {
                    JOptionPane.showMessageDialog(this,"Data tidak ditemukan");
                    return;
                }
                konek.rs.close();
                konek.st.close();
            } catch (SQLException ex){
            }
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void txtKNoPolKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKNoPolKeyTyped
        // TODO add your handling code here:
        evt.setKeyChar(Character.toUpperCase(evt.getKeyChar())); 
    }//GEN-LAST:event_txtKNoPolKeyTyped

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
        // TODO add your handling code here:
        if(txtKNoPol.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Data kosong!");
        }
        else if(txtKNoTiket.getText().isEmpty()) {
        	JOptionPane.showMessageDialog(this, "Cari Data Terlebih Dahulu");
        	}
        else{
            int biaya = Integer.parseInt(lblbiaya.getText());
            String sql, notiket;
            notiket = txtKNoTiket.getText();
            
            sql = "UPDATE parkirmasuk SET tgl_keluar=CURDATE(), jam_keluar=CURTIME(), biaya='"+biaya+"' "
                    + "WHERE no_tiket='"+notiket+"'";
                try{
                    konek.st = konek.conn.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil diperbaharui");
                txtKNoPol.setText("");
                txtKNoTiket.setText("");
                txtKJenis.setText("");
                txtKTglMasuk.setText("");
                txtKJamMasuk.setText("");
                txtKDurasiH.setText("");
                txtKDurasiJ.setText("");
                txtKBiaya.setText("");
                txtKBiayaAkhir.setText("");
                resetAll();
                tampil_masuk_motor();
                tampil_masuk_mobil();
                tampil_keluar();
                tampil_laporan();
        }
   	}//GEN-LAST:event_btnKeluarActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtKNoPol.setText("");
        txtKNoTiket.setText("");
        txtKJenis.setText("");
        txtKTglMasuk.setText("");
        txtKJamMasuk.setText("");
        txtKDurasiH.setText("");
        txtKDurasiJ.setText("");
        txtKBiaya.setText("");
        txtKBiayaAkhir.setText("");
    }//GEN-LAST:event_btnClearActionPerformed
    
    public void resetAll(){
        //txtNoPol.setText("");
        //cbJenis.setSelectedIndex(0);
        masukmotor = (DefaultTableModel) tbMasukMotor.getModel();
        keluar = (DefaultTableModel) tbKeluar.getModel();
        laporan = (DefaultTableModel) tbLaporan.getModel();
        masukmobil = (DefaultTableModel) tbMasukMobil.getModel();
        int rowCount1 = masukmotor.getRowCount();
        int rowCount2 = keluar.getRowCount();
        int rowCount3 = laporan.getRowCount();
        int rowCount4 = masukmobil.getRowCount();
        //Remove rows one by one from the end of the table
        for (int i = rowCount1 - 1; i >= 0; i--) {
            masukmotor.removeRow(i);
        }
        for (int i = rowCount2 - 1; i >= 0; i--) {
            keluar.removeRow(i);
        }
        for (int i = rowCount3 - 1; i >= 0; i--) {
            laporan.removeRow(i);
        }
        for (int i = rowCount4 - 1; i >= 0; i--) {
            masukmobil.removeRow(i);
        }
    }
    
    public void tampil_masuk_motor(){
        masukmotor = (DefaultTableModel) tbMasukMotor.getModel();
        try {
        	String jenis = "Motor";
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM parkirmasuk WHERE biaya=0 AND jenis='"+jenis+"' ORDER BY no_tiket DESC";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                //String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket, no_pol, tgl_masuk, jam_masuk};
                masukmotor.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbMasukMotor.setModel(masukmotor);
    }
    
    public void tampil_masuk_mobil(){
        masukmobil = (DefaultTableModel) tbMasukMobil.getModel();
        try {
        	String jenis = "Mobil";
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM parkirmasuk WHERE biaya=0 AND jenis='"+jenis+"' ORDER BY no_tiket DESC";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                //String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String jam_masuk = konek.rs.getString("jam_masuk");
                
                String [] data = {no_tiket, no_pol, tgl_masuk, jam_masuk};
                masukmobil.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbMasukMobil.setModel(masukmobil);
    }
    
    public void cek_lahan_motor() {
    	try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT lahan_motor FROM setparkir WHERE ID=1";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
            	txtLahanMotor.setText(konek.rs.getString("lahan_motor"));
            }
    	} catch (Exception e) {
    		JOptionPane.showMessageDialog(this, "Gagal ambil data ea"+e);
    	}
    }
    
    public void cek_lahan_mobil() {
    	try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT lahan_mobil FROM setparkir WHERE ID=1";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
            	txtLahanMobil.setText(konek.rs.getString("lahan_mobil"));
            }
    	} catch (Exception e) {
    		JOptionPane.showMessageDialog(this, "Gagal ambil data ea"+e);
    	}
    }
    
    public void tampil_keluar(){
        DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        keluar = (DefaultTableModel) tbKeluar.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM parkirmasuk WHERE biaya <> 0 ORDER BY tgl_keluar DESC,jam_keluar DESC";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_tiket = konek.rs.getString("no_tiket");
                String no_pol = konek.rs.getString("no_pol");
                String jenis = konek.rs.getString("jenis");
                String tgl_masuk = konek.rs.getString("tgl_masuk");
                String tgl_keluar = konek.rs.getString("tgl_keluar");
                String jam_keluar = konek.rs.getString("jam_keluar");
                String biaya = konek.rs.getString("biaya");
                Double biaya2 = Double.parseDouble(biaya);
                String biaya_final = (rupiah.format(biaya2));
                
                String [] data = {no_tiket, no_pol, jenis, tgl_masuk, tgl_keluar, jam_keluar, biaya_final};
                keluar.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbKeluar.setModel(keluar);
    }
    
    public void tampil_laporan() {
    	DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
        
        laporan = (DefaultTableModel) tbLaporan.getModel();
        try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT * FROM laporan";
            konek.rs = konek.st.executeQuery(query);
            while (konek.rs.next()) {
                String no_laporan = konek.rs.getString("no_laporan");
                String tanggal = konek.rs.getString("tanggal");
                String jam = konek.rs.getString("jam");
                String total_biaya = konek.rs.getString("total_biaya");
                Double biaya2 = Double.parseDouble(total_biaya);
                String biaya_final = (rupiah.format(biaya2));
                String jumlah_kendaraan = konek.rs.getString("jumlah_kendaraan");
                
                String [] data = {no_laporan, tanggal, jam, jumlah_kendaraan, biaya_final};
                laporan.addRow(data);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal ambil data"+e);
        }
        tbLaporan.setModel(laporan);
    }
    
    public void cek_dasbor(){
    	txtLiveParkir.setText(Integer.toString(tbMasukMotor.getRowCount()));
    	int TotalParkir = tbMasukMotor.getRowCount() + tbKeluar.getRowCount();
    	txtTotalParkir.setText(Integer.toString(TotalParkir));
    	cek_lahan_tersedia_motor();
    	cek_lahan_tersedia_mobil();
    	hitung_pendapatan_harian();
    	hitung_parkir_harian();
    	hitung_total_pendapatan();
    	cek_waktu();
    	cek_tanggal();
    }

    public void cek_lahan_tersedia_mobil() {
    	int TotalLahan = Integer.parseInt(txtLahanMobil.getText());
    	int lahanTersedia = TotalLahan - tbMasukMobil.getRowCount(); 
    	if (lahanTersedia <= 0) {
    		txtLahanMobilAvail.setText("Lahan Penuh");
    	} else {
    		txtLahanMobilAvail.setText(Integer.toString(lahanTersedia));
    	}
    }
    
    public void cek_lahan_tersedia_motor() {
    	int TotalLahan = Integer.parseInt(txtLahanMotor.getText());
    	int lahanTersedia = TotalLahan - tbMasukMotor.getRowCount(); 
    	if (lahanTersedia <= 0) {
    		txtLahanMotorAvail.setText("Lahan Penuh");
    	} else {
    		txtLahanMotorAvail.setText(Integer.toString(lahanTersedia));
    	}
    }
    
    public void hitung_total_pendapatan() {
    	DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
    	try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT SUM(biaya) FROM parkirmasuk";
            konek.rs = konek.st.executeQuery(query);
            
            if (konek.rs.next()) {
            	System.out.println(konek.rs.getString("SUM(biaya)"));
            	if (konek.rs.wasNull()) {
            		txtPendapatan.setText("Rp 0,00");
            	} else {
            	int sum = Integer.parseInt(konek.rs.getString("SUM(biaya)"));
            	txtPendapatan.setText(rupiah.format(sum));
            	}
            }
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    		//JOptionPane.showMessageDialog(this, "Gagal ambil data total pendapatan "+e);
    	}
    }
    
    public void cek_waktu() {
    	updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTime = new Date();
                String formatTimeStr = "HH:mm:ss";
                DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
                String formattedTimeStr = formatTime.format(currentTime);
                lblTime.setText(formattedTimeStr);
                
    		}
    	});
    	updateTimer.start();
    }
    
    public void cek_tanggal() {
    	updateTimer = new Timer(DELAY, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date currentTime = new Date();
                String formatTimeStr = "E, dd MMM yyyy";
                DateFormat formatTime = new SimpleDateFormat(formatTimeStr);
                String formattedTimeStr = formatTime.format(currentTime);
                lblDate.setText(formattedTimeStr);
                
    		}
    	});
    	updateTimer.start();
    }
    
    public void hitung_parkir_harian() {
    	try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT COUNT(no_pol) FROM parkirmasuk WHERE tgl_keluar=CURDATE()";
            konek.rs = konek.st.executeQuery(query);
            
            if (konek.rs.next()) {
            	txtTotalParkirToday.setText(konek.rs.getString("COUNT(no_pol)"));
            }
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    		//JOptionPane.showMessageDialog(this, "Gagal ambil data total pendapatan "+e);
    	}
    }
    
    public void hitung_pendapatan_harian() {
    	DecimalFormat rupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols formatRp = new DecimalFormatSymbols();
        formatRp.setCurrencySymbol("Rp ");
        formatRp.setMonetaryDecimalSeparator(',');
        formatRp.setGroupingSeparator('.');
        rupiah.setDecimalFormatSymbols(formatRp);
    	try {
            konek.st = konek.conn.createStatement();
            String query = "SELECT SUM(biaya) FROM parkirmasuk WHERE tgl_keluar=CURDATE()";
            konek.rs = konek.st.executeQuery(query);
            
            if (konek.rs.next()) {
            	System.out.println(konek.rs.getString("SUM(biaya)"));
            	if (konek.rs.wasNull()) {
            		txtPendapatanToday.setText("Rp 0,00");
            		lblbiaya1.setText("0");
            	} else {
            	int sum = Integer.parseInt(konek.rs.getString("SUM(biaya)"));
            	txtPendapatanToday.setText(rupiah.format(sum));
            	lblbiaya1.setText(""+sum);
            	}
            }
    	} catch (Exception e) {
    		throw new RuntimeException(e);
    		//JOptionPane.showMessageDialog(this, "Gagal ambil data total pendapatan "+e);
    	}
    }
    
    public void esekusi_masuk() {
    	Connection connection;
        PreparedStatement ps;
    	try{
    	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_parkir?zeroDateTimeBehavior=convertToNull","root","");
    	ps= connection.prepareStatement("SELECT * FROM parkirmasuk WHERE no_pol = ? AND tgl_keluar IS NULL");
        ps.setString(1,txtNoPol.getText());
        ResultSet result = ps.executeQuery();
        if (result.next()) {
        
        	JOptionPane.showMessageDialog(this, "Nomor Plat ini sudah masuk");
        	} else {
        		String nopol, jenis, sql;
                nopol = txtNoPol.getText();
                jenis = cbJenis.getSelectedItem().toString();

                sql = "INSERT INTO parkirmasuk(no_pol,jenis,tgl_masuk,jam_masuk)"
                        + "VALUES('"+nopol+"','"+jenis+"',CURDATE(),CURTIME())";
                try{
                    konek.st = konek.conn.createStatement();
                    konek.st.execute(sql);
                }
                catch (SQLException e){
                    JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
                    return;
                }
                JOptionPane.showMessageDialog(this, "Data berhasil disimpan");
                txtNoPol.setText("");
                cbJenis.setSelectedIndex(0);
        	}

        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(this, "Data gagal disimpan"+e);
            return;
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                menu dialog = new menu(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JComboBox<String> cbJenis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel pnKeluar;
    private javax.swing.JPanel pnMasuk;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblbiaya;
    private javax.swing.JLabel lblbiaya1;
    private javax.swing.JTable tbKeluar;
    private javax.swing.JTable tbMasukMotor;
    private javax.swing.JTextField txtKBiaya;
    private javax.swing.JTextField txtKBiayaAkhir;
    private javax.swing.JTextField txtKDurasiH;
    private javax.swing.JTextField txtKDurasiJ;
    private javax.swing.JTextField txtKJamMasuk;
    private javax.swing.JTextField txtKJenis;
    private javax.swing.JTextField txtKNoPol;
    private javax.swing.JTextField txtKNoTiket;
    private javax.swing.JTextField txtKTglMasuk;
    private javax.swing.JTextField txtNoPol;
    private JLabel lblTukangParkirV;
    private JButton button;
    private JButton button_1;
    private JLabel label;
    private JButton btnTentang;
    private JButton btnLogout;
    private JTextField txtLahanMotor;
    private JTextField txtLiveParkir;
    private JTextField txtTotalParkir;
    private JLabel lblTotalPendapatan;
    private JTextField txtPendapatan;
    private JLabel lblSelamatDatang;
    private JLabel lblWaktu;
    private JLabel lblTime;
    private JLabel lblDate;
    private JLabel label_1;
    private JButton btnHapus_1;
    private JTextField txtLahanMotorAvail;
    private JTextField txtPendapatanToday;
    private JLabel lblLahanMotorTersedia;
    private JTable tbLaporan;
    private JLabel lblRekapLaporanParkir;
    private JTextField txtTotalParkirToday;
    private JLabel lblTotalKendaraanParkir;
    private JTable tbMasukMobil;
    private JTextField txtLahanMobil;
    private JLabel lblLahanMobil;
    private JTextField txtLahanMobilAvail;
    private JLabel lblLahanMobilTersedia;
    private JLabel lblMobil;
    private JLabel lblMotor;
}
   
   /*public void keluar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}*/
