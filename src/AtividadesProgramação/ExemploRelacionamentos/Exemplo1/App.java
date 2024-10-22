/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.ExemploRelacionamentos.Exemplo1;

/**
 *
 * @author Cauê
 */
public class App {
    public static void main(String[] args) {
        Funcionario gerente = new Funcionario();
        gerente.setNome("Pablo");
        gerente.setRamal(2027);
        
        Departamento ti = new Departamento(gerente);
        ti.setNome("T.I");
        
        System.out.println("Departamento: " + ti.getNome() + "\nGerente: " + ti.getGerente().getNome() + "\nRamal: " + ti.getGerente().getRamal());
    }
}
