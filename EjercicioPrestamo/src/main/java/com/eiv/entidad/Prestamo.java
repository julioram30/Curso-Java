package com.eiv.entidad;

import java.math.BigDecimal;

public class Prestamo {

    private int Cuota;
    private BigDecimal VC;
    private BigDecimal Interes;
    private BigDecimal Capital;
    private BigDecimal Saldo;
    public int getCuota() {
        return Cuota;
    }
    public void setCuota(int cuota) {
        Cuota = cuota;
    }
    public BigDecimal getVC() {
        return VC;
    }
    public void setVC(BigDecimal vC) {
        VC = vC;
    }
    public BigDecimal getInteres() {
        return Interes;
    }
    public void setInteres(BigDecimal interes) {
        Interes = interes;
    }
    public BigDecimal getCapital() {
        return Capital;
    }
    public void setCapital(BigDecimal capital) {
        Capital = capital;
    }
    public BigDecimal getSaldo() {
        return Saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        Saldo = saldo;
    }

}
