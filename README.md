# Enunciado: Gerenciamento de Empréstimos de Livros em uma Biblioteca

Você foi contratado para desenvolver um sistema simples de gerenciamento de empréstimos de livros para uma biblioteca. A biblioteca possui um catálogo de livros e precisa acompanhar quais livros foram emprestados, a quem e quando devem ser devolvidos.

### Sua tarefa é criar um programa em Java que:

- Registre o catálogo de livros: Utilize um array para armazenar os títulos dos livros disponíveis na biblioteca.
- Registre os empréstimos: Utilize dois arrays adicionais para armazenar as informações dos empréstimos - um para os nomes dos leitores e outro para a data de devolução dos livros (use o formato "dd/MM/yyyy").

### Permita realizar as seguintes operações:
- Listar todos os livros disponíveis no catálogo.
- Emprestar um livro: Solicite ao usuário o título do livro e o nome do leitor, e registre a data de devolução.
- Listar todos os empréstimos atuais: Exiba os títulos dos livros emprestados, os nomes dos leitores e as datas de devolução.
- Devolver um livro: Solicite ao usuário o título do livro a ser devolvido e remova o registro do empréstimo.

### Regras:
- Não é permitido emprestar um livro que já está emprestado.
- Um livro devolvido volta a ficar disponível no catálogo.
- Inicialmente, o catálogo deve conter pelo menos 5 livros.