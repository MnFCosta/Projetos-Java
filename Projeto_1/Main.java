import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Delimitador do tamanho dos vetores
        int MAX_BANDA = 10;
        int MAX_MUSICA = 10;

        // Vetor Bandas
        Banda bandas[] = new Banda[MAX_BANDA];
        int numBandas = 0;
        // Vetor Musicas
        Musica musicas[] = new Musica[MAX_MUSICA];
        int numMusicas = 0;

        // Banda default
        Banda b = new Banda();
        b.id = numBandas;
        b.Nome = "Metallica";
        b.Nacionalidade = "Estados Unidos";
        b.Integrante1 = "James Hetfield";
        b.Integrante2 = "Kirk Hemmett";
        b.Integrante3 = "Robert Trujillo";
        b.Integrante4 = "Lars Ulrich";
        b.Anoformacao = 1981;
        b.GeneroMusica = "Heavy Metal";

        bandas[numBandas] = b;
        numBandas++;

        // Musica default
        Musica m = new Musica();
        m.id = numMusicas;
        m.Nome = "Damage Inc";
        m.AnoLanc = 1986;
        m.Duracao = 5.32;
        m.Genero = "Thrash Metal";
        m.banda = bandas[0];

        musicas[numMusicas] = m;
        numMusicas++;

        // Scanner e variável de controle option
        int option = 1;
        Scanner input = new Scanner(System.in);
        {

            // loop de opções para o usuário
            while (option != 0) {
                System.out.println("\nDigite:" + "\n0 para sair" + "\n1 para cadastrar uma nova banda"
                        + "\n2 para listar todas as bandas cadastradas" + "\n3 para cadastrar uma nova musica"
                        + "\n4 para listar todas as musicas cadastradas" + "\n5 para editar bandas"
                        + "\n6 para editar musicas");
                option = Integer.valueOf(input.nextLine());

                switch (option) {
                // case para sair
                case 0:
                    break;
                // case para cadastrar uma nova banda
                case 1:
                    Banda novaBanda = new Banda();
                    novaBanda.id = numBandas;
                    System.out.println("Qual e o nome da banda?");
                    novaBanda.Nome = input.nextLine();
                    System.out.println("Qual e a nacionalidade da banda");
                    novaBanda.Nacionalidade = input.nextLine();
                    System.out.println("Qual e o nome do primeiro integrante?");
                    novaBanda.Integrante1 = input.nextLine();
                    System.out.println("Qual e o nome do segundo integrante?");
                    novaBanda.Integrante2 = input.nextLine();
                    System.out.println("Qual e o nome do terceiro integrante?");
                    novaBanda.Integrante3 = input.nextLine();
                    System.out.println("Qual e o nome do quarto integrante?");
                    novaBanda.Integrante4 = input.nextLine();
                    System.out.println("Qual foi o ano de formacao da banda?");
                    novaBanda.Anoformacao = Integer.valueOf(input.nextLine());
                    System.out.println("Qual e o genero musical da banda?");
                    novaBanda.GeneroMusica = input.nextLine();
                    bandas[numBandas] = novaBanda;
                    numBandas++;
                    break;

                // case para listar as bandas cadastradas
                case 2:
                    System.out.println("\n");
                    for (int i = 0; i < numBandas; i++) {
                        System.out.println("Id = " + bandas[i].id + " Nome = " + bandas[i].Nome + " Nacionalidade = "
                                + bandas[i].Nacionalidade + " Integrante1 = " + bandas[i].Integrante1
                                + " Integrante2 = " + bandas[i].Integrante2 + " Integrante3 = " + bandas[i].Integrante3
                                + " Integrante4 = " + bandas[i].Integrante4 + " Ano de formacao = "
                                + bandas[i].Anoformacao + " Genero de musica = " + bandas[i].GeneroMusica);
                    }
                    break;

                // case para cadastrar uma nova musica
                case 3:
                    Musica novaMusica = new Musica();
                    System.out.println("Qual e o nome da musica?");
                    novaMusica.Nome = input.nextLine();
                    System.out.println("Qual foi eu ano de lancamento?");
                    novaMusica.AnoLanc = Integer.valueOf(input.nextLine());
                    System.out.println("Qual e o tempo de duracao?");
                    novaMusica.Duracao = Double.valueOf(input.nextLine());
                    System.out.println("Qual e o genero musical?");
                    novaMusica.Genero = input.nextLine();

                    for (int i = 0; i < numBandas; i++) {
                        System.out.println("Id banda: " + bandas[i].id + " Nome: " + bandas[i].Nome);
                    }
                    System.out.print("Digite o id de uma das bandas acima para selecionar a banda desejada: ");
                    int idBanda = Integer.valueOf(input.nextLine());
                    novaMusica.banda = bandas[idBanda];

                    musicas[numMusicas] = novaMusica;
                    numMusicas++;
                    break;

                // case para listar musicas cadastradas
                case 4:
                    System.out.println("\n");
                    for (int i = 0; i < numMusicas; i++) {
                        System.out.println("Nome = " + musicas[i].Nome + " Ano de Lancamento = " + musicas[i].AnoLanc
                                + " Duracao = " + musicas[i].Duracao + " Genero = " + musicas[i].Genero + " Banda = "
                                + musicas[i].banda.Nome);
                    }
                    break;

                // case para editar bandas
                case 5:
                    Banda newBanda = new Banda();
                    for (int i = 0; i < numBandas; i++) {
                        System.out.println("Id banda: " + bandas[i].id + " Nome: " + bandas[i].Nome);
                    }
                    System.out.print("Digite o id da banda que deseja editar: ");
                    int ideBanda = Integer.valueOf(input.nextLine());
                    newBanda.id = numBandas;
                    System.out.println("Qual e o nome da banda?");
                    newBanda.Nome = input.nextLine();
                    System.out.println("Qual e a nacionalidade da banda");
                    newBanda.Nacionalidade = input.nextLine();
                    System.out.println("Qual e o nome do primeiro integrante?");
                    newBanda.Integrante1 = input.nextLine();
                    System.out.println("Qual e o nome do segundo integrante?");
                    newBanda.Integrante2 = input.nextLine();
                    System.out.println("Qual e o nome do terceiro integrante?");
                    newBanda.Integrante3 = input.nextLine();
                    System.out.println("Qual e o nome do quarto integrante?");
                    newBanda.Integrante4 = input.nextLine();
                    System.out.println("Qual foi o ano de formacao da banda?");
                    newBanda.Anoformacao = Integer.valueOf(input.nextLine());
                    System.out.println("Qual e o genero musical da banda?");
                    newBanda.GeneroMusica = input.nextLine();
                    bandas[ideBanda] = newBanda;
                    break;

                // case para editar músicas
                case 6:
                    Musica newMusica = new Musica();
                    for (int i = 0; i < numMusicas; i++) {
                        System.out.println("Id musica " + musicas[i].id + " Nome: " + musicas[i].Nome);
                    }
                    System.out.println("Digite o id da musica que deseja editar: ");
                    int ideMusica = Integer.valueOf(input.nextLine());
                    newMusica.id = numMusicas;
                    System.out.println("Qual e o nome da musica?");
                    newMusica.Nome = input.nextLine();
                    System.out.println("Qual foi seu ano de lancamento?");
                    newMusica.AnoLanc = Integer.valueOf(input.nextLine());
                    System.out.println("Qual e o tempo de duracao");
                    newMusica.Duracao = Double.valueOf(input.nextLine());
                    System.out.println("Qual e o genero musical");
                    newMusica.Genero = input.nextLine();
                    System.out.println("Qual e a banda que toca");
                    for (int i = 0; i < numBandas; i++) {
                        System.out.println("Id banda: " + bandas[i].id + " Nome: " + bandas[i].Nome);
                    }
                    System.out.print("\n Digite o id de uma das bandas acima para selecionar a banda desejada: ");
                    int idxBanda = Integer.valueOf(input.nextLine());
                    newMusica.banda = bandas[idxBanda];

                    musicas[ideMusica] = newMusica;

                    break;

                // case para impedir valores inválidos
                default:
                    System.out.println("\nNumero invalido, tente novamente");
                }
            }
            // fechar o input
            input.close();
        }
    }
}
