package titoliazionari.ing;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FileServizio {
	
public static boolean esistenzafile(File file) {
	if(file.exists())
		return true;
		else 
		return false;
}
public static void creareUnoNuovo0(PortaFoglio portaFoglio) 
		throws IOException,ClassNotFoundException,FileNotFoundException {
	File file=new File("E:\\peter0.txt");
	ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ;
	
	out.writeObject(portaFoglio);
	
	out.close();
	
	
}
public static void creareUnoNuovo1(ElencoTitoli elencoTitoli)
		throws IOException,ClassNotFoundException,FileNotFoundException{
	File file=new File("E:\\peter1.txt");
	ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ;
	out.writeObject(elencoTitoli);
	out.close();
	
}

public static void creareUnoNuovo2(ArrayList<Titolo> titoli)
		throws IOException,ClassNotFoundException,FileNotFoundException{
	File file=new File("E:\\peter2.txt");
	ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ;
	out.writeObject(titoli);
	out.close();
	
}
public static void creareUnoNuovo3(ArrayList<Lotto> lotto)
		throws IOException,ClassNotFoundException,FileNotFoundException{
	File file=new File("E:\\peter3.txt");
	ObjectOutputStream out=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file))) ;
	out.writeObject(lotto);
	out.close();
	
}

public static PortaFoglio trovareUnoNuovo0(PortaFoglio portaFoglio ) 
		throws IOException,ClassNotFoundException,FileNotFoundException {
	File file=new File("E:\\peter0.txt");
	ObjectInputStream out=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))) ;
	portaFoglio = (PortaFoglio) out.readObject();

	out.close();
	
	return portaFoglio;
	
}
public static ElencoTitoli trovareUnoNuovo1(ElencoTitoli elencoTitoli ) 
		throws IOException,ClassNotFoundException,FileNotFoundException {
	File file=new File("E:\\peter1.txt");
	ObjectInputStream out=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))) ;
	
	elencoTitoli=(ElencoTitoli)out.readObject();
	out.close();
	return elencoTitoli;
	
	
}
@SuppressWarnings("unchecked")
public static ArrayList<Titolo> trovareUnoNuovo2(ArrayList<Titolo> titoli)
		throws IOException,ClassNotFoundException,FileNotFoundException 
{File file=new File("E:\\peter2.txt");
ObjectInputStream out=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))) ;
titoli =(ArrayList<Titolo>) out.readObject();
	out.close();
	return titoli;
	
}
@SuppressWarnings("unchecked")
public static ArrayList<Lotto> trovareUnoNuovo3( ArrayList<Lotto> lotto)
		throws IOException,ClassNotFoundException,FileNotFoundException 
{File file=new File("E:\\peter3.txt");
ObjectInputStream out=new ObjectInputStream(new BufferedInputStream(new FileInputStream(file))) ;
lotto =(ArrayList<Lotto>) out.readObject();
	out.close();
	return lotto;
	
	
}


}




