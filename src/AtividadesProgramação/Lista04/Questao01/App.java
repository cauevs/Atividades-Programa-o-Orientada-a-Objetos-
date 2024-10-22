/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista04.Questao01;
import java.util.Scanner;
/**
 *
 * @author Cauê
 */
public class App {
    public static void main(String [] args){
        Retangulo retangulo = new Retangulo();
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a o valor da altura: ");
        retangulo.setAltura(teclado.nextInt());
        System.out.print("Insira o valor do comprimento: ");
        retangulo.setComprimento(teclado.nextInt());
        System.out.print("\nO valor do perimentro é de: " + retangulo.calcularPerimetro());
        System.out.println("\nO valor da área é de: " + retangulo.calcularArea());
    }
}
