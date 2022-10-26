package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
// import java.util.Collection;
// import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {
		
		// < > ->Generics->Guarda apenas referencias do mesmo tipo
		
		//Collection<Conta> lista = new LinkedList<Conta>();
		List<String> nomes = new ArrayList<String>();
		List<Conta> lista = new Vector<Conta>(); //Thread Safe
				
		Conta cc = new ContaCorrente(22, 13);
		lista.add(cc);
		
		Conta cc2 = new ContaCorrente(22, 11);
		lista.add(cc2);
		
		System.out.println(lista.size());
		
		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());
		
		lista.remove(0);
		System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(22, 12);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(22, 14);
		lista.add(cc4);
		
		for(int i = 0; i < lista.size(); i++ ) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("-----");
		for(Conta conta: lista) {
			System.out.println(conta);
		}
	}
}
