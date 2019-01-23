public class MinhaApp {

    public static void main(String[] args){
        Pato p = new Pato();


        //ALERTA O COMPORTAMENTO DE VOAR
        p.setComportamentoVoar(new NaoVoar());

        p.voar();
        p.grasnar();

    }

}
