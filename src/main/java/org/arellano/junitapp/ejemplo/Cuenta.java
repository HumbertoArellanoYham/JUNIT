package org.arellano.junitapp.ejemplo;

import java.math.BigDecimal;

public class Cuenta {
    private String nombre;
    private BigDecimal saldo;

    public Cuenta(String nombre, BigDecimal saldo){
        this.nombre = nombre;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Cuenta)) return false;

        if(this.nombre == null || this.saldo == null) return false;

        Cuenta cuenta = (Cuenta) obj;
        return this.nombre.equals(cuenta.getNombre()) && this.saldo.equals(cuenta.getSaldo());
    }
}
