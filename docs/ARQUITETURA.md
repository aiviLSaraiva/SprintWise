# Organização do SprintWise

Este documento mostra onde cada parte do projeto deve ficar. A ideia é manter uma estrutura simples, separada por responsabilidade.

## Estrutura de pastas

```text
SprintWise/
├── src/
│   ├── classes/
│   ├── servicos/
│   ├── menus/
│   └── persistencia/
├── testes/
├── data/
├── docs/
├── README.md
└── .gitignore
```

## O que fica em cada pasta?

- **src/classes:** classes que representam as informações do sistema, como Disciplina, Projeto, Tarefa e Evento.
- **src/servicos:** regras e operações do programa, como validar datas, calcular progresso e identificar atrasos.
- **src/menus:** menus e mensagens usados para interagir com o programa pelo terminal.
- **src/persistencia:** código que salva e carrega as informações em arquivos.
- **testes:** códigos usados para verificar se as funcionalidades estão funcionando.
- **data:** arquivos com os dados salvos pelo SprintWise.
- **docs:** documentos de organização, arquitetura, testes e uso do GitHub.

## Como as partes se relacionam?

Os menus recebem as escolhas de quem usa o programa e chamam os serviços necessários. Os serviços aplicam as regras do sistema e trabalham com as classes. Quando for necessário guardar ou recuperar informações, os serviços ou a parte responsável chamam a persistência.

## Tecnologias

A proposta prevê Java, armazenamento local em arquivos e menus no terminal. A versão do Java e o formato dos arquivos ainda serão definidos pela equipe.

## Atenção ao Java

Os nomes das pastas de código devem combinar com os nomes dos pacotes declarados nos arquivos Java. Por exemplo, um arquivo dentro de `src/classes` deverá usar o pacote `classes`. Se a equipe decidir usar uma ferramenta de compilação ou uma estrutura diferente, esta organização poderá ser adaptada.
