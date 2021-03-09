/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author AlvaroRomo
 * @version 1.1
 * @since 09/03/2021
 */
public class Deposito {

    /**
     * @param args recibe en Array de String
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
    
    /**
     * @param cantidad argumento de entrada para probar la refactorización
     * Metodo que te dice la cantidad de saldo actual que tienes
     * ademas retira de una cuenta dinero 
     * @throws En caso de que al retirar o al ingresar halla un error tenemos dos métodos que nos pueden lanzar excepciones (estado y ingresar)
     */
    private static void operativa_cuenta (float cantidad) {
        // TODO code application logic here
        CCuenta cuenta2AAAA;
        double saldoActual;

        cuenta2AAAA = new CCuenta("Antonio LÃ³pez", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta2AAAA.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta2AAAA.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta2AAAA.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }
    
}
