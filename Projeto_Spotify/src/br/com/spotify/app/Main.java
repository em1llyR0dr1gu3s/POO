package br.com.spotify.app;
import java.util.Scanner;

import br.com.spotify.model.Musica;

public class Main {
	
	public static void main (String[] args) {
		
		Musica primeiraMusica = new Musica();
		
		
		//Música
		
		primeiraMusica.setTitulo("shameless");
		primeiraMusica.setArtista("camila cabello");
		primeiraMusica.setGenero("pop");
		primeiraMusica.setDuracao("3:36");
		primeiraMusica.setReproducoes(100000); 
		primeiraMusica.setCurtidas(27000);
		
		primeiraMusica.imprimeInfo();
		
		
		Scanner s = new Scanner(System.in);
		
		while (true) {
		
		System.out.println("Quer reproduzir a música? [S/N]");
		String lt = s.nextLine();
		
		if(lt.equalsIgnoreCase("S")) {
			primeiraMusica.setReproducoes(primeiraMusica.getReproducoes() + 1);
			
		}else if(lt.equals("N")) {
		
		}else {
			System.out.println("Opção indisponivel");
		}
		
		primeiraMusica.imprimeInfo();
		System.out.println();
		
		Scanner s2 = new Scanner(System.in);
		
		System.out.println("Quer curtir a música? [S/N]");
		String lt2 = s.nextLine();
		
		if(lt.equalsIgnoreCase("S")) {
			primeiraMusica.setCurtidas(primeiraMusica.getCurtidas() + 1);
			
		}else if(lt.equals("N")) {
		
		}else {
			System.out.println("Opção indisponivel");
		}
		
		primeiraMusica.imprimeInfo();
	}
		
	}
}
