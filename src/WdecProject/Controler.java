package WdecProject;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import org.ojalgo.ProgrammingError;
import org.ojalgo.netio.Message;

import ext.ojalgo.ampl.JAMPL;

public class Controler {
	
	WdecProject window;
	JAMPL jampl;
	
	public Controler(WdecProject window) {
		this.window = window;
		try {
			this.jampl = new JAMPL();
		} catch (ProgrammingError e) {
			System.err.println(e);
		}
		
	}
	
	public void resetWindow() {
		window.textField_jakoscZwykly.setText("");
		window.textField_produkcjaZwykly.setText("");
		window.textField_cenaZwykly.setText("");
		window.textField_promocjaInternet.setText("");
		window.textField_promocjaTelewizja.setText("");
		window.textField_promocjaMagazyn.setText("");
		window.textField_majatekTrwaly.setText("");
		window.textField_maksKredyt.setText("");
		window.textField_gotowka.setText("");
		window.textField_zadluzenie.setText("");
		window.textField_amortyzacja.setText("");
		window.textField_kosztyStale.setText("");
		window.textField_oprocKonta.setText("");
		window.textField_oprocKredytu.setText("");
		window.textField_stawkaPodatku.setText("");
		window.textField_maksProdukcja.setText("");
		window.textField_zysk.setText("");
	}
	
	public void obliczWindow() {
		createData();
		solve();
		setData();
	}
	
	public void createData() {
		File file = new File("data.dat");
		PrintWriter writer;
		try {
			file.createNewFile();
			writer = new PrintWriter(file);
			
			// tutaj uzupelniamy plik .dat
			writer.println("param amortyzacja := " + window.textField_amortyzacja.getText() +";");
			writer.println("param gotowka := " + window.textField_gotowka.getText() +";");
			writer.println("param max_kredyt := " + window.textField_maksKredyt.getText() +";");
			writer.println("param max_produkcja := " + window.textField_maksProdukcja.getText() +";");
			writer.println("param k_staly := " + window.textField_kosztyStale.getText() +";");
			writer.println("param zadluzenie := " + window.textField_zadluzenie.getText() +";");
			//
			
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void solve() {
		Message message = new Message(
				"reset;\n" + "data data.dat;\n" + "model model.mod;\n" + "solve;\n"
				);
		List<Message> reply = jampl.communicate(message);
	}
	
	public void setData() {
		window.textField_jakoscZwykly.setText(display( "jakosc" ));
		window.textField_produkcjaZwykly.setText(display( "produkcja" ));
		window.textField_cenaZwykly.setText(display( "cena" ));
		window.textField_promocjaInternet.setText(display( "promocjaInternet" ));
		window.textField_promocjaMagazyn.setText(display( "promocjaMagazyn" ));
		window.textField_promocjaTelewizja.setText(display( "promocjaTelewizja" ));
		window.textField_zysk.setText(display( "zysk" ));
	}
	
	public String display(String param) {
		Message message = new Message("display " + param + ";");
		List<Message> reply = jampl.communicate(message);
		return reply.get(0).toString();
	}
}
