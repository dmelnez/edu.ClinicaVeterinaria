package edu.Servicios;

import java.util.List;
import java.util.Scanner;

import Dtos.EsclavoDtos;
import Dtos.PacienteDto;

public class AltaEsclavoImplementacion implements AltaEsclavoInterfaz{

	public long altaEsclavo (List<PacienteDto> listaPacientes) {
		
		Scanner sc = new Scanner(System.in);
		
		EsclavoDtos nuevoEsclavo = new EsclavoDtos();
		
		System.out.println("########################");
		System.out.println("### DAR ALTA ESCLAVO ###");
		System.out.println("########################");
		System.out.println("ID ESCLAVO: ");
		long idEsclavo = sc.nextLong();
		idEsclavo = nuevoEsclavo.getIdEsclavo();
		
		System.out.println("NOMBRE: ");
		String nombreEsclavo = sc.next();
		nombreEsclavo = nuevoEsclavo.getNombreEsclavo();
		
		System.out.println("APELLIDOS: ");
		String apellidosEsclavo = sc.next();
		apellidosEsclavo = nuevoEsclavo.getApellidosEsclavo();
		
		System.out.println("TELEFONO: ");
		int telefonoEsclavo = sc.nextInt();
		
		System.out.println("DNI: ");
		String dniEsclavo = sc.next();
		dniEsclavo = nuevoEsclavo.getDniEsclavo();

		
		return idEsclavo;

		
		
		
	}
	
	
}
