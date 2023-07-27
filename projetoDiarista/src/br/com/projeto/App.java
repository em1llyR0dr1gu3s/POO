package br.com.projeto;

import br.com.classes.Atendimento;
import br.com.classes.Clientes;
import br.com.classes.Diarista;

public class App {

	public static void main(String[] args) {

		Diarista  diarista = new Diarista();
		diarista.setNome( "João da Silva");
		diarista.setTelefone("(11)99523-8879");
		diarista.setEndereco("Av Cajamar, N 111");
		diarista.setChavePix("123"); 
		
		
		System.out.println("Nome Diarista: "+ diarista.getNome());
		System.out.println("Telefone Diarista: "+ diarista.getTelefone());
		System.out.println("Endereço Diarista: "+ diarista.getEndereco());
		System.out.println("Chave Pix Diarista "+ diarista.getChavePix());
		diarista.atender("Daniel");
		
		System.out.println("Saldo Cliente: " + diarista.getSaldo());
		diarista.depositar(30);
		System.out.println("Novo Saldo: "+ diarista.getSaldo());
		diarista.sacar(10);
		System.out.println("saque:" + diarista.getSaldo());
		
		
		System.out.println("====================================================================================================");
		
		Clientes cliente = new Clientes();
		cliente.setNome( "Daniel");
		cliente.setTelefone("(11)995238879"); 
		cliente.setEndereco("Av Osasco, N 41"); 
		
		
		
				
		System.out.println("Nome Cliente: "+ cliente.getNome());
		System.out.println("Telefone Cliente: "+ cliente.getTelefone());
		System.out.println("Endereço Cliente: "+ cliente.getEndereco());
		System.out.println("Saldo Cliente: "+ cliente.getSaldo());
		cliente.depositar(30);
		System.out.println("Novo Saldo: "+ cliente.getSaldo());
		cliente.sacar(20);
		System.out.println("Saque: " + cliente.getSaldo());
		
		
		
		System.out.println("=====================================");
		
		Atendimento atendimento = new Atendimento();
		
		atendimento.setHoras(5);
		System.out.println(atendimento.getHoras());
		
				
				
		
	}

}
