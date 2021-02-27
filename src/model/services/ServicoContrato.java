package model.services;

import model.entities.Contrato;

public class ServicoContrato {

	public void ProcessarContrato(Contrato contrato, int qtdParcelas) {
		double valBase = contrato.getValorContrato() / qtdParcelas;
		for (int i = 1; i <= qtdParcelas; i++) {
			double p1 = valBase + valBase * 0.01 * i;
			p1 = p1 + p1 * 0.02;
			Date dataVenc = contrato.getDataContrato().getMonth() + 1;
			System.out.println(p1);
		}
	}

}
