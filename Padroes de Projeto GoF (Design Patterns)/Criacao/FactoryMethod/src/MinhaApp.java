import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinhaApp {

    public static void main(String[] args) {
        //EMPRESAS DE ÔNIBUS
        Empresa viacaoABCLocal = new EmpresaOnibusUrbano();

        Empresa viacaoXYZInter = new EmpresaOnibusInterestadual();


        //EMITE PASSAGENS
        Passagem pUrbano = viacaoABCLocal.emitePassagem("São Paulo", "Campinas", new GregorianCalendar(2016, Calendar.MARCH, 10, 11, 0));

        Passagem pInterestadual = viacaoXYZInter.emitePassagem("São Paulo", "Rio de Janeiro", new GregorianCalendar(2016, Calendar.APRIL, 10, 11, 0));


        //EXIBE DETALHES DAS PASSAGENS
        pUrbano.exibeDetalhes();

        pInterestadual.exibeDetalhes();

    }

}
