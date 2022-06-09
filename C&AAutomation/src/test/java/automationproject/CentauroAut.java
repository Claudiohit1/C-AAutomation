package automationproject;



import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.ElementosUse;
import metodos.MetodosUse;

public class CentauroAut {
	
	MetodosUse metodos = new MetodosUse();
	ElementosUse elementos = new ElementosUse();

	
	

	@Before
	public void setUp() throws Exception {
		metodos.abrirNavegador("https://www.cea.com.br/");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPreencher() {
		metodos.preencher(elementos.escrever, "Blusa gola alta");
		metodos.clicar(elementos.clicar);
		
	
	}

}
