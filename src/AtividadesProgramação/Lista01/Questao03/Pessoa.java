package AtividadesProgramação.Lista01.Questao03;
import java.util.Scanner;

public class Pessoa {
Scanner teclado = new Scanner(System.in);
    
    double altura;
    double peso;

    public double CalcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }
}
