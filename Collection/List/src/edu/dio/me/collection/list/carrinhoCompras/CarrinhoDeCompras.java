package edu.dio.me.collection.list.carrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoList;

    public CarrinhoDeCompras(List<Item> carrinhoList) {
        this.carrinhoList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for(Item i : carrinhoList){
            if(i.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(i);
            }
        }
        carrinhoList.removeAll(itensParaRemover);
        System.out.println("Removendo: " + itensParaRemover);
    }

    public void calcularValorTotal(){
        //List<Item> calcularValor = new ArrayList<>();
        double valorTotal = 0;

        for(Item t : carrinhoList){
            valorTotal += t.getPreco() * t.getQuantidade();
            }
            System.out.println("Valor total: " + valorTotal);
        }

    public void exibirItens(){
        for ( Item t : carrinhoList) {
            System.out.println(t.toString());
        }
        
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras(null);

        carrinhoDeCompras.adicionarItem("Impressora 3d", 500, 1);
        carrinhoDeCompras.adicionarItem("Notebook Acer", 100, 1);
        carrinhoDeCompras.adicionarItem("Computador Dell", 350, 1);

        carrinhoDeCompras.exibirItens();

        carrinhoDeCompras.calcularValorTotal();

        carrinhoDeCompras.removerItem("Computador Dell");

        carrinhoDeCompras.calcularValorTotal();
    }
        
    }