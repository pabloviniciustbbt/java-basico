package edu.dio.me.collection.map.estoqueProdutos;

import java.util.Map;

public class EstoqueProdutos {
    
    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos(Map<Long, Produto> estoqueProdutosMap) {
        this.estoqueProdutosMap = estoqueProdutosMap;
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        if (!estoqueProdutosMap.isEmpty()) {
            System.out.println(estoqueProdutosMap);
        } else {
            System.out.println("Não tem produtos no estoque!");
        }
    }

    public Double calcularValorEstoque(){
        
        double valorEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto produto : estoqueProdutosMap.values()) {
                valorEstoque += produto.getPreco() * produto.getQuantidade();
            }
        } 
        return valorEstoque;
    }
   
    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        Double maiorPreco = Double.MIN_VALUE;
        
        for (Produto produto : estoqueProdutosMap.values()) {
            if (produto.getPreco() > maiorPreco) {
                produtoMaisCaro = produto;
                maiorPreco = produto.getPreco();
            }
            
        }
        return produtoMaisCaro;
    }

    public Produto obteProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        Double menorPreco = Double.MAX_VALUE;

        for(Produto produto : estoqueProdutosMap.values()){
            if (produto.getPreco() < menorPreco) {
                produtoMaisBarato = produto;
                menorPreco = produto.getPreco();
            }
        }
        return produtoMaisBarato;
    }
  
    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeDeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;

        if (!estoqueProdutosMap.isEmpty()) {
            for(Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet() ){
                double valorProdutosEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutosEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutosEmEstoque;
                    produtoMaiorQuantidadeDeValorNoEstoque = entry.getValue();
                }
            }
        } 
        return produtoMaiorQuantidadeDeValorNoEstoque;
    }

}