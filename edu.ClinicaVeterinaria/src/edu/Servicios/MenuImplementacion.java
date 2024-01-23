/**
 * 
 */
package edu.Servicios;

import java.util.Scanner;

/**
 * 
 */
public class MenuImplementacion implements MenuInterfaz{
	
	public int menuPrincipal() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("----------------------------");
		System.out.println("- [0] -> Cerrar Aplicacion -");
		System.out.println("- [1] -> Dar Alta Paciente -");
		System.out.println("----------------------------");
		
		int seleccionMenu = sc.nextInt();
		
		return seleccionMenu;	
	}

}
