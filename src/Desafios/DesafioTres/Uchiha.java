package Desafios.DesafioTres;

public class Uchiha extends Ninja {
    String habilidadeEspecial;

    public void mostrarHabilidadeEspecial(){
        System.out.println("Especial: " + habilidadeEspecial);
    }


    @Override
    public void mostrarInformacoes() {
        // Chama a versão original da classe Ninja
        super.mostrarInformacoes();

        // Depois adiciona a parte extra da subclasse
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

}
