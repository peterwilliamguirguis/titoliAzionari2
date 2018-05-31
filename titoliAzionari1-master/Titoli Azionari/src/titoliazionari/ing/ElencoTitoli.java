package titoliazionari.ing;

import java.io.Serializable;
import java.util.ArrayList;

import com.sun.org.apache.regexp.internal.recompile;

import it.unibs.fp.mylib.InputDati;

public class ElencoTitoli implements Serializable {
private ArrayList <Titolo> insieme=new ArrayList<Titolo>();
private int numero ;
private final static String STRINGA="l'elenco ha %d titoli e sono\n";
private final static String STRINGA_appending="il titolo numero %d ha un nome %s ed ha un prezzo %f";

public ArrayList<Titolo> getInsieme() {
	return insieme;
}
public void setInsieme(ArrayList<Titolo> insieme) {
	this.insieme = insieme;
}
private final static String RICHIESTA_NOME= "inserire il nome del titolo" ;
private final static String richiesta_NUMERO= "inserire il NUMERO del titolo" ;

public int getNumero() {
	return numero;
}
public void setNumero(int numero) {
	this.numero = numero;
}
public ElencoTitoli(ArrayList<Titolo> insieme, int numero) {
	super();
	this.insieme = insieme;
	this.numero = numero;	
for(int i=0;i<this.numero;i++)
{ this.insieme.add(new Titolo (InputDati.leggiStringa(RICHIESTA_NOME),InputDati.leggiIntero(richiesta_NUMERO)));
	
	
}

}
public void addTitolo(Titolo l)
{
	insieme.add(l);
	
}
public double valoreElenco(ElencoTitoli elenco)
{ double value1=0 ;
	for(int i=0;i<elenco.getNumero();i++)
	{ Titolo value =elenco.insieme.get(i);
		value1 =value.getPrezzo()+value1;
	}
	return value1;
}
public String toString(ElencoTitoli elencoTitoli)
{ StringBuffer pop=new StringBuffer();
for(int i=0;i<=elencoTitoli.getNumero();i++)
{
	pop.append(String.format(STRINGA_appending,i,elencoTitoli.insieme.get(i).getNome(),elencoTitoli.insieme.get(i).getPrezzo()));
	
}
return String.format(STRINGA+pop, elencoTitoli.numero);
	
}
public void simulaVariazione(ElencoTitoli elencoTitoli)

{
	
	
	
}
}
