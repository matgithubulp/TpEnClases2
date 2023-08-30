/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tpenclases2;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author ejarq
 */
public class Empresa extends Empleado{
    
    private String razonSocial;
    private int cuit;
    private ArrayList<Empleado> empleadoLista;

    public Empresa(String razonSocial, int cuit, ArrayList<Empleado> empeladoLista) {
        this.razonSocial = razonSocial;
        this.cuit = cuit;
        this.empleadoLista = empeladoLista;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public int getCuit() {
        return cuit;
    }

    public ArrayList<Empleado> getEmpeladoLista() {
        return empleadoLista;
    }
    
    public void agregarEmpleado(Empleado e){
    
        
      
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.empleadoLista);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Empresa other = (Empresa) obj;
        return Objects.equals(this.empleadoLista, other.empleadoLista);
    }
    
    public void mostrarEmpleados(){
    
    
    }
    
    
    
    
}
