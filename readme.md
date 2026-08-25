# OOP Roadmap

Repositório de estudos para construir uma base sólida em **Java**, **Programação Orientada a Objetos**, **SOLID** e **Design Patterns** — do básico ao avançado — usando uma estrutura **multi-módulo Maven**, seguindo práticas modernas de engenharia de software.

## Objetivo

Cada fase do aprendizado vive em um módulo Maven isolado, compilável e testável de forma independente. A ideia é simular a organização de um repositório profissional real: um POM pai centraliza configuração e versões, e cada módulo representa uma etapa evolutiva do roadmap.

## Pré-requisitos

- **JDK 21** instalado (`java -version` deve reportar 21.x).
- **Não é necessário ter o Maven instalado globalmente** — o projeto usa o [Maven Wrapper](https://maven.apache.org/wrapper/), que baixa automaticamente a versão correta do Maven na primeira execução.

## Como buildar

Na raiz do projeto:

```bash
./mvnw clean install
```

No Windows:

```bash
mvnw.cmd clean install
```

Isso compila e roda os testes de todos os módulos declarados no `pom.xml` raiz, na ordem correta de dependências (reactor build).

Para buildar/testar um módulo específico:

```bash
./mvnw -pl 01-fundamentals-java clean install
```

## Estrutura do repositório

```
oop-roadmap/
├── pom.xml                    # POM pai: packaging=pom, gerencia versões e plugins comuns
├── mvnw / mvnw.cmd             # Maven Wrapper
├── .mvn/                       # Configuração do Wrapper
└── 01-fundamentals-java/       # Módulo 1 do roadmap
    ├── pom.xml                 # POM do módulo (herda do pai)
    └── src/
        ├── main/java/...
        └── test/java/...
```

Cada módulo novo segue o mesmo padrão: pasta de topo na raiz do repositório, com seu próprio `pom.xml` referenciando o POM pai via `<parent>`.

## Roadmap de módulos

| Módulo | Tema |
|---|---|
| `01-fundamentals-java` | Sintaxe, tipos primitivos vs. referência, controle de fluxo, arrays, I/O básico |
| `02-oop-essentials` | Classes, objetos, encapsulamento, herança, polimorfismo, abstração |
| `03-data-structures` | Collections (List/Set/Map/Deque), generics, estruturas próprias (pilha, fila, árvore) |
| `04-solid-principles` | Os cinco princípios SOLID aplicados em Java |
| `05-design-patterns` | Padrões de projeto criacionais, estruturais e comportamentais |
| `06-advanced-java` | Streams, concorrência, NIO e tópicos avançados |

Novos módulos só são adicionados ao `<modules>` do POM pai quando já existem fisicamente no repositório, para manter o build sempre íntegro a cada commit.

## Convenções do repositório

- Cada módulo herda do pai configuração de compilador (`maven.compiler.release`), encoding e dependência de testes (JUnit 5) — não redeclare o que já é herdado.
- Formatação de código segue as regras definidas em [`.editorconfig`](.editorconfig).
- Commits seguem o padrão [Conventional Commits](https://www.conventionalcommits.org/).
