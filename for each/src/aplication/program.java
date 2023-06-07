package aplication;

public class program {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"maria", "bob", "alex"};
		
		for(int i=0; i< vect.length; i++) {
			System.out.println(vect[i]);
		}
		System.out.println("-------------------------");
		// leitura: para cada objeto 'obj' contido em vect, faça:
		for(String obj : vect) { //percorre todos os elementos de vect chamando cada um dos elementos de OBJ
			System.out.println(obj);
		}
	}

}
