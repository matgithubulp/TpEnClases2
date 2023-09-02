
package tpenclases2;


import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;


public class Empresa{
    
     private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleados;

    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> empleados) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleados = empleados;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public void agregarEmpleado(Empleado empleado) {
        
    boolean empleadoRepetido = false;
    int numeroDocumentoNuevo = empleado.getDni();

    for (Empleado empleadoExistente : empleados) {
        if (empleadoExistente.getDni() == numeroDocumentoNuevo) {
            empleadoRepetido = true;
            break; // El empleado ya existe, no es necesario continuar buscando
        }
    }

    if (!empleadoRepetido) {
        empleados.add(empleado);
        JOptionPane.showMessageDialog(null, "Empleado agregado a la empresa " + razonSocial);
    } else {
        JOptionPane.showMessageDialog(null, "El empleado con DNI: " + numeroDocumentoNuevo + " ya existe en la empresa -> " + razonSocial, "Opss", JOptionPane.ERROR_MESSAGE);
    }
        
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }
    
    public void mostrarEmpleado(){
    
    String detallesEmpleados = "Empleados en la empresa " + razonSocial + ":\n";

        for (Empleado empleado : empleados) {
            detallesEmpleados += "Nombre: " + empleado.getNombreApellido() + "\nCategoria: " + empleado.getCategoria() + "\nSueldo: $" + empleado.getSueldo() + "\n";
        }

        JOptionPane.showMessageDialog(null, detallesEmpleados, "Empleados en la empresa", JOptionPane.INFORMATION_MESSAGE);
    }
    }

    
  
    
    
    
    

