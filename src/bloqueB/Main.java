/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloqueB;

import bloqueA.*;

public class Main {
    public static void main(String[] args) {

        //ESTUDIANTE
        
        // La clase Estudiante es una plantilla que define atributos y comportamientos
        // est1 es un objeto porque es una instancia real creada a partir de la clase
        System.out.println("ESTUDIANTE");
        Estudiante est1 = new Estudiante();
        est1.nombre = "Alexander";
        est1.codigo = "123";
        est1.semestre = 3;

        est1.mostrarInfo();

        est1.cambiarSemestre(4);
        est1.mostrarInfo();


        //VEHICULO
        // Los objetos comparten la misma estructura (atributos y métodos),
        // pero se diferencian en los valores que tienen.
        // Por ejemplo, dos vehículos tienen marca y modelo,
        // pero pueden tener datos distintos.
        System.out.println("\nVEHICULO");
        Vehiculo v1 = new Vehiculo();
        v1.marca = "Toyota";
        v1.modelo = "Corolla";
        v1.velocidadActual = 60;

        Vehiculo v2 = new Vehiculo();
        v2.marca = "Mazda";
        v2.modelo = "3";
        v2.velocidadActual = 80;

        v1.mostrarEstado();
        v2.mostrarEstado();

        v1.acelerar();
        v1.mostrarEstado();

        v1.frenar();
        v1.mostrarEstado();


        //PRODUCTOS
        System.out.println("\nPRODUCTOS");
        Producto p1 = new Producto();
        p1.nombre = "Arroz";
        p1.precio = 3000;
        p1.stock = 10;

        Producto p2 = new Producto();
        p2.nombre = "Leche";
        p2.precio = 2500;
        p2.stock = 20;

        Producto p3 = new Producto();
        p3.nombre = "Pan";
        p3.precio = 500;
        p3.stock = 50;

        p1.mostrarProducto();
        p2.mostrarProducto();
        p3.mostrarProducto();

        p1.vender(2);
        p1.mostrarProducto();

        p1.reabastecer(5);
        p1.mostrarProducto();


        //MASCOTA
        System.out.println("\nMASCOTA");
        Mascota m1 = new Mascota();
        m1.nombre = "Firulais";
        m1.especie = "Perro";
        m1.edad = 2;

        m1.mostrarMascota();

        m1.edad = 3;
        m1.mostrarMascota();

        m1.edad = 4;
        m1.mostrarMascota();

        m1.cumplirAnios();
        m1.mostrarMascota();


        //CUENTAS
        System.out.println("\nCUENTAS BANCARIAS");
        CuentaBancaria c1 = new CuentaBancaria();
        c1.numero = "001";
        c1.titular = "Alexander";
        c1.saldo = 1000;

        CuentaBancaria c2 = new CuentaBancaria();
        c2.numero = "002";
        c2.titular = "Juan";
        c2.saldo = 2000;

        c1.mostrarCuenta();
        c2.mostrarCuenta();

        c1.consignar(500);
        c1.mostrarCuenta();

        c1.retirar(300);
        c1.mostrarCuenta();
        
        //EJERCICIO 21
        
        System.out.println("\n=== EJERCICIO 21 ===");
        
        Producto prod1 = new Producto();
        prod1.nombre = "Arroz";
        prod1.precio = 3000;
        prod1.stock = 10;

        Producto prod2 = new Producto();
        prod2.nombre = "Arroz"; // mismo valor en este atributo
        prod2.precio = 2500;
        prod2.stock = 5;

        prod1.mostrarProducto();
        prod2.mostrarProducto();
        
        
        //EJERCICIO 22
        // La clase Libro funciona como una plantilla que define las características
        // generales de un libro, mientras que los objetos representan libros reales
        // con valores específicos. Esto permite crear múltiples instancias con
        // diferentes datos a partir de una misma estructura
        System.out.println("\n=== LIBROS ===");

        Libro l1 = new Libro();
        l1.titulo = "Libro A";
        l1.autor = "Autor 1";
        l1.paginas = 100;

        Libro l2 = new Libro();
        l2.titulo = "Libro B";
        l2.autor = "Autor 2";
        l2.paginas = 200;

        Libro l3 = new Libro();
        l3.titulo = "Libro C";
        l3.autor = "Autor 3";
        l3.paginas = 300;

        Libro l4 = new Libro();
        l4.titulo = "Libro D";
        l4.autor = "Autor 4";
        l4.paginas = 400;

        l1.mostrarInfo();
        l2.mostrarInfo();
        l3.mostrarInfo();
        l4.mostrarInfo();
        
        //EJERCICIO 25
        System.out.println("\nEJERCICIO 25");

        // Usando constructor vacío
        Libro l5 = new Libro();
        l5.titulo = "Libro Vacío";
        l5.autor = "Autor X";
        l5.paginas = 150;

        // Usando constructor con parámetros
        Libro l6 = new Libro("Libro Constructor", "Autor Y", 250);

        l5.mostrarInfo();
        l6.mostrarInfo();
        
        //BLOQUE E
        System.out.println("\n=== BLOQUE E ===");

        // Ejercicio 26
        Producto p4 = new Producto("Teclado", 80000, 10);
        System.out.println(p4.nombre);

        // Ejercicio 27 y 28
        CuentaBancaria c3 = new CuentaBancaria("003", "Maria", 3000);
        CuentaBancaria c4 = new CuentaBancaria("004", "Luis", 4000);
        CuentaBancaria c5 = new CuentaBancaria("005", "Ana", 5000);

        c3.mostrarCuenta();
        c4.mostrarCuenta();
        c5.mostrarCuenta();
        
        //BLOQUE F
        System.out.println("\nBLOQUE F");

        // Diferentes formas de crear objetos
        Estudiante e1 = new Estudiante();
        e1.nombre = "Pedro";
        e1.codigo = "001";
        e1.semestre = 1;

        Estudiante e2 = new Estudiante("Laura", "002");

        Estudiante e3 = new Estudiante("Carlos", "003", 5);

        e1.mostrarInfo();
        e2.mostrarInfo();
        e3.mostrarInfo();
        
        //EJERCICIOS 30–34

        // Ejercicio 30
        Producto p5 = new Producto("Monitor", 500000, 3);
        p5.mostrarProducto();

        // Ejercicio 31
        Libro l7 = new Libro("Libro F", "Autor F", 600);
        l7.mostrarInfo();

        // Ejercicio 32
        Libro l8 = new Libro();
        l8.titulo = "Libro G";
        l8.autor = "Autor G";
        l8.paginas = 700;
        l8.mostrarInfo();

        // Ejercicio 33
        // Usar constructores con parámetros permite inicializar objetos más rápido
        // mientras que el constructor vacío requiere asignar valores después

        // Ejercicio 34
        // La sobrecarga de constructores permite crear objetos de diferentes formas
        // dependiendo de la información disponible
        
        //BLOQUE G
        System.out.println("\nBLOQUE G");

        // Lámpara
        Lampara lampara = new Lampara();
        lampara.encender();
        lampara.mostrarEstado();
        lampara.apagar();
        lampara.mostrarEstado();

        // Puerta
        Puerta puerta = new Puerta();
        puerta.abrir();
        puerta.mostrarEstado();
        puerta.cerrar();
        puerta.mostrarEstado();

        // Celular
        Celular cel = new Celular();
        cel.encender();
        cel.cargarBateria();
        cel.mostrarEstado();
        cel.apagar();
        cel.mostrarEstado();
        
        //BLOQUE H
        System.out.println("\nBLOQUE H");

        // Ejercicio 41
        // Las clases permiten organizar mejor el código agrupando datos y comportamientos

        // Ejercicio 42
        // Los objetos representan instancias reales creadas a partir de una clase

        // Ejercicio 43
        // La programación orientada a objetos facilita la reutilización del código

        // Ejercicio 44
        // También permite modelar situaciones del mundo real de manera más clara
        
        //BLOQUE I
        System.out.println("\nBLOQUE I");

        // Ejercicio 45
        Vehiculo vTest = new Vehiculo(); // corregido: ahora sí se instancia

        // Ejercicio 46
        Producto pTest = new Producto(); // correcto uso del constructor vacío

        // Ejercicio 47
        Estudiante eTest = new Estudiante(); // se crea correctamente el objeto

        // Ejercicio 48
        // Error común: usar un objeto sin crearlo primero

        // Ejercicio 49
        // Error común: no definir constructores necesarios

        // Ejercicio 50
        // Corrección: definir correctamente clases, atributos y métodos antes de usarlos
        
        //BLOQUE J
        System.out.println("\nBLOQUE J");

        // Rectángulo
        Rectangulo r = new Rectangulo();
        r.base = 5;
        r.altura = 10;

        System.out.println("Área: " + r.area());
        System.out.println("Perímetro: " + r.perimetro());

        // Factura
        FacturaSimple f = new FacturaSimple();
        f.valor = 1000;
        f.aplicarDescuento();
        System.out.println("Valor con descuento: " + f.valor);

        // Semáforo
        Semaforo s = new Semaforo();
        s.color = "rojo";

        s.cambiar();
        System.out.println("Color: " + s.color);

        s.cambiar();
        System.out.println("Color: " + s.color);
        
        //BLOQUE K
        System.out.println("\nBLOQUE K");

        // Ejercicio 61
        // La POO permite organizar el código en clases y objetos facilitando su comprensión

        // Ejercicio 62
        // Los objetos contienen atributos y métodos que representan características y acciones

        // Ejercicio 63
        // La encapsulación ayuda a proteger los datos dentro de una clase

        // Ejercicio 64
        // Los constructores permiten inicializar objetos al momento de crearlos

        // Ejercicio 65
        // La sobrecarga permite tener varios métodos o constructores con el mismo nombre
        
        // ===== BLOQUE L =====
        System.out.println("\n=== BLOQUE L ===");

        // Crear cursos
        Curso curso1 = new Curso();
        curso1.nombre = "POO";
        curso1.creditos = 3;

        Curso curso2 = new Curso();
        curso2.nombre = "Bases de Datos";
        curso2.creditos = 4;

        curso1.mostrarCurso();
        curso2.mostrarCurso();
        
        // La programación orientada a objetos permite estructurar mejor el código,
        // facilitando la creación de programas más organizados, reutilizables y fáciles de mantener.
        // A través de clases y objetos se pueden representar situaciones reales de forma eficiente.
    }
}
