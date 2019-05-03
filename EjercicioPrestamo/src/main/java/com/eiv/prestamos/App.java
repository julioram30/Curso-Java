package com.eiv.prestamos;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.eiv.controler.solicitarPrestamoFR;
import com.eiv.entidad.Prestamo;

public class App {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("SOLICITUD DE PRESTAMO");
        System.out.println("Seleccione el tipo de Prestamo (1-Frances / 2-Aleman");
        Scanner scTipo = new Scanner(System.in);
        int tipo = scTipo.nextInt();
        scTipo.close();

        System.out.println("Ingrese el capital");
        Scanner scCapital = new Scanner(System.in);
        BigDecimal capital = scCapital.nextBigDecimal();
        scCapital.close();

        System.out.println("Ingrese la tasa");
        Scanner scTasa = new Scanner(System.in);
        Float tasa = scTasa.nextFloat();
        scTasa.close();

        System.out.println("Ingrese la cantidad de cuotas");
        Scanner scCuotas = new Scanner(System.in);
        Long cuotas = scCuotas.nextLong();
        scCuotas.close();

        if (tipo == 1) {
            solicitarPrestamoFR prestamoFr = new solicitarPrestamoFR();
            List<Prestamo> desarrollo = prestamoFr.solicitar(capital, tasa, cuotas);

        } else {
            System.out.println("No Implementado");
        }
        
    }

}
