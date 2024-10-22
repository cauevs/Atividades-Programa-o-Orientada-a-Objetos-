package AtividadesProgramação.Lista03;
import java.util.Scanner;

public class App {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

        Funcionario[] vetorFuncionarios = new Funcionario[3];

        for (int i = 0; i <= vetorFuncionarios.length; i++) {
            Funcionario funcionarios;
            funcionarios = new Funcionario();
            System.out.printf("Insira o nome do funcionário %d: ", i );
            funcionarios.setNome(teclado.next());
            System.out.printf("Insira o salário do funcionário %d: ", i );
            funcionarios.setSalario(teclado.nextDouble());

            vetorFuncionarios[i] = funcionarios;
        }

        for (int i = 0; i < vetorFuncionarios.length; i++) {
            Funcionario funcionarios;
            funcionarios = vetorFuncionarios[i];
            System.out.println("\n\nNome: " + funcionarios.getNome());
            System.out.println("Salário: " + funcionarios.getSalario(i));
            System.out.println("IRPF: " + funcionarios.calcularIrpf());

        }
        teclado.close();
}
}
