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
		valor[0][0] = 1;
		valor[0][1] = 1;
		valor[0][2] = 1;
		valor[0][3] = 1;
		valor[0][4] = 1;
		valor[0][5] = 1;
		valor[0][6] = 1;
		valor[1][0] = 2;
		valor[1][1] = 2;
		valor[1][2] = 2;
		valor[1][3] = 2;
		valor[1][4] = 2;
		valor[1][5] = 2;
		valor[1][6] = 2;
		valor[2][0] = 3;
		valor[2][1] = 3;
		valor[2][2] = 3;
		valor[2][3] = 3;
		valor[2][4] = 3;
		valor[2][5] = 3;
		valor[2][6] = 3;
		valor[3][0] = 4;
		valor[3][1] = 4;
		valor[3][2] = 4;
		valor[3][3] = 4;
		valor[3][4] = 4;
		valor[3][5] = 4;
		valor[3][6] = 4;
		
		// Criar uma array para ter aonde jogar as médias semanais a fim de compará-las
		float mediasSemanais[] = new float[valor.length];
		
		for(int linha = 0; linha <= valor.length -1; linha++) {
			
			// Zerar o valor total da semana
			valorSemanal = 0;
			
			for(int coluna = 0; coluna <= valor[0].length -1; coluna++) {
				System.out.print(valor[linha][coluna] + " ");
				
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
				
		Arrays.sort(mediasSemanais);
		System.out.println("Menor média semanal: R$ " + mediasSemanais[0]);
		System.out.println("Maior média semanal: R$ " + mediasSemanais[mediasSemanais.length -1]);
		System.out.println("Média mensal: R$ " + mediaMensal);
	}
}
