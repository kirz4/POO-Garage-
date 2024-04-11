

public class Furgao extends Veiculo{
    private int volume;

    public Furgao(String tipo, int peso, int precoPorHora, int volume){
        super(tipo, peso, precoPorHora);
        this.volume = volume;
    }

    public void setVolume(int volume){
        this.volume = volume;
    }

    public int getVolume(){
        return this.volume;
    }
}
