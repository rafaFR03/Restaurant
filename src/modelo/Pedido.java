
package modelo;


public class Pedido{
    private long nPedido;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;
    private double PrecioTotal;

    public Pedido(long nPedido, String descripcion, int cantidad, double precioUnitario, double PrecioTotal) {
        this.nPedido = nPedido;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.PrecioTotal = PrecioTotal;
    }

    public double getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(double PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }

    public long getnPedido() {
        return nPedido;
    }

    public void setnPedido(long nPedido) {
        this.nPedido = nPedido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    
    
}
