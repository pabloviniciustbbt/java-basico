package edu.dio.me.collection.set.gerenciadorAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media){
        alunoSet.add(new Aluno(nome, matricula, media));
    }

    public void removerAluno(long matricula){
        
        Aluno alunoParaRemover = null;

        if (!alunoSet.isEmpty()) {
            for (Aluno aluno : alunoSet) {
                if (aluno.getMatricula() == matricula) {
                    alunoParaRemover = aluno;
                }
            }
            alunoSet.remove(alunoParaRemover);
        } else {
            throw new RuntimeException("Não existem alunos na lista!");
        }

        if (alunoParaRemover == null) {
            System.out.println("Matricula não encontrada!");
        }

    }

    public Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());

        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos(){
        for (Aluno aluno : alunoSet) {
            System.out.println(aluno);
        }
        
    }

    public static void main(String[] args) {
        
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("João", 123456L, 7.5);
        gerenciadorAlunos.adicionarAluno("Maria", 123457L, 9.0);
        gerenciadorAlunos.adicionarAluno("Carlos", 123458L, 5.0);
        gerenciadorAlunos.adicionarAluno("Ana", 123459L, 6.8);

        System.out.println("Alunos no gerenciador:");
        gerenciadorAlunos.exibirAlunos();

        System.out.println("\nAlunos por nome:" + gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println("\nAlunos por nota :" + gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(123457L);
        System.out.println("\nLista após remoção e aluno:");
        gerenciadorAlunos.exibirAlunos();

        
    }
}
