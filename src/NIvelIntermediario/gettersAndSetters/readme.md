# Resumo sobre Getters e Setters em Java

Getters e setters são métodos especiais usados para acessar e modificar os valores dos atributos privados de uma classe em Java. Eles promovem o encapsulamento, permitindo controlar como os dados de um objeto são acessados e alterados. O uso de getters e setters ajuda a proteger os dados, podendo adicionar validações ou lógica extra ao acessar ou modificar atributos.

## Exemplo de código em Java utilizando getters e setters

```java
public class Ninja {
    private String nome;
    private int idade;

    // Getter para nome
    public String getNome() {
        return nome;
    }

    // Setter para nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Getter para idade
    public int getIdade() {
        return idade;
    }

    // Setter para idade
    public void setIdade(int idade) {
        this.idade = idade;
    }
}

// Exemplo de uso
public class Main {
    public static void main(String[] args) {
        Ninja ninja = new Ninja();
        ninja.setNome("Naruto");
        ninja.setIdade(17);
        System.out.println(ninja.getNome()); // Naruto
        System.out.println(ninja.getIdade()); // 17
    }
}
```

