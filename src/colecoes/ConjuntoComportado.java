package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<String>(); //pode ser vazio o parâmetro da Generics do lado direito,
												   //como: Set<String> lista = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		

		Set<Integer> nums = new HashSet<>(); //pode ser vazio o parâmetro da Generics do lado direito,
												   //como: Set<String> lista = new HashSet<>();
		//teste123456
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(5);
		
		for(int num: nums) {
			System.out.println(num);
		}
		
		
	}

}
