package edu.dio.me.collection.map.agendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map <String, Integer> agendaContatesMap;
    
    public AgendaContatos(){
        this.agendaContatesMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatesMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatesMap.isEmpty()) {
            agendaContatesMap.remove(nome);
        } else {
            System.out.println("A agenda está vazia");
        }
    }

    public void exibirContatos(){
        if (!agendaContatesMap.isEmpty()) {
            System.out.println(agendaContatesMap);
        } else {
            System.out.println("A agenda está vazia");
        }
    }

    public Integer pesquisarPorNome(String nome){

        Integer numeroPorNome = null;

        if (!agendaContatesMap.isEmpty()) {
            numeroPorNome = agendaContatesMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda");
            }   
        } else {
            System.out.println("A agenda está vazia");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("João", 5665);
        agendaContatos.adicionarContato("Carlos", 1111111);
        agendaContatos.adicionarContato("Ana", 654987);
        agendaContatos.adicionarContato("Maria", 1111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Maria");
        agendaContatos.exibirContatos();

        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Número de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExistente = "Paula";
        Integer numeroPesquisaNaoExistente = agendaContatos.pesquisarPorNome(nomePesquisaNaoExistente);
        System.out.println("Número de telefone de " + nomePesquisaNaoExistente + ": " + numeroPesquisaNaoExistente);
    }
}
