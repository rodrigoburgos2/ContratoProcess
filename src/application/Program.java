package application;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.services.ServicoContrato;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Dados do Contrato");
		System.out.print("Número: ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/mm/yyyy): ");
		Date data = sdf.parse(sc.nextLine());
		System.out.print("Valor do Contrato: ");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(num, data, valor);
		
		System.out.print("Número de Parcelas: ");
		int parcela = sc.nextInt();
		
		ServicoContrato processContrato = new ServicoContrato();
		processContrato.ProcessarContrato(contrato, parcela);
		
		

		
//		Installments:
//		25/07/2018 - 206.04
//		25/08/2018 - 208.08
//		25/09/2018 - 210.12
		sc.close();
	}

}
