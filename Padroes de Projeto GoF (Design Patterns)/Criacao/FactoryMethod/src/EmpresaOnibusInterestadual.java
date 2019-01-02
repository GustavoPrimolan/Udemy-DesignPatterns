import java.util.Calendar;

//FABRICA CONCRETA
public class EmpresaOnibusInterestadual extends Empresa{


    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusInterestadual(origem, destino, dataHoraPartida);
    }
}
