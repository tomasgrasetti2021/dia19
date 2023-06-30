import java.util.Scanner;
public class ejemploSwitch {

	public static void main(String [] args) {
		Scanner en = new Scanner(System.in);
		System.out.println("Escoge un día");
		System.out.println("1.Lunes");
		System.out.println("2.Martes");
		System.out.println("3.Miercoles");
		System.out.println("4.Jueves");
		System.out.println("5.Viernes");
		System.out.println("6.Sabado");
		System.out.println("7.Domingo");
		int dia = en.nextInt();
		
		switch(dia) {
		case 1:
			System.out.println("el día es Lunes ");
			break;
		case 2:
			System.out.println("el día es Martes");
			break;
		case 3:
			System.out.println("el día es Miercoles");
			break;
		case 4:
			System.out.println("el día es Jueves");
			break;
		case 5:
			System.out.println("el día es Viernes");
			break;
		case 6:
			System.out.println("el día es Sabado");
			break;
		case 7:
			System.out.println("el día es Domingo");
			break;
			default:
				System.out.println("Ese no es un dia");
			
		}
	}}
		
