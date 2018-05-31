package titoliazionari.ing;

import java.io.Serializable;

public class Lotto implements Serializable {
private Titolo azione ;
private int quantita;
private final static String STRING=" IL LOTTO ha una quantita' paro a %d\n";
public Lotto(Titolo azione, int quantita) {
	this.azione = azione;
	this.quantita = quantita;
}
public Titolo getAzione() {
	return azione;
}
public void setAzione(Titolo azione) {
	this.azione = azione;
}
public int getQuantita() {
	return quantita;
}
public void setQuantita(int quantita) {
	this.quantita = quantita;
}
public StringBuffer toString(Lotto lotto)
{ StringBuffer string =new StringBuffer();
string.append(lotto.azione.toString());
string.append(String.format(STRING, lotto.quantita));
return  string;
	
}


}
