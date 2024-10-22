package AtividadesProgramação.Lista01.Questao03;
import java.util.Scanner;
public class App2 {
    public static void main(String[] args) {    //Utilizando o "for" podemos poupar muitas linhas e facilitar o trabalho.
        Scanner teclado = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            Pessoa pessoa = new Pessoa();
            System.out.printf("Insira a altura da pessoa %d: ", i);
            pessoa.altura = teclado.nextDouble();
            System.out.printf("Insira o peso da pessoa %d: ", i);
            pessoa.peso = teclado.nextDouble();
            System.out.printf("O IMC desta pessoa é de: %.2f%n", pessoa.CalcularImc());
        }
        teclado.close();
    }
}
