package Desafios.DesafioSeis;

public class Ninjas {
    String Nome;
    int idade;
    String Vila;

    public Ninjas(String nome, int idade, String vila) {
        Nome = nome;
        this.idade = idade;
        Vila = vila;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getVila() {
        return Vila;
    }

    public void setVila(String vila) {
        Vila = vila;
    }
    @Override
    public String toString(){
        return "Nome: " + Nome + ", Idade: " + idade + ", Vila: " + Vila;
    }
}
