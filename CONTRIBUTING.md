# Como contribuir com o SprintWise

Estas orientações ajudam os três integrantes a trabalhar no mesmo repositório sem sobrescrever alterações uns dos outros.

## Fluxo recomendado

1. Atualize sua cópia local a partir da branch `main`.
2. Crie uma branch para uma tarefa específica.
3. Faça alterações pequenas e relacionadas ao objetivo da branch.
4. Execute os testes disponíveis antes de enviar.
5. Abra um Pull Request para `main`, descrevendo o que mudou e quais requisitos atende.
6. Peça revisão de outro integrante e resolva os comentários antes de integrar.

## Nome de branches

Use nomes curtos e descritivos, por exemplo:

- `feat/cadastro-disciplinas`
- `feat/gestao-tarefas`
- `feat/eventos-academicos`
- `feat/analise-risco`
- `feat/persistencia-arquivos`
- `docs/relatorio`
- `fix/validacao-prazo`

## Mensagens de commit

Prefira mensagens objetivas, por exemplo:

- `feat: cadastrar disciplinas`
- `fix: validar prazo de tarefa`
- `test: cobrir cálculo de progresso`
- `docs: atualizar instruções de execução`

## Integração

- Não faça commit de arquivos compilados, configurações pessoais da IDE ou dados locais de execução.
- Não altere regras de negócio sem conferir a proposta e conversar com a equipe.
- Ao mudar uma regra, atualize os testes e a documentação relacionada.
- Evite misturar refatorações grandes com implementação de funcionalidades.
- Registre decisões técnicas compartilhadas na documentação do repositório.
