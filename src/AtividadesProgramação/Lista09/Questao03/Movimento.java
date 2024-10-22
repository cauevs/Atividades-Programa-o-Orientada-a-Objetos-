/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AtividadesProgramação.Lista09.Questao03;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author Cauê
 */
public class Movimento {

    public Movimento(double valor, TipoMovimento tipoMovimento) {

    }

    private double valor;
    private TipoMovimento tipoMovimento;
    private LocalDate data;
    private LocalTime hora;

    public LocalDate getData() {
        return data;
    }

    public LocalTime getHora() {
        return hora;
    }

    public Double getValor() {
        return valor;
    }

    public TipoMovimento getTipoMovimento() {
        return tipoMovimento;
    }

}
