
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        // faz uma array list utilizando
        List<Banda> listBanda = new ArrayList<Banda>();
        List<Musica> listMusica = new ArrayList<Musica>();

        Banda b;
        Musica m;

        int idBanda = iniciaListaBanda(listBanda);
        int idMusica = iniciaListaMusica(listMusica, listBanda);

        int idBandas = -1;
        int idMusicas = -1;

        // Scanner e variável de controle option
        int option = 1;
        int option2 = 1;
        Scanner input = new Scanner(System.in);
        {

            // loop de opcões para o usuário
            while (option != 0) {
                System.out.println("\nDigite:" + "\n0 para sair" + "\n1 para cadastrar uma nova banda"
                        + "\n2 para listar todas as bandas cadastradas" + "\n3 para cadastrar uma nova musica"
                        + "\n4 para listar todas as musicas cadastradas" + "\n5 para editar bandas"
                        + "\n6 para editar musicas" + "\n7 para remover uma banda" + "\n8 para remover um musica");
                option = Integer.valueOf(input.nextLine());

                switch (option) {
                    case 0:
                        System.out.println("Saindo...");
                        break;

                    // Case para adicionar uma nova banda
                    case 1:
                        b = new Banda();
                        b.id = idBanda;
                        idBanda++;
                        System.out.println("Digite o nome da banda");
                        b.banda = input.nextLine();
                        System.out.println("Digite a nacionalidade da banda");
                        b.Nacionalidade = input.nextLine();
                        System.out.println("Digite o nome do frontman da banda");
                        b.Frontman = input.nextLine();
                        System.out.println("Digite o ano de formacao da banda");
                        b.Anoformacao = Integer.valueOf(input.nextLine());
                        System.out.println("Digite o genero musical da banda");
                        b.GeneroMusica = input.nextLine();
                        listBanda.add(b);
                        System.out.println("Operacao realizada com sucesso!\n\n");
                        break;

                    // Case para listar as bandas cadastradas
                    case 2:
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            System.out.println("Id = " + b.id
                                    + " Nome = " + b.banda
                                    + " Nacionalidade = " + b.Nacionalidade
                                    + " Frontman = " + b.Frontman
                                    + " Ano de formacao = " + b.Anoformacao
                                    + " Genero de musica = " + b.GeneroMusica);
                        }
                        System.out.println("\n\n");
                        break;

                    // Case para cadastrar uma nova musica
                    case 3:
                        m = new Musica();
                        m.id = idMusica;
                        idMusica++;
                        System.out.println("Digite o nome da musica");
                        m.nome = input.nextLine();
                        System.out.println("Digite o ano de lancamento da musica");
                        m.AnoLanc = Integer.valueOf(input.nextLine());
                        System.out.println("Digite o genero musical da musica");
                        m.Genero = input.nextLine();
                        // For loop que mostra as bandas cadastradas
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            System.out.println("Id = " + b.id
                                    + " Nome = " + b.banda
                                    + " Nacionalidade = " + b.Nacionalidade
                                    + " Frontman = " + b.Frontman
                                    + " Ano de formacao = " + b.Anoformacao
                                    + " Genero de musica = " + b.GeneroMusica);
                        }
                        System.out.println("Digite o id da banda");
                        idBandas = Integer.valueOf(input.nextLine());
                        // For loop que verifica se o id selecionado é valido e coloca o input na variável "banda" da música
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            if (idBandas == b.id) {
                                m.banda = b;
                            }
                        }
                        if (m.banda == null) {
                            System.out.println("Banda nao encontrada, operacao cancelada\n\n");
                            idMusica--;
                        } else {
                            listMusica.add(m);
                            System.out.println("Operacao relizada com sucesso!\n\n");
                        }
                        break;
                    
                    // Case que lista as musicas cadastradas
                    case 4:
                        for (int i = 0; i < listMusica.size(); i++) {
                            m = listMusica.get(i);
                            System.out.println("Id = " + m.id
                                    + " Nome = " + m.nome
                                    + " Ano de Lancamento = " + m.AnoLanc
                                    + " Genero Musical = " + m.Genero
                                    + " Banda = " + m.banda.banda);
                        }
                        System.out.println("\n\n");
                        break;
                    
                    // Case para editar bandas
                    case 5:
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            System.out.println("Id = " + b.id
                                    + " Nome = " + b.banda
                                    + " Nacionalidade = " + b.Nacionalidade
                                    + " Frontman = " + b.Frontman
                                    + " Ano de formacao = " + b.Anoformacao
                                    + " Genero de musica = " + b.GeneroMusica);
                        }
                        System.out.println("Digite o id da banda que deseja editar");
                        idBandas = Integer.valueOf(input.nextLine());
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            if (idBandas == b.id) {
                                System.out.println("Que informacao voce deseja editar?"
                                        + "\n1 - Nome da banda"
                                        + "\n2 - Nacionalidade da banda"
                                        + "\n3 - Frontman da banda"
                                        + "\n4 - Ano de formacao da banda"
                                        + "\n5 - Genero musical da banda");
                                option2 = Integer.valueOf(input.nextLine());
                                switch (option2) {
                                    case 1:
                                        System.out.println("Digite o nome da banda");
                                        b.banda = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 2:
                                        System.out.println("Digite a nacionalidade da banda");
                                        b.Nacionalidade = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 3:
                                        System.out.println("Digite o nome do frontman da banda");
                                        b.Frontman = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 4:
                                        System.out.println("Digite o ano de formacão da banda");
                                        b.Anoformacao = Integer.valueOf(input.nextLine());
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 5:
                                        System.out.println("Digite o genero musical da banda");
                                        b.GeneroMusica = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    default:
                                        System.out.println("Operacao cancelada, numero invalido");
                                        break;

                                }

                            }
                        }
                        break;
                    // case para editar músicas
                    case 6:
                        for (int i = 0; i < listMusica.size(); i++) {
                            m = listMusica.get(i);
                            System.out.println("Id = " + m.id
                                    + " Nome = " + m.nome
                                    + " Ano de Lancamento = " + m.AnoLanc
                                    + " Genero Musical = " + m.Genero
                                    + " Banda = " + m.banda.banda);
                        }

                        System.out.println("Digite o id da musica que deseja editar");
                        idMusicas = Integer.valueOf(input.nextLine());
                        for (int i = 0; i < listMusica.size(); i++) {
                            m = listMusica.get(i);
                            if (idMusicas == m.id) {
                                System.out.println("Que informacao voce deseja editar?"
                                        + "\n1 - Nome da musica"
                                        + "\n2 - Ano de lancamento da musica"
                                        + "\n3 - Genero musical da musica"
                                        + "\n4 - Banda da musica");

                                option2 = Integer.valueOf(input.nextLine());
                                switch (option2) {
                                    case 1:
                                        System.out.println("Digite o nome da musica");
                                        m.nome = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 2:
                                        System.out.println("Digite o ano de lancamento");
                                        m.AnoLanc = Integer.valueOf(input.nextLine());
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 3:
                                        System.out.println("Digite o genero musical da banda");
                                        m.Genero = input.nextLine();
                                        System.out.println("Operacao realizada com sucesso!");
                                        break;

                                    case 4:
                                        for (int j = 0; j < listBanda.size(); j++) {
                                            b = listBanda.get(j);
                                            System.out.println("Id = " + b.id
                                                    + " Nome = " + b.banda);
                                        }
                                        System.out.println("Digite o id da banda que toca a musica");
                                        idBandas = Integer.valueOf(input.nextLine());
                                        for (int j = 0; j < listBanda.size(); j++) {
                                            b = listBanda.get(j);
                                            if (b.id == idBandas) {
                                                m.banda = b;
                                                System.out.println("Operacao realizada com sucesso!");
                                                break;
                                            }
                                            if (j == listBanda.size() - 1) {
                                                System.out.println("Banda nao encontrada, operacao cancelada");
                                                break;
                                            }
                                        }

                                        break;
                                    default:
                                        System.out.println("Operacao cancelada, numero invalido");
                                        break;

                                }

                            }
                        }
                        break;
                    // Case para remover uma banda
                    case 7:
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            System.out.println("Id = " + b.id
                                    + " Nome = " + b.banda);
                        }
                        System.out.println("Digite o id da banda que deseja remover");
                        idBandas = Integer.valueOf(input.nextLine());
                        for (int i = 0; i < listBanda.size(); i++) {
                            b = listBanda.get(i);
                            if (b.id == idBandas) {
                                listBanda.remove(i);
                                System.out.println("Banda removida com sucesso!");
                                break;
                            }
                            if (i == listBanda.size() - 1) {
                                System.out.println("Banda nao encontrada, operacao cancelada");
                                break;
                            }
                        }
                        break;
                    case 8:
                    // Case para remover músicas
                        for (int i = 0; i < listMusica.size(); i++) {
                            m = listMusica.get(i);
                            System.out.println("Id = " + m.id
                                    + " Nome = " + m.nome);
                        }
                        System.out.println("Digite o id da musica que deseja remover");
                        idMusicas = Integer.valueOf(input.nextLine());
                        for (int i = 0; i < listMusica.size(); i++) {
                            m = listMusica.get(i);
                            if (m.id == idMusicas) {
                                listMusica.remove(i);
                                System.out.println("Musica removida com sucesso!");
                                break;
                            }
                            if (i == listMusica.size() - 1) {
                                System.out.println("Musica nao encontrada, operacao cancelada");
                                break;
                            }
                        }
                        break;

                    default:
                        System.out.println("Numero invalido!\n\n");
                        break;
                }

            }
        }
        input.close();
    }

    // Função para que exista uma banda ao executar o programa
    public static int iniciaListaBanda(List<Banda> listaBanda) {

        int idBandas = 0;
        Banda b = new Banda();
        b.id = idBandas;
        b.banda = "Metallica";
        b.Nacionalidade = "Estados Unidos";
        b.Frontman = "James Hetfield";
        b.Anoformacao = 1981;
        b.GeneroMusica = "Heavy Metal";

        listaBanda.add(b);
        idBandas++;

        return idBandas;
    }

    // Função para que exista
    public static int iniciaListaMusica(List<Musica> listMusica, List<Banda> listBanda) {
        int idMusica = 0;
        Musica m = new Musica();
        m.id = idMusica;
        m.nome = "Damage Inc";
        m.AnoLanc = 1986;
        m.Genero = "Thrash Metal";
        m.banda = listBanda.get(0);

        listMusica.add(m);
        idMusica++;

        return idMusica;

    }

}