public class MiProducto extends Productos{

    
    private String Leche;
    private String Atun;
    private String Soda;

    public MiProducto(String tipoProducto, String tipoMaterialH, String tipoMarca,  int cantidadProducto, double precio,String Leche, String Atun, String Soda) {
       super(tipoProducto, tipoMaterialH, tipoMarca, cantidadProducto, precio);
        this.Leche = Leche;
        this.Atun = Atun;
        this.Soda = Soda;
        ImprimirDatos1();
    }

   
    public void ImprimirDatos1(){
        
            
            System.out.println("Tipo de producto: " + gettipoProducto;
            System.out.println("Tipo de Material: "+ getTipoMaterialH());
            System.out.println("Marca productp: "+ getTipoMarca());
             System.out.println("Cantidad del Producto: " + getCantidadProducto());
            System.out.println("Precio del producto: "+ getPrecio());
            System.out.println("Producto: "+ Leche);
           
    }

}
