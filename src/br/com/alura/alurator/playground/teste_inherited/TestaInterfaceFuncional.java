package br.com.alura.alurator.playground.teste_inherited;

public class TestaInterfaceFuncional {

	public static void main(String[] args) {
		System.out.println("Interface Funcional usando lambda");
		InterfaceFuncional ifunc = numero -> System.out.println(numero);
		ifunc.imprime(10);
		
		System.out.println();
		
		System.out.println("Interface Funcional usando classe anônima");
		new InterfaceFuncional() {
			@Override
			public void imprime(int numero) {
				System.out.println(numero);
			}
		}.imprime(10);
	}
	
}
