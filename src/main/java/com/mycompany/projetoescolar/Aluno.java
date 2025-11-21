package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    String nome;
    String cpf;
    int idade;
    String genero;
    String resposavel;
    double[] notas = new double[4];
    String matricula;
    List<Disciplina> disciplinas = new ArrayList();
    
    public Aluno(String nome, String cpf, int idade, String genero, String responsavel){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.resposavel = responsavel;
        this.matricula = matricula;
    }
    
    public void ver_suas_notas(Aluno aluno1){
        System.out.println("Notas do aluno" + this.nome + ":");
            for (double nota : notas){
                System.out.println(notas + "");
            }
    }
    
    public void consultar_frequencias(){
    
    }
    
    public void consultar_historico(){
    
    }
    
    public void consultar_comprovante_matricula(){
    
    }
    
    public void consultar_grade_de_horario(){
    
    }

    public void matricular_aluno() {
        
    }
}
