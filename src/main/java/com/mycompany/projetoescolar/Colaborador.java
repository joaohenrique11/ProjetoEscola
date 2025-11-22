package com.mycompany.projetoescolar;

public class Colaborador {
    public String nome;
    private String cpf;
    public int idade;
    private String genero;
    public String cargo;
    private double salario;
    
    public Colaborador(String nome, String cpf, int idade, String genero, String cargo, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.genero = genero;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    void verificarEscalaDeTrabalho(){
        // Verifica o cargo
        // Define os horários de acordo com o cargo
    }
    void baterPonto(String horario_inicio, String horario_almoco, String fim_de_almoco, String fim_horario){
        System.out.println("Entrada: " + horario_inicio);
        System.out.println("Horario almoço: " + horario_almoco);
        System.out.println("Fim do almoço: " + fim_de_almoco);
        System.out.println("Fim horario: " + fim_horario);
    }
}