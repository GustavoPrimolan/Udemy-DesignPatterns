import java.util.ArrayList;
import java.util.List;

public class Gerente extends Empregado{

    private List<Empregado> listaSubordinados = new ArrayList<Empregado>();

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    //EXIBE A ESTRUTURA
    @Override
    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
        for(Empregado e : listaSubordinados){
            e.print();
        }
    }

    //ADICIONA EMPREGADO À ESTRUTURA
    @Override
    public void add(Empregado e) {
        listaSubordinados.add(e);
    }

    //REMOVE EMPREGADO DA ESTRUTURA
    @Override
    public void remove(Empregado e) {
        listaSubordinados.remove(e);
    }
}
