/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista04.Questao01;

/**
 *
 * @author Cauê
 */
public class Retangulo {
private int altura;
private int comprimento;
/**
 * seta o valor das varíaves altura e comprimento para 0.
 */
    public Retangulo() {
        this.altura = 0;
        this.comprimento = 0;
    }
/**
 *seta o valor das varíaves altura e comprimento para o valor que for setada no teclado pelo usuário.
 */ 
    public Retangulo(int altura, int comprimento) {
        this.altura = altura;
        this.comprimento = comprimento;
    }
    /**
 *seta o valor do comprimento para o valor que for setada no teclado pelo usuário.
 */
public void setComprimento(int novoComprimento){
    comprimento = novoComprimento;
}
    /**
 *da return no valor do comprimento informado pelo usuário.
 */
public int getComprimento(){
    return comprimento;
} 
    /**
 *seta o valor da altura para o valor  que for setado no teclado pelo usuário.
 */
public void setAltura(int novaAltura){
    altura = novaAltura;
}
    /**
 *da return no valor da altura informado pelo usuário.
 */
public int getAltura(){
    return altura;
}
    /**
 *soma os valores da altura e comprimento e multiplica por 2 para saber o tamanho do perimetro.
 */
public int calcularPerimetro(){
    int perimetro = (2 * (altura + comprimento));
    return perimetro;
}
    /**
 *multiplica os valores da altura e comprimento para gerar a área do retangulo.
 */
public int calcularArea(){
    int area = (altura * comprimento);
    return area;
}
}