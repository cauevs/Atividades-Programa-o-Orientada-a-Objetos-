/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista07.Questao01;

/**
 *
 * @author Cauê
 */
public class Bairro {
    
    private String nome;
    private Double coeficienteIptu;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
           if (nome == null) {
            throw new IllegalArgumentException("É necessário definir um bairro");
        }
        this.nome = nome;
    }

    public Double getCoeficienteIptu() {
        return coeficienteIptu;
    }

    public void setCoeficienteIptu(Double coeficienteIptu) {
         if (coeficienteIptu < 0) {
            throw new IllegalArgumentException("O coeficiente não pode ser menor que 0");
        }
        this.coeficienteIptu = coeficienteIptu;
    }

    
}
