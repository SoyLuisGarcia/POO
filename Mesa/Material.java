public class Material{
   
    private String tipoMaterial;
    private String tipoTornillo;
    private String tipoPintura;
    
    public Material(String tipoMaterial, String tipoTornillo, String tipoPintura){
        this.tipoMaterial = tipoMaterial;
        this.tipoTornillo = tipoTornillo;
        this.tipoPintura = tipoPintura;
        
    }


    public String getTipoMaterial(){
        return tipoMaterial;
    }

    public String getTipoTornillo(){
        return tipoTornillo;
    }

    public String getTipoPitura(){
        return tipoPintura;
    }

}