package titoliazionari.ing;

import java.io.Serializable;
import java.util.Random;

public class Titolo implements Serializable {
private String nome;
private double prezzo ;
final static String STRINGA="il nome e' %s ed ha un prezzo di %f";
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}

public double getPrezzo() {
	return prezzo;
}
public void setPrezzo(double prezzo) {
	this.prezzo = prezzo;
}
public Titolo(String nome, double prezzo) {

	this.nome = nome;
	this.prezzo = prezzo;
}
public void variazioneGiornaliera  (Titolo titolo )
{
Random rand =new Random();
int val =rand.nextInt(2);
switch (val) {
case 0: 
	titolo.prezzo = (titolo.prezzo-(rand.nextDouble()*titolo.prezzo));
	 
	break;
case 1:
	titolo.prezzo = (titolo.prezzo-(rand.nextDouble()*titolo.prezzo));
	 break;
default:
	titolo.prezzo=titolo.prezzo;
}

}
public double valoreTitolo(Titolo titolo)
{
	return titolo.prezzo;
}
public String toString(Titolo titolo)
{
	return String.format(STRINGA, titolo.nome,titolo.prezzo);
}


}
