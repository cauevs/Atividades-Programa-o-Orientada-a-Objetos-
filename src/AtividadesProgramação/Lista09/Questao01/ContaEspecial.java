/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista09.Questao01;

/**
 *
 * @author Cauê
 */
public class ContaEspecial extends ContaBancaria {

    private double limiteCredito;

    public double getLimiteCredito() {
        return limiteCredito;
    }

    public void setLimiteCredito(double limiteCredito) {
        this.limiteCredito = limiteCredito;
    }
    
    @Override
    public void sacar(double valor) {
        if(valor <= 0 || valor > (getSaldo() + limiteCredito)){
            throw new IllegalArgumentException("Valor Inválido");
        }
        setSaldo(getSaldo() - valor);
    }

}
