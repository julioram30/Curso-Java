package com.eiv.controler;

import java.math.BigDecimal;
import java.util.List;

import org.apache.commons.math3.analysis.function.Pow;

import com.eiv.entidad.Prestamo;

public class solicitarPrestamoFR implements SolicitarPrestamo {

    private BigDecimal capital = null;
    private Float tasa = null;
    private Long cuotas = null;
    private Float razon = null;
    private Double vp = null;

    List<Prestamo> desarrollo;

    public solicitarPrestamoFR() {
        super();
    }

    public solicitarPrestamoFR(BigDecimal capital, Float tasa, Long cuotas) {
        super();
        this.capital = capital;
        this.tasa = tasa;
        this.cuotas = cuotas;

    }

    @Override
    public List<Prestamo> solicitar(BigDecimal capital, Float tasa, Long cuotas) {
        System.out.println("metodo de calculo");

        Pow potencia = new Pow();
        razon = tasa / 365 * 30/100;
        vp = capital.doubleValue() * razon.doubleValue() * potencia.value(1+razon.doubleValue(), cuotas.doubleValue()) / potencia.value(1+razon.doubleValue(),(cuotas.doubleValue()-1));

        
        return null;
    }

}
