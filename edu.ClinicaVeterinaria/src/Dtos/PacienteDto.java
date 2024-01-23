/**
 * 
 */
package Dtos;

/**
 * 
 */
public class PacienteDto {







	long idEsclavo;
	
	int edadPaciente = 11111;
	
	String fchNacimientoPaciente = "9999/12/31";
	
	char sexoBiologicoPaciente = 'a';
	
	String especiePaciente = "aaaaa";
	
	String nombrePaciente = "aaaaa";
	
	long idPaciente;
	
	
	
	
	//Getter and Setters
	
	public long getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(long idPaciente) {
		this.idPaciente = idPaciente;
	}

	public String getNombrePaciente() {
		return nombrePaciente;
	}

	public void setNombrePaciente(String nombrePaciente) {
		this.nombrePaciente = nombrePaciente;
	}

	public int getEdadPaciente() {
		return edadPaciente;
	}

	public void setEdadPaciente(int edadPaciente) {
		this.edadPaciente = edadPaciente;
	}

	public String getFchNacimientoPaciente() {
		return fchNacimientoPaciente;
	}

	public void setFchNacimientoPaciente(String fchNacimientoPaciente) {
		this.fchNacimientoPaciente = fchNacimientoPaciente;
	}

	public char getSexoBiologicoPaciente() {
		return sexoBiologicoPaciente;
	}

	public void setSexoBiologicoPaciente(char sexoBiologicoPaciente) {
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
	}

	public String getEspeciePaciente() {
		return especiePaciente;
	}

	public void setEspeciePaciente(String especiePaciente) {
		this.especiePaciente = especiePaciente;
	}

	public long getIdEsclavo() {
		return idEsclavo;
	}

	public void setIdEsclavo(long idEsclavo) {
		this.idEsclavo = idEsclavo;
	}

	


	public PacienteDto(long idEsclavo, int edadPaciente, String fchNacimientoPaciente, char sexoBiologicoPaciente,
			String especiePaciente, String nombrePaciente, long idPaciente) {
		super();
		this.idEsclavo = idEsclavo;
		this.edadPaciente = edadPaciente;
		this.fchNacimientoPaciente = fchNacimientoPaciente;
		this.sexoBiologicoPaciente = sexoBiologicoPaciente;
		this.especiePaciente = especiePaciente;
		this.nombrePaciente = nombrePaciente;
		this.idPaciente = idPaciente;
	}
	
	
	
	public PacienteDto() {
		super();
	}

	
	
	
	@Override
	public String toString() {
		return "PacienteDto [idEsclavo=" + idEsclavo + ", edadPaciente=" + edadPaciente + ", fchNacimientoPaciente="
				+ fchNacimientoPaciente + ", sexoBiologicoPaciente=" + sexoBiologicoPaciente + ", especiePaciente="
				+ especiePaciente + ", nombrePaciente=" + nombrePaciente + ", idPaciente=" + idPaciente + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
