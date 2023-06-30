
import java.util.Scanner;
public class switch3 {

	public static void main(String[] args) {
		Scanner en = new Scanner(System.in);
		System.out.println("Elige una comida");
		System.out.println("1.Spaguetti");
		System.out.println("2.Lasagna");
		System.out.println("3.Sopa");
		System.out.println("4.Pizza");
		System.out.println("5.Papitas");
		System.out.println("Escribe el numero: ");
		int seleccion = en.nextInt();
	
		switch(seleccion) {
		case 1:
			System.out.println("Elegiste Spaguetti");
			break;
		case 2:
			System.out.println("Elegiste Lasagna");
			break;
		case 3:
			System.out.println("Elegiste sopa");
			break;
		case 4:
		System.out.println("Elegiste Pizza");
			break;
		case 5:
			System.out.println("Elegiste Papitas");
			break;
		}
		
	}
}
