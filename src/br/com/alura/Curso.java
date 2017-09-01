package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;

public class Curso {

	/**
	 * O LinkedHashSet nos dá a performance de um HashSet mas com acesso
	 * previsível e ordenado.
	 */

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer,Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();

		}

		return tempoTotal;
	}

	public int getTempoTotal1() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum(); // java 8
																	// stream

	}

	@Override
	public String toString() {

		return "[Curso: " + this.getNome() + ", tempo total:  " + this.getTempoTotal() + ",  " + this.aulas + "]";
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);

	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
		this.matriculaParaAluno.put(aluno.getNumeroDaMatricula(), aluno);

	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public boolean estaMatriculado(Aluno aluno) {

		return this.alunos.contains(aluno);
	}

	public Aluno buscaMatriculado(int numero) {
		
		if(!matriculaParaAluno.containsKey(numero) )
			throw new NoSuchElementException("aluno não encontrado !");
		return matriculaParaAluno.get(numero);
	}

}
