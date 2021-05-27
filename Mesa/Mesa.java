public class Mesa extends Material{

    private String forma;
    private double anchura;
    private double longitud;
    private double altura;
    private double peso;
    private double herramienta;

    
    public Mesa(String tipoMaterial, String tipoTornillo, String tipoPintura, String forma, double anchura, double longitud, double altura, double peso, double Herramienta){
        super(tipoMaterial, tipoPintura, tipoTornillo);
        this.forma = forma;
        this.anchura = anchura;
        this.longitud = longitud;
        this.altura = altura;
        this.peso = peso;
        ImprimirDatos1();
    }

    public void ImprimirDatos1(){
        
            
            System.out.println("Tipo de material: "+getTipoMaterial());
            System.out.println("Tipo de Clavo: "+getTipoTornillo());
            System.out.println("Color: "+getTipoPitura());
            System.out.println("Tipo de material: "+forma);
            System.out.println("Tipo de Clavo: "+anchura);
            System.out.println("Color: "+longitud);
            System.out.println("Tipo de material: "+ altura);
            System.out.println("Tipo de Clavo: "+peso);
    }
} 