package WdecProject;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class WdecProject extends JFrame {
	
	 Controler controler;

	 JPanel contentPane;
	 JTextField textField_jakoscZwykly;
	 JTextField textField_produkcjaZwykly;
	 JTextField textField_cenaZwykly;
	 JTextField textField_promocjaInternet;
	 JTextField textField_promocjaTelewizja;
	 JTextField textField_promocjaMagazyn;
	 JTextField textField_majatekTrwaly;
	 JTextField textField_maksKredyt;
	 JTextField textField_gotowka;
	 JTextField textField_zadluzenie;
	 JTextField textField_amortyzacja;
	 JTextField textField_kosztyStale;
	 JTextField textField_oprocKonta;
	 JTextField textField_oprocKredytu;
	 JTextField textField_stawkaPodatku;
	 JTextField textField_maksProdukcja;
	 JTextField textField_zysk;
	 JTextField textField_ryzyko;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WdecProject frame = new WdecProject();
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
	public WdecProject() {
		
		controler = new Controler(this);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 712, 528);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(1, 0, 0, 0));
		
		JPanel panel_stan = new JPanel();
		contentPane.add(panel_stan);
		
		JLabel lblStan = new JLabel("Stan");
		lblStan.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label_majatekTrwaly = new JLabel("Majatek trwaly");
		
		JLabel label_maksKredyt = new JLabel("Maks kredyt");
		
		JLabel label_gotowka = new JLabel("Gotowka");
		
		JLabel label_zadluzenie = new JLabel("Zadluzenie");
		
		JLabel label_amortyzacja = new JLabel("Amortyzacja");
		
		JLabel label_kosztyStale = new JLabel("Koszty stale");
		
		JLabel label_oprocKonta = new JLabel("Oproc konta");
		
		textField_majatekTrwaly = new JTextField();
		textField_majatekTrwaly.setText("1000000");
		textField_majatekTrwaly.setColumns(10);
		
		textField_maksKredyt = new JTextField();
		textField_maksKredyt.setText("800000");
		textField_maksKredyt.setColumns(10);
		
		textField_gotowka = new JTextField();
		textField_gotowka.setText("300000");
		textField_gotowka.setColumns(10);
		
		textField_zadluzenie = new JTextField();
		textField_zadluzenie.setText("0");
		textField_zadluzenie.setColumns(10);
		
		textField_amortyzacja = new JTextField();
		textField_amortyzacja.setText("20000");
		textField_amortyzacja.setColumns(10);
		
		textField_kosztyStale = new JTextField();
		textField_kosztyStale.setText("10000");
		textField_kosztyStale.setColumns(10);
		
		textField_oprocKonta = new JTextField();
		textField_oprocKonta.setText("0.04");
		textField_oprocKonta.setColumns(10);
		
		JButton btnOblicz = new JButton("Oblicz");
		btnOblicz.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controler.obliczWindow();
			}
		});
		
		JLabel label_oprocKredytu = new JLabel("Oproc kredytu");
		
		JLabel label_stawkaPodatku = new JLabel("Stawka podatku");
		
		JLabel label_maksProdukcja = new JLabel("Maks produkcja");
		
		textField_oprocKredytu = new JTextField();
		textField_oprocKredytu.setText("0.12");
		textField_oprocKredytu.setColumns(10);
		
		textField_stawkaPodatku = new JTextField();
		textField_stawkaPodatku.setText("0.19");
		textField_stawkaPodatku.setColumns(10);
		
		textField_maksProdukcja = new JTextField();
		textField_maksProdukcja.setText("400000");
		textField_maksProdukcja.setColumns(10);
		
		JLabel lblRyzyko = new JLabel("Ryzyko");
		
		textField_ryzyko = new JTextField();
		textField_ryzyko.setText("0.3");
		textField_ryzyko.setColumns(10);
		GroupLayout gl_panel_stan = new GroupLayout(panel_stan);
		gl_panel_stan.setHorizontalGroup(
			gl_panel_stan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.LEADING)
						.addComponent(lblStan)
						.addGroup(gl_panel_stan.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_panel_stan.createParallelGroup(Alignment.LEADING)
								.addComponent(label_majatekTrwaly)
								.addComponent(label_maksKredyt)
								.addComponent(label_gotowka)
								.addComponent(label_zadluzenie)
								.addComponent(label_amortyzacja)
								.addComponent(label_kosztyStale)
								.addComponent(label_oprocKonta))
							.addGap(49)
							.addGroup(gl_panel_stan.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_oprocKonta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_kosztyStale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_amortyzacja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_zadluzenie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_gotowka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_maksKredyt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_majatekTrwaly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_oprocKredytu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_stawkaPodatku, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_maksProdukcja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_ryzyko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(81, Short.MAX_VALUE))
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addContainerGap(263, Short.MAX_VALUE)
					.addComponent(btnOblicz)
					.addContainerGap())
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_oprocKredytu)
					.addContainerGap(250, Short.MAX_VALUE))
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_stawkaPodatku)
					.addContainerGap(239, Short.MAX_VALUE))
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_maksProdukcja)
					.addContainerGap(241, Short.MAX_VALUE))
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblRyzyko)
					.addContainerGap(274, Short.MAX_VALUE))
		);
		gl_panel_stan.setVerticalGroup(
			gl_panel_stan.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_stan.createSequentialGroup()
					.addComponent(lblStan)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_majatekTrwaly)
						.addComponent(textField_majatekTrwaly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_maksKredyt)
						.addComponent(textField_maksKredyt, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_gotowka)
						.addComponent(textField_gotowka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_zadluzenie)
						.addComponent(textField_zadluzenie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_amortyzacja)
						.addComponent(textField_amortyzacja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_kosztyStale)
						.addComponent(textField_kosztyStale, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_oprocKonta)
						.addComponent(textField_oprocKonta, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_oprocKredytu)
						.addComponent(textField_oprocKredytu, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_stawkaPodatku)
						.addComponent(textField_stawkaPodatku, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_maksProdukcja)
						.addComponent(textField_maksProdukcja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_stan.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRyzyko)
						.addComponent(textField_ryzyko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
					.addComponent(btnOblicz)
					.addContainerGap())
		);
		panel_stan.setLayout(gl_panel_stan);
		
		JPanel panel_decyzja = new JPanel();
		contentPane.add(panel_decyzja);
		
		JLabel label_decyzje = new JLabel("Decyzje");
		label_decyzje.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		JLabel label_jakoscZwykly = new JLabel("Jakosc Zwykly");
		
		textField_jakoscZwykly = new JTextField();
		textField_jakoscZwykly.setEditable(false);
		textField_jakoscZwykly.setColumns(10);
		
		JLabel label_produkcjaZwykly = new JLabel("Produkcja Zwykly");
		
		textField_produkcjaZwykly = new JTextField();
		textField_produkcjaZwykly.setEditable(false);
		textField_produkcjaZwykly.setColumns(10);
		
		JLabel label_cenaZwykly = new JLabel("Cena Zwykly");
		
		textField_cenaZwykly = new JTextField();
		textField_cenaZwykly.setEditable(false);
		textField_cenaZwykly.setColumns(10);
		
		JLabel label_promocjaInternet = new JLabel("Promocja Internet");
		
		textField_promocjaInternet = new JTextField();
		textField_promocjaInternet.setEditable(false);
		textField_promocjaInternet.setColumns(10);
		
		JLabel label_promocjaTelewizja = new JLabel("Promocja Telewizja");
		
		textField_promocjaTelewizja = new JTextField();
		textField_promocjaTelewizja.setEditable(false);
		textField_promocjaTelewizja.setColumns(10);
		
		JLabel label_promocjaMagazyn = new JLabel("Promocja Magazyn");
		
		textField_promocjaMagazyn = new JTextField();
		textField_promocjaMagazyn.setEditable(false);
		textField_promocjaMagazyn.setColumns(10);
		
		JButton btnResetuj = new JButton("Resetuj");
		btnResetuj.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				controler.resetWindow();
			}
		});
		
		JLabel label_zysk = new JLabel("Zysk");
		
		textField_zysk = new JTextField();
		textField_zysk.setEditable(false);
		textField_zysk.setColumns(10);
		GroupLayout gl_panel_decyzja = new GroupLayout(panel_decyzja);
		gl_panel_decyzja.setHorizontalGroup(
			gl_panel_decyzja.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel_decyzja.createSequentialGroup()
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.LEADING)
						.addComponent(label_decyzje)
						.addGroup(gl_panel_decyzja.createSequentialGroup()
							.addContainerGap()
							.addComponent(label_jakoscZwykly)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(textField_jakoscZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(141, Short.MAX_VALUE))
				.addGroup(gl_panel_decyzja.createSequentialGroup()
					.addContainerGap(264, Short.MAX_VALUE)
					.addComponent(btnResetuj)
					.addContainerGap())
				.addGroup(Alignment.LEADING, gl_panel_decyzja.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_produkcjaZwykly)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textField_produkcjaZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(142))
				.addGroup(Alignment.LEADING, gl_panel_decyzja.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_cenaZwykly)
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addComponent(textField_cenaZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(142))
				.addGroup(Alignment.LEADING, gl_panel_decyzja.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel_decyzja.createSequentialGroup()
							.addComponent(label_promocjaInternet)
							.addGap(18)
							.addComponent(textField_promocjaInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_decyzja.createSequentialGroup()
							.addComponent(label_promocjaTelewizja)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(textField_promocjaTelewizja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel_decyzja.createSequentialGroup()
							.addComponent(label_promocjaMagazyn)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.LEADING)
								.addComponent(textField_zysk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(textField_promocjaMagazyn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(142, Short.MAX_VALUE))
				.addGroup(Alignment.LEADING, gl_panel_decyzja.createSequentialGroup()
					.addContainerGap()
					.addComponent(label_zysk)
					.addContainerGap(287, Short.MAX_VALUE))
		);
		gl_panel_decyzja.setVerticalGroup(
			gl_panel_decyzja.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel_decyzja.createSequentialGroup()
					.addComponent(label_decyzje)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_jakoscZwykly)
						.addComponent(textField_jakoscZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_produkcjaZwykly)
						.addComponent(textField_produkcjaZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_cenaZwykly)
						.addComponent(textField_cenaZwykly, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_promocjaInternet)
						.addComponent(textField_promocjaInternet, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_promocjaTelewizja)
						.addComponent(textField_promocjaTelewizja, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_promocjaMagazyn)
						.addComponent(textField_promocjaMagazyn, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_panel_decyzja.createParallelGroup(Alignment.BASELINE)
						.addComponent(label_zysk)
						.addComponent(textField_zysk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
					.addComponent(btnResetuj)
					.addContainerGap())
		);
		panel_decyzja.setLayout(gl_panel_decyzja);
	}
}
