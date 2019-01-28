import java.util.ArrayList;
import java.util.List;

//OBJECT STRUCTURE
public class Loja {

    private List<Equipamento> eqList = new ArrayList<>();

    public void addEquipamento(Equipamento e) {
        eqList.add(e);
    }

    public List<Equipamento> getEquipamentoList(){
        return eqList;
    }

}
