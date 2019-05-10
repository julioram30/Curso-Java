package com.eiv.entidad;

import java.math.BigDecimal;

public class Cuota {

    private int cuota;
    private BigDecimal VC;
    private BigDecimal Interes;
    private BigDecimal Capital;
    private BigDecimal Saldo;

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
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

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Capital == null) ? 0 : Capital.hashCode());
        result = prime * result + cuota;
        result = prime * result + ((Interes == null) ? 0 : Interes.hashCode());
        result = prime * result + ((Saldo == null) ? 0 : Saldo.hashCode());
        result = prime * result + ((VC == null) ? 0 : VC.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Cuota other = (Cuota) obj;
        if (Capital == null) {
            if (other.Capital != null)
                return false;
        } else if (!Capital.equals(other.Capital))
            return false;
        if (cuota != other.cuota)
            return false;
        if (Interes == null) {
            if (other.Interes != null)
                return false;
        } else if (!Interes.equals(other.Interes))
            return false;
        if (Saldo == null) {
            if (other.Saldo != null)
                return false;
        } else if (!Saldo.equals(other.Saldo))
            return false;
        if (VC == null) {
            if (other.VC != null)
                return false;
        } else if (!VC.equals(other.VC))
            return false;
        return true;
    }
}
