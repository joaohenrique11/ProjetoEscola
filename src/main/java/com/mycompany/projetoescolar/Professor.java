/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetoescolar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author JOÃOHENRIQUEDASILVAC
 */
class Professor {
    Scanner notas = new Scanner(System.in);
    String nome;
    String cpf;
    int idade;
    String genero;
    double salario;
    List<Disciplina> disciplinas = new ArrayList();
    List<Turma> turmas = new ArrayList();
    List<Aluno> alunos = new ArrayList();
    private double[] nota = new double[4];
    
    private Professor(){}
    
    private Professor(String nome, String cpf, int idade, String genero, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.salario = salario;
        this.disciplinas = disciplinas;
    }
    
    void verificar_disciplinas(){
        System.out.println("Ronildo: Portugues, Matematica, Ingles");
    }
    
    void verificar_cronograma_das_disciplinas(){
        System.out.println("3° Serie\n1° Bimestre: Operações básicas com números naturais, frações e decimais. Múltiplos e divisores (MMC e MDC). Expressões numéricas.");
    }
    
    void verificar_presenca(String colocar_presenca, String tirar_presenca){
        System.out.println("Carlos: Presente");
        System.out.println("Luan: Presente");
        System.out.println("Tiago: Falta");
        System.out.println("Joao: Presente");
        System.out.println("Felipe: Falta");
    }
    
    void inserir_notas(){
        System.out.println("Professor Ronildo inseriu a nota: " + nota + " para Joao Henrique");
    }
    
    void colocar_presenca(){
        System.out.println("Joao: Presenca confirmada\nLuan: Presenca confirmada");
    }
    
    void definir_situacao_academica_do_aluno(){
        System.out.println("Carlos: Aprovado\nLuan: Aprovado\nTiago: Reprovado\nJoao: Aprovado\nFelipe: Aprovado");
    }
}
