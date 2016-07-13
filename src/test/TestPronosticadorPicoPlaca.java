/**
 * 
 */
package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import implementacion.PronosticadorPicoyPlaca;

/**
 * @author Edgar Chimarro
 *
 */
public class TestPronosticadorPicoPlaca {

	/**
	 * Test method for
	 * {@link implementacion.PronosticadorPicoyPlaca#PronosticadorPicoyPlaca(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testPronosticadorSinPicoyPlaca() {
		String mensajeExito = "Vehiculo no debe estar en el camino";
		PronosticadorPicoyPlaca testPronosticarPyP = new PronosticadorPicoyPlaca("BBF435", "25/10/2015", 16);
		assertEquals(mensajeExito, testPronosticarPyP.predescirPicoyPlaca());

	}

	/**
	 * Test method for
	 * {@link implementacion.PronosticadorPicoyPlaca#predescirPicoyPlaca(java.lang.String, java.lang.String, int)}.
	 */
	@Test
	public void testPronosticadorConPicoyPlaca() {
		String mensajeExito = "Vehiculo no debe estar en el camino";
		PronosticadorPicoyPlaca testPronosticarPyP = new PronosticadorPicoyPlaca("BBF435", "02/07/2016", 16);
		assertNotEquals(mensajeExito, testPronosticarPyP.predescirPicoyPlaca());

	}

}
