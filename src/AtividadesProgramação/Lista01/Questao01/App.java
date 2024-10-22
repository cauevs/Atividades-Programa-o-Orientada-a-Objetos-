package AtividadesProgramação.Lista01.Questao01;
public class App {
    public static void main(String [] args){

      Pessoa pessoa1;
      pessoa1 = new Pessoa();

      pessoa1.altura = 1.75;
      pessoa1.peso = 78;

      System.out.printf("O IMC desta pessoa é de: %.2f", pessoa1.CalcularImc());
    }
}
