package AtividadesProgramação.Lista01.Questao03;
import java.util.Scanner;
public class App {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Pessoa pessoa1;
    pessoa1 = new Pessoa();

    Pessoa pessoa2;
    pessoa2 = new Pessoa();

    Pessoa pessoa3;
    pessoa3 = new Pessoa();

    System.out.print("Insira a altura da primeira pessoa: ");
    pessoa1.altura = teclado.nextDouble();
    System.out.print("Insira o peso da primeira pessoa: ");
    pessoa1.peso = teclado.nextDouble();

    System.out.printf("O IMC desta pessoa é de: %.2f", pessoa1.CalcularImc()); 

    System.out.print("\nInsira a altura da segunda pessoa: ");
    pessoa2.altura = teclado.nextDouble();
    System.out.print("Insira o peso da segunda pessoa: ");
    pessoa2.peso = teclado.nextDouble();

    System.out.printf("O IMC desta pessoa é de: %.2f", pessoa2.CalcularImc());

    System.out.print("\nInsira a altura da terceira pessoa: ");
    pessoa3.altura = teclado.nextDouble();
    System.out.print("Insira o peso da terceira pessoa: ");
    pessoa3.peso = teclado.nextDouble();

    System.out.printf("O IMC desta pessoa é de: %.2f", pessoa3.CalcularImc());
    teclado.close();
}
}
