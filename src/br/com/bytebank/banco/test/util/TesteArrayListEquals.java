package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {
		
		// < > ->Generics->Guarda apenas referencias do mesmo tipo
		
		ArrayList<Conta> lista = new ArrayList<Conta>();
				
		Conta cc = new ContaCorrente(22, 13);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(22, 11);
		
		//Contains->Verifica referencia
		boolean existe = lista.contains(cc3); 
		
		System.out.println("Ja existe? " + existe);
		
		for(Conta conta: lista) {
			System.out.println(conta);
		}
		
//		Conta cc4 = new ContaCorrente(22, 11);		
//		Conta cc5 = new ContaCorrente(22, 11);
//		System.out.println( cc4.contaIgual(cc5));
	}
}
