package br.com.alura;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/**
 * velocidade e performace em usar Set hashset (tabela de espalhamento)
 * @author Israel
 *
 */

public class TestaAlunos {
	
	public static void main(String[] args) {
		
		Collection<String> alunos = new HashSet<>();
		
		alunos.add("Rodrigo Turini");
		alunos.add("Joao Grandao");
		alunos.add("Nico steppat");
		alunos.add("Sergio Lopes");
		alunos.add("Renan Seggio");
		alunos.add("Mauricio Aniche");
		alunos.add("Mauricio Aniche");
		alunos.add("Paulo Silveira");
		
		ArrayList<String> alunosEmLista = new ArrayList<>(alunos);
		
		boolean pauloEstaMatriculado = alunos.contains("Paulo Silveira");
		alunos.remove("Sergio Lopes");
		
		System.out.println(pauloEstaMatriculado);
		
		for (String aluno : alunos) {
		//	System.out.println(aluno);
		}
		
		
		alunos.forEach(aluno -> {
			System.out.println(aluno);
		});
		
		// System.out.println(alunos.size());
		
	}

}
