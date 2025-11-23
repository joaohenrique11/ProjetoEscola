package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    String nome = "Joao";
    String cpf = "123-543-234-65";
    int idade = 19;
    String genero = "Homem";
    String responsavel = "Joao Roberto";
    double[] notas = new double[4];
    String matricula = "436346-5";
    List<Disciplina> disciplinas = new ArrayList();
    
    public Aluno(){

    }
    
    public Aluno(String nome, String cpf, int idade, String genero, String responsavel){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.responsavel = responsavel;
        this.matricula = matricula;
    }
    
    public void ver_suas_notas(Aluno aluno1){
        System.out.println("Notas do aluno" + this.nome + ":");
            for (double nota : notas){
                System.out.println(notas + "");
            }
    }
    
    public void consultar_frequencias(){
        System.out.println("Frequencias de " + nome + ":");
        System.out.println("Dia 26: Presente");
        System.out.println("Dia 29: Presente");
        System.out.println("Dia 31: Falta");
        System.out.println("Dia 02: Presente");
        System.out.println("Dia 05: Falta");
    }
    
    public void consultar_historico(){
    
    }
    
    public void consultar_comprovante_matricula(){
        System.out.println("Comprovante de matricula: " + matricula);
    }
    
    public void consultar_grade_de_horario(){
        System.out.println("Hora: 7:30-8:20\n" + "Segunda: Portugues");
    }

    public void matricular_aluno() {
        System.out.println("Disciplinas: " + nome);
    }
}
