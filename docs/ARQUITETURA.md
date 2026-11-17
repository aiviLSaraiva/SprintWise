# Organização do SprintWise

Este documento explica onde ficará cada parte do código. A organização segue a proposta do projeto e pode ser ajustada se a equipe e o professor definirem algo diferente.

## Estrutura de pastas

```text
SprintWise/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── sprintwise/
│   │           ├── model/
│   │           ├── service/
│   │           ├── persistence/
│   │           └── ui/
│   └── test/
│       └── java/
│           └── sprintwise/
├── data/
├── docs/
└── README.md
```

## O que cada pasta guarda?

- **model:** classes que representam as informações do sistema, como Disciplina, Projeto, Tarefa e Evento.
- **service:** operações do programa, como validações e cálculo do progresso dos projetos.
- **persistence:** código responsável por salvar e carregar informações em arquivos.
- **ui:** menus e mensagens que aparecem para quem usa o programa.
- **test:** testes para conferir se as funcionalidades estão funcionando.
- **data:** arquivos usados para guardar os dados do SprintWise.
- **docs:** documentos que explicam e organizam o projeto.

## Como o programa será desenvolvido?

A proposta prevê Java, armazenamento em arquivos locais e interação por menus no terminal.

A equipe ainda precisa combinar detalhes como a versão do Java e o formato dos arquivos. Essas escolhas não devem ser presumidas antes da decisão do grupo.
