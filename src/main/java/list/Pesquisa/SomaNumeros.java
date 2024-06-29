package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {

    private List<Integer> numeros;

    public SomaNumeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        if(!numeros.isEmpty()) {
            for (int n : numeros) {
                soma = soma + n;
            }
        }
        return soma;
    }

    public int encontrarMaiorNumero() {
        int maiorNumero = 0;
        if(!numeros.isEmpty()) {
            for (int n: numeros) {
                if (maiorNumero < n) {
                    maiorNumero = n;
                }
            }
        }
        return maiorNumero;
    }

    public int encontrarMenorNumero() {
        int menorNumero = 0;
        if (!numeros.isEmpty()) {
            for (int n : numeros) {
                if (menorNumero > n) {
                    menorNumero = n;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println("Todos os números da lista: "+numeros);
    }

    public static void main(String[] args) {

        SomaNumeros numeros = new SomaNumeros();

        numeros.adicionarNumero(1);
        numeros.adicionarNumero(10);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(-3);
        numeros.adicionarNumero(-5);

        System.out.println("Soma de todos os números da lista: "+numeros.calcularSoma());

        System.out.println("Maior número da lista: "+numeros.encontrarMaiorNumero());

        System.out.println("Menor número da lista: "+ numeros.encontrarMenorNumero());

        numeros.exibirNumeros();

    }


}
