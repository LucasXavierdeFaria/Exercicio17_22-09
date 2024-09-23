import java.util.ArrayList;
import java.util.List;

public class Post {
    private Usuario autor;
    private String mensagem;
    private List<Comentario> comentarios;

    public Post(Usuario autor, String mensagem) {
        this.autor = autor;
        this.mensagem = mensagem;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public String getMensagem() {
        return mensagem;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    // Método para adicionar um comentário ao post
    public void adicionarComentario(Usuario autor, String mensagemComentario) {
        Comentario comentario = new Comentario(autor, mensagemComentario);
        comentarios.add(comentario);
        System.out.println(autor.getNome() + " comentou: " + mensagemComentario);
    }

    // Exibir o post com os comentários
    public void exibirPost() {
        System.out.println("Post de " + autor.getNome() + ": " + mensagem);
        for (Comentario comentario : comentarios) {
            System.out.println(" - " + comentario.getAutor().getNome() + " comentou: " + comentario.getMensagem());
        }
    }
}
