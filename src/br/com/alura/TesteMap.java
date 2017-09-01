package br.com.alura;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TesteMap {
	
	
	public static void main(String[] args) {
		
		Map<String, Integer> nomesParaIdade = new HashMap<>();
		nomesParaIdade.put("Alice", 1);
		nomesParaIdade.put("Ana Clara", 5);
		nomesParaIdade.put("Jonatas", 18);
		
		
		nomesParaIdade.keySet().forEach(a -> {
			System.out.println(nomesParaIdade.get(a));
		});
		
		Set<String> chaves = nomesParaIdade.keySet();    
		for (String nome : chaves) {
		    System.out.println(nome);
		    
		    Collection<Integer> valores = nomesParaIdade.values();
		    for (Integer idade : valores) {
		        System.out.println(idade);
		        
		        Set<java.util.Map.Entry<String, Integer>> associacoes = nomesParaIdade.entrySet();
		        
		        Set<java.util.Map.Entry<String, Integer>> associacoes1 = nomesParaIdade.entrySet();    
		        for (java.util.Map.Entry<String, Integer> associacao : associacoes) {
		            System.out.println(associacao.getKey() + " - " + associacao.getValue());
		        }
		    }
		}
		
		
	}
	
	
}
