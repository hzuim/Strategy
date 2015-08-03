package br.com.haz.calculo;

import br.com.haz.entidades.Orcamento;
import br.com.haz.interfaces.Imposto;

public class CalculadoraDeImpostos {

	public double calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
