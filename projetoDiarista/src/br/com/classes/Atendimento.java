package br.com.classes;

public class Atendimento {

	private int horas;

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		
		if (horas >= 1 && horas <=12) {
			
			System.out.println("Parabens Atendimento Realizado");
		}else {
		
		this.horas = horas;
		System.out.println("Atendimento fora do horario comercial");
	}
	
	
}
	
}
