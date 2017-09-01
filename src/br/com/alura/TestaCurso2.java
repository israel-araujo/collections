package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("trabalhando com cursos e array list", 21));
		javaColecoes.adiciona(new Aula("criando uma aula", 20));
		javaColecoes.adiciona(new Aula("modelando com coleçoes", 24));
		
		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		
		System.out.println(aulasImutaveis);
		
		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		
		Collections.sort(aulas);
		
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal()  + " " + "min");
		
		System.out.println(javaColecoes);
	
	}

}
