/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perro;

/**
 *
 * @author Telma
 */
public class Perro {
    //*****************************************************************
    // Attributes 
    //*****************************************************************
    public static final String ICONO = "/img/perro.png";
    public static final String NOMBRE = "Perro sin nombre"; 
    public static final int EDAD = 1;
    public static final int ATENCION = 0;
    public static final int NIVEL = 10;
    
    private String icono;
    private String nombrePerro; 
    private int edadPerro;
    private int atencionPerro;
    private int nivel;

    //*****************************************************************
    // Constructors 
    //*****************************************************************
    public Perro(String icono, String nombre, int edad, int atencion, int nivel) {
        this.icono = icono;
        this.nombrePerro = nombre; 
        this.edadPerro = edad;
        this.atencionPerro = atencion;
        this.nivel = nivel;
    }
    
    public Perro() {
        this(ICONO, NOMBRE, EDAD, ATENCION, NIVEL);
    }

    public Perro(Perro otro) {
        this(otro.icono, otro.nombrePerro, otro.edadPerro, otro.atencionPerro, otro.nivel);
    }

}
