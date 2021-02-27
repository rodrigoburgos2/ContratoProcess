package model.services;

public class ServicoPaypal implements ServicoPagOnline {

	@Override
	public double taxaPorPagamento(double valor) {
		return valor * 0.02;
	}

	@Override
	public double juroMensal(double valor, int meses) {

		return valor * 0.01 * meses;
	}

}
