//LEAF
public class Programador extends Empregado{

    public Programador(String nome, double salario){
        super(nome, salario);
    }

    //EXIBE DETALHES DO EMPREGADO
    @Override
    public void print() {
        System.out.println(super.nome + ", $" + super.salario);
    }

    //ADICIONA EMPREGADO À ESTRUTURA
    @Override
    public void add(Empregado e) {
        System.out.println("Não é possível adicionar empregado subordinado do programador");
    }

    //REMOVE EMPREGADO DA ESTRUTURA
    @Override
    public void remove(Empregado e) {
        System.out.println("Não é possível remover empregado subordinado do programador");
    }

}
