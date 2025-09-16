package NIvelIntermediario.record;

public record NinjaRecord(String nome, String email, String telefone) {
  // Todos os atributos sao finais e imutaveis
  // O construtor, getters, equals, hashcode e toString sao gerados automaticamente
  // Podemos adicionar metodos adicionais se necessario
  // Records nao tem setters
    public String emailUperCase() {
        return email.toUpperCase();
    }
}
