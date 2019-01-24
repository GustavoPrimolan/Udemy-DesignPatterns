import java.util.Observable;
import java.util.Observer;

public class CarroPolicia implements Observer, Carro{


    @Override
    public void frente() {
        System.out.println("Viatura segue em frente.");
    }

    @Override
    public void direita() {
        System.out.println("Viatura vira a direita.");
    }

    @Override
    public void esquerda() {
        System.out.println("Viatura vira a esquerda.");
    }

    @Override
    public void para() {
        System.out.println("Viatura para");
    }

    @Override
    public void update(Observable observable, Object object) {
        CarroRoubado carroObservado = (CarroRoubado) observable;
        String acao = String.valueOf(object);

        if(acao.equals("frente")){
            this.frente();
        }
        else if(acao.equals("direita")){
            this.direita();
        }
        else if(acao.equals("esquerda")){
            this.esquerda();
        }
        else if(acao.equals("para")){
            this.para();
        }

    }
}
