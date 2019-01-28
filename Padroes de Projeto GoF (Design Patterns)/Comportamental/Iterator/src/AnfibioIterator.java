import java.util.Iterator;

//CONCRETE ITERATOR
public class AnfibioIterator implements Iterator<Animal> {

    private Zoo zoo;
    private int pos = 0;

    public AnfibioIterator(Zoo zoo){
        this.zoo = zoo;
    }


    //METODO VERIFICA SE EXISTE UM PROXIMO ELEMENTO ESPECIFICO DESSA CLASSE NA LISTA
    @Override
    public boolean hasNext() {
        for(int i = pos; i < zoo.getAnimais().size(); i++){
            Animal a = zoo.getAnimais().get(i);
            if(a.getClasse().equals("anfibio")){
                return true;
            }
        }
        return false;
    }


    //ITERAÇÕES FILTRADAS
    @Override
    public Animal next() {
        while(pos < zoo.getAnimais().size()){
            Animal a = zoo.getAnimais().get(pos);
            pos++;

            if(a.getClasse().equalsIgnoreCase("anfibio")){
                return a;
            }
        }
        //RETORNA NULL SE NÃO HA MAIS ELEMENTOS ESPECIFICOS DESSA CLASSE NA LISTA
        return null;
    }


}
