import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nome;
    private List<Usuario> amigos;
    private List<Post> posts;

    public Usuario(String nome) {
        this.nome = nome;
        this.amigos = new ArrayList<>();
        this.posts = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public List<Usuario> getAmigos() {
        return amigos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    // Método para adicionar um amigo
    public void adicionarAmigo(Usuario amigo) {
        if (!amigos.contains(amigo)) {
            amigos.add(amigo);
            System.out.println(amigo.getNome() + " agora é amigo de " + nome);
        } else {
            System.out.println(amigo.getNome() + " já é amigo de " + nome);
        }
    }

    // Método para publicar uma mensagem
    public void publicarMensagem(String mensagem) {
        Post post = new Post(this, mensagem);
        posts.add(post);
        System.out.println(nome + " publicou: " + mensagem);
    }
}
