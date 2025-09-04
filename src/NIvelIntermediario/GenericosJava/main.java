package NIvelIntermediario.GenericosJava;

public class main {
    public static void main(String[] args) {

        EquipamentoNinja shuriken = new EquipamentoNinja("Shuriken");
        EquipamentoNinja pergaminho = new EquipamentoNinja("pergaminho");
        Bolsa<EquipamentoNinja> bolsaNinja = new Bolsa<>();
        bolsaNinja.addEquipamento(shuriken);
        bolsaNinja.addEquipamento(pergaminho);
        System.out.println(bolsaNinja);


    }
}
