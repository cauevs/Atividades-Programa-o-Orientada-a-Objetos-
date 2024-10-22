/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista06.Questao01;

/**
 *
 * @author Cauê
 */
public class Funcionario {

    private String nome;
    private double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double novoSalario) {
        this.salario = novoSalario;
        if (salario <= 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
    }
    
    public double getSalario(double salario) {
        return salario;
    }

    public double calcularIrpf() {

        double imposto = 0;
        double diferenca = 0;

        if (salario > 1903.98) {
            // Faixa 2
            if (salario <= 2826.65) {
                diferenca = salario - 1903.98;
                imposto = diferenca * (7.5 / 100);
            } else if (salario <= 3751.05) { // Faixa 3
                // Calcular da faixa 2
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);

                // Calcular da faixa 3
                diferenca = salario - 2826.65;
                imposto += diferenca * (15.0 / 100);
            } else if (salario <= 4664.68) {
                // Calcular da faixa 2
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);

                // Calcular da faixa 3
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15.0 / 100);

                // Calcular da faixa 4
                diferenca = salario - 3751.05;
                imposto += diferenca * (22.5 / 100);
            } else {
                // Calcular da faixa 2
                diferenca = 2826.65 - 1903.98;
                imposto = diferenca * (7.5 / 100);

                // Calcular da faixa 3
                diferenca = 3751.05 - 2826.65;
                imposto += diferenca * (15.0 / 100);

                // Calcular da faixa 4
                diferenca = 4664.68 - 3751.05;
                imposto += diferenca * (22.5 / 100);

                diferenca = salario - 4664.68;
                imposto += diferenca * (27.5 / 100);
            }
        }
        return imposto;
    }

    public IdentificarFaixaIrpf IdentificaFaixa() {
        if (salario <= 1903.98) {
            return IdentificarFaixaIrpf.PRIMEIRA;
        }

        if (salario >= 1903.99 && salario <= 2826.65) {
            return IdentificarFaixaIrpf.SEGUNDA;
        }
        if (salario >= 2826.66 && salario <= 3751.05) {
            return IdentificarFaixaIrpf.TERCEIRA;
        }
        if (salario >= 3751.06 && salario <= 4664.68) {
            return IdentificarFaixaIrpf.QUARTA;
        }
        if (salario >= 4664.69) {
            return IdentificarFaixaIrpf.QUINTA;
        }
        return IdentificarFaixaIrpf.PRIMEIRA;
    }
}
