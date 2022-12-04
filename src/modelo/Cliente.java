
package modelo;



public class Cliente {
    private long codigo;
    private String nombre;
    private double dni;

    public Cliente(long codigo, String nombre, double dni) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.dni = dni;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
