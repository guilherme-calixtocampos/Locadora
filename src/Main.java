import br.com.estudo.locadora.models.Filme;
import br.com.estudo.locadora.models.Serie;
import br.com.estudo.locadora.models.Usuario;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner insere = new Scanner(System.in);
        System.out.println("Olá, seja bem-vindo(a) à Locadora Filmes Sorocabanos");
        System.out.println("Faça login");

        Usuario usuario = new Usuario();

        System.out.println("Login: ");
        usuario.setUsuario(insere.nextLine());

        System.out.println("Senha: (digite ESQUECI A SENHA se não lembrar da senha");
        usuario.setSenha(insere.nextLine());

        if (usuario.getSenha().equals("esqueci a senha")) {
            usuario.trocaSenha();
        }

        // Verifica se login e senha batem
        usuario.verificaUsuario(usuario.getUsuario());
        usuario.verificaSenha(usuario.getSenha());

        // NOVO: Agora verifica se é admin
        if (usuario.isAdmin()) {
            MainAdmin admin = new MainAdmin();
            admin.executa();
            return; // Encerra o programa para admin, ou você pode abrir um menu de admin depois
        }

        // Se não for admin, continua cadastro normalmente
        System.out.println("-----------------Escolha a ação que você gostaria de executar-----------------");
        System.out.println("1 - Ver catalogo");
        System.out.println("2 - Filmes do meu plano");
        System.out.println("3 - Series no meu plano");
        System.out.println("4 - Sair");

        int escolhaUsuario = insere.nextInt();
        Filme filme = new Filme();
        Serie serie = new Serie();
        switch (escolhaUsuario) {
            case 1:
                System.out.println("Mostrando catálogo: ");
                System.out.println(filme);
                System.out.println(serie);
            break;
            case 2:
                System.out.println("Filmes do seu plano");
                System.out.println(filme);
            break;
            case 3:
                System.out.println("Series do seu plano");
                System.out.println(serie);
            break;
            case 4:
                System.out.println("Saindo...");
            break;
        }

    }
}
