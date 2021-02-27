package model.services;

public class ServicoPaypal implements ServicoPagOnline {

	@Override
	public double taxaPorPagamento(double valor) {
		// TODO Auto-generated method stub
		return 0.02;
	}

	@Override
	public double juroMensal(double valor, int meses) {

		return 0.01;
	}

}
