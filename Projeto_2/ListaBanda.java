import java.util.Scanner;

public class ListaBanda {

    int numElemento;
    ElementoBand primeiro;
    ElementoBand ultimo;

    public ListaBanda() {
        numElemento = 0;
        primeiro = null;
        ultimo = null;
    }

    public void inserir(Band novaBanda) {

        ElementoBand novoElementoBand = new ElementoBand();
        novoElementoBand.banda = novaBanda;
        novoElementoBand.prox = null;

        if (numElemento == 0) {
            primeiro = novoElementoBand;
            ultimo = novoElementoBand;
            numElemento++;
            return;
        }

        ultimo.prox = novoElementoBand;
        ultimo = novoElementoBand;
        numElemento++;
        return;

    }

    public void listar() {
        ElementoBand aux = primeiro;

        for (int i = 0; i < numElemento; i++) {
            System.out.println("Id = " + aux.banda.id + " Nome = " + aux.banda.banda + " Nacionalidade = "
                    + aux.banda.Nacionalidade + " Frontman = " + aux.banda.Frontman
                    + " Ano de formacao = "
                    + aux.banda.Anoformacao + " Genero de musica = " + aux.banda.GeneroMusica + '\n');
            aux = aux.prox;
        }
    }

    public Band getBandaID(int id) {
        ElementoBand aux = primeiro;

        for (int i = 0; i < numElemento; i++) {
            if (i == id) {
                return aux.banda;
            }
            aux = aux.prox;
        }
        System.out.println("Elemento nao foi encontrado");
        return null;
    }

    public void editar(int id, Scanner input) {
        ElementoBand aux = primeiro;
        for (int i = 0; i < numElemento; i++) {
            if (aux.banda.id == id) {
                System.out.println("Que informação você quer editar"
                        + "\n1 - nome"
                        + "\n2 - Ano de formacao da banda"
                        + "\n3 - Nacionalidade"
                        + "\n4 - Frontman"
                        + "\n5 - Genero Musical da banda");

                int opcao = Integer.valueOf(input.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da banda: ");
                        String nome = input.nextLine();
                        aux.banda.banda = nome;
                        System.out.println("Operacao Concluida");
                        return;
                    case 2:
                        System.out.print("Digite o ano de formação da banda: ");
                        int Anoformacao = Integer.valueOf(input.nextLine());
                        aux.banda.Anoformacao = Anoformacao;
                        System.out.println("Operacao Concluida");
                        return;
                    case 3:
                        System.out.print("Digite o pais de origem da banda: ");
                        String Nacionalidade = input.nextLine();
                        aux.banda.Nacionalidade = Nacionalidade;
                        System.out.println("Operacao Concluida");
                        return;
                    case 4:
                        System.out.print("Digite o nome do Frontman: ");
                        String Frontman = input.nextLine();
                        aux.banda.Frontman = Frontman;
                        System.out.println("Operacao Concluida");
                        return;
                    case 5:
                        System.out.print("Digite o genero musical da banda: ");
                        String Generomusica = input.nextLine();
                        aux.banda.GeneroMusica = Generomusica;
                        System.out.println("Operacao Concluida");
                        return;
                    default:
                        System.out.println("Erro, Opcao invalida");
                        return;
                }
            }
            aux = aux.prox;
        }
        System.out.println("Erro, Banda nao encontrada");
    }

    public void remover(int id) {
        ElementoBand aux = primeiro;
        ElementoBand antAux = null;

        for (int i = 0; i < numElemento; i++) {

            if (aux.banda.id == id) {
                if (aux == primeiro) {
                    primeiro = primeiro.prox;
                    numElemento--;
                    if (numElemento == 0) {
                        ultimo = null;
                    }
                    return;
                }
                antAux.prox = aux.prox;
                numElemento--;
                if (aux == ultimo) {
                    ultimo = antAux;
                }
                return;
            }
            antAux = aux;
            aux = aux.prox;
        }
        System.out.println("Erro, Banda nao encontrada");
    }
}
