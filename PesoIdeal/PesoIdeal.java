package PesoIdeal;
import java.util.Scanner;

/* Questão (Unialfa - Algoritmos e Linguagens de Programação - 2019)
 * Tendo como dados de entrada a altura e o sexo de uma pessoa, construa um algoritmo
 * que calcule seu peso ideal, uilizando as seguintes fórmulas:
 * - Para homens: (72.7*h)-58;
 * - Para mulheres: (62.1*h)-44.7;
*/

public class PesoIdeal {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int sexo = 0;
		double altura, peso;
		
		System.out.printf("Informe sua altura:(Ex. 1,80)\n");
		altura = entrada.nextDouble();
		
		if (altura > 0) {
			System.out.printf("Inorme seu sexo:\n1 se for homem.\n2 se for mulher.\n");
			sexo = entrada.nextInt();
		
		if((sexo >= 1) && (sexo <= 2)) {
			if (sexo == 1) {
				peso = (72.2*altura)-58;
				System.out.printf("Seu peso ideal é %.2f Kg.", peso);
			}
			if (sexo == 2) {
				peso = (62.1*altura)-44.7;
				System.out.printf("Seu peso ideal é %.2f Kg.", peso);
			}
		}
		
		if ((sexo <= 0) || (sexo > 2)) {
			System.out.println("Informação inválida.");
		}
		}
		else { System.out.println("Altura inválida");
		}
		entrada.close();
	}
}