package AtividadesProgramação.Lista01.Questao04;
import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Pessoa pessoa1;
        pessoa1 = new Pessoa();

        System.out.print("Insira o nome da primeira pessoa: ");
        pessoa1.nome = teclado.next();
        System.out.print("Insira a altura da primeira pessoa: ");
        pessoa1.altura = teclado.nextDouble();
        System.out.print("Insira o peso da primeira pessoa: ");
        pessoa1.peso = teclado.nextDouble();

        Pessoa pessoa2;
        pessoa2 = new Pessoa();

        System.out.print("Insira o nome da segunda pessoa: ");
        pessoa2.nome = teclado.next();
        System.out.print("Insira a altura da segunda pessoa: ");
        pessoa2.altura = teclado.nextDouble();
        System.out.print("Insira o peso da segunda pessoa: ");
        pessoa2.peso = teclado.nextDouble();

        Pessoa pessoa3;
        pessoa3 = new Pessoa();

        System.out.print("Insira o nome da terceira pessoa: ");
        pessoa3.nome = teclado.next();
        System.out.print("Insira a altura da terceira pessoa: ");
        pessoa3.altura = teclado.nextDouble();
        System.out.print("Insira o peso da terceira pessoa: ");
        pessoa3.peso = teclado.nextDouble();

        System.out.println("\n\nNome: " + pessoa3.nome);
        System.out.println("Altura: " + pessoa3.altura);
        System.out.println("Peso: " + pessoa3.peso + "\n");
        System.out.printf("O IMC desta pessoa é de: %.2f", pessoa3.CalcularImc());

        System.out.println("\n\nNome: " + pessoa2.nome);
        System.out.println("Altura: " + pessoa2.altura);
        System.out.println("Peso: " + pessoa2.peso + "\n");
        System.out.printf("O IMC desta pessoa é de: %.2f", pessoa2.CalcularImc());

        System.out.println("\n\nNome: " + pessoa1.nome);
        System.out.println("Altura: " + pessoa1.altura);
        System.out.println("Peso: " + pessoa1.peso + "\n");
        System.out.printf("O IMC desta pessoa é de: %.2f", pessoa1.CalcularImc());
        teclado.close();
    }
}