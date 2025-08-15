Orientação a objetos 

Conceitos

Orientação a Objetos é um paradgima de programação que organiza o código em objetos, que são instâncias de classes. Esses objetos combinam dados ( atributos) e comportamentos (métodos). Facilitando assim o reuso, a manuntenção e a organização do código usando conceitos como Herança, Encapsulamento, Polimorfismo e Abstração.

Classe: É um molde que define os atributos(dados) e métodos de um tipo de objeto.

Objeto: É uma instancia de uma classe, ou seja, é o que você cria com "new", presenta algo concreto com dados próprios

Método: É uma função dentro da classe que define um comportamento ou ação que o objeto pode executar

Herança: Usar Características de uma classe mãe em outras classes para assim poupar código e agilizar trabalho.

Polimorfismo: Criar uma função única que pode ser utilizada em diferentes classes com diferentes características.

Encapsulamento: Capacidade de proteger variaveis e classes para que não haja vazamento e mantendo assim protegida e encapsulada nossos objetos.

Interface: É um tipo de contrato que define métodos que uma classe deve implementar, mas sem fornecer a implementação. Ela é usada para garantir que classes diferentes sigam o mesmo comportamento, mesmo que tenham implementações diferentes

@override: Serve para indicar que um método está sendo sobrescrito de uma classe pai ou de uma interface. Ela ajuda o compilador a validar que você realmente está sobrescrevendo um método existente.

Construtor: É um método especial usado para inicializar objetos no momento em que são criados. Ele tem o mesmo nome da classe e não possui tipo de retorno. Pode receber parâmetros para definir valores iniciais dos atributos. Toda classe tem um construtor padrão, mas é possível criar construtores personalizados.

Classe abstrata: Serve para impedir que objetos sejam instanciados diretamente a partir dela. Pode conter métodos abstratos (sem corpo), que devem ser obrigatoriamente implementados pelas subclasses."

Enum: enum (abreviação de enumeration) é um tipo especial de classe usado para representar um conjunto fixo de constantes. Ele serve para nomes fixos e bem definido.