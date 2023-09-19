package edu.dio.me.collection.list.somaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public void calcularSoma(){

        int somaTotal = 0;

        for(Integer n : numeroList){
                somaTotal += n;
        }
            System.out.println("Soma total = " + somaTotal);
        }

    public void encontrarMaiorNumero(){

        int maiorNumero = Integer.MIN_VALUE;

        if(!numeroList.isEmpty()){

            for (Integer n : numeroList) {
                if (n >= maiorNumero){
                    maiorNumero = n;
                }
                }
                System.out.println("O maior número é: " + maiorNumero);
            } else  {
                throw new RuntimeException("A lista está vazia");
            }
            
        }

    public void encontrarMenorNumero(){

        int menorNumero = Integer.MAX_VALUE;

        if(!numeroList.isEmpty()){

            for (Integer n : numeroList) {
                if (n <= menorNumero){
                    menorNumero = n;
                }
            }
            System.out.println("O menor número é: " + menorNumero);
        } else{
            throw new RuntimeException("A lista está vazia");
        }
    }

    public void exibirNumeros(){
                if (!numeroList.isEmpty()) {
                    System.out.println(this.numeroList);                    
                } else {
                    throw new RuntimeException("A lista está vazia");
                }
    }

    public static void main(String[] args) {
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(0);
        somaNumeros.adicionarNumero(-2);
        somaNumeros.adicionarNumero(10);
        
        System.out.println("Números Adicionados:");
        somaNumeros.exibirNumeros();
        somaNumeros.encontrarMaiorNumero();
        somaNumeros.encontrarMenorNumero();
    }
}
