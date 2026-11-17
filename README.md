# SprintWise

**Organizador Acadêmico com Gestão de Projetos, Tarefas e Eventos**

Projeto final da disciplina **Programação Orientada a Objetos (TI0142)** — UFC, semestre 2026/2.

> **Status:** em desenvolvimento  
> **Entrega:** dia 29 ou dia 07 — data ainda a confirmar.

## 1. Visão geral

O SprintWise é uma aplicação voltada a estudantes universitários que precisam organizar atividades de diferentes disciplinas e acompanhar trabalhos acadêmicos com prazos variados.

A proposta é reunir em um único sistema:

- Disciplinas (cadeiras);
- Projetos acadêmicos;
- Tarefas;
- Eventos acadêmicos, como provas, seminários, apresentações e aulas práticas.

O usuário poderá consultar atividades por disciplina ou por data, acompanhar o andamento dos projetos e identificar riscos de atraso.

## 2. Tecnologias e execução

De acordo com a proposta de projeto, a aplicação será desenvolvida em **Java**, com armazenamento local em arquivos e interface inicial por **menus de terminal**. A proposta prevê adaptação para interface gráfica caso exista exigência formal.

| Parte | Definição da proposta |
|---|---|
| Linguagem | Java |
| Persistência | Arquivos locais |
| Interface inicial | Menus de terminal |
| Interface gráfica | Apenas se houver exigência |

As instruções de compilação e execução serão adicionadas quando a estrutura e as ferramentas do projeto estiverem definidas.

## 3. Funcionalidades (requisitos funcionais)

### RF01 — Gestão de disciplinas

- Cadastrar, consultar, editar e remover disciplinas.
- Cada disciplina deve ter nome e pode ter identificador ou código.
- Consultar as tarefas e os eventos associados a uma disciplina.
- Impedir ou alertar sobre exclusão de disciplina que ainda tenha atividades vinculadas.

### RF02 — Gestão de projetos e tarefas

- Cadastrar, consultar, editar e remover projetos e tarefas.
- Projetos podem conter título, descrição, data de criação, prazo final e disciplina associada.
- Tarefas devem conter título, prioridade, prazo, status e disciplina associada; a descrição é opcional.
- Tarefas que fizerem parte de um projeto também devem ser vinculadas a ele.
- Listar e filtrar tarefas por disciplina, projeto, status, prioridade ou prazo.

### RF03 — Gestão de eventos acadêmicos

- Cadastrar, consultar, editar e remover eventos.
- Exemplos: provas, seminários, apresentações e aulas práticas.
- Cada evento deve ter título, tipo, data, disciplina associada e, quando conhecidas, hora e descrição.
- Consultar eventos em ordem cronológica, por disciplina e próximos compromissos.
- Eventos são independentes das tarefas.

### RF04 — Progresso e risco de atraso

- Calcular o percentual de conclusão de cada projeto com base nas tarefas concluídas.
- Classificar o risco de atraso em baixo, médio ou alto.
- Destacar tarefas vencidas, tarefas próximas do vencimento e projetos que demandem atenção.
- Apresentar os motivos básicos da classificação.
- A análise de risco se aplica a projetos e tarefas com prazo, não a eventos pontuais.

### RF05 — Persistência e recuperação

- Salvar disciplinas, projetos, tarefas e eventos em arquivos locais, mantendo seus relacionamentos.
- Carregar os dados ao iniciar o programa.
- Atualizar o armazenamento após inclusões, edições e remoções.
- Tratar erros de leitura e gravação com mensagens compreensíveis.

### RF06 — Interface, consultas e relatórios

- Disponibilizar menus para navegar pelos módulos e realizar cadastros e consultas.
- Apresentar uma visão geral com tarefas pendentes, atrasadas, prazos próximos, próximos eventos e projetos de maior risco.
- Permitir consultas por disciplina.
- Exibir tarefas e eventos separadamente.
- Apresentar resumos simples de progresso por projeto.

## 4. Regras de negócio

- **RN01 — Dados obrigatórios:** disciplinas precisam de nome; projetos, tarefas e eventos precisam de título. Datas e prazos devem ser válidos quando exigidos.
- **RN02 — Associação com disciplinas:** toda tarefa e todo evento devem estar associados a uma disciplina cadastrada. Um projeto pode ter disciplina associada.
- **RN03 — Validação de datas:** a data final de um projeto não pode ser anterior à data de criação. O prazo de uma tarefa vinculada não pode ultrapassar o prazo final do projeto.
- **RN04 — Status:** uma tarefa só pode estar pendente, em andamento ou concluída.
- **RN05 — Progresso:** percentual = (quantidade de tarefas concluídas ÷ quantidade total de tarefas) × 100. Projetos sem tarefas têm progresso de 0%.
- **RN06 — Risco:** projetos concluídos não têm risco de atraso. Para projetos em andamento:
  - **Alto:** existe tarefa atrasada ou o prazo final está a até 3 dias e mais da metade das tarefas está pendente.
  - **Médio:** não é alto, o prazo final está a até 7 dias e há tarefas pendentes.
  - **Baixo:** demais casos.
  - A classificação deve ser recalculada quando tarefas ou prazos forem alterados.
- **RN07 — Eventos e tarefas:** eventos não contam como tarefas concluídas e não alteram diretamente o progresso de projetos.
- **RN08 — Integridade:** a exclusão de disciplina ou projeto não pode deixar tarefas ou eventos com referências inválidas. Atividades vinculadas devem ser removidas ou reassociadas antes da exclusão.
- **RN09 — Persistência:** alterações confirmadas devem ser gravadas em arquivos locais e recuperadas na próxima execução.

## 5. Divisão preliminar de responsabilidades

A proposta distribui os módulos entre três integrantes. A participação em testes, revisão e integração é compartilhada.

| Frente | Responsabilidades |
|---|---|
| Integrante 1 | RF01 e RF02: classes principais; disciplinas, projetos e tarefas; associações e validações de datas. |
| Integrante 2 | RF03 e RF04: eventos; cálculo de progresso; classificação de risco e identificação de atrasos. |
| Integrante 3 | RF05 e RF06: persistência em arquivos; menus e consultas; painéis e resumos; integração e tratamento de erros de persistência. |

## 6. Entregáveis

- [ ] Código-fonte
- [ ] Apresentação
- [ ] Relatório

## 7. Próximos passos

- [ ] Definir a estrutura de pacotes e classes.
- [ ] Definir o formato dos arquivos de persistência.
- [ ] Implementar e integrar os módulos RF01–RF06.
- [ ] Testar as regras de negócio RN01–RN09.
- [ ] Preparar a apresentação e o relatório.
- [ ] Confirmar a data final de entrega.

## 8. Documentação

A proposta acadêmica é a referência inicial para o escopo e os requisitos. Decisões técnicas posteriores e instruções de desenvolvimento devem ser registradas neste repositório.

---

*SprintWise — Projeto final de Programação Orientada a Objetos.*
