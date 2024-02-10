import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Helper.Helper;
import datas.AddArtistPass;
import datas.AddDinleyiciPass;

import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DinleyiciKayitGUI extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtKullaniciAdi;
	private JPasswordField pfSifre;
	private JPasswordField pfSifreTekrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DinleyiciKayitGUI frame = new DinleyiciKayitGUI();
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
	public DinleyiciKayitGUI() {
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
		txtKullaniciAdi.setColumns(10);
		txtKullaniciAdi.setBounds(187, 11, 158, 39);
		contentPane.add(txtKullaniciAdi);
		
		JLabel lblSifre = new JLabel("Şifre:");
		lblSifre.setForeground(Color.WHITE);
		lblSifre.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblSifre.setBounds(10, 65, 167, 39);
		contentPane.add(lblSifre);
		
		pfSifre = new JPasswordField();
		pfSifre.setBounds(187, 61, 158, 39);
		contentPane.add(pfSifre);
		
		JLabel lblSifreTekrar = new JLabel("Şifre Tekrar:");
		lblSifreTekrar.setForeground(Color.WHITE);
		lblSifreTekrar.setFont(new Font("Yu Gothic", Font.BOLD, 16));
		lblSifreTekrar.setBounds(10, 115, 167, 39);
		contentPane.add(lblSifreTekrar);
		
		pfSifreTekrar = new JPasswordField();
		pfSifreTekrar.setBounds(187, 113, 158, 39);
		contentPane.add(pfSifreTekrar);
		
		JButton btnKayıtOl = new JButton("Kayıt Ol");
		btnKayıtOl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 
					if(txtKullaniciAdi.getText().length() == 0 || pfSifre.getText().length() == 0 || pfSifreTekrar.getText().length() == 0) {
						Helper.showMsg("fill");		
					}else {
						if(!pfSifre.getText().equals(pfSifreTekrar.getText())) {
							Helper.showMsg("sifre alanlari esit olmali..");
						}
						else {
							AddDinleyiciPass.ekleDosyaya(txtKullaniciAdi.getText(),pfSifre.getText());
							Helper.showMsg("Kayit Basarili");
							dispose();
						}
					}
					


				}
			
		});
		btnKayıtOl.setForeground(new Color(0, 0, 0));
		btnKayıtOl.setBackground(Color.CYAN);
		btnKayıtOl.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnKayıtOl.setBounds(93, 165, 177, 51);
		contentPane.add(btnKayıtOl);
		
		JLabel lblKarsila = new JLabel("Dogru yoldasin --Musiki Dinleyicisi...");
		lblKarsila.setForeground(Color.RED);
		lblKarsila.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKarsila.setBounds(10, 303, 335, 33);
		contentPane.add(lblKarsila);
	}

}
