import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Vastaus;
		String oikea = "Mikko";
		int i = 0;
	do {
System.out.println("Quess my name!");
		Vastaus = in.nextLine();
		 i++;
		if(Vastaus.equalsIgnoreCase("Mikko")) {
			
			System.out.println("Arvasit oikein! " + i + "-Kerralla!");
			break;
		}
		else if (i == 5){
			System.out.println("Oikean nimen ensimmäinen kirjain on ");
			System.out.println(oikea.substring(0, 1));
		
		}else if (i == 10){
			System.out.println("Oikean nimen kaksi ensimmäistä kirjainta on ");
			System.out.println(oikea.substring(0, 2));
		
		}
	
	}while (!Vastaus.equals("loppu"));
	 if(Vastaus.equals("loppu"))
	{
		 i--;
		System.out.println("Lopetit Pelin " + i + " Kerralla, Parempi onni ensi kerralla");
	
		}
	}

}
