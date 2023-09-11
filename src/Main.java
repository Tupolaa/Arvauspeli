import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String Vastaus;
		int i = 0;
	do {
System.out.println("Quess my name!");
		Vastaus = in.nextLine();
		 i++;
		if(Vastaus.equalsIgnoreCase("Mikko")) {
			
			System.out.println("Arvasit oikein! " + i + "- Kerralla!");
			break;
		}
	
	}while (!Vastaus.equals("loppu"));
	 if(Vastaus.equals("loppu"))
	{
		 i--;
		System.out.println("Lopetit Pelin " + i + " Kerralla, Parempi onni ensi kerralla");
	
		}
	}

}
