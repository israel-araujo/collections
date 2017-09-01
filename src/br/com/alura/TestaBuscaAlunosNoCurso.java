package br.com.alura;

import java.util.Map;
import java.util.Set;

public class TestaBuscaAlunosNoCurso {
	
	public static void main(String[] args) {
		
Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("trabalhando com cursos e array list", 21));
		javaColecoes.adiciona(new Aula("criando uma aula", 22));
		javaColecoes.adiciona(new Aula("modelando com coleçoes", 23));
		
		Aluno a1 = new Aluno("Rodrigo Turino", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		Aluno a4 = new Aluno("Israel araujo", 17645);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		javaColecoes.matricula(a4);
		
		System.out.println(javaColecoes.getInstrutor());
		Aluno aluno = javaColecoes.buscaMatriculado(17645);
		System.out.println(aluno);
		
		Map<Integer,Set<Aluno>> matriculaParaAlunos;
		
		
	}
	
	

}
