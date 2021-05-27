public class Productos {

    private String tipoProducto;
    private String tipoMaterialH;
    private String tipoMarca; 
    private int cantidadProducto;
    private double precio;

    
    public Productos(String tipoProducto, String tipoMaterialH, String tipoMarca,  int cantidadProducto, double precio){
        this.tipoProducto = tipoProducto;
        this.tipoMaterialH = tipoMaterialH;
        this.tipoMarca = tipoMarca;
        this.cantidadProducto = cantidadProducto;
        this.precio = precio;
        
    }


    public String getTipoProducto(){
        return tipoProducto;
    }

    public String getTipoMaterialH(){
        return tipoMaterialH;
    }

    public String getTipoMarca(){
        return tipoMarca;
    }
    public int getCantidadProducto(){
        return cantidadProducto;
    }
    public double getPrecio(){
        return precio;
    }

}