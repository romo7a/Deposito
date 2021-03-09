/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

/**
 *
 * @author eland
 */
public class Deposito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }

    private static void operativa_cuenta (float cantidad) {
        // TODO code application logic here
        CCuenta cuenta2;
        double saldoActual;

        cuenta2 = new CCuenta("Antonio LÃ³pez", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta2.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta2.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta2.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar");
        }
    }

}
