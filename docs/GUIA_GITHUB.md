# Guia do GitHub — SprintWise

Este guia foi feito para a equipe conseguir trabalhar no GitHub mesmo sem experiência anterior.

## 1. Abrir o projeto

1. Acesse https://github.com/aiviLSaraiva/SprintWise.
2. Entre na aba **Code** para ver os arquivos.
3. Para abrir uma pasta, clique no nome dela. Para voltar, use o caminho que aparece acima da lista de arquivos.

## 2. Escolher sua branch

Uma branch é uma área separada para fazer alterações sem mexer diretamente na versão principal.

1. Na página dos arquivos, encontre o botão que mostra o nome da branch atual (geralmente aparece como `main`).
2. Clique nele.
3. Escolha o seu nome: `marilia`, `amanda` ou `livia`.
4. Confira se o nome escolhido aparece no botão antes de editar qualquer arquivo.

**Importante:** não faça alterações diretamente na `main`.

## 3. Editar um arquivo

1. Primeiro, escolha sua branch.
2. Abra a pasta e o arquivo que deseja alterar.
3. Clique no ícone de lápis (**Edit this file**).
4. Faça as alterações no texto ou código.
5. Confira se não apagou sem querer outra parte do arquivo.

Se precisar criar um arquivo, entre na pasta onde ele deve ficar e use **Add file → Create new file**. Digite o caminho e o nome, por exemplo: `src/classes/Disciplina.java`.

## 4. Salvar a alteração (commit)

1. Depois de editar, clique em **Commit changes**.
2. Escreva uma frase curta explicando a mudança. Exemplo: `Criar classe Disciplina`.
3. Se aparecer a opção de escolher onde salvar, selecione **Commit directly to the [seu nome] branch**.
4. Confirme o commit.

O commit é um registro de uma alteração feita no projeto. Ele funciona como um ponto no histórico para a equipe consultar depois.

## 5. Enviar uma parte pronta para a versão principal

Quando uma alteração estiver pronta para ser revisada:

1. Abra a aba **Pull requests**.
2. Clique em **New pull request**.
3. Em **base**, escolha `main`.
4. Em **compare**, escolha sua branch (`marilia`, `amanda` ou `livia`).
5. Confira se as alterações exibidas são as que você quer enviar.
6. Dê um título claro, como `Adicionar cadastro de disciplinas`.
7. Clique em **Create pull request**.

O Pull Request (ou PR) é um pedido para que a equipe revise suas alterações antes de juntá-las à versão principal. Criar um PR não significa que ele já foi integrado.

## 6. Antes de terminar

- Confira se está na sua branch antes de editar.
- Não faça commit diretamente na `main`.
- Converse com a equipe antes de alterar uma parte que outra pessoa está desenvolvendo.
- Não envie senhas, dados pessoais ou arquivos que não fazem parte do projeto.
- Se tiver dúvida, peça para outra integrante revisar antes de abrir o PR.

## Resumo

**Escolher sua branch → editar → fazer commit na sua branch → abrir Pull Request para main → revisar em equipe.**
