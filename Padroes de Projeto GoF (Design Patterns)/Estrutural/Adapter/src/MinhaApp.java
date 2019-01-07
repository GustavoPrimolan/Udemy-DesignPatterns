public class MinhaApp {

    public static void main(String[] args){
        //TARGET
        TomadaBrasileira tomadaBras = new TomadaBrasileira();

        //ADAPTADO
        PlugAmericano plugEUA = new PlugAmericano();

        AdapterEUAtoBrasil tomadaModificada = new AdapterEUAtoBrasil();
        String s = tomadaModificada.conecta(plugEUA);

        System.out.println(s);
    }

}
