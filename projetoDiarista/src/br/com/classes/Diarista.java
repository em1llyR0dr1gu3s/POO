package br.com.classes;

public class Diarista extends Pessoa{
	
	protected String chavePix;
	
	public void atender(String nomeCliente) {
		System.out.println("Realizamos atendimento para cliente "+ nomeCliente);
		}

	public String getChavePix() {
		return chavePix;
	}

	public void setChavePix(String chavePix) {
		this.chavePix = chavePix;
	}

	@Override
	public void sacar(int valor) {
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual - valor;
		this.setSaldo(novoSaldo);
		
	}

	@Override
	public void depositar(int valor) {
		var saldoAtual = this.getSaldo();
		var novoSaldo = saldoAtual + valor;
		this.setSaldo(novoSaldo);
		
		
		
	}
	
	
	
	
}
