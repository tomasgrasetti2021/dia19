import java.util.Scanner;
public class switch2 {
	public static void main(String [] args) {
		Scanner en = new Scanner(System.in);
			
		System.out.println("Que desea hacer:");
		System.out.println("1.Suma");
		System.out.println("2.resta");
		System.out.println("3.Multiplicación");
		System.out.println("4.División");
		int sel = en.nextInt();
		
		switch(sel) {
		case 1: 
			System.out.println("Elige el primer numero: ");
			float num1 = en.nextFloat();
			System.out.println("Elige el segundo numero: ");
			float num2 = en.nextFloat();
			float suma = num1 + num2;
			System.out.println("La suma de "+num1 +" y " + num2 + " es igual a: " + suma);
			break;
		case 2: 
			System.out.println("Elige el primer numero: ");
			float nume1 = en.nextFloat();
			System.out.println("Elige el segundo numero: ");
			float nume2 = en.nextFloat();
			float resta = nume1 - nume2;
			System.out.println("La resta de "+nume1 +" y " + nume2 + " es igual a: " + resta);
		case 3: 
			System.out.println("Elige el primer numero: ");
			float numer1 = en.nextFloat();
			System.out.println("Elige el segundo numero: ");
			float numer2 = en.nextFloat();
			float multi = numer1 * numer2;
			System.out.println("La multiplicación de "+numer1 +" y " + numer2 + " es igual a: " + multi);
		case 4: 
			System.out.println("Elige el primer numero: ");
			float numero1 = en.nextFloat();
			System.out.println("Elige el segundo numero: ");
			float numero2 = en.nextFloat();
			float div = numero1 * numero2;
			System.out.println("La multiplicación de "+numero1 +" y " + numero2 + " es igual a: " + div);
		}
		 
		}
}
