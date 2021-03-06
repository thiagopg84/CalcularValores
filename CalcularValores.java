import java.util.Scanner;
import java.util.Arrays;

public class CalcularValores {

	public static void main(String[] args) {
		
		// Definir uma variável para descobrir o valor total do mês para calcular a média no futuro
		float valorMensal = 0;
		
		// Definir uma variável para descobrir o valor total da semana para calcular a média no futuro
		float valorSemanal = 0;
		
		// Definir uma variável para descobrir quantos dias o mês tem
		int diasDoMes = 0;
		
		// OBS: Valores definidos somente a título de testes!
		float[][] valor = new float[4][7];

		Scanner keyboard = new Scanner(System.in);

		// Criar uma array para ter aonde jogar as médias semanais a fim de compará-las
		float mediasSemanais[] = new float[valor.length];
		
		for(int linha = 0; linha <= valor.length -1; linha++) {
			
			// Zerar o valor total da semana
			valorSemanal = 0;

			for(int coluna = 0; coluna <= valor[0].length -1; coluna++) {
				
				System.out.print(valor[linha][coluna] + " ");
				System.out.print("Digite o valor do dia " + (diasDoMes +1) + ": ");
				valor[linha][coluna] = keyboard.nextFloat();
				
				// Somar o valor do dia na variável do valor mensal total
				valorMensal += valor[linha][coluna];
				
				// Somar o valor do dia na variável do valor semanal
				valorSemanal += valor[linha][coluna];
				
				// Somar os dias do mês
				diasDoMes++;
			}
			
			System.out.print("\n");
			
			// Calcular e alocar o valor médio da semana 
			mediasSemanais[linha] = (float) valorSemanal/valor[0].length;
		}
		
		// Calcular o valor médio mensal
		float mediaMensal = valorMensal/diasDoMes;
				
		// Ordenar a array das médias semanais
		Arrays.sort(mediasSemanais);
		
		System.out.println("Menor média semanal: R$ " + mediasSemanais[0]);
		System.out.println("Maior média semanal: R$ " + mediasSemanais[mediasSemanais.length -1]);
		System.out.println("Média mensal: R$ " + mediaMensal);
	}
}
