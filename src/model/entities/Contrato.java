package model.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {

	private Integer numeroContrato;
	private Date dataContrato;
	private Double valorContrato;
	
	List<Parcelas> lista = new ArrayList<>();
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Contrato(Integer numeroContrato, Date dataContrato, Double valorContrato) {
		this.numeroContrato = numeroContrato;
		this.dataContrato = dataContrato;
		this.valorContrato = valorContrato;
	}

	public Integer getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public Date getDataContrato() {
		return dataContrato;
	}

	public void setDataContrato(Date dataContrato) {
		this.dataContrato = dataContrato;
	}

	public Double getValorContrato() {
		return valorContrato;
	}

	public void setValorContrato(Double valorContrato) {
		this.valorContrato = valorContrato;
	}
	
	public void addParcela(Parcelas parcela) {
		lista.add(parcela);
	}
	
	public String getParcela() {
		StringBuilder sb = new StringBuilder();
		// para cada Parcela p contido(:) na lista		
		for (Parcelas p : lista) {
			sb.append(sdf.format(p.getDataVencimento()));
			sb.append(" - ");
			sb.append(p.getValorParcela());
			sb.append("\n");
		}
		return sb.toString();
		
	}

}
