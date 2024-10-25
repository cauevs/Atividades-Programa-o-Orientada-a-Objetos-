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
public class Vendedor extends Funcionario {

    private double percentualComissao;
    ArrayList<Venda> vendas = new ArrayList<>();

    public Vendedor(String nome, double salarioBase, double percentualComissao) {
        super(nome, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    public ArrayList<Venda> getVendas() {
        return vendas;
    }

    public void incluirVendas(Venda venda) {
        vendas.add(venda);
    }

    public double calcularSalario() {

    }

}
