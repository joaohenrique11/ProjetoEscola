/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.List;

/**
 *
 * @author JOÃOHENRIQUEDASILVAC
 */
public class Turma { 

    private String identificador;
    private List<Aluno> alunos;
    String horario;
    String local;
    private List<Professor> professores;

    
    public Turma(){
    
    }
    
    public Turma(String identificador, String horario, String local, String alunos, String professores) {
        this.identificador = identificador;
        this.horario = horario;
        this.local = local;
    }

 
    public void definirLimiteDeAlunos() {
        System.out.println("O limite da turma eh de 25 alunos");
    }

    public void inserirProfessoresNaTurma(Professor professor) {
        professores.add(professor);
    }

    public void inserirAlunosNaTurma(Aluno aluno) {
        alunos.add(aluno);
    }

    public void removerProfessoresNaTurma(Professor professor) {
        professores.remove(professor);
    }

    public void removerAlunosNaTurma(Aluno aluno) {
        alunos.remove(aluno);
    }
}
