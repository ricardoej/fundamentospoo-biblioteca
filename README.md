# Sistema de Gerenciamento de Biblioteca

# Sistema de Gerenciamento de Biblioteca em Java

## Descrição
Vamos criar um sistema de gerenciamento de biblioteca em Java. O sistema deve ser capaz de lidar com livros, autores, usuários e empréstimos. Cada livro tem um título, um autor, uma categoria e uma quantidade disponível. Cada autor tem um nome e uma lista de livros escritos por ele. Cada usuário tem um nome, um número de identificação e uma lista de livros que ele pegou emprestado. Cada empréstimo está associado a um usuário e a um livro, e possui uma data de retirada e uma data de devolução prevista.

## Classes
- Livro: Representa um livro na biblioteca.
- Autor: Representa um autor de livros.
- Usuario: Representa um usuário da biblioteca.
- Emprestimo: Representa um empréstimo de livro.
- CategoriaLivro: Representa uma categoria de livro.
- Biblioteca: Classe principal que gerencia o sistema de biblioteca.
- Main: Classe principal para iniciar o programa.

## Requisitos
- A classe Livro deve conter os seguintes atributos: título, autor, categoria e quantidade disponível.
- A classe Autor deve ter um atributo para o nome do autor e uma lista de livros que ele escreveu.
- A classe Usuario deve ter atributos para o nome, número de identificação e uma lista de livros emprestados.
- A classe Emprestimo deve conter referências para o usuário, o livro, a data de retirada e a data de devolução prevista.
- A classe CategoriaLivro deve representar as categorias disponíveis para os livros na biblioteca.
- A classe Biblioteca deve ter métodos para adicionar livros, autores, usuários e empréstimos, verificar a disponibilidade de um livro, emprestar um livro para um usuário, devolver um livro, etc.
- A classe Main deve conter o método main() para iniciar o programa e interagir com o usuário.

## Exercício
Implemente as classes mencionadas acima e um programa principal que demonstre o funcionamento do sistema de gerenciamento de biblioteca. O programa deve permitir ao usuário realizar as seguintes operações:
- Adicionar um novo livro à biblioteca.
- Adicionar um novo autor à biblioteca.
- Registrar um novo usuário da biblioteca.
- Realizar um empréstimo de livro para um usuário.
- Devolver um livro emprestado.
- Visualizar a lista de livros disponíveis na biblioteca.
- Visualizar a lista de empréstimos pendentes.
- Visualizar as informações de um usuário específico, incluindo os livros que ele pegou emprestado.
- Visualizar as informações de um livro específico, incluindo quem o pegou emprestado e a data de devolução prevista.

## Observações
- Implemente métodos de validação para garantir que as operações de empréstimo e devolução sejam realizadas corretamente.
- Utilize as classes de data disponíveis em Java para manipular datas de empréstimo e devolução.
- Mantenha o código limpo e bem organizado, com comentários explicativos sempre que necessário.
