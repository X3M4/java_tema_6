package EA8;

import java.util.Iterator;

public class TestListaPacientes {

	public static void main(String[] args) {
		
		ListaPacientes lp = new ListaPacientes("Clínica dental");
		lp.setPaciente(13456745, "Andres", 175);
		lp.setPaciente(23456754, "Carla", 168);
		lp.setPaciente(43612089, "Vicente", 185);
		lp.setPaciente(98763420, "Mateo", 174);
		lp.setPaciente(98763421, "Arantxa", 174);
		
		System.out.println(lp.getPaciente(0).compareTo(lp.getPaciente(1)));
		System.out.println(lp.getPaciente(0).compareTo(lp.getPaciente(2)));
		System.out.println(lp.getPaciente(3).compareTo(lp.getPaciente(4)));
	}
}
