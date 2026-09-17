## O que é um objeto?
1. Um objeto é um pacote de software de estado e comportamento relacionados
2. Os objetos compartilham duas características: todos eles tem estado e comportamento
3. Os cães têm estado (nome, cor, raça, fome) e comportamento (latir, buscar, abanar o rabo)



### Exercício: observe um objeto e identifique os estados e comportamentos.

- **Objeto escolhido**: celular
- **Estados**: ligado, desligado, cor, peso, tamanho de tela, quantidade de botões, quantidade de câmeras, nível de volume
- **Comportamentos**: tirar foto, enviar mensagens, tocar musicas, ligar a lanterna, aumentar o volume, diminuir o volume

### Objetos de software consistem em estados e comportamento relacionado.
1. Um objeto armazena seu estado em "campos" (variáveis)
2. Um objeto expõe seu comportamento através de "métodos" (funções)
3. Os métodos operam no estado interno de um objeto e servem como meio de comunicação entre objeto a objeto
4. Ocultar estado interno e exigir que toda a interação seja realizada por meio de métodos de um objeto é conhecido como: encapsulamento

### Benefícios de agrupar códigos em objetos de software
1. Modularidade: o código-fonte de um objeto pode ser criado e mantido independentemente do código fonte de outros objetos. Um vez criado, um objeto pode ser facilmente passado dentro do sistema.
2. Ocultação de informações: ao interagir apenas com métodos de um objeto, os detalhes de sua implementação ficam ocultos do mundo exterior.
3. Reutilização de código: se um objeto já existir, você poderá utilizar esse objeto em seu programa. Isso permite que especialistas depurem/implementem/testem objetos complexos e especificos de tarefas, nos quais você pode confiar para executar seu próprio código.
4. Plugabilidade e facilidade de depuração: se um objeto for problemático, você pode simplesmente remove-lo do seu aplicativo e conectar em um objeto diferente como seu substituto. Isso é análogo ao mundo real, por exemplo: se um parafuso quebrar você substitui o parafuso e não a máquina inteira

## O que é uma classe?
1. Uma classe pode ser definida como a estrutura que define os estados e comportamentos os objetos vão ter
2. classe -> define; objeto -> instância
3. Um objeto é uma instância de uma classe

### Exemplo de uma classe: `Bicycle.java`

## Herança

1. Diferentes tipos de objetos geralmente tem uma quantidade de características comum entre si.
2. Bicicletas de montanha, bicicletas de estrada e bicicletas tandem, por exemplo compartilham características das bicicletas (velocidade atual, marcha atual, cor).
3. A POO permite que as classes herdem o estado e o comportamento comumente usado de outras classes.
4. Em um exemplo a `Bicycle.java` se torna a superclasse de `MountainBike.java`, `RoadBike.java` e `TandemBike.java`.
5. Uma observação: deve-se tomar cuidado para documentar adequadamente o estado e o comportamento que cada superclasse define

## Interface

1. É um grupo de métodos relacionados com corpos vazios.
2. Se o comportamento de uma bicicleta for especificado como interface pode aparecer da seguinte forma: exemplo em `IBicycle.java`.
3. Implementar uma interface permite que a classe seja mais formal e previsivel em relação aos seus comportamentos.
4. As interfaces formam um "contrato" entre a classe e o mundo exterior.

## Pacote

1. É um namespace que organiza um conjunto de classes e interfaces relacionadas.
2. A plataforma Java fornece uma enorme biblioteca de classes (um conjunto de pacotes). Essa biblioteca é conhecida como "Interface de Programação de Aplicativos" ou "API".
3. Exemplos de APIs: String, File, Socket, Objetos GUI, entre outros.

## Construtor

1. Bloco de código semelhante a métodos, utilizados para iniciar novos objetos.
2. A principal função é garantir que o objeto seja criado com um estado válido.
3. Em Java, é possível definir múltiplos construtores (sobrecarga) com diferentes listas.

## Declaração de variáveis membros

1. Variáveis membros de uma classe são chamadas de `fields`.
2. Variáveis em uma método ou em um bloco de código são chamadas de `variáveis locais`.
3. Variáveis em declaração de métodos são chamados de `parâmetros`

### Fields

> Declaração de variáveis **fields** são compostos por três componentes, em ordem:
1. Zero ou mais modificadores, como `public` ou `private`.
2. O tipo do `field`.
3. O nome do `field`.

### Controlando quem tem acesso a um membro

- `public`: o campo é acessível a partir de todas as classes.
- `private`: o campo é acessível apenas a partir de dentro da sua própria classe.

## Tipos de dados

> Os tipos de dados são divididos em **primitivos** (por valor) e **não primitivos** (por referência).  Existem oito tipos primitivos básicos, que armazenam valores simples como números inteiros, decimais, caracteres e booleanos. 

- Tipos primitivos:
1. **byte**: 8 bits, inteiro de -128 a 127.
2. **short**: 16 bits, inteiro de -32.768 a 32.767.
3. **int**: 32 bits, inteiro de -2.147.483.648 a 2.147.483.647.
4. **long**: 64 bits, inteiro para valores muito grandes.
5. **float**: 32 bits, ponto flutuante de precisão simples. 
6. **double**: 64 bits, ponto flutuante de precisão dupla.
7. **boolean**: 1 bit, valores `true` ou `false`.
8. **char**: 16 bits, único caractere Unicode. 

- Tipos não primitivos:
> Incluem String, Arrays e Classes, são criados pelo programador, podem ter valor nulo e possuem métodos associados.  Diferente dos primitivos, que têm tamanho fixo e são imutáveis, os não primitivos permitem a execução de operações complexas através de métodos.
