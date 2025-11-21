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
        System.out.println(nome + "foi matriculado com sucesso");
    }
    
    private void expulsar_aluno(){
        System.out.println(nome + "foi expulso!");
    }
    
    public void orientar_aluno(){
        System.out.println(nome + "esta suspenso");
        System.out.println(nome + "foi expulso");
    }
    
    private void contratar_professor(){
        System.out.println("Professor Roberto foi contratado!!");
    }
    
    private void demitir_professor(){
        System.out.println("Professor Roberto foi demitido!!");
    }
    
    private void suspender_professor(){
        System.out.println("Professor Roberto foi suspenso");
    }
    
    private void contratar_colaborador(){
        System.out.println(colaboradores + "foi contratado!");
    }
    
    private void demitir_colaborador(){
        System.out.println(colaboradores + "foi dmeitido!");
    }
    
    private void suspender_colaborador(){
        System.out.println(colaboradores + "foi suspenso");
    }
}
