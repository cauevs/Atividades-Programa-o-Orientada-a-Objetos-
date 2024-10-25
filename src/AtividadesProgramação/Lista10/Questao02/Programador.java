/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista10.Questao02;

import java.util.ArrayList;

/**
 *
 * @author Cauê
 */
public class Programador extends Funcionario{
    ArrayList<String> linguagens = new ArrayList<>();

    public Programador(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public void incluirLinguagem(String linguagem) {
        linguagens.add(linguagem);
    }

    public ArrayList<String> getLinguagem() {
        return linguagens;
    }

    public void removerLinguagem(String linguagem) {
        linguagens.remove(linguagem);
    }

    public double calcularSalario() {

    }
}
