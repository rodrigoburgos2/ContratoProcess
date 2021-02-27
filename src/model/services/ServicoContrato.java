package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contrato;
import model.entities.Parcelas;

public class ServicoContrato {

	private ServicoPagOnline servicoPagOnline;

	public ServicoContrato(ServicoPagOnline servicoPagOnline) {
		this.servicoPagOnline = servicoPagOnline;
	}

	public void ProcessarContrato(Contrato contrato, int qtdParcelas) {
		double valBase = contrato.getValorContrato() / qtdParcelas;
		for (int i = 1; i <= qtdParcelas; i++) {
			double vlParc = valBase + servicoPagOnline.juroMensal(valBase, i);
			vlParc = vlParc + servicoPagOnline.taxaPorPagamento(vlParc);
			Date dataVenc = addMes(contrato.getDataContrato(), i);
			Parcelas parcela = new Parcelas(dataVenc, vlParc);
			contrato.addParcela(parcela);

		}
	}

	private Date addMes(Date data, int qtdMes) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(data);
		calendar.add(Calendar.MONTH, qtdMes);
		return calendar.getTime();

	}

}
