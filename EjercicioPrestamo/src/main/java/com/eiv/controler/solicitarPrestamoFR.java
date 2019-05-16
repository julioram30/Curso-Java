package com.eiv.controler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.function.Pow;

import com.eiv.entidad.Cuota;

public class solicitarPrestamoFR implements SolicitarPrestamo {

    private BigDecimal capital = null;
    private BigDecimal tasa = null;
    private Integer cuotas = null;
    private BigDecimal razon = null;
    private Double vp = null;
    private BigDecimal diasanio = new BigDecimal("365");
    private BigDecimal modulo = new BigDecimal("30");
    private BigDecimal porcentaje = new BigDecimal("100");
    

    List<Cuota> desarrollo = new ArrayList<>();

    public solicitarPrestamoFR() {
        super();
    }

    public solicitarPrestamoFR(BigDecimal capital, BigDecimal tasa, int cuotas) {
        super();
        this.capital = capital;
        this.tasa = tasa;
        this.cuotas = cuotas;

    }

    @Override
    public List<Cuota> solicitar(BigDecimal capital, BigDecimal tasa, int cuotas) {
                
        this.cuotas=cuotas;
        System.out.println("metodo de calculo");

        for (int i=1;i< cuotas;i++) {
            
        
        Pow potencia = new Pow();
        razon = tasa.divide(diasanio.multiply(modulo.divide(porcentaje))) ;  // calculo principal
        vp = capital.doubleValue() * razon.doubleValue() * potencia.value(1+razon.doubleValue(), this.cuotas.doubleValue()) / potencia.value(1+razon.doubleValue(),(this.cuotas.doubleValue()-1));
        
        //desarrollo.add()
        }
        
        return null;
    }

}
