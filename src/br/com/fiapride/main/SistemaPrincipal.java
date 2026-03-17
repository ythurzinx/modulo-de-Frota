package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class SistemaPrincipal {

    public static void main(String[] args) {

        System.out.println("Iniciando sistema");

        Veiculo v1 = new Veiculo("Ana Silva", "ABC-1234");
        v1.adicionarCombustivel(50);

        Veiculo v2 = new Veiculo("Carlos Souza", "DEF-5678");
        v2.adicionarCombustivel(12.5);

        System.out.println(v1.getProprietario() + " - " + v1.getCombustivel());
        System.out.println(v2.getProprietario() + " - " + v2.getCombustivel());

        v1.consumirCombustivel(20);
        v2.consumirCombustivel(20);

        System.out.println("Depois do consumo:");
        System.out.println(v1.getProprietario() + " - " + v1.getCombustivel());
        System.out.println(v2.getProprietario() + " - " + v2.getCombustivel());
    }
}