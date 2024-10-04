import tde.ListaEncadeada;

public class Main {
    public static void main(String[] args) {
        ListaEncadeada<Integer> lista = new ListaEncadeada<>();

        lista.adicionarNoInicio(1);
        lista.adicionarNoFim(2);
        lista.adicionarNaPosicao(1, 3);

        System.out.println("Lista: " + lista);

        lista.removerDoInicio();
        System.out.println("Após remover do início: " + lista);

        lista.removerDoFim();
        System.out.println("Após remover do fim: " + lista);

        lista.removerDaPosicao(0);
        System.out.println("Após remover da posição 0: " + lista);

        lista.adicionarNoInicio(4);
        lista.adicionarNoFim(5);
        lista.adicionarNoFim(6);
        System.out.println("Lista: " + lista);

        System.out.println("Elemento na posição 1: " + lista.buscar(1));
        System.out.println("Posição do valor 5: " + lista.buscarPosicao(5));

        lista.atualizar(1, 10);
        System.out.println("Após atualizar posição 1 para 10: " + lista);

        lista.limpar();
        System.out.println("Após limpar a lista: " + lista);
    }
}