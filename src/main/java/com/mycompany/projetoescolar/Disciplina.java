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
class Disciplina {
    public String nome;
    public String horario;
    public List<Professor> professores;
    public List<Turma> turmas;
    public List<Aluno> alunos;
    
    public Disciplina(){
    
    }
    
    public Disciplina(String nome, String horario, String professores, String turmas, String alunos){
        this.nome = nome;
        this.horario = horario;
    }
}
