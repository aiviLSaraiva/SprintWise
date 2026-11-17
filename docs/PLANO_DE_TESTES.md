# Plano inicial de testes

Este plano transforma os requisitos e regras de negócio da proposta em verificações. Os casos abaixo são cenários a implementar; não indicam que o sistema já esteja pronto ou testado.

## Disciplinas (RF01)

- [ ] Cadastrar disciplina com nome válido.
- [ ] Rejeitar disciplina sem nome.
- [ ] Consultar, editar e remover disciplina sem atividades vinculadas.
- [ ] Impedir ou alertar a remoção de disciplina que ainda tenha tarefas ou eventos.
- [ ] Exibir as atividades associadas à disciplina.

## Projetos e tarefas (RF02)

- [ ] Cadastrar, consultar, editar e remover projeto e tarefa.
- [ ] Rejeitar projeto ou tarefa sem título.
- [ ] Permitir descrição opcional.
- [ ] Validar status apenas como pendente, em andamento ou concluída.
- [ ] Associar tarefa a uma disciplina existente.
- [ ] Permitir filtros por disciplina, projeto, status, prioridade e prazo.
- [ ] Rejeitar prazo final de projeto anterior à data de criação.
- [ ] Rejeitar prazo de tarefa vinculada posterior ao prazo final do projeto.

## Eventos (RF03)

- [ ] Cadastrar, consultar, editar e remover evento.
- [ ] Rejeitar evento sem título ou sem disciplina válida.
- [ ] Consultar eventos em ordem cronológica.
- [ ] Consultar eventos por disciplina e próximos compromissos.
- [ ] Confirmar que eventos não são cadastrados como tarefas.

## Progresso e risco (RF04 / RN05 / RN06)

- [ ] Projeto sem tarefas apresenta progresso de 0%.
- [ ] Projeto com todas as tarefas concluídas apresenta progresso de 100%.
- [ ] Projeto com tarefas concluídas e não concluídas apresenta a proporção correta.
- [ ] Projeto concluído não recebe classificação de risco de atraso.
- [ ] Projeto em andamento com tarefa atrasada recebe risco alto.
- [ ] Aplicar os limites de três e sete dias conforme RN06.
- [ ] Exibir o motivo básico da classificação.
- [ ] Recalcular o risco após alteração de tarefa ou prazo.
- [ ] Confirmar que eventos não alteram o percentual de conclusão.

## Persistência (RF05 / RN09)

- [ ] Salvar disciplinas, projetos, tarefas e eventos.
- [ ] Encerrar e iniciar novamente o programa e verificar a recuperação dos dados.
- [ ] Preservar associações entre registros após carregar os arquivos.
- [ ] Tratar arquivo ausente, conteúdo inválido e falhas de leitura/gravação com mensagens compreensíveis.

## Interface e consultas (RF06)

- [ ] Navegar pelos menus de cada módulo.
- [ ] Exibir tarefas pendentes e atrasadas.
- [ ] Exibir prazos próximos e próximos eventos.
- [ ] Destacar projetos de maior risco.
- [ ] Consultar atividades por disciplina.
- [ ] Exibir tarefas e eventos separadamente.
- [ ] Exibir resumo de progresso por projeto.

## Integridade (RN08)

- [ ] Não permitir que a remoção de disciplina deixe tarefas ou eventos sem associação válida.
- [ ] Não permitir que a remoção de projeto deixe tarefas com referência inválida.
- [ ] Solicitar confirmação e exigir remoção ou reassociação das atividades vinculadas, conforme a proposta.

## Registro da execução

Ao executar cada teste, a equipe pode registrar aqui a data, o responsável, o resultado (aprovado/reprovado) e, se houver falha, o link para a issue correspondente.
