/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Prova01.Questao01;

import AtividadesProgramação.Prova01.Questao01.Convenio;

/**
 *
 * @author Cauê Vieira da Silva
 */
/**
 * A classe DiariaBicicleta é a classe principal, onde todos os calculos e
 * comparações irão acontecer
 */
public class DiariaBicicleta {

    private int quantidadeHoras;
    private Convenio convenio;

    /**
     * Metódo que seta o novo valor a variavel quantidadehoras e também cria as
     * mensagens de erro
     */
    public void setHoras(int novaQuantidadeHoras) {
        if (novaQuantidadeHoras <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        quantidadeHoras = novaQuantidadeHoras;
    }

    /**
     * Metódo que recebe o valor da varíavel quantidadeHoras
     */
    public int getHoras() {
        return quantidadeHoras;
    }

    /**
     * Metódo que seta o novo valor ao convenio e também cria as mensagens de
     * erro
     */
    public void setConvenio(Convenio novoConvenio) {
        if (convenio.equals(null)) {
            throw new IllegalArgumentException("Convênio não pode ser vazio");
        }
        convenio = novoConvenio;
    }

    /**
     * Metódo que recebe o valor do enumerado convenio
     */
    public Convenio getConvenio() {
        return convenio;
    }

    /**
     * Classe sem paremetros da classe
     */
    public DiariaBicicleta() {
    }

    /**
     * Classe com os paremetros: quantidade de horas e o enumerado convenio
     */
    public DiariaBicicleta(int quantidadeHoras, Convenio convenio) {
        this.quantidadeHoras = quantidadeHoras;
        this.convenio = convenio;
    }

    /**
     * Metódo que seta o valor do aluguel e faz as comparações aumentando ou
     * diminuindo o preço comparando com o convenio no enumerado
     */
    public double valorTotalPagar() {
        double valorAluguel = 10.00;

        if (convenio.equals(Convenio.ESTUDANTE)) {
            double valorTotal = quantidadeHoras * valorAluguel;
            double desconto = valorTotal * (50.0 / 100);
            double resultadoTotal = valorTotal - desconto;
            if (convenio.equals(Convenio.CDL) ^ convenio.equals(Convenio.NSC)) {
                valorTotal = quantidadeHoras * valorAluguel;
                desconto = valorTotal * (5.0 / 100);
                resultadoTotal = valorTotal - desconto;

                if (quantidadeHoras >= 5) {
                    valorTotal = quantidadeHoras * valorAluguel;
                    desconto = valorTotal * (20.0 / 100);
                    resultadoTotal = valorTotal - desconto;
                }

                if (quantidadeHoras >= 10) {
                    valorTotal = quantidadeHoras * valorAluguel;
                    desconto = valorTotal * (30.0 / 100);
                    resultadoTotal = valorTotal - desconto;
                }

            }

            return resultadoTotal;
        }
        double valorTotal = quantidadeHoras * valorAluguel;
        return valorTotal;
    }
}
