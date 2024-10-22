/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista04.Questao03;

import javax.swing.JOptionPane;

/**
 *
 * @author Cauê
 */
public class AppQuestao3Ui {
     public static void main(String[] args) {
         int altura = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura:"));;
         int comprimento = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do comprimento:"));
       Retangulo retangulo = new Retangulo(altura, comprimento);
        JOptionPane.showMessageDialog(null, "A área é de: " + retangulo.calcularArea());
        JOptionPane.showMessageDialog(null, "O perimetro é de: " + retangulo.calcularPerimetro());
       }
}
