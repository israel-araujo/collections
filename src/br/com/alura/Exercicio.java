package br.com.alura;

import java.util.HashMap;
import java.util.Map;

import org.omg.CosNaming.NamingContextExtPackage.InvalidAddress;

public class Exercicio {
	
	public static void main(String[] args) {
		
		  Map<Integer, String> pessoas = new HashMap<>();
		  
		  pessoas.put(21, "Israel Araujo");
		  pessoas.put(34, "Joao Silva");
		  pessoas.put(45, "July Araujo");
		  pessoas.put(70, "Ismael Ferreira");
		  
		  pessoas.keySet().forEach(idade -> {
			  System.out.println(pessoas.get(idade));
		  });
	}

}
