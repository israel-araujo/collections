package br.com.alura;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;

public class TestaCursoComAluno {
	
	public static void main(String[] args) {
		
		Curso javaColecoes = new Curso("Dominando as colecoes do java", "Paulo Silveira");
		
		javaColecoes.adiciona(new Aula("trabalhando com cursos e array list", 21));
		javaColecoes.adiciona(new Aula("criando uma aula", 22));
		javaColecoes.adiciona(new Aula("modelando com coleçoes", 23));
		
		Aluno a1 = new Aluno("Rodrigo Turino", 34672);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Mauricio Aniche", 17645);
		//Aluno a4 = new Aluno("Israel araujo", 22222);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		//javaColecoes.matricula(a4);
		
		System.out.println(" Todos os alunos matriculados");
		
		
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> iterador = alunos.iterator();
		while(iterador.hasNext()){
			Aluno proximo = iterador.next();
			System.out.println(proximo);
		}
		
		// Vector<Aluno> vetor = new Vector<>();
		
				
	//	for (Aluno a : javaColecoes.getAlunos()) {
	//		System.out.println(a);
	//	}
		
		
		
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		
		//System.out.println(  a4 + " esta matriculado ?");
		//System.out.println(javaColecoes.estaMatriculado(a4));
		
		
		String alunoProcurado = "Israel araujo";
		
		Aluno araujo = new Aluno("Israel araujo", 22222);
		System.out.println("araujo , esta matriculado ?");
		System.out.println(javaColecoes.estaMatriculado(araujo));
		
			
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("E esse Turini, está matriculado?");
		System.out.println(javaColecoes.estaMatriculado(turini));
		
	}

}