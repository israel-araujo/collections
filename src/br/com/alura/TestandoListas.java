package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
	public static void main(String[] args) {
		
		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";
		String aula4 = "Trabalhando com cursos e big data";
		
		ArrayList<String> aulas = new ArrayList<>();
		
		
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);
		aulas.add(aula4);
		
		// aulas.contains()
		
		System.out.println(aulas);
		
		//aulas.remove(1);
	
		
		System.out.println(aulas);
		
		for (String aula : aulas) {
			System.out.println("Aula : " +" " + aula);
			
			for(int i = 0; i < aulas.size(); i++){
				System.out.println("using for as iterator : "  +" " + aulas.get(i));
				// O método size retorna o total de elementos.
			}
			
			System.out.println(aulas.size());
			
			
		}
		
		String primeiraAula = aulas.get(0);
		System.out.println("primeiro curso utiliza o metodo get" +"  "+ primeiraAula);
		
		aulas.forEach(aula -> {
			
			System.out.println("percorrendo e usando lambda :");
			System.out.println(aula);
			
		});
		
		Collections.sort(aulas);
		System.out.println("ordenando lexografico" +" "+ aulas);
	}
	
	
	
	

}
