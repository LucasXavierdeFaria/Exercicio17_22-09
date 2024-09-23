import java.util.ArrayList;
import java.util.List;

public class RedeSocial {
    private List<Usuario> usuarios;

    public RedeSocial() {
        this.usuarios = new ArrayList<>();
    }

    // Método para adicionar um novo usuário à rede social
    public void adicionarUsuario(String nome) {
        Usuario usuario = new Usuario(nome);
        usuarios.add(usuario);
        System.out.println("Usuário " + nome + " foi adicionado à rede social.");
    }

    // Método para buscar um usuário pelo nome
    public Usuario buscarUsuario(String nome) {
        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equalsIgnoreCase(nome)) {
                return usuario;
            }
        }
        System.out.println("Usuário " + nome + " não encontrado.");
        return null;
    }

    // Método para exibir todos os usuários da rede
    public void exibirUsuarios() {
        System.out.println("Usuários na rede social:");
        for (Usuario usuario : usuarios) {
            System.out.println("- " + usuario.getNome());
        }
    }
}
