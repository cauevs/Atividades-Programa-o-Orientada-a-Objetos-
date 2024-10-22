/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista04.Questao02;

import javax.swing.JOptionPane;

/**
 *
 * @author Cauê
 */
public class AppQuestao2Ui {
    public static void main(String[] args) {
       Retangulo retangulo = new Retangulo();
        retangulo.setAltura(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da altura:")));
        retangulo.setComprimento(Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do comprimento:")));
        
        JOptionPane.showMessageDialog(null, "A área é de: " + retangulo.calcularArea());
        JOptionPane.showMessageDialog(null, "O perimetro é de: " + retangulo.calcularPerimetro());
       }
}
