
package tpenclases2;

import java.util.ArrayList;
import java.util.TreeSet;
import javax.swing.JOptionPane;

/**
 *
 * @author ejarq
 */
public class Empresa extends Empleado{
    
    private String razonSocial;
    private int cuit;
//    private ArrayList<Empleado> empleadoLista;
    private TreeSet<Empleado> empleadoLista = new TreeSet();

    public Empresa(String razonSocial, int cuit, TreeSet<Empleado> empeladoLista) {
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

    public TreeSet<Empleado> getEmpeladoLista() {
        return empleadoLista;
    }
    
    public void agregarEmpleado(Empleado e){
    empleadoLista.add(e);          
    }
    
    public void mostrarEmpleados(){
    JOptionPane.showMessageDialog(null, empleadoLista);
    }
    
    
    
    
}
