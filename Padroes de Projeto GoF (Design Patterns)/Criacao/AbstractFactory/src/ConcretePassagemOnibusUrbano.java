import java.util.Calendar;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano{

    protected ConcretePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super(origem, destino, dataHoraPartida);
    }

    @Override
    public void exibeDetalhes() {
        System.out.println("Passagem de ônibus urbana: " + this.getOrigem() + " para " + this.getDestino() + ", Data/Hora " + super.df.format(this.getDataHoraPartida().getTime()));
    }
}
