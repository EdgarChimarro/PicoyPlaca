package modelo;

/**
 * 
 */

/**
 * @author Edgar Chimarro
 *
 */
public class PicoyPlaca {

	protected static final String[] DIAS_SEMANA = { "Lunes", "Martes", "Miercoles", "Jueves", "Viernes" };
	protected static final int[] VALOR_DIA = { 2, 3, 4, 5, 6 };

	private String placa;
	private String fecha;
	private int hora;

	/**
	 * Constructor de clase con los parametros
	 * 
	 * @param placa
	 * @param fecha
	 * @param hora
	 */
	protected PicoyPlaca(String placa, String fecha, int hora) {
		this.placa = placa;
		this.fecha = fecha;
		this.hora = hora;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public int getHora() {
		return hora;
	}

	public void setHora(int hora) {
		this.hora = hora;
	}

	public boolean isHoraPico(int hora) {
		boolean horaPico = false;
		this.hora = hora;
		if (hora >= 7 && hora <= 9) {
			horaPico = true;
		} else if (hora >= 16 && hora <= 19) {
			horaPico = true;
		}
		return horaPico;
	}

	/*
	 * private String predecirPicoyPlaca(String placa, String fecha, int hora) {
	 * this.placa = placa; this.fecha = fecha; this.hora = hora; int diaSemana =
	 * 0; String resultado = ""; try { Date fechaIngresada = new
	 * SimpleDateFormat("dd/MM/yyyy").parse(fecha); Calendar calendario =
	 * Calendar.getInstance(); calendario.setTime(fechaIngresada); diaSemana =
	 * calendario.get(Calendar.DAY_OF_WEEK);
	 * 
	 * for (int i = 0; i < DIAS_SEMANA.length; i++) { if (VALOR_DIA[i] ==
	 * diaSemana && isHoraPico(hora)) { resultado =
	 * "Vehiculo no debe estar en el camino"; return resultado; } } resultado =
	 * "Vehiculo puede estar en el camino";
	 * 
	 * } catch (ParseException error) { error.printStackTrace(); } return
	 * resultado; }
	 */
}