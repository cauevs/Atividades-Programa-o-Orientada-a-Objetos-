package AtividadesProgramação.Lista02.Questao01;
import java.util.Scanner;

public class Pessoa {
Scanner teclado = new Scanner(System.in);

    private String nome; //Atributo privado

    public void setNome(String novoNome){ //Usamos o comando set para atribuir um valor a variavel.
        nome = novoNome;
    }

    public String getNome(){ // Retornar o valor inserido.
        return nome;
    }

    private double altura;

    public void setAltura(Double novaAltura){
        altura = novaAltura;
    }

    public double getAltura(){
        return altura;
    }

    private double peso;

    public void setPeso(Double novaPeso){
        peso = novaPeso;
    }

    public double getPeso(){
        return peso;
    }

    public double CalcularImc() {
        double imc = peso / (altura * altura);
        return imc;
    }


}
