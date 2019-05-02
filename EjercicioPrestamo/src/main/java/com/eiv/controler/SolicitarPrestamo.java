package com.eiv.controler;

import java.math.BigDecimal;
import java.util.List;

import com.eiv.entidad.Prestamo;

public interface SolicitarPrestamo {
   
    public List<Prestamo> solicitar(BigDecimal capital,Float tasa,Long cuotas);
    

}
