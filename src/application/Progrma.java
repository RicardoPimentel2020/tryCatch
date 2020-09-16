package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progrma {

	public static void main(String[] args) {
	
		method1();
		
		
		
	}
	
	public static void method2() {
		System.out.println("***METHOD2 START***");
		Scanner sc = new Scanner(System.in);
		try {
			
			
			String[] vect = sc.nextLine().split(" ");//split define leitura sepado por espaço em branco
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
			}
			catch (ArrayIndexOutOfBoundsException e) { // tratamento de numero fora do array 
				System.out.println("Invalide position!");
				e.printStackTrace(); /// mostra o caminho do erro 
				sc.next();
			}
			catch (InputMismatchException e) {
				System.out.println("Input erro!");
			}
			
		System.out.println("***METHOD2 END***");
			
			sc.close();
		}
	
	public static void method1() {
		System.out.println("***METHOD1 START***");
		method2();
		
		
		System.out.println("***METHOD1 END***");
		
	}	
		

}
