package AtividadesProgramação.Lista01.Questao02;
import java.util.Scanner;

public class App {
    public static void main(String [] args){
    Scanner teclado = new Scanner(System.in);
    
        Pessoa pessoa1;
        pessoa1 = new Pessoa();
        
        System.out.print("Insira a sua altura: ");
        pessoa1.altura = teclado.nextDouble();
        System.out.print("Insira o seu peso: ");
        pessoa1.peso = teclado.nextDouble();
        
        System.out.printf("O IMC desta pessoa é de: %.2f", pessoa1.CalcularImc());
        teclado.close();
      }
  }

