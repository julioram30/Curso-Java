package com.eiv.prestamos;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;

import com.eiv.controler.solicitarPrestamoFR;
import com.eiv.entidad.Cuota;

public class App {

    public static void main(String[] args) {
        
        App app = new App();
        app.run( args);

   
    }

    private void run(String[] args) {
        int tipo = 0;
        BigDecimal capital = null;
        BigDecimal tasa = null;
        Integer cuotas = null;
        try {
            System.out.println("SOLICITUD DE PRESTAMO");
            System.out.println("Seleccione el tipo de Prestamo (1-Frances / 2-Aleman");
            Scanner scTipo = new Scanner(System.in);
            tipo = scTipo.nextInt();

            System.out.println("Ingrese el capital");
            Scanner scCapital = new Scanner(System.in);
            capital = scCapital.nextBigDecimal();

            System.out.println("Ingrese la tasa");
            Scanner scTasa = new Scanner(System.in);
            tasa = scTasa.nextBigDecimal();

            System.out.println("Ingrese la cantidad de cuotas");
            Scanner scCuotas = new Scanner(System.in);
            cuotas = scCuotas.nextInt();

            scCuotas.close();
            scTasa.close();
            scCapital.close();
            scTipo.close();
        } catch (Exception e) {

        }
        if (tipo == 1) {
            solicitarPrestamoFR prestamoFr = new solicitarPrestamoFR();
            List<Cuota> desarrollo = prestamoFr.solicitar(capital, tasa, cuotas);

        } else {
            System.out.println("No Implementado");
        }
        System.out.println("FIN App");
        
    }

}
