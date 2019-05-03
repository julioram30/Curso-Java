package com.eiv.controler;

import java.math.BigDecimal;
import java.util.List;

import com.eiv.entidad.Prestamo;

public class solicitarPrestamoAL implements SolicitarPrestamo {
   
    private BigDecimal capital;
    private Float tasa;
    private Long cuotas;
    
    @Override
    public List<Prestamo> solicitar(BigDecimal capital, Float tasa, Long cuotas) {
        // TODO Auto-generated method stub
        return null;
    }

}
