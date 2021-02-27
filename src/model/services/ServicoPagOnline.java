package model.services;

public interface ServicoPagOnline {
	
	double taxaPorPagamento(double valor);
	double juroMensal(double valor, int meses);

}
