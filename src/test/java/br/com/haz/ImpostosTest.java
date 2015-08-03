package br.com.haz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.haz.calculo.CalculadoraDeImpostos;
import br.com.haz.entidades.Orcamento;
import br.com.haz.impostos.ICMS;
import br.com.haz.impostos.ISS;
import br.com.haz.interfaces.Imposto;

public class ImpostosTest {
	
	private Orcamento orcamento;
	private CalculadoraDeImpostos calculadora;

	@Before
	public void setUp() throws Exception {
		orcamento = new Orcamento(500.00);
		calculadora = new CalculadoraDeImpostos();
	}

	@Test
	public void iss() {
		Imposto iss = new ISS();
		double imposto = calculadora.calcular(orcamento, iss);
		Assert.assertEquals(30.00, imposto, Double.MIN_VALUE);
	}

	@Test
	public void icms() {
		Imposto icms = new ICMS();
		double imposto = calculadora.calcular(orcamento, icms);
		Assert.assertEquals(50.00, imposto, Double.MIN_VALUE);
	}

}
