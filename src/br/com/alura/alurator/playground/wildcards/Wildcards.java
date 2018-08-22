package br.com.alura.alurator.playground.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Wildcards {

	public static void main(String[] args) {
		List<Number> lista = new ArrayList<>();
		lista.add(1);
		
		print(lista);
	}
	
// Lower Bounded Wildcard
// <? super Integer> qualquer coisa que seja um super tipo de Integer
	public static void print(List<? super Integer> lista) {
		for (Object o : lista)
			System.out.println(o + " ");
		System.out.println();
	}
	
}
