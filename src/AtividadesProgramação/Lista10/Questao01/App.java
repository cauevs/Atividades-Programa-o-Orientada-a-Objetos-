/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista10.Questao01;

import java.util.Scanner;

/**
 *
 * @author Cauê
 */
public class App {

    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe a figura geométrica: ");
        String figura = teclado.next();
        Figura resultado = null;

        switch (figura) {

            case "Quadrado":
                System.out.print("Insira a medida: ");
                int medida = teclado.nextInt();
                resultado = new Quadrado(medida);
                break;

            case "Retangulo":
                System.out.print("Insira a altura: ");
                int altura = teclado.nextInt();
                System.out.print("Insira a largura: ");
                int largura = teclado.nextInt();
                resultado = new Retangulo(altura, largura);
                break;

            case "Triangulo":
                System.out.print("Insira o primeiro lado: ");
                int lado1 = teclado.nextInt();
                System.out.print("Insira o segundo lado: ");
                int lado2 = teclado.nextInt();
                System.out.print("Insira o terceiro lado: ");
                int lado3 = teclado.nextInt();
                resultado = new Triangulo(lado1, lado2, lado3);
                break;

            case "Circulo":
                System.out.print("Insira o raio: ");
                int raio = teclado.nextInt();
                resultado = new Circulo(raio);
                break;
        }
        if (resultado != null) {
            System.out.println("O resultado da área da figura " + figura + " é: " + resultado.calcularArea());
        }
    }
}
