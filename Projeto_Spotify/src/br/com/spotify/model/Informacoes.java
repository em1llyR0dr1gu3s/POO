package br.com.spotify.model;

public class Informacoes {
	
private String titulo;
	
	private String artista;
	
	private String genero;
	
	private String duracao;
	
	private int reproducoes;

	private int curtidas;
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getDuracao() {
		return duracao;
	}

	public void setDuracao(String duracao) {
		this.duracao = duracao;
	}

	public int getReproducoes() {
		return reproducoes;
	}

	public void setReproducoes(int string) {
		this.reproducoes = string;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}
	
	public void imprimeInfo() {
		System.out.println("Título: " + getTitulo());
		System.out.println("Artista: " + getArtista());
		System.out.println("Gênero: " + getGenero());
		System.out.println("Duração: " + getDuracao() + " Minutos");
		System.out.println("Total de Reproduções: " + getReproducoes());
		System.out.println("Total de Curtidas: " + getCurtidas());
	}

}
