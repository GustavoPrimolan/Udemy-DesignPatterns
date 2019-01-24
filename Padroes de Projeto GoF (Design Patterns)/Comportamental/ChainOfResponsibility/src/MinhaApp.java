public class MinhaApp {

    public static void main(String[] args) {

        //TOMADORES DE DECISÃO
        TomadorDeDecisao presidente = new Presidente();
        TomadorDeDecisao vicepresidente = new VicePresidente();
        TomadorDeDecisao diretor = new Diretor();
        TomadorDeDecisao gerente = new Gerente();

        gerente.setSucessor(diretor);
        diretor.setSucessor(vicepresidente);
        vicepresidente.setSucessor(presidente);

        Compra compra = new Compra(500F);
        gerente.aprova(compra);

    }

}
