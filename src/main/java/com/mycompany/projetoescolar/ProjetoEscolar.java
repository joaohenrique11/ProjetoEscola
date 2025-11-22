/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoescolar;

/**
 *
 * @author JOÃOHENRIQUEDASILVAC
 */
public class ProjetoEscolar {

    public static void main(String[] args) {
        Turma turma1 = new Turma();
        Turma turma2 = new Turma();
        Disciplina disciplina1 = new Disciplina(); 
        Aluno aluno1 = new Aluno();
        
        aluno1.consultar_frequencias();
        
        disciplina1.nome = "Matematica";
        disciplina1.horario = "9:50 as 10:30";
        
        turma1.horario = "\n7:30 as 8:10: Portugues\n 8:10 as 8:50: Geografia\n 8:50 as 9:30: Historia\n 9:30 as 9:50: Intervalo";
        turma2.local = "Bloco A, Andar 2";
        
        System.out.println("A disciplina eh: " + disciplina1.nome);
        System.out.println("Horario da aula: " + disciplina1.horario);
        
    }
}
