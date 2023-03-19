package EA5;

public class Ea5 {

	public static void main(String[] args) {
		
		ListaPacientes lp = new ListaPacientes("Clínica dental");
		lp.setPaciente(13456745, "Andres", 175);
		lp.setPaciente(23456754, "Carla", 168);
		lp.setPaciente(43612089, "Vicente", 185);
		
		System.out.println("Total pacientes = " + lp.getTotalPacientes());
		System.out.println(lp.getPaciente(1));
		System.out.println("Paciente eliminado: " + lp.eliminaDatos(0));
		System.out.println("Total pacientes = " + lp.getTotalPacientes());
	}

}
