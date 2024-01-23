/**
 * 
 */
package edu.Controladores;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Dtos.PacienteDto;
import edu.Servicios.AltaPacienteImplementacion;
import edu.Servicios.AltaPacienteInterfaz;
import edu.Servicios.MenuImplementacion;
import edu.Servicios.MenuInterfaz;

/**
 * 
 */
public class Inicio {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<PacienteDto> listaPacientes = new ArrayList<PacienteDto>();
		
		Scanner sc = new Scanner (System.in);
		
		MenuInterfaz me = new MenuImplementacion();
		
		AltaPacienteInterfaz pa = new AltaPacienteImplementacion();
		
		boolean cerrarAplicacion = false;
		
		while(!cerrarAplicacion) {
			
		int seleccionMenu = me.menuPrincipal();
			
			switch (seleccionMenu) {
			
			case 0:
				
				System.out.println("[INFO] -> Se cerrara la Aplicacion");
				cerrarAplicacion = true;
				
				break;
				
			case 1:
				
				System.out.println("[INFO] -> Se dara de alta a un nuevo paciente");
				pa.altaPaciente(listaPacientes);
				
				break;

					
			default:
				
				System.out.println("[ATENCION] -> Seleccion no Valida");
			
			
			}
			
			
			
		}
		

		
		
		
		
		
	}

}
