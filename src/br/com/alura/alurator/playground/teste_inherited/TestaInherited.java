package br.com.alura.alurator.playground.teste_inherited;

import java.util.stream.Stream;

public class TestaInherited {

	public static void main(String[] args) {
		Produto produto = new Produto("Achocolatado Nescau 3.0", 3.0, "Nescau");
		Class<?> classeProduto = produto.getClass();
		
		NomeTagXml2 annotation = classeProduto.getAnnotation(NomeTagXml2.class);
		System.out.println(annotation.value());
		
		// getDeclaredAnnotations retorna somente as anotações dessa mesma classe
		// desconsiderando as super classes e interfaces
		Stream	
			.of(classeProduto.getDeclaredAnnotations())
			.forEach(System.out::println);

		// getAnnotations retorna as anotações dessa mesma classe
		// também considerando as super classes e interfaces
		Stream	
			.of(classeProduto.getAnnotations())
			.forEach(System.out::println);
	}
	
}
