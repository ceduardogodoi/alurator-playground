package br.com.alura.alurator.playground.instancia_abstratos;

import java.util.AbstractCollection;
import java.util.List;

import br.com.alura.alurator.ioc.ContainerIoC;

public class CriaInstanciaAbstractCollection {

    public static void main(String[] args) {
        ContainerIoC container = new ContainerIoC();

        Object instancia = container.getInstancia(AbstractCollection.class);

        System.out.println(instancia instanceof List);
    }

}