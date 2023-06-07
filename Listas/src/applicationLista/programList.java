package applicationLista;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class programList {

	public static void main(String[] args) {
		List<String> list =  new ArrayList<>();
		
		list.add("Maria");//adicionar lista
		list.add("João");		
		list.add("Bob");
		list.add("Biel");
		list.add(2, "Marco");//adicionar na posição desejável
		
		System.out.println(list.size());// mostrar o tamanho da lista
		
		for(String x : list) {
			System.out.println(x); //mostrar os elementos da lista
		}
		System.out.println("-------------------------");
		//list.remove(1); > ou seja posição 1
		//list.remove("Lucas");
		list.removeIf(x -> x.charAt(0) == 'M'); // remover todas as palavras/nomes da lista que começa com a letra 'm'
		for(String x : list) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		System.out.println("Index of Bob: " + list.indexOf("Bob")); // para mostrar posição de um certo
		System.out.println("Index of marco: " + list.indexOf("Marco"));
		
		System.out.println("-------------------------");
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'B').collect(Collectors.toList());
		// para pegar os elementos da lista e colocar apenas os que começam com B voltando então os dados para a lista
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("-------------------------");
		// para encontrar o preimeiro cara que começa com a letra A
		String name = list.stream().filter(x -> x.charAt(0) == 'j').findFirst().orElse(null);// se o elemento n existir ele retorna nulo
		System.out.println(name);
	}
}
