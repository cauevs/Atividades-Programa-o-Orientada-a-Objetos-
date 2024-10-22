package AtividadesProgramação.Lista02.Questao01;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        Pessoa[] vetorPessoas = new Pessoa[3];

        for (int i = 1; i <= vetorPessoas.length; i++) {
            Pessoa pessoa;
            pessoa = new Pessoa();
            System.out.printf("Insira o nome da pessoa %d: ", i);
            pessoa.setNome(teclado.next());
            System.out.printf("Insira a altura da pessoa %d: ", i);
            pessoa.setAltura(teclado.nextDouble());
            System.out.printf("Insira o peso da pessoa %d: ", i);
            pessoa.setPeso(teclado.nextDouble());

            // Fazemos isso para que possa ser armazenado no vetor diminuindo o valor
            vetorPessoas[i - 1] = pessoa;
        }

        for (int i = vetorPessoas.length - 1; i >= 0; i--) {
            Pessoa pessoa;
            pessoa = vetorPessoas[i];
            System.out.println("\n\nNome: " + pessoa.getNome());
            System.out.println("Altura: " + pessoa.getAltura());
            System.out.println("Peso: " + pessoa.getPeso() + "\n");
            System.out.printf("O IMC desta pessoa é de: %.2f", pessoa.CalcularImc());

        }
        teclado.close();
}
}
