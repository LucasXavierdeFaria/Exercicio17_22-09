public class Main {
    public static void main(String[] args) {
        RedeSocial redeSocial = new RedeSocial();

        // Adicionar usuários
        redeSocial.adicionarUsuario("Alice");
        redeSocial.adicionarUsuario("Bob");
        redeSocial.adicionarUsuario("Carlos");

        // Buscar usuários
        Usuario alice = redeSocial.buscarUsuario("Alice");
        Usuario bob = redeSocial.buscarUsuario("Bob");

        // Alice adiciona Bob como amigo
        if (alice != null && bob != null) {
            alice.adicionarAmigo(bob);
        }

        // Alice publica uma mensagem
        if (alice != null) {
            alice.publicarMensagem("Estou adorando essa rede social!");
        }

        // Bob comenta no post de Alice
        if (alice != null && bob != null) {
            Post postDeAlice = alice.getPosts().get(0); // Pegando o primeiro post de Alice
            postDeAlice.adicionarComentario(bob, "Eu também estou gostando muito!");
        }

        // Exibir o post com os comentários
        if (alice != null) {
            Post postDeAlice = alice.getPosts().get(0);
            postDeAlice.exibirPost();
        }

        // Exibir todos os usuários
        redeSocial.exibirUsuarios();
    }
}
