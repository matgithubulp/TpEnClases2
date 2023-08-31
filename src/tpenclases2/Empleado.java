
package tpenclases2;



public class Empleado {
    
    
    private int dni;
    private String nombreApellido;
    private String categoria;
    private double sueldo;
    private Empresa empersa;

    public int getDni() {
        return dni;
    }

    public Empleado(int dni, String nombreApellido, String categoria, double sueldo, Empresa empersa) {
        this.dni = dni;
        this.nombreApellido = nombreApellido;
        this.categoria = categoria;
        this.sueldo = sueldo;
        this.empersa = empersa;
    }

    public String getNombreApellido() {
        return nombreApellido;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getSueldo() {
        return sueldo;
    }

    public Empresa getEmpersa() {
        return empersa;
    }

    
    
    
}
