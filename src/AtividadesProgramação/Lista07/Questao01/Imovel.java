/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista07.Questao01;

/**
 *
 * @author Cauê
 */
public class Imovel {

    private String endereço;
    private int area;
    private Bairro bairroInfo;
    private Finalidade finalidadeInfo;

    public Imovel() {
    }

    public Imovel(Bairro bairroInfo) {
        setBairro(bairroInfo);
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        if (area < 0) {
            throw new IllegalArgumentException("A área não pode ser negativa");
        }
        this.area = area;
    }

    public Bairro getBairro() {
        return bairroInfo;
    }

    public void setBairro(Bairro bairroInfo) {
        this.bairroInfo = bairroInfo;

    }

    public void setFinalidade(Finalidade finalidadeInfo) {
        this.finalidadeInfo = finalidadeInfo;
    }

    public Finalidade getFinalidade() {
        return finalidadeInfo;
    }

    public Double calcularIptu() {
        
        if (getBairro() == null) {
            throw new IllegalArgumentException("é necessário definir um bairro");
        }
        
        if (getFinalidade() == null) {
            throw new IllegalArgumentException("É necessário definir uma finalidade");
        }

        if (bairroInfo.getCoeficienteIptu() < 0) {
            throw new IllegalArgumentException("O coeficiente não pode ser menor que 0");
        }
        double valorMetro;
        double total = 0;

        switch (getFinalidade()) {

            case RESIDENCIAL:
                valorMetro = 1;
                total = valorMetro * area;
                break;

            case COMERCIAL:
                if (area <= 100) {
                    total = 500;
                }
               else if (area <= 400) {
                    total = 1000;
                } else {
                    valorMetro = 2.55;
                    total = valorMetro * area;
                }
                break;

            case INDUSTRIAL:
                if (area <= 2000) {
                    total = 1000;
                } else {
                    valorMetro = 0.55;
                    total = valorMetro * area;
                }
                break;
        }
        return total * bairroInfo.getCoeficienteIptu();
    }

}
