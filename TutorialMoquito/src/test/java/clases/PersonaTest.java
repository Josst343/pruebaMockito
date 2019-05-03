package clases;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import javax.annotation.Generated;

import org.junit.Before;
import org.junit.Test;
import org.junit.tools.configuration.base.MethodRef;

@Generated(value = "org.junit-tools-1.1.0")
public class PersonaTest {

	private Persona persona;

	@Before
	public void setUp() {
		persona = new Persona(20202020, "josue", 50, 50000);
	}

	@Test

	public void testGetdni() {
		assertEquals(20202020, persona.getDni());

	}

	@Test
	public void testSetdni() {
		assertEquals(20202020, persona.getDni());
		persona.setDni(5000);
		assertEquals(5000, persona.getDni());

	}
	@Test
	public void  testIsMayor() {
		
		assertTrue(persona.isMayo18());
		
		
	}
	

	
	
	/*
	 * private Persona createTestSubject() { return new Persona(); }
	 * 
	 * @MethodRef(name = "getDni", signature = "()I")
	 * 
	 * @Test public void testGetDni() throws Exception { Persona testSubject; int
	 * result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.getDni(); }
	 * 
	 * @MethodRef(name = "setDni", signature = "(I)V")
	 * 
	 * @Test public void testSetDni() throws Exception { Persona testSubject; int
	 * dni = 0;
	 * 
	 * // default test testSubject = createTestSubject(); testSubject.setDni(dni); }
	 * 
	 * @MethodRef(name = "getNombre", signature = "()QString;")
	 * 
	 * @Test public void testGetNombre() throws Exception { Persona testSubject;
	 * String result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.getNombre(); }
	 * 
	 * @MethodRef(name = "setNombre", signature = "(QString;)V")
	 * 
	 * @Test public void testSetNombre() throws Exception { Persona testSubject;
	 * String nombre = "";
	 * 
	 * // default test testSubject = createTestSubject();
	 * testSubject.setNombre(nombre); }
	 * 
	 * @MethodRef(name = "getEdad", signature = "()I")
	 * 
	 * @Test public void testGetEdad() throws Exception { Persona testSubject; int
	 * result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.getEdad(); }
	 * 
	 * @MethodRef(name = "setEdad", signature = "(I)V")
	 * 
	 * @Test public void testSetEdad() throws Exception { Persona testSubject; int
	 * edad = 0;
	 * 
	 * // default test testSubject = createTestSubject(); testSubject.setEdad(edad);
	 * }
	 * 
	 * @MethodRef(name = "getSueldo", signature = "()I")
	 * 
	 * @Test public void testGetSueldo() throws Exception { Persona testSubject; int
	 * result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.getSueldo(); }
	 * 
	 * @MethodRef(name = "setSueldo", signature = "(I)V")
	 * 
	 * @Test public void testSetSueldo() throws Exception { Persona testSubject; int
	 * sueldo = 0;
	 * 
	 * // default test testSubject = createTestSubject();
	 * testSubject.setSueldo(sueldo); }
	 * 
	 * @MethodRef(name = "isMayo18", signature = "()Z")
	 * 
	 * @Test public void testIsMayo18() throws Exception { Persona testSubject;
	 * boolean result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.isMayo18(); }
	 * 
	 * @MethodRef(name = "isSalarioAlto", signature = "()Z")
	 * 
	 * @Test public void testIsSalarioAlto() throws Exception { Persona testSubject;
	 * boolean result;
	 * 
	 * // default test testSubject = createTestSubject(); result =
	 * testSubject.isSalarioAlto(); }
	 */
}