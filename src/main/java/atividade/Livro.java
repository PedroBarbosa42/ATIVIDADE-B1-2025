package atividade;
import java.util.Objects;


public class Livro {
    private String autor;
    private String editora;
    private int numeroPaginas;

    @Override
    public String getInformacoes() {
        String mensagem = "Titulo: " + this.getTitulo();
        mensagem += "Autor: " + this.getAutor();

        return mensagem;
    }
}