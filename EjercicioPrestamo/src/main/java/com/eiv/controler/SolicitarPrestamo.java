package com.eiv.controler;

import java.math.BigDecimal;
import java.util.List;

import com.eiv.entidad.Cuota;

public interface SolicitarPrestamo {
   
    public List<Cuota> solicitar(BigDecimal capital,BigDecimal tasa,int  cuotas);
    

}
