import java.util.Calendar;

//FÁBRICA
public abstract class Empresa {

    public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);

}
