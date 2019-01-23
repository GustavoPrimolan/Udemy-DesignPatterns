public class Pato extends Ave{

    private Comportamento comportamentoVoar;
    private Comportamento comportamentoGrasnar;

    public Pato(){
        comportamentoVoar = new Voar();
        comportamentoGrasnar = new Grasnar();
    }


    @Override
    public void setComportamentoVoar(Comportamento comportamentoVoar) {
        this.comportamentoVoar = comportamentoVoar;
    }

    public void voar() {
        comportamentoVoar.exec();
    }

    @Override
    public void setComportamentoGrasnar(Comportamento comportamentoGrasnar) {
        this.comportamentoGrasnar = comportamentoGrasnar;
    }

    public void grasnar(){
        comportamentoGrasnar.exec();
    }

}
