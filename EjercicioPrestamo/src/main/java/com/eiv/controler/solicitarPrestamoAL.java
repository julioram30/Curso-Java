package com.eiv.controler;

import java.math.BigDecimal;
import java.util.List;

import com.eiv.entidad.Cuota;

public class solicitarPrestamoAL implements SolicitarPrestamo {

    private BigDecimal capital;
    private Float tasa;
    private Long cuotas;

    @Override
    public List<Cuota> solicitar(BigDecimal capital, BigDecimal tasa, int cuotas) {
        // TODO Auto-generated method stub
        return null;
    }

}
