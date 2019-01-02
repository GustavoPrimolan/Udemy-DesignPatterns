import java.util.Calendar;


//ANTES HAVIA UMA FÁBRICA PARA CRIAR CADA PRODUTO AGORA EXISTE APENAS UMA FABRICA
public abstract class EmpresaOnibus {

    public abstract PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida);

    public abstract PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida);

}
