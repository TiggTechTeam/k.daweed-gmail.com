import java.util.ArrayList;
import java.util.Scanner;

public class mainW {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("How many Real Estate do you want to compare ?");
	ArrayList<Wohnung>WohnungListe = new ArrayList<>();
	ArrayList<Haus>HausListe = new ArrayList<>();
	
	
	int anzhl = sc.nextInt();
	int i = 0;
	double x, y ;
	int zahl;
	while (i < anzhl) {
		System.out.println("Is this a Flat or House? For a Flat press (1) for a House press (2) ");
		zahl = sc.nextInt();
		if(zahl ==1) {
		
			System.out.println("Welche W1 Kooridante ");
			x = sc.nextDouble();
			System.out.println("Welche W2 Kooridante ");
			y =sc.nextDouble();
			Wohnung w = new Wohnung(x,y,3);
			WohnungListe.add(w);
			i++;
			
			
		}
		if(zahl ==2) {
			
			System.out.println("Welche H1 Kooridante ");
			x = sc.nextDouble();
			System.out.println("Welche H2 Kooridante ");
			y =sc.nextDouble();
			Haus h = new Haus(x,y,4);
			HausListe.add(h);
			i++;
			
		
		}
		
	}	
	
		
		System.out.println("Flat:  "+WohnungListe.toString());
		System.out.println("House:  "+HausListe.toString());
		System.out.println("Equals "+HausListe.equals(WohnungListe));


		
		
	}

}
