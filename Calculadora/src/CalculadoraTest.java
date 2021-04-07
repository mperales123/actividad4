import static org.junit.Assert.*;

import org.junit.Test;


public class CalculadoraTest {

	@Test
	public void testSuma() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.suma();
		assertEquals(30,resultado);
	}

	@Test
	public void testResta() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.resta();
		assertEquals(10,resultado);
	}

	@Test
	public void testMultiplica() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.multiplica();
		assertEquals(200,resultado);
	}

	@Test
	public void testDivide() {
		Calculadora calcu=new Calculadora(20,10);
		int resultado=calcu.divide();
		assertEquals(2,resultado);
	}
	@Test
	public void testresta2(){
		Calculadora calcu=new Calculadora(20,10);
		boolean resultado=calcu.resta2();
		assertTrue(resultado);
	}
	@Test
	public void testresta2bis(){
		Calculadora calcu=new Calculadora(10,20);
		boolean resultado=calcu.resta2();
		assertFalse(resultado);
	}
	@Test
	public void testdivide2(){
		Calculadora calcu=new Calculadora(10,0);
		Integer resultado=calcu.divide2();
		assertNull(resultado);
	}

	
	@Test
	public void testException(){
		try{
			Calculadora calcu=new Calculadora(20,0);
			int resultado=calcu.divide();
			fail("FALLO, deberia haber lanzado la excepcion");
			
		}catch (ArithmeticException e){
			//PRUEBA satifactoria
		}
	}
	@Test(expected = java.lang.ArithmeticException.class)
		public void testDivide0 (){
			Calculadora calcu = new Calculadora(20, 0);
			Integer resultado = calcu.divide0();
		}
	
}
