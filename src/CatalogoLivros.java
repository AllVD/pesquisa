/*
** Version: 1.4
** Date: 15/08/2024
** Author: AlvD
*/
import java.util.ArrayList;
import java.util.List;
// Classe que representa um catálogo de livros
public class CatalogoLivros {
    // Atributo que armazena a lista de livros do catálogo
    private List<Livro> livroList;
    // Construtor da classe que inicializa a lista de livros
    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }
    // Método para adicionar um livro ao catálogo
    // Recebe como parâmetros o título, o autor e o ano de publicação do livro
    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }
    // Método para pesquisar livros por autor
    // Recebe o nome do autor como parâmetro e retorna uma lista de livros escritos por ele
    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();
        // Verifica se a lista de livros não está vazia
        if (!livroList.isEmpty()) {
            // Percorre todos os livros na lista
            for(Livro l : livroList){
                // Verifica se o autor do livro corresponde ao autor buscado (ignorando maiúsculas/minúsculas)
                if (l.getAutor().equalsIgnoreCase(autor)){
                     // Adiciona o livro à lista de resultados
                    livrosPorAutor.add(l);    
                }
            }
        }
        // Retorna a lista de livros encontrados para o autor especificado
        return livrosPorAutor;
    }
    // Método para pesquisar livros por intervalo de anos
    // Recebe como parâmetros o ano inicial e o ano final do intervalo
    // Retorna uma lista de livros publicados dentro desse intervalo
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        // Verifica se a lista de livros não está vazia
        if(!livroList.isEmpty()){
            // Percorre todos os livros na lista
            for(Livro l : livroList){
                // Verifica se o ano de publicação do livro está dentro do intervalo especificado
                if(l.getAnoPublicacao()>= anoInicial && l.getAnoPublicacao() <= anoFinal){
                     // Adiciona o livro à lista de resultados
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
         // Retorna a lista de livros encontrados dentro do intervalo de anos especificado
        return livrosPorIntervaloAnos;
    }
    // Método para pesquisar um livro por título
    // Recebe como parâmetro o título do livro e retorna o livro encontrado
    public Livro pesquisargit stPorTitulo(String titulo){
        // Verifica se a lista de livros não está vazia
        Livro livroPorTitulo = null;
        // Percorre todos os livros na lista
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
                // Verifica se o título do livro corresponde ao título buscado (ignorando maiúsculas/minúsculas)
                if(l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        // Retorna o livro encontrado ou null se nenhum livro for encontrado
        return livroPorTitulo;
    }
    // Método principal para testar o catálogo de livros
    public static void main(String[] args){
        // Adiciona livros ao catálogo
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 1998);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1998);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 1999);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2000);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 2001);
    
        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(1999, 2001));
        System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }

}
