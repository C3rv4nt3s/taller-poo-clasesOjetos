/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class CuentaBancaria {
    public String numero;
    public String titular;
    public int saldo;

    // Constructor vacío
    public CuentaBancaria() {}

    public CuentaBancaria(String numero, String titular, int saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarCuenta() {
        System.out.println(numero + " - " + titular + " - " + saldo);
    }

    public void consignar(int valor) {
        saldo += valor;
    }

    public void retirar(int valor) {
        if (saldo >= valor) {
            saldo -= valor;
        }
    }
}
