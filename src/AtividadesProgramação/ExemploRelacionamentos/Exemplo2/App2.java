/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.ExemploRelacionamentos.Exemplo2;

/**
 *
 * @author Cauê
 */
public class App2 {

    public static void main(String[] args) {
        Funcionario2 gerente = new Funcionario2();
        gerente.setNome("Carlinhos");
        gerente.setRamal(10000);
       
        
        Departamento2 compras = new Departamento2(gerente);
        compras.setNome("COMPRAS");
         gerente.setDepartamentoGerenciado(compras);
        
        
        System.out.println("Departamento: " + compras.getNome() + "\nGerente: " + compras.getGerente().getNome() + "\nRamal: " + compras.getGerente().getRamal());
    }
}
