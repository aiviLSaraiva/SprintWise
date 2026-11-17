# Como trabalhar no SprintWise

Este guia resume a combinação da equipe para trabalhar no mesmo repositório.

## Branches

- **main:** versão principal e integrada do projeto.
- **marilia:** espaço de trabalho da Marília.
- **amanda:** espaço de trabalho da Amanda.
- **livia:** espaço de trabalho da Lívia.

Cada integrante deve fazer suas alterações na própria branch, e não diretamente na `main`. O nome da branch identifica o espaço de trabalho, mas não impede que as integrantes ajudem umas às outras.

## Fluxo simples

1. Abra o repositório SprintWise no GitHub.
2. No seletor de branches, escolha sua branch.
3. Abra o arquivo que deseja alterar e use o botão de edição (ícone de lápis).
4. Faça a alteração e confira o resultado.
5. Na parte de confirmação, escreva uma mensagem curta explicando o que mudou e confirme o commit na sua própria branch.
6. Quando uma parte estiver pronta para ser integrada, abra um Pull Request da sua branch para `main`.
7. Outra integrante confere as alterações. Depois da revisão, a equipe decide se pode integrar o Pull Request.

O passo a passo com mais detalhes está em [docs/GUIA_GITHUB.md](docs/GUIA_GITHUB.md).

## Cuidados

- Não trabalhe diretamente na `main`.
- Antes de editar, confira se está na sua branch.
- Não apague nem substitua o trabalho de outra integrante sem conversar com ela.
- Não coloque senhas, dados pessoais ou arquivos temporários no repositório.
- Se uma regra do projeto mudar, converse com a equipe e atualize a documentação.
- Use mensagens de commit curtas, como:
  - `feat: cadastrar disciplinas`
  - `fix: corrigir validação de prazo`
  - `docs: explicar a pasta classes`
