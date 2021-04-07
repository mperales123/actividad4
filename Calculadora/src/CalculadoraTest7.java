import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class CalculadoraTest7{
	private int nume1;
	private int nume2;
	private int resul;
	public CalculadoraTest7(int nume1,int nume2,int resul){
		this.nume1=nume1;
		this.nume2=nume2;
		this.resul=resul;//resultado de la operacion
		
	}
	

@Parameters
public static Collection<Object[]>numero(){
	return Arrays.asList(new Object[][]{
		{20,10,200},{30,-2,-15},{5,2,10}});
}

@Test
public void testresta(){
	Calculadora calcu=new Calculadora(nume1,nume2);
	int resultado=calcu.multiplica();
	assertEquals(resul,resultado);
}
}