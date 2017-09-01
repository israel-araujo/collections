package br.com.alura;


/**
 * Por que implementar o metodo to string 
 * 
 * Isso aconteceu porque o método toString da classe ArrayList percorre todos os elementos da lista,
 * concatenando seus valores também de toString. Como a classe Aula não possui um toString reescrito (override),
 * ele utilizará o toString definido em Object, que retorna o nome da classe,
 * concatenado com um @ e seguido de um identificador único do objeto.
 * [Aula@c3bfe4, Aula@d24512, Aula@c13eaa1]
 * 
 * 
 * @author Israel
 *
 */

public class Aula implements Comparable<Aula>{
	private String titulo;
	private int tempo;
	
	public Aula(String titulo, int tempo) {
		// super(); não precisa é implicito no java
		this.titulo = titulo;
		this.tempo = tempo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public int getTempo() {
		return tempo;
	}
	

	
	@Override
	public String toString() {
		
	//	return "[Aula : " + this.titulo + " " + this.tempo  + " minutos]";
		
		return  "[ Aula " + this.titulo +"   "+ this.tempo+" min]";
	}

	@Override
	public int compareTo(Aula outraAula) {
		
		return this.titulo.compareTo(outraAula.titulo);
	}

}
