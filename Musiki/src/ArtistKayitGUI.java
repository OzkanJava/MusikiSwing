import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.Helper;
import datas.AddArtistPass;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ArtistKayitGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKullaniciAdi;
	private JLabel lblSifre;
	private JLabel lblifre;
	private JLabel lblKarsila;
	private JPasswordField pfSifre;
	private JPasswordField pfSifreTekrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ArtistKayitGUI frame = new ArtistKayitGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ArtistKayitGUI() {
		setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 380, 400);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblKullaniciadi = new JLabel("Kullanıcı Adı:");
		lblKullaniciadi.setForeground(Color.WHITE);
		lblKullaniciadi.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblKullaniciadi.setBounds(10, 11, 167, 39);
		contentPane.add(lblKullaniciadi);
		
		txtKullaniciAdi = new JTextField();
		txtKullaniciAdi.setBounds(187, 11, 158, 39);
		contentPane.add(txtKullaniciAdi);
		txtKullaniciAdi.setColumns(10);
		
		lblSifre = new JLabel("Şifre:");
		lblSifre.setForeground(Color.WHITE);
		lblSifre.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblSifre.setBounds(10, 65, 167, 39);
		contentPane.add(lblSifre);
		
		lblifre = new JLabel("Şifre Tekrar:");
		lblifre.setForeground(Color.WHITE);
		lblifre.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblifre.setBounds(10, 115, 167, 39);
		contentPane.add(lblifre);
		
		lblKarsila = new JLabel("Dogru yoldasin --Musiki");
		lblKarsila.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKarsila.setForeground(Color.RED);
		lblKarsila.setBounds(10, 303, 335, 33);
		contentPane.add(lblKarsila);
		
		pfSifre = new JPasswordField();
		pfSifre.setBounds(187, 61, 158, 39);
		contentPane.add(pfSifre);
		
		pfSifreTekrar = new JPasswordField();
		pfSifreTekrar.setBounds(187, 113, 158, 39);
		contentPane.add(pfSifreTekrar);
		
		JButton btnKayitOl = new JButton("Kayıt Ol");
		btnKayitOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(txtKullaniciAdi.getText().length() == 0 || pfSifre.getText().length() == 0 || pfSifreTekrar.getText().length() == 0) {
					Helper.showMsg("fill");		
				}else {
					if(!pfSifre.getText().equals(pfSifreTekrar.getText())) {
						Helper.showMsg("sifre alanlari esit olmali..");
					}
					else {
						AddArtistPass.ekleDosyaya(txtKullaniciAdi.getText(),pfSifre.getText());
						Helper.showMsg("Kayit Basarili");
						dispose();
					}
				}
				


			}
		});
		btnKayitOl.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnKayitOl.setBounds(93, 165, 177, 51);
		contentPane.add(btnKayitOl);
	}
}
