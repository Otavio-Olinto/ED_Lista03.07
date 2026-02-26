/*
 * Escreva uma função recursiva que calcule a soma dos dígitos de um número inteiro. Por 
exemplo, se a entrada for 123, portanto 1+2+3, logo, a saída deverá ser 6. 
 */

package view;

import java.util.Scanner;
import controller.SomarDigitos;

public class Principal {

	public static void main(String[] args) {
		// Instanciando os métodos da classe SomarDigitos
		SomarDigitos metodo = new SomarDigitos();
		
		// Criando o método de leitura com o Scanner
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Qual número deseja realizar a soma de seus algarismos?: ");
		int num = Integer.parseInt(ler.nextLine());
		
		System.out.println("A soma dos algarismos de "+num+" é: "+metodo.somar(num));
		
		ler.close();
	}

}
