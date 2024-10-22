/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.ExemploArrayList;

import java.util.ArrayList;

/**
 *
 * @author Cauê
 */
public class ExemploArrayList {

    public static void main(String[] args) {
        ArrayList<Double> iptu = new ArrayList<>();

        iptu.add(145.80); //indice 0
        iptu.add(250.10); //indice 1
        iptu.add(7890.10); //indice 2 

        System.out.println(iptu.get(2)); //Posição Fixa

        for (Double variavelIptu : iptu) { //Lista completa
            System.out.println(variavelIptu);
        }

        System.out.println("Removido!");
        iptu.remove(2);
        for (Double variavelIptu : iptu) { //Lista completa com o indice 2 removido
            System.out.println(variavelIptu);
        }
    }
}
