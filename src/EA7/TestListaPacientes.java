package EA7;

import java.util.Iterator;

public class TestListaPacientes {

	public static void main(String[] args) {
		
		ListaPacientes lp = new ListaPacientes("Clínica dental");
		lp.setPaciente(13456745, "Andres", 175);
		lp.setPaciente(23456754, "Carla", 168);
		lp.setPaciente(43612089, "Vicente", 185);
		lp.setPaciente(98763421, "Mateo", 174);
		lp.setPaciente(98763421, "Arantxa", 174);
		
		System.out.println("Total pacientes = " + lp.getTotalPacientes());
		
		for(Persona p: lp.arp) {
			if(p.getAltura() == 174) {
				System.out.println("Paciente eliminado: " + lp.eliminaDatos(lp.getPosicion(p)));
			}
		}
		System.out.println("Total pacientes = " + lp.getTotalPacientes());
	}

}
