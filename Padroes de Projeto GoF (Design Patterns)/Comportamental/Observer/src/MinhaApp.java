public class MinhaApp {

    public static void main(String[] args){
        //OBSERVADOR
        CarroPolicia carroPolicia = new CarroPolicia();

        //OBSERVADO
        CarroRoubado carroRoubado = new CarroRoubado();

        //ADICIONA OBSERVADOR AO OBSERVADO
        carroRoubado.addObserver(carroPolicia);

        carroRoubado.frente();
        carroRoubado.direita();
        carroRoubado.frente();
        carroRoubado.esquerda();
        carroRoubado.para();
    }

}
