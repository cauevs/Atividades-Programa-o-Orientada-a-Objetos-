/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.ExemploRelacionamentos.Exemplo1;

/**
 *
 * @author Cauê
 */
public class Departamento {

    private String nome;
    private Funcionario gerente;

    public Departamento() {
    }
 
    public Departamento(Funcionario gerente) {
        setGerente(gerente);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Funcionario getGerente() {
        return gerente;
    }

    public void setGerente(Funcionario gerente) {
                if (gerente == null){
            throw new IllegalArgumentException("Ao menos um gerente é obrigatório");
        }
        this.gerente = gerente;
    }

}
