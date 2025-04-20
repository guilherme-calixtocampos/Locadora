import br.com.estudo.locadora.models.Filme;
import br.com.estudo.locadora.models.Serie;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAdmin {
    public void executa() {
        Scanner insere = new Scanner(System.in);
        Filme filme = new Filme();
        Serie serie = new Serie();
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        ArrayList<Serie> listaSeries = new ArrayList<>();
        boolean encontrado = false;

        int escolhaAdm = 0;

        while (escolhaAdm != 8) {
            System.out.println("\n--------------------Menu Administrador--------------------");
            System.out.println("1 - Cadastrar filme");
            System.out.println("2 - Cadastrar série");
            System.out.println("3 - Listar filmes");
            System.out.println("4 - Listar séries");
            System.out.println("5 - Filtrar filme por nome");
            System.out.println("6 - Filtrar serie por nome");
            System.out.println("7 - Filtrar por filmes/series ativos");
            System.out.println("8 - Sair");

            System.out.print("Qual opção você quer? ");
            escolhaAdm = insere.nextInt();
            insere.nextLine(); // Consumir quebra de linha do nextInt()

            switch (escolhaAdm) {
                case 1:


                    System.out.println("Insira algumas informações do filme:");
                    System.out.print("Nome do filme: ");
                    filme.setNome(insere.nextLine());

                    System.out.print("Duração (min): ");
                    filme.setDuracao(insere.nextInt());

                    System.out.print("Idade mínima: ");
                    filme.setIdadePermitida(insere.nextInt());

                    System.out.print("Valor: ");
                    filme.setPreco(insere.nextDouble());

                    filme.setStatus(true);

                    listaFilmes.add(filme);

                    System.out.println("✅ Filme cadastrado com sucesso!");
                    break;

                case 2:


                    System.out.println("Insira algumas informações da série:");
                    System.out.print("Nome da série: ");
                    serie.setNome(insere.nextLine());

                    System.out.print("Quantidade de temporadas: ");
                    serie.setQtdeTemporadas(insere.nextInt());

                    System.out.print("Quantidade de episódios: ");
                    serie.setQtdeEpisodios(insere.nextInt());

                    System.out.print("Duração por episódio (min): ");
                    serie.setDuracaoEpisodio(insere.nextInt());

                    System.out.print("Idade mínima: ");
                    serie.setIdadePermitida(insere.nextInt());

                    System.out.print("Valor: ");
                    serie.setPreco(insere.nextDouble());

                    serie.setStatus(true);

                    listaSeries.add(serie);

                    System.out.println("✅ Série cadastrada com sucesso!");
                    break;

                case 3:
                    System.out.println("🎬 Lista de Filmes:");
                    for (Filme f : listaFilmes) {
                        System.out.println(f.exibeFicha());
                        System.out.println("Duração: " + f.getDuracao() + " minutos");
                        System.out.println("--------------------------------");
                    }
                    break;

                case 4:
                    System.out.println("📺 Lista de Séries:");
                    for (Serie s : listaSeries) {
                        System.out.println(s.exibeFicha());
                        System.out.println("Episódios: " + s.getQtdeEpisodios());
                        System.out.println("Temporadas: " + s.getQtdeTemporadas());
                        System.out.println("Duração total: " + s.calculaDuracaoTemporada() + " minutos");
                        System.out.println("--------------------------------");
                    }
                    break;
                case 5:
                    System.out.println("Digite o nome do filme que você quer procurar: ");
                    String filmeFiltra = insere.nextLine();

                    for (Filme Filme : listaFilmes) {
                        if (filme.getNome().equalsIgnoreCase(filmeFiltra)) {
                            System.out.println("🎬 Filme encontrado!");
                            System.out.println(filme.exibeFicha());
                            encontrado = true;
                        } else {
                            System.out.println("🚫 Filme não encontrado.");
                        }
                    }
                    break;
                case 6:
                    System.out.println("Digite o nome do filme que você quer procurar: ");
                    String serieFiltra = insere.nextLine();

                    for (Serie Serie : listaSeries) {
                        if (serie.getNome().equalsIgnoreCase(serieFiltra)) {
                            System.out.println("🎬 Serie encontrada!");
                            System.out.println(serie.exibeFicha());
                            encontrado = true;

                        } else {
                            System.out.println("🚫 Serie não encontrada.");
                        }
                    }
                    break;

                case 7:

                    for (Serie Serie : listaSeries) {
                        if (serie.isStatus() == true) {
                            System.out.println("Serie: " +serie.getNome());
                        } else {
                            System.out.println("🚫 Não há serie ativa no momento");
                        }
                    }
                    for (Filme Filme : listaFilmes) {
                        if (filme.isStatus() == true) {
                            System.out.println("Filme: " +filme.getNome());
                        } else {
                            System.out.println("🚫 Não há filme ativo no momento");
                        }
                    }

                    break;
                case 8:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }

    }
}
