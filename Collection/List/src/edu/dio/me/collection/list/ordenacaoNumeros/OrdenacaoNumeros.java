package edu.dio.me.collection.list.ordenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {

    private List<Integer> numeroList;

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.numeroList.add(numero);
    }

    public void exibirNumeros(){

        if (!numeroList.isEmpty()) {
            System.out.println(numeroList);
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    }
    
    public List<Integer> ordenarAscendente(){

        List<Integer> ordemAscendente = new ArrayList<>(this.numeroList);

        if (!numeroList.isEmpty()) {
            Collections.sort(ordemAscendente);
        return ordemAscendente;
        } else {
            throw new RuntimeException("A Lista está vazia");
        }
    }
    
    public List<Integer> ordenarDescendente(){

        List<Integer> ordemDescendente = new ArrayList<>(this.numeroList);

        if (!numeroList.isEmpty()) {
            Collections.sort(ordemDescendente, Collections.reverseOrder());
        return ordemDescendente;

        } else {
            throw new RuntimeException("A Lista está vazia");
        }
        
    }

    public static void main(String[] args) {
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(99);

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarAscendente());

        ordenacaoNumeros.exibirNumeros();

        System.out.println(ordenacaoNumeros.ordenarDescendente());

        ordenacaoNumeros.exibirNumeros();
    }
}
