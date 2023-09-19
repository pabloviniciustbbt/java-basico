package edu.dio.me.collection.set.agendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        this.contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){

        Set<Contato> contatoPorNome = new HashSet<>();

        if (!contatoSet.isEmpty()) {
            for (Contato contato : contatoPorNome) {
            if (contato.getNome().startsWith(nome)) {
                contatoPorNome.add(contato);              
            }
        }
        } else {
            throw new RuntimeException("A lista está vazia");
        }
    return contatoPorNome;  
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){

        Contato contatoAtualizado = null;

        if (!contatoSet.isEmpty()) {
            for (Contato contato : contatoSet) {
                if (contato.getNome().equalsIgnoreCase(nome)) {
                    contato.setNumero(novoNumero);;
                }
            }
        } else {
            throw new RuntimeException("A lista está vazia");       
        }
        return contatoAtualizado;
    }
    
    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("João", 123456789);
        agendaContatos.adicionarContato("Maria", 987654321);
        agendaContatos.adicionarContato("Maria Fernandes", 55555555);
        agendaContatos.adicionarContato("Ana", 88889999);
        agendaContatos.adicionarContato("Fernando", 77778888);
        agendaContatos.adicionarContato("Carolina", 55555555);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Maria"));

        Contato contatoAtualizado = agendaContatos.atualizarNumeroContato("Carolina", 44443333);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agendaContatos.exibirContatos();
    }
    
}
