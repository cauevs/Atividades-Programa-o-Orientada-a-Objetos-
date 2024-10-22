/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista05.Questao01;

/**
 *
 * @author Cauê
 */
public class Ponto {
    private int x;
    private int y;

    public Ponto() {
    this.x = 0;
    this.y = 0;
    }
    
    public Ponto(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public void setX(int novoX){
        x = novoX;
    }
    
   public int getX(){
       return x;
   }
       public void setY(int novoY){
        y = novoY;
    }
    
   public int getY(){
       return y;
   }
   /**
 faz condições "if" para que possam identificar em qual quadrante o valor está localizado com base nos valores de x e y.
    */
   public Quadrante identificarQuadrante(){
       if (x == 0 && y == 0){
           return Quadrante.NENHUM;
       }
       if (x > 0 && y > 0){
           return Quadrante.PRIMEIRO;
       }
       if (x < 0 && y > 0){
           return Quadrante.SEGUNDO;
       }
       if (x < 0 && y < 0){
           return Quadrante.TERCEIRO;
       }
       if (x > 0 && y < 0){
           return Quadrante.QUARTO;
       }
        return Quadrante.NENHUM;
   }
   /**
  usa uma condição if para determinar se o valor de x corresponde a 0.
    */
   public boolean estaIncidindoSobreX(){
       if (x == 0){
           return true;
       }
       return false;
   }
     /**
  usa uma condição if para determinar se o valor de y corresponde a 0.
    */
      public boolean estaIncidindoSobreY(){
       if (y == 0){
           return true;
       }
       return false;
   }
        /**
  pega os valores de x e y e usa os métodos Math para que possa chegar ao resultado da distância.
    */
   public double calcularDistancia(Ponto ponto2){
       double distancia = Math.sqrt(Math.pow((this.x - ponto2.getX()), 2) + Math.pow((this.y - ponto2.getY()), 2));
       return distancia;
   }
}