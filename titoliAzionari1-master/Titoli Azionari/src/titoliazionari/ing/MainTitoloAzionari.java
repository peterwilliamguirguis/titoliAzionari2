/**
 * 
 */
package titoliazionari.ing;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.sun.xml.internal.bind.v2.model.core.EnumLeafInfo;

import it.unibs.fp.mylib.InputDati;

/**
 * @author peter
 *
 */
public class MainTitoloAzionari {

	/**
	 * @param args
	 */
	private static int selezione ;
	private static int selezione2 ;
	private static PortaFoglio portaFoglio ;
	private static ElencoTitoli elencoTitoli;
	private static int flag=1 ;
	private static ArrayList<Titolo> titoli=new ArrayList<>();
	private static ArrayList<Lotto> lotto=new ArrayList<>();
	private static File file0=new File("E:\\peter0.txt");
	private static File file1=new File("E:\\peter1.txt");
	private static File file2=new File("E:\\peter2.txt");
	private static File file3=new File("E:\\peter3.txt");
	
	private final static String TRATTEGGI="_____________________________________";
	private final static String DATI_DA_INSERIRE="1:VISUALIZZAZIONE DATI\n";
	private final static String DATI_DA_INSERIRE2="2:gestione Dati";
	private final static String DATI_DA_INSERIRE3="3:uscire da programma";
	private final static String CREAZIONE="non ci sono ne portafogli ne elencoTitoli creati ";
	private final static String NUMERO_AZIONI="INSERIRE IL NUMERO DI AZIONI";
	private final static String QUANTI_TITOLI ="QUANTI TITLOLI VUOI INSERIRE";
	private final static String inserimento_nome ="inserire il nome del titolo numero %d";
	private final static String inserimento_prezzo ="inserire il prezzo del titolo numero %d";
	private final static String inserimento_NUMERO_ELENCO ="inserire il numero del elenco ";
	private final static String inserimento_NUMERO_LOTTO ="inserire il numero dei lotti ";
	private final static String inserimento_nome_lotto ="inserire il nome del lotto numero %d";
	private final static String inserimento_prezzo2 ="inserire il prezzo del lotto numero %d";
	private final static String inserimento_nome1 ="inserire il nome del titolo";
	private final static String inserimento_prezzo1 ="inserire il prezzo del titolo ";
	private final static String INSERIMENTO_QUAANTITA="INSERIRE LA QUANTITA' DEL LOTTO NUMERO %d ";
	private final static String ADDGIUNGERE_LUTTO="1: AGIIUNGERE NUOVO LUTTO";
	private final static String LA_VARIAZIONE_GIORNALIERA =" 2:PASSA ALLA GIORNATA SUCESSIVA";
	private final static String ADDGIUNGERE_Titolo ="3: AGIIUNGERE NUOVO LUTTO";
	private final static String USCITA_DALLA_MODIFICA ="3: AGIIUNGERE NUOVO LUTTO";
	private final static String AVVISO =" NON CI SONON DATI PRESENTI!!!!!!!!!";
	
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException 
	{
		if(FileServizio.esistenzafile(file0)&&FileServizio.esistenzafile(file1)
				&&FileServizio.esistenzafile(file2)&&FileServizio.esistenzafile(file3))
			flag=0;
		else 
			flag =1;
		if(flag==1)
		{System.out.println(AVVISO);
		int quanti=InputDati.leggiIntero(QUANTI_TITOLI);
			for(int i=0;i<quanti;i++)
			{titoli.add(new Titolo(InputDati.leggiStringa(String.format(inserimento_nome, i)), InputDati.leggiIntero(String.format(inserimento_prezzo, i))));
			}
			System.out.println(CREAZIONE);
			elencoTitoli= new ElencoTitoli(titoli, InputDati.leggiIntero(inserimento_NUMERO_ELENCO));
			int quanti1=InputDati.leggiIntero(inserimento_NUMERO_LOTTO);
			for(int i=0;i<quanti1;i++)
			{lotto.add(new Lotto(new Titolo(InputDati.leggiStringa(inserimento_nome1), InputDati.leggiIntero(inserimento_prezzo1)), InputDati.leggiIntero(String.format(INSERIMENTO_QUAANTITA, i))));
			}
			System.out.println(CREAZIONE);
			portaFoglio=new PortaFoglio(InputDati.leggiIntero(NUMERO_AZIONI), elencoTitoli,lotto);
		}
		if(flag==0)
		{ portaFoglio=FileServizio.trovareUnoNuovo0(portaFoglio);
		elencoTitoli=FileServizio.trovareUnoNuovo1(elencoTitoli);
		lotto=FileServizio.trovareUnoNuovo3(lotto);
		titoli=FileServizio.trovareUnoNuovo2(titoli);
		}
		
		
		do{System.out.println(DATI_DA_INSERIRE);
	System.out.println(TRATTEGGI);
	System.out.println(DATI_DA_INSERIRE2);
	System.out.println(TRATTEGGI);
	System.out.println(DATI_DA_INSERIRE3);
	
	selezione=InputDati.leggiIntero(" " , 1, 3);
	switch(selezione)
	{case 1:
		
		
			portaFoglio.visuaizzazione(portaFoglio);
				


		
		break;
	case 2:
		System.out.println(ADDGIUNGERE_LUTTO);
		System.out.println(TRATTEGGI);
		System.out.println(LA_VARIAZIONE_GIORNALIERA);
		System.out.println(TRATTEGGI);
		System.out.println(ADDGIUNGERE_Titolo);
		System.out.println(TRATTEGGI);
		System.out.println(USCITA_DALLA_MODIFICA);
		
		
		selezione2=InputDati.leggiIntero(" ");
		switch(selezione2)
		{case 1:
			portaFoglio.addlotto(portaFoglio, new Titolo(InputDati.leggiStringa(inserimento_nome), InputDati.leggiIntero(inserimento_prezzo)), InputDati.leggiIntero(inserimento_NUMERO_LOTTO));
		case 2:
		for(int i=0;i<titoli.size();i++)
		{
		titoli.get(i).variazioneGiornaliera(titoli.get(i));	
			
		}
		break;
		case 3:
			titoli.add(new Titolo(InputDati.leggiStringa(inserimento_nome), InputDati.leggiIntero(inserimento_prezzo)));
			break;
		default :
			break;
		}
		
		break;
	default:
		break;
			
	}
	}while(selezione!=3);
		
	
	FileServizio.creareUnoNuovo0(portaFoglio);
	FileServizio.creareUnoNuovo1(elencoTitoli);
	FileServizio.creareUnoNuovo2(titoli);
	FileServizio.creareUnoNuovo3(lotto);
	
	}
		
		
		
		
		
			}
	
