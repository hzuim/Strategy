package br.com.haz.impostos;

import br.com.haz.entidades.Orcamento;
import br.com.haz.interfaces.Imposto;

public class ICMS implements Imposto {

	public double calcular(Orcamento orcamento) {
		return orcamento.getValor() * 0.1;
	}

}
