/**
 * 
 */
package Dtos;

/**
 * 
 */
public class EsclavoDtos {




	long idEsclavo;
	
	String nombreEsclavo = "aaaaa";
	
	String apellidosEsclavo = "aaaaa";
	
	int telefonoEsclavo = 11111;
	
	String dniEsclavo = "aaaaa";
	
	
	
	
	public long getIdEsclavo() {
		return idEsclavo;
	}

	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}

	public String getNombreEsclavo() {
		return nombreEsclavo;
	}

	public void setNombreEsclavo(String nombreEsclavo) {
		this.nombreEsclavo = nombreEsclavo;
	}

	public String getApellidosEsclavo() {
		return apellidosEsclavo;
	}

	public void setApellidosEsclavo(String apellidosEsclavo) {
		this.apellidosEsclavo = apellidosEsclavo;
	}

	public int getTelefonoEsclavo() {
		return telefonoEsclavo;
	}

	public void setTelefonoEsclavo(int telefonoEsclavo) {
		this.telefonoEsclavo = telefonoEsclavo;
	}

	public String getDniEsclavo() {
		return dniEsclavo;
	}

	public void setDniEsclavo(String dniEsclavo) {
		this.dniEsclavo = dniEsclavo;
	}

	
	
	

	public EsclavoDtos(long idEsclavo, String nombreEsclavo, String apellidosEsclavo, int telefonoEsclavo,
			String dniEsclavo) {
		super();
		this.idEsclavo = idEsclavo;
		this.nombreEsclavo = nombreEsclavo;
		this.apellidosEsclavo = apellidosEsclavo;
		this.telefonoEsclavo = telefonoEsclavo;
		this.dniEsclavo = dniEsclavo;
	}
	
	

	public EsclavoDtos() {
		super();
	}

	
	
	@Override
	public String toString() {
		return "EsclavoDtos [idEsclavo=" + idEsclavo + ", nombreEsclavo=" + nombreEsclavo + ", apellidosEsclavo="
				+ apellidosEsclavo + ", telefonoEsclavo=" + telefonoEsclavo + ", dniEsclavo=" + dniEsclavo + "]";
	}
	
	
	
	
	
	
	
	
}
