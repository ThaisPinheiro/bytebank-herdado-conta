package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {
		//ArrayList, LinkedList,Vector -> Só existem coleções de referências 
			
		int idade = 29;
		Integer idadeRef = Integer.valueOf(29); //autoboxing
		System.out.println(idadeRef.doubleValue());
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.SIZE);
		
		int valor = idadeRef.intValue(); //unboxing
		List<Integer>numeros = new ArrayList<Integer>();
		numeros.add(29);

		String s = args[0];
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		System.out.println(numero);
	}
}
