
public class Veiculo {
    protected String tipo;
    protected int peso;
    protected int precoPorHora;

    public Veiculo(String tipo, int peso, int precoPorHora) {
        this.tipo = tipo;
        this.peso = peso;
        this.precoPorHora = precoPorHora;
    }

    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getTipo(){
        return this.tipo;
    }
    public void setPeso(int peso){
        this.peso = peso;
    }
    public int getPeso(){       
        return this.peso;
    }
    public void setPrecoPorHora(int precoPorHora){
        this.precoPorHora = precoPorHora;
    }
    public int getPrecoPorHora(){
        return this.precoPorHora;
    }
  
    

}



