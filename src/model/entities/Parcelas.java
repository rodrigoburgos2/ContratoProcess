package model.entities;

import java.util.Date;

public class Parcelas {

	private Date dataVencimento;
	private Double valorParcela;

	public Parcelas(Date dataVencimento, Double valorParcela) {
		this.dataVencimento = dataVencimento;
		this.valorParcela = valorParcela;
	}

	public Date getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public Double getValorParcela() {
		return valorParcela;
	}

	public void setValorParcela(Double valorParcela) {
		this.valorParcela = valorParcela;
	}

}
