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
 * Visto
 */
public class CCuenta {

    /**
     * inicializacion de las variables de la clase
     */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta() {
    }

    /**
     * @param nomb nombre del administrador de la cuenta
     * @param cue numero de cuenta
     * @param sal saldo disponible en la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        this.nombre = nom;
        this.cuenta = cue;
        this.saldo = sal;
    }

    /**
     * @return devuelve el nombre del administrador de la cuenta
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @return devuelve el numero de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @return devuelve el saldo de la cuenta
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @return devuelve el tipo de interes de la cuenta
     */
    public double getTipoInteres() {
        return tipoInteres;
    }

    /**
     * @param nombre recibe el nombre de la cuenta
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @param cuenta recibe el numero de cuenta
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo recibe el saldo a introducir de la cuenta
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @param tipoInteres recibe el tipo de interés de la cuenta
     */
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoInteres;
    }

    /**
     * @return devuelve el saldo actual que tiene la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * @param recibe la cantidad a ingresar en la cuenta
     * @throws lanza una excepcion en caso de que la cantidad sea negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * @param cantidad cantidad a retirar de la cuenta
     * @throws lanza una excepcion en caso de que se intente retirar una
     * cantidad negativa
     * @throws lanza una excepcion en caso de que no haya suficiente saldo para
     * retirar
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}
