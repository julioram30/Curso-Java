package com.eiv.controler;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.math3.analysis.function.Pow;

import com.eiv.entidad.Cuota;

public class SolicitarPrestamoFR implements SolicitarPrestamo {

    private final static  BigDecimal DIASANIO = new BigDecimal("365");
    private final static BigDecimal modulo = new BigDecimal("30");
    private final static BigDecimal porcentaje = new BigDecimal("100");
    
    

    List<Cuota> desarrollo = new ArrayList<>();

    public SolicitarPrestamoFR() {
        super();
    }

    public SolicitarPrestamoFR(BigDecimal capital, BigDecimal tasa, int cuotas) {
        super();
       
        // metodo solo para mostrar el polimorfismo
    }

    @Override
    public List<Cuota> solicitar(BigDecimal capital, BigDecimal tasa, int cuotas) {

        System.out.println("metodo de calculo");
       
        BigDecimal razon = tasa.divide(DIASANIO.multiply(modulo.divide(porcentaje))); // calculo principal
        Double exponente = Double.valueOf(cuotas);

        Pow potencia = new Pow();
        
        BigDecimal auxiliar = new BigDecimal(potencia.value(razon.add(BigDecimal.ONE).doubleValue() , exponente));
        BigDecimal auxiliar1 = new BigDecimal(potencia.value(razon.add(BigDecimal.ONE).doubleValue() , exponente-1));
        
        BigDecimal valorcuota = capital.multiply(razon).multiply(auxiliar).divide(auxiliar1) ;


        for (int i = 1; i < cuotas; i++) {
            
            // calculos secundarios para rellenar la cuota
            BigDecimal interes = capital.multiply(razon);
            BigDecimal capitalCuota = valorcuota.subtract(interes);
            BigDecimal saldo = capital.subtract(capitalCuota);
            

            desarrollo.add( new Cuota(capitalCuota, interes, i, valorcuota, saldo));
        }

        return null;
    }

}
