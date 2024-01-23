package edu.Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.PacienteDto;

public class AltaPacienteImplementacion implements AltaPacienteInterfaz {

	public void altaPaciente (List<PacienteDto> listaPacientes) {
		
		AltaEsclavoInterfaz esc = new AltaEsclavoImplementacion();
		
		Scanner sc = new Scanner(System.in);
		
		PacienteDto nuevoPaciente = new PacienteDto();
		
		System.out.println("NOMBRE: ");
		String nombre = sc.next();
		nombre = nuevoPaciente.getNombrePaciente();
		
		System.out.println("EDAD: ");
		int edadPaciente = sc.nextInt();
		edadPaciente = nuevoPaciente.getEdadPaciente();
		
		System.out.println("FECHA NAC: ");
		String fechaNacPaciente = sc.next();
		fechaNacPaciente = nuevoPaciente.getFchNacimientoPaciente();
		
		System.out.println("SEXO: ");
		char sexoPaciente = sc.next().charAt(0);
		sexoPaciente = nuevoPaciente.getSexoBiologicoPaciente();
		
		System.out.println("ESPECIE: ");
		String especiePaciente = sc.next();
		especiePaciente = nuevoPaciente.getEspeciePaciente();
		
		System.out.println("ID PACIENTE: ");
		long idPaciente = sc.nextLong();
		idPaciente = nuevoPaciente.getIdPaciente();
		
		System.out.println("¿EL ESCLAVO EXISTE?");
		System.out.println("True/False");
		

	
		
		boolean validadorEsclavo = sc.nextBoolean();
		
		
		
		if (validadorEsclavo == true) {
			
			System.out.println("ID ESCLAVO");
			long idEsclavo = sc.nextInt();
			
			idEsclavo = nuevoPaciente.getIdEsclavo();
			
		}
		
		else {
			
			long idEsclavo = esc.altaEsclavo(listaPacientes);
			
			idEsclavo = nuevoPaciente.getIdEsclavo();
			
		}
		
		

		
		listaPacientes.add(nuevoPaciente);
		
	}
	
	
}
