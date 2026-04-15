/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueA;

public class Rectangulo {
    public int base;
    public int altura;

    public int area() {
        return base * altura;
    }

    public int perimetro() {
        return 2 * (base + altura);
    }
}
