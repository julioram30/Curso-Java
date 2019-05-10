package com.eiv.controler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.function.Pow;

import com.eiv.entidad.Cuota;

public class solicitarPrestamoFR implements SolicitarPrestamo {

    private BigDecimal capital = null;
    private BigDecimal tasa = null;
    private Long cuotas = null;
    private BigDecimal razon = null;
    private Double vp = null;

    List<Cuota> desarrollo = new ArrayList<>();

    public solicitarPrestamoFR() {
        super();
    }

    public solicitarPrestamoFR(BigDecimal capital, BigDecimal tasa, Long cuotas) {
        super();
        this.capital = capital;
        this.tasa = tasa;
        this.cuotas = cuotas;

    }

    @Override
    public List<Cuota> solicitar(BigDecimal capital, BigDecimal tasa, Long cuotas) {
        System.out.println("metodo de calculo");

        Pow potencia = new Pow();
        razon = tasa / 365 * 30/100;
        vp = capital.doubleValue() * razon.doubleValue() * potencia.value(1+razon.doubleValue(), cuotas.doubleValue()) / potencia.value(1+razon.doubleValue(),(cuotas.doubleValue()-1));

        
        return null;
    }

}
