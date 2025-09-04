package NIvelIntermediario.GenericosJava;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Bolsa <T> {
     private List<T> Equipamentos;

    public Bolsa() {
         this.Equipamentos = new ArrayList<>();
    }

    public List<T> getEquipamentos() {
        return Equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.Equipamentos = equipamentos;
    }
    public void addEquipamento(T equipamento){
        Equipamentos.add(equipamento);
    }
    @Override
    public String toString() {
        return "Na bolsa tem: " + Equipamentos;
    }
}
