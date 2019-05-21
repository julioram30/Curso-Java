package com.eiv.entidad;

import java.math.BigDecimal;

public class Cuota {

    private int cuota;
    private BigDecimal vc;
    private BigDecimal interes;
    private BigDecimal capital;
    private BigDecimal saldo;

    public int getCuota() {
        return cuota;
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
    }

    public BigDecimal getVC() {
        return vc;
    }

    public void setVC(BigDecimal vC) {
        vc = vC;
    }

    public BigDecimal getInteres() {
        return interes;
    }

    public void setInteres(BigDecimal interes) {
        this.interes = interes;
    }

    public BigDecimal getCapital() {
        return capital;
    }

    public void setCapital(BigDecimal capital) {
        this.capital = capital;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }
    
    public Cuota() {}
    
    public Cuota(BigDecimal capital,BigDecimal interes, int cuota,BigDecimal vc, BigDecimal saldo ) {
        super();
        this.capital=capital;
        this.interes=interes;
        this.cuota=cuota;
        this.vc=vc;
        this.saldo=saldo;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((capital == null) ? 0 : capital.hashCode());
        result = prime * result + cuota;
        result = prime * result + ((interes == null) ? 0 : interes.hashCode());
        result = prime * result + ((saldo == null) ? 0 : saldo.hashCode());
        result = prime * result + ((vc == null) ? 0 : vc.hashCode());
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
        if (capital == null) {
            if (other.capital != null)
                return false;
        } else if (!capital.equals(other.capital))
            return false;
        if (cuota != other.cuota)
            return false;
        if (interes == null) {
            if (other.interes != null)
                return false;
        } else if (!interes.equals(other.interes))
            return false;
        if (saldo == null) {
            if (other.saldo != null)
                return false;
        } else if (!saldo.equals(other.saldo))
            return false;
        if (vc == null) {
            if (other.vc != null)
                return false;
        } else if (!vc.equals(other.vc))
            return false;
        return true;
    }
}
