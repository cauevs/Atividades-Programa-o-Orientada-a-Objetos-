package AtividadesProgramação.Lista02.Questao02;
public class ContaBancaria {
String numero;
String titular;
private double saldo;

public void sacar(double valor){
    if (valor <= 0 || valor > saldo){
        System.out.println("Valor Inválido");
    }
    saldo = saldo - valor;
}

public void depositar(double valor){
    if (valor < 0){
        System.out.println("Valor Inválido!");
    }
    saldo = saldo + valor;
}

public double getSaldo() {
    return saldo;
}

public void transferencia(ContaBancaria contaDestino, double valor){
    this.sacar(valor);
    contaDestino.depositar(valor);
}
}