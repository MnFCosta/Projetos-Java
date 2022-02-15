import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListaBanda ListaBand = new ListaBanda();
        ListaMusic ListaMusic = new ListaMusic();

        int idBanda = 0;
        int idMusica = 0;

        // Scanner e variável de controle option
        int option = 1;
        Scanner input = new Scanner(System.in);
        {

            // loop de opções para o usuário
            while (option != 0) {
                System.out.println(
                        "\nDigite:"
                                + "\n0 - para sair"
                                + "\n1 - para cadastrar uma nova banda"
                                + "\n2 - para listar todas as bandas cadastradas"
                                + "\n3 - para editar uma banda"
                                + "\n4 - para remover uma banda"
                                + "\n5 - para cadastrar uma nova musica"
                                + "\n6 - para listar todas as musicas cadastradas"
                                + "\n7 - para editar uma musica"
                                + "\n8 - para remover uma musica");
                option = Integer.valueOf(input.nextLine());

                switch (option) {

                    case 0:
                        System.out.println("Encerrando...");
                        return;

                    case 1:
                        Band novaBanda = new Band();
                        novaBanda.id = idBanda;
                        System.out.println("Qual e o nome da banda?");
                        novaBanda.banda = input.nextLine();
                        System.out.println("Qual e a nacionalidade da banda");
                        novaBanda.Nacionalidade = input.nextLine();
                        System.out.println("Qual e o nome do frontman?");
                        novaBanda.Frontman = input.nextLine();
                        System.out.println("Qual foi o ano de formacao da banda?");
                        novaBanda.Anoformacao = Integer.valueOf(input.nextLine());
                        System.out.println("Qual e o genero musical da banda?");
                        novaBanda.GeneroMusica = input.nextLine();
                        ListaBand.inserir(novaBanda);
                        idBanda++;
                        break;

                    case 2:
                        ListaBand.listar();
                        break;

                    case 3:
                        System.out.println("Digite o id da banda que deseja editar: ");
                        idBanda = Integer.valueOf(input.nextLine());
                        ListaBand.editar(idBanda, input);
                        System.out.println("Banda editada com sucesso");
                        break;

                    case 4:
                        System.out.println("Digite o id da banda que deseja remover: ");
                        ListaBand.listar();
                        idBanda = Integer.valueOf(input.nextLine());
                        ListaBand.remover(idBanda);
                        System.out.println("Banda removida com sucesso.");
                        break;

                    case 5:
                        Music novaMusica = new Music();
                        novaMusica.id = idMusica;
                        System.out.println("Qual e o nome da musica?");
                        novaMusica.nome = input.nextLine();
                        System.out.println("Qual foi seu ano de lancamento?");
                        novaMusica.AnoLanc = Integer.valueOf(input.nextLine());
                        System.out.println("Qual e o genero musical?");
                        novaMusica.Genero = input.nextLine();
                        System.out.println("Qual e o nome da banda?");
                        ListaBand.listar();
                        novaMusica.banda = input.nextLine();

                        ListaMusic.inserirM(novaMusica);
                        idMusica++;
                        break;

                    case 6:
                        ListaMusic.listarM();
                        break;

                    case 7:
                        System.out.println("Digite o id da musica que deseja editar: ");
                        idMusica = Integer.valueOf(input.nextLine());
                        ListaMusic.editarM(idMusica, input);
                        System.out.println("Musica editada com sucesso");
                        break;

                    case 8:
                        System.out.println("Digite o id da musica que deseja remover: ");
                        ListaMusic.listarM();
                        idMusica = Integer.valueOf(input.nextLine());
                        ListaMusic.removerM(idMusica);
                        System.out.println("Musica removida com sucesso");
                        break;

                    default:
                        System.out.println("Erro, opcao invalida");
                        break;

                }
            }
        }
        input.close();
    }
}
