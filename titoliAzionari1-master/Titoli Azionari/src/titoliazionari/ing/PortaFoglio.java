package titoliazionari.ing;

import java.io.Serializable;
import java.util.ArrayList;

import javax.print.attribute.standard.PrinterMessageFromOperator;

import it.unibs.fp.mylib.InputDati;

public class PortaFoglio implements Serializable {
private int azione;
private ElencoTitoli elencoTitoli;
private ArrayList<Lotto> lotto=new ArrayList<Lotto>();
private final static String STRING= "IL PORTA FOGLIO HA %n azioni con le segueti proprieta'";


public int getAzione() {
	return azione;
}


public void setAzione(int azione) {
	this.azione = azione;
}


public ElencoTitoli getElencoTitoli() {
	return elencoTitoli;
}


public void setElencoTitoli(ElencoTitoli elencoTitoli) {
	this.elencoTitoli = elencoTitoli;
}


public PortaFoglio(int azione, ElencoTitoli elencoTitoli, ArrayList<Lotto> lotto) {
	super();
	this.azione = azione;
	this.elencoTitoli = elencoTitoli;
	this.lotto = lotto;
}


public PortaFoglio(int azione, ElencoTitoli elencoTitoli) {
	this.azione = azione;
	this.elencoTitoli = elencoTitoli;
}


public double valore (PortaFoglio portafoglio)
{
	
	ElencoTitoli value=portafoglio.elencoTitoli;
	return portafoglio.elencoTitoli.valoreElenco(value);
	


}
public void visuaizzazione (PortaFoglio portaFoglio)
{StringBuffer string =new StringBuffer();
string.append(portaFoglio.elencoTitoli.toString());
for(int i=0;i<portaFoglio.lotto.size();i++)
string.append(portaFoglio.lotto.get(i).toString()+"\n");
System.out.println(STRING+string);

	
}

public void addlotto(PortaFoglio portaFoglio,Titolo nome,int numero) {
	
	portaFoglio.lotto.add(new Lotto(nome,numero));
}


	
	
	

}
