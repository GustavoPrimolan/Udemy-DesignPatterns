import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ZooImpl extends Zoo {


    private List<Animal> animalList = new ArrayList<>();

    @Override
    public List<Animal> getAnimais() {
        return animalList;
    }

    @Override
    public void addAnimal(Animal a) {
        animalList.add(a);
    }

    @Override
    public void removeAnimal(Animal a) {
        animalList.remove(a);
    }

    @Override
    public Iterator<Animal> createIterator() {
        return animalList.iterator();
    }
}
