//Decorator Concreto
public class Estrela extends Decoracao{
    public Estrela(Arvore a) {
        super(a);
    }

    public void showEnfeites() {
        super.showEnfeites();
        System.out.println("Estrela, ");
    }

}
