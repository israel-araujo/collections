package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroDaMatricula;

	public Aluno(String nome, int numeroDaMatricula) {

		if (nome == null) {

			throw new NullPointerException("nome não pode ser nulo");
		}

		this.nome = nome;
		this.numeroDaMatricula = numeroDaMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroDaMatricula() {
		return numeroDaMatricula;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + numeroDaMatricula;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (numeroDaMatricula != other.numeroDaMatricula)
			return false;
		return true;
	}

	@Override
	public String toString() {

		return "[Aluno: " + this.nome + ", matricula:" + this.numeroDaMatricula + "]";
	}

}
