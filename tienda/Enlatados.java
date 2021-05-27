public class Enlatados extends Producto{

    double precio;
    int cantidad_Producto;
    String nombre_Producto;

    public Enlatados(String tipoMarca, String tipoMaterial, double precio, int cantidad_Producto, String nombre_Producto) {
        this.precio = precio;
        this.cantidad_Producto = cantidad_Producto;
        this.nombre_Producto = nombre_Producto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getCantidad_Producto() {
        return this.cantidad_Producto;
    }

    public String getNombre_Producto() {
        return this.nombre_Producto;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad_Producto(int cantidad_Producto) {
        this.cantidad_Producto = cantidad_Producto;
    }

    public void setNombre_Producto(String nombre_Producto) {
        this.nombre_Producto = nombre_Producto;
    }

    public void setCantidad_Producto_Restantes(int restar) {
        this.cantidad_Producto = this.cantidad_Producto - restar;
    }

}

