import java.util.Scanner;

public class ListaMusic {

    int numElemento;
    ElementoMusic primeiro;
    ElementoMusic ultimo;

    public ListaMusic() {
        numElemento = 0;
        primeiro = null;
        ultimo = null;
    }

    public void inserirM(Music musica) {

        ElementoMusic novoElementoMusic = new ElementoMusic();
        novoElementoMusic.musica = musica;
        novoElementoMusic.prox = null;

        if (numElemento == 0) {
            primeiro = novoElementoMusic;
            ultimo = novoElementoMusic;
            numElemento++;
            return;
        }
        ultimo.prox = novoElementoMusic;
        ultimo = novoElementoMusic;
        numElemento++;
        return;
    }

    public void listarM() {
        ElementoMusic aux = primeiro;

        for (int i = 0; i < numElemento; i++) {
            System.out.println("Id = " +aux.musica.id + " Nome = " +aux.musica.nome + " Ano de Lancamento = " +aux.musica.AnoLanc
                 + " Genero = " +aux.musica.Genero + " banda = "
                    + aux.musica.banda);
                    aux=aux.prox;
        }

    }

    public Music getMusicaID(int id) {
        ElementoMusic aux = primeiro;

        for (int i = 0; i < numElemento; i++) {
            if (i == id) {
                return aux.musica;
            }
            aux = aux.prox;
        }
        System.out.println("Elemento nao foi encontrado");
        return null;
    }

    public void editarM(int id, Scanner input) {
        ElementoMusic aux = primeiro;
        for (int i = 0; i < numElemento; i++) {
            if (aux.musica.id == id) {
                System.out.println("Que informação você quer editar"
                        + "\n1 - nome"
                        + "\n2 - Ano de lançamento da musica"
                        + "\n3 - Genero"
                        + "\n4 - Banda");

                int opcao = Integer.valueOf(input.nextLine());
                switch (opcao) {
                    case 1:
                        System.out.print("Digite o nome da musica: ");
                        String nome = input.nextLine();
                       aux.musica.nome = nome;
                        System.out.println("Operacao Concluida");
                        return;
                    case 2:
                        System.out.print("Digite o ano de lancamento da musica: ");
                        int AnoLanc = Integer.valueOf(input.nextLine());
                       aux.musica.AnoLanc = AnoLanc;
                        System.out.println("Operacao Concluida");
                        return;
                    case 3:
                        System.out.print("Digite o genero da musica: ");
                        String Genero = input.nextLine();
                        aux.musica.Genero = Genero;
                        System.out.println("Operacao Concluida");

                    case 4:
                        System.out.print("Digite o nome da banda: ");
                        String banda = input.nextLine();
                        aux.musica.banda = banda;
                        System.out.println("Operacao Concluida");

                    default:
                        System.out.println("Erro, Opcao invalida");
                        return;
                }
            }
            aux = aux.prox;
        }
        System.out.println("Erro, musica nao encontrada");
    }

    public void removerM(int id) {
        ElementoMusic aux = primeiro;
        ElementoMusic antAux = null;

        for (int i = 0; i < numElemento; i++) {

            if (aux.musica.id == id) {
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
        System.out.println("Erro, musica nao encontrada");
    }
}
