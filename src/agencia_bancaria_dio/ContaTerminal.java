
package agencia_bancaria_dio;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
		System.out.println("Digite o número da sua agência, com o digito: ");
		System.out.println("EX:1xxx-5 ");
		String agencia = sc.next();
		
		System.out.println("Digite o número da conta: ");
		System.out.println("EX:1xxxx6 ");
		int numeroConta = sc.nextInt();

		sc.nextLine();
		System.out.println("Digite seu nome: ");
		String nomeCliente = sc.nextLine();

		System.out.println("Digite seu saldo em conta: ");
		Double saldo = sc.nextDouble();

		System.out.println("Parabens " + nomeCliente + ", Voce acaba de criar uma conta em nosso Banco!");
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numeroConta);
		System.out.println("Seu saldo é: " + saldo);
		System.out.println("Já está disponível para saque.");

		sc.close();

	}

}
