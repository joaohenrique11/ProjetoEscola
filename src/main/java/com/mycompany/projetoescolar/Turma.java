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
    private String horario;
    private String local;
    private List<Professor> professores;

    public Turma(String identificador, String horario, String local) {
        this.identificador = identificador;
        this.horario = horario;
        this.local = local;
    }

 
    public void definirLimiteDeAlunos() {}

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
