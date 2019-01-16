public class MinhaApp {

    public static void main(String[] args) {
        //CRIA PROGRAMADORES (FOLHAS)
        Programador pEstagiario = new Programador("José", 900);
        Programador pJunior = new Programador("Pedro", 2900);
        Programador pSenior = new Programador("Ricardo", 3900);

        //GERENTES
        Gerente g3 = new Gerente("João", 15000);
        Gerente g2 = new Gerente("Maria", 10000);
        Gerente g1 = new Gerente("Carlos", 5000);


        //MOSTAR A ESTRUTURA EM ÁRVORE

        //CARLOS SUPERVISIONA OS PROGRAMADORES JOSÉ E PEDRO
        g1.add(pEstagiario);
        g1.add(pJunior);

        //MARIA SUPERVISIONA O PROGRAMADOR RICARDO
        g2.add(pSenior);

        //JOÃO É RAIZ DA ESTRUTURA EM ÁRVORE
        g3.add(g1);
        g3.add(g2);

        g3.print();
    }

}
