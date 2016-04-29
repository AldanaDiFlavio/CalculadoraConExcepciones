package ar.edu.unlam.tallerweb;

import org.junit.Test;

public class CalculadoraTest {


	@Test(expected=Exception.class)
	public void dividirPorCeroDeberiaLanzarException() throws Exception {
		Calculadora c=new Calculadora();
		c.dividir(8,0);
	}
	

}
