package classes;

import java.util.Scanner;

public class Calc {
	
	public int soma(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtracao(int num1,int num2) {
		return num1-num2;
	}
	
	public float divisao(int num1, int num2)
	{
		return num1/num2;
	}
	
	public int multiplicacao(int num1, int num2)
	{
		return num1*num2;
	}
	
	
	public static void main(String[] args) {
		
		Calc calc = new Calc();
		
		int opcao = 5;
		int num1;
		int num2;
		
		Scanner valor = new Scanner(System.in);
		System.out.println("Bem Vindo a Calculadora");
		System.out.println("-------------------------");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("0 - Sair");
		System.out.println("-------------------------");
		
		opcao = valor.nextInt();
		
		while(opcao != 0 ) {
			Scanner escolha = new Scanner(System.in);
			
			System.out.println("Digite o primeiro valor: ");
			num1=escolha.nextInt();
			System.out.println("Qual o segundo valor: ");
			num2=escolha.nextInt();
			
			switch(opcao) {
				
				case 1:
					int soma = calc.soma(num1, num2);
					System.out.printf("O resultado é %d\n",soma);
					break;
				
				case 2:
					int subtracao = calc.subtracao(num1, num2);
					System.out.printf("O resultado é %d\n", subtracao);
					break;
				
				case 3:
					int multiplicacao=calc.multiplicacao(num1, num2);
					System.out.printf("O resultado é %d\n", multiplicacao);
					break;
				
				case 4:
					float divisao=calc.divisao(num1, num2);
					System.out.printf("O resultado é %d\n",divisao);
					break;
					
				default:
					System.out.println("Digite um valor válido");
			}
			
			
		}

	}

}
