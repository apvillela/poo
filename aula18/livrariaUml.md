```mermaid

classDiagram

class Autor{
    -int idAutor
    -String nome
}

class Livro{
    -String idLivro
    -String titulo
    -AL<Autor> autores
    -AL <Edicao> edicao
}

class Editora{
    -String nome
    -String cidade
    -int idEditora
}

class Edicao{
    -int ano
    -int edicao
    -String isbn
    -Editora editora
    -int paginas
    -String idioma
}

Autor "1...*"--o"0...*" Livro
Livro "1"o--"1...*" Edicao
Edicao "0...*"o--"1" Editora