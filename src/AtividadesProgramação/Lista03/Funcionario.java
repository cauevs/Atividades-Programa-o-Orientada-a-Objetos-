package AtividadesProgramação.Lista03;
public class Funcionario {
    private String nome;
    private double salario;

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double novoSalario) {
        salario = novoSalario;
    }

    public double getSalario(double salario) {
        return salario;
    }

    double calcularIrpf() {
        double imposto = 0;
        double diferenca = 0;

        if (salario < 0) {
            throw new IllegalArgumentException("Valor inválido");
        }
        if (salario > 1903.99 || salario <= 2826.65) {
            diferenca = salario - 1903.98;
            imposto  = diferenca * (7.5/100);
        }
        if (salario > 2826.66 || salario <= 3751.05) {
            diferenca = salario - 2826.65 - 1903.98;
            imposto  = diferenca * (7.5/100);

            diferenca = salario - 2826.65;
            imposto += diferenca * (15.0/100);
        }
        if (salario > 3751.06 || salario <= 4664.68) {
            diferenca = salario - 3751.05 - 2826.65;
            imposto  = diferenca * (22.5/100);

            diferenca = salario - 3751.05;
            imposto += diferenca * (22.5/100);
        }
        else  {

            diferenca = salario - 1903.98;
            imposto  = diferenca * (7.5/100);

            diferenca = salario - 2826.65 - 1903.98;
            imposto  = diferenca * (7.5/100);

            diferenca = salario - 2826.65;
            imposto += diferenca * (15.0/100);

            diferenca = salario - 3751.05 - 2826.65;
            imposto  = diferenca * (22.5/100);

            diferenca = salario - 3751.05;
            imposto += diferenca * (22.5/100);

            diferenca = salario - 4664.68 - 3751.05;
            imposto  = diferenca * (27.5/100);

            diferenca = salario - 4664.68;
            imposto += diferenca * (27.5/100);
        }
        return imposto;
    }

}