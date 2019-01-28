public class MinhaApp {

    public static void main(String[] args) {
        //CRIA OBJETO VENDEDOR
        Vendedor vendedor = new Vendedor("João", 10000.0F);

        System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");

        //SALVA ESTADO INTERNO
        VendasMemory memory = new VendasMemory();
        memory.setMemento(vendedor.createMemento());

        //ALTERA OS VALORES DOS ATRIBUTOS DO OBJETO VENDEDOR
        vendedor.setNome("Pedro");
        vendedor.setTotalVendas(50000.0F);

        System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");

        //RESTAURA MEMENTO
        vendedor.restoreMemento(memory.getMemento());

        System.out.println(vendedor.getNome() + " - Total de vendas: " + vendedor.getTotalVendas() + "\n");

    }


}
