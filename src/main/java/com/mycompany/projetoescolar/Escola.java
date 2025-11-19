package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

public class Escola {
    String nome;
    String diretor;
    List<Professor> professores = new ArrayList();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    List<Colaborador> colaboradores = new ArrayList();
    
    public Escola(String nome, String diretor){
        this.nome = nome;
        this.diretor = diretor;
        this.alunos = null;
        this.professores = null;
        this.turmas = null;
        this.colaboradores = null;
    }
    
    private void matricular_aluno(){
        System.out.println("João foi matriculado com sucesso");
    }
    
    private void expulsar_aluno(){
        System.out.println("João foi expulso!");
    }
    
    public void orientar_aluno(){
        System.out.println("Aluno 1 esta suspenso");
        System.out.println("Aluno 2 foi expulso");
    }
    
    private void contratar_professor(){
        System.out.println("Professor Roberto foi contratado!!");
    }
    
    private void demitir_professor(){
        System.out.println("Professor Roberto foi contratado!!");
    }
    
    private void suspender_professor(){
    
    }
    
    private void contratar_colaborador(){
    
    }
    
    private void demitir_colaborador(){
    
    }
    
    private void suspender_colaborador(){
    
    }
}
