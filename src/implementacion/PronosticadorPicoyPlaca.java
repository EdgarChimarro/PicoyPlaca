/**
 * 
 */
package implementacion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import modelo.PicoyPlaca;

/**
 * @author Edgar Chimarro
 */
public class PronosticadorPicoyPlaca extends PicoyPlaca {

	public PronosticadorPicoyPlaca(String placa, String fecha, int hora) {
		super(placa, fecha, hora);
	}

	public String predescirPicoyPlaca() {

		int diaSemana = 0;
		String resultado = "";
		try {
			Date fechaIngresada = new SimpleDateFormat("dd/MM/yyyy").parse(getFecha());
			Calendar calendario = Calendar.getInstance();
			calendario.setTime(fechaIngresada);
			diaSemana = calendario.get(Calendar.DAY_OF_WEEK);

			for (int i = 0; i < DIAS_SEMANA.length; i++) {
				if (VALOR_DIA[i] == diaSemana && isHoraPico(getHora())) {
					resultado = "Vehiculo no debe estar en el camino";
					return resultado;
				}
			}
			resultado = "Vehiculo puede estar en el camino";

		} catch (ParseException error) {
			error.printStackTrace();
		}
		return resultado;
	}

}
