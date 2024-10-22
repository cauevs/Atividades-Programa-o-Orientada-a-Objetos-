package AtividadesProgramação.Lista02.Questao02;
import java.util.Scanner;
public class App {
public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    ContaBancaria conta1;
    conta1 = new ContaBancaria();
    System.out.print("Insira o usuário: ");
    conta1.titular = teclado.next();
    System.out.print("Insira o número: ");
    conta1.numero = teclado.next();
    
    conta1.depositar(1000);
    conta1.depositar(700);

    ContaBancaria conta2;
    conta2 = new ContaBancaria();
    System.out.print("Insira o usuário: ");
    conta2.titular = teclado.next();
    System.out.print("Insira o número: ");
    conta2.numero = teclado.next();
    conta2.depositar(5000);
    conta2.sacar(3000);
    conta2.transferencia(conta1, 1800);
    System.out.println("\nTitular da primeira conta: " + conta1.titular);
    System.out.println("Saldo da primeira conta: " + conta1.getSaldo());
    System.out.println("\nTitular da segunda conta: " + conta2.titular);
    System.out.println("Saldo da segunda conta: " + conta2.getSaldo());
    teclado.close();
}
}