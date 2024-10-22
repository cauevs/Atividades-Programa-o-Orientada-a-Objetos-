package AtividadesProgramação.Lista01.Questao01;

public class Pessoa {
    double altura;
    double peso;

    public double CalcularImc() {
        double imc = peso / (Math.pow(altura, 2));
        return imc;
    }
}
