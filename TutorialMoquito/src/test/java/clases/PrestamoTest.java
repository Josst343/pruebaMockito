package clases;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class PrestamoTest {
	
	private Persona personaValida;
	private Persona personaInvalida;
	private Prestamo  prestamo;
	
	@Before
	public void setUp() {
		
		prestamo = new Prestamo(20000,1L,50,30);
		personaInvalida= mock(Persona.class);
		personaValida= mock(Persona.class);
		 when(personaInvalida.isMayo18()).thenReturn(Boolean.FALSE);
		 when(personaValida.isMayo18()).thenReturn(Boolean.TRUE);
		 when(personaInvalida.isSalarioAlto()).thenReturn(Boolean.FALSE);
		 when(personaValida.isSalarioAlto()).thenReturn(Boolean.TRUE);
		 
	}
	@Test(expected =IllegalArgumentException.class)
	public void testPersonaInvalida() {
		prestamo.setPersona(personaInvalida);
		
		
	}
	
	@Test
	public void testPersonaValida() {
		prestamo.setPersona(personaValida);
		verify(personaValida).isMayo18();
		verify(personaValida).isSalarioAlto();
		
	}
	

}
