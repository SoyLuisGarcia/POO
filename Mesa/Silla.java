public class Silla extends Material{

    private String forma;
    private double anchura;
    private double longitud;
    private double altura;
    private double peso;

    
    public Silla(String tipoMaterial,String tipoTornillo, String tipoPintura, String forma, double anchura, double longitud, double altura, double peso, double herramienta){
        super(tipoMaterial, tipoTornillo, tipoPintura);
        this.forma = forma;
        this.anchura = anchura;
        this.longitud = longitud;
        this.altura = altura;
        this.peso = peso;
        ImprimirDatos2();
    }

    public void ImprimirDatos2(){

        

            System.out.println("\nTipo de material: "+getTipoMaterial());
            System.out.println("Tipo de Clavo: "+getTipoTornillo());
            System.out.println("Color: "+getTipoPitura());
            System.out.println("Tipo de material: "+forma);
            System.out.println("Tipo de Clavo: "+anchura);
            System.out.println("Color: "+longitud);
            System.out.println("Tipo de material: "+ altura);
            System.out.println("Tipo de Clavo: "+peso);
            
    }
}