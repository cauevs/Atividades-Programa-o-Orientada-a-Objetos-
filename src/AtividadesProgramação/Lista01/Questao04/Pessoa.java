package AtividadesProgramação.Lista01.Questao04;
import java.util.Scanner;

public class Pessoa {
Scanner teclado = new Scanner(System.in);
    
    double altura;
    double peso;
    String nome;

    public double CalcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }
}
