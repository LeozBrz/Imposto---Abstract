package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entidade.Contribuinte;
import entidade.PessoaFisica;
import entidade.PessoaJuridica;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ENTRE COM O NUMERO DE CONTRIBUINTES: ");
		int n = sc.nextInt();

		List<Contribuinte> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			System.out.printf("DADOS DO CONTRIBUINTE #%d \n", i+1);
			System.out.print("INDIVIDUAL OU COMPANHIA (i/c): ");
			char resp = sc.next().charAt(0);
			System.out.print("NOME: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("RENDIMENTO ANUAL: ");
			double rendimento = sc.nextDouble();
			
			if(resp == 'c') {
				System.out.print("NUMERO DE FUNCIONARIOS: ");
				int func = sc.nextInt();
				PessoaJuridica pj = new PessoaJuridica(nome, rendimento, func);
				list.add(pj);
			}else if(resp == 'i') {
				System.out.print("GASTOS COM SAÚDE: ");
				double saude = sc.nextDouble();
				PessoaFisica pf = new PessoaFisica(nome, rendimento, saude);
				list.add(pf);
			}		
		}
		System.out.println("IMPOSTOS PAGOS");		
		
		double total=0;
		for(Contribuinte cont : list) {
		System.out.printf(cont.getNome() + ": $" + String.format("%.2f", cont.taxa()));
		System.out.println();
		total +=cont.taxa();
		}
		System.out.printf("TOTAL DE TAXAS $ %.2f" , total);
		sc.close();
		
	
	}

}
