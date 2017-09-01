package br.com.alura;

import java.util.List;

public class TestaCurso {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
			
		List<Aula> aulas = javaColecoes.getAulas();
		
	//	javaColecoes.getAulas().add(new Aula("trabalhando com cursos e array list", 21));
		
	//	aulas.add(new Aula("trabalhando com cursos e array list", 21));
		
		javaColecoes.adiciona(new Aula("trabalhando com cursos e array list", 21));
		javaColecoes.adiciona(new Aula("criando uma aula", 22));
		javaColecoes.adiciona(new Aula("modelando com coleçoes", 23));
		
		System.out.println(javaColecoes.getAulas());
		
	//	System.out.println(aulas == javaColecoes.getAulas());
		
		
	}

}
