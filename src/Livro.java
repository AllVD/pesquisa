/*
** Version: 1.2
** Date: 15/08/2024
** Author: AlvD
*/
public class Livro {
    // Atributos que representam as características de um livro
    
    private String titulo;

    private String autor;

    private int anoPublicacao;
    // Construtor da classe Livro que inicializa os atributos com os valores fornecidos
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo; // Inicializa o título do livro
        this.autor = autor; // Inicializa o autor do livro
        this.anoPublicacao = anoPublicacao; // Inicializa o ano de pulbicação do livro
    }
    // Método getter para o atributo 'titulo'
    // Retorna o título do livro
    public String getTitulo() {
        return titulo;
    }
    // Método getter para o atributo 'autor'
    // Retorna o autor do livro
    public String getAutor(){
        return autor;
    }
    // Método getter para o atributo 'publicação'
    // Retorna o ano de publicação do livro
    public int getAnoPublicacao(){
        return anoPublicacao;
    }
    // Sobrescreve o método toString para retornar uma representação textual do livro
    @Override
    public String toString(){
        return "Livro{" +
        "titulo='" + titulo + '\'' + // Representa o título do livro
        ", autor='" + autor + '\'' + // Representa o autor do livro
        ", anoPublicacao=" + anoPublicacao + // Representa o ano de publicação do livro
        '}';
    }
}
