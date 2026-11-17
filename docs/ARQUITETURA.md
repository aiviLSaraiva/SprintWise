# Arquitetura inicial

Este documento propõe uma organização inicial para o SprintWise com base na proposta acadêmica. É uma referência para a equipe revisar antes da implementação; não representa decisões já tomadas sobre bibliotecas, formato de arquivos ou ferramenta de build.

## Diretrizes

- Linguagem: Java.
- Interface inicial: menus de terminal.
- Persistência: arquivos locais.
- Separar regras de negócio, modelos, persistência e interação com o usuário.
- Manter eventos acadêmicos separados de tarefas.
- Preservar associações entre disciplinas, projetos, tarefas e eventos.
- Evitar adicionar funcionalidades fora do escopo aprovado.

## Estrutura sugerida

```text
src/
  main/
    java/
      sprintwise/
        model/        # Entidades e tipos do domínio
        service/      # Regras de negócio e casos de uso
        persistence/  # Leitura e gravação em arquivos
        ui/           # Menus e interação pelo terminal
  test/
    java/
      sprintwise/     # Testes automatizados
data/                 # Arquivos locais usados durante a execução
docs/
  ARQUITETURA.md
  PLANO_DE_TESTES.md
```

## Responsabilidade dos pacotes

| Pacote | Responsabilidade |
|---|---|
| `model` | Representar Disciplina, Projeto, Tarefa e Evento, além dos tipos necessários para status, prioridade e risco. |
| `service` | Aplicar validações, associações, cálculo de progresso e classificação de risco. |
| `persistence` | Carregar e salvar os dados em arquivos locais, mantendo os relacionamentos. |
| `ui` | Apresentar menus, receber entradas e exibir consultas e resumos. |

## Entidades candidatas

- **Disciplina:** nome e identificador/código opcional.
- **Projeto:** título, descrição, data de criação, prazo final e disciplina opcional.
- **Tarefa:** título, descrição opcional, prioridade, prazo, status, disciplina e projeto opcional.
- **Evento:** título, tipo, data, hora opcional, descrição opcional e disciplina.

Os atributos definitivos, tipos Java, identificadores e relacionamentos devem ser acordados pela equipe antes de implementar os construtores e métodos.

## Regras que precisam permanecer centralizadas

1. Validar os dados obrigatórios antes de cadastrar ou atualizar registros.
2. Não permitir tarefas ou eventos associados a disciplinas inexistentes.
3. Validar datas de projetos e tarefas em relação aos prazos.
4. Restringir o status de tarefa a pendente, em andamento ou concluída.
5. Calcular progresso somente com as tarefas do projeto; projeto sem tarefas tem progresso de 0%.
6. Aplicar a classificação de risco exatamente conforme RN06 da proposta.
7. Não contar eventos como tarefas nem incluí-los no progresso dos projetos.
8. Impedir exclusões que deixem associações inválidas.
9. Persistir alterações confirmadas e tratar falhas de leitura/gravação.

## Decisões ainda pendentes

- Versão do Java e JDK adotado pela equipe.
- Uso ou não de Maven/Gradle.
- Formato dos arquivos locais.
- Estratégia de identificadores e relacionamento entre entidades.
- Biblioteca ou abordagem para testes automatizados.

Não escolha essas opções isoladamente: registre a decisão acordada aqui e atualize as instruções de execução depois.
