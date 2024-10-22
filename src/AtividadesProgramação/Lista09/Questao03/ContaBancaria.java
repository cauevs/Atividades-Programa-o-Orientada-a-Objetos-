/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista09.Questao03;

import AtividadesProgramação.Lista08.Aluno;
import AtividadesProgramação.Lista09.Questao01.*;
import java.util.ArrayList;

/**
 *
 * @author Cauê
 */
public class ContaBancaria {

    private String numero;
    private double saldo;
    private ContaEspecial contaEspecial;
    private Cliente titular;
    private ArrayList<Movimento> movimentos = new ArrayList<>();

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo = saldo + valor;
        Movimento moveDeposito = new Movimento(valor, TipoMovimento.CREDITO);
        incluirMovimento(moveDeposito);
    }

    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            throw new IllegalArgumentException("Valor inválido");
        }
        saldo = saldo - valor;
        Movimento moveDeposito = new Movimento(valor, TipoMovimento.DEBITO);
        incluirMovimento(moveDeposito);
    }

    public void transferir(ContaBancaria contaDestino, double valor) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    public ArrayList<Movimento> getMovimentos() {
        return movimentos;
    }

    protected void incluirMovimento(Movimento m) {
        movimentos.add(m);
    }

}
