package tde;

public class ListaEncadeada<T> {
    private Node<T> inicio;
    private int tamanho;

    public ListaEncadeada() {
        this.inicio = null;
        this.tamanho = 0;
    }

    public void adicionarNoInicio(T valor) {
        Node<T> novoNo = new Node<>(valor);
        novoNo.setProximo(inicio);
        inicio = novoNo;
        tamanho++;
    }

    public void adicionarNoFim(T valor) {
        Node<T> novoNo = new Node<>(valor);
        if (inicio == null) {
            inicio = novoNo;
        } else {
            Node<T> atual = inicio;
            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }
            atual.setProximo(novoNo);
        }
        tamanho++;
    }

    public void adicionarNaPosicao(int posicao, T valor) {
        if (posicao < 0 || posicao > tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            adicionarNoInicio(valor);
        } else {
            Node<T> novoNo = new Node<>(valor);
            Node<T> atual = inicio;
            for (int i = 0; i < posicao - 1; i++) {
                atual = atual.getProximo();
            }
            novoNo.setProximo(atual.getProximo());
            atual.setProximo(novoNo);
            tamanho++;
        }
    }

    public T removerDoInicio() {
        if (inicio == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        T valor = inicio.getValor();
        inicio = inicio.getProximo();
        tamanho--;
        return valor;
    }

    public T removerDoFim() {
        if (inicio == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        if (inicio.getProximo() == null) {
            T valor = inicio.getValor();
            inicio = null;
            tamanho--;
            return valor;
        }
        Node<T> atual = inicio;
        while (atual.getProximo().getProximo() != null) {
            atual = atual.getProximo();
        }
        T valor = atual.getProximo().getValor();
        atual.setProximo(null);
        tamanho--;
        return valor;
    }

    public T removerDaPosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        if (posicao == 0) {
            return removerDoInicio();
        }
        Node<T> atual = inicio;
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.getProximo();
        }
        T valor = atual.getProximo().getValor();
        atual.setProximo(atual.getProximo().getProximo());
        tamanho--;
        return valor;
    }

    public T removerPorValor(T valor) {
        if (inicio == null) {
            throw new IllegalStateException("A lista está vazia");
        }
        if (inicio.getValor().equals(valor)) {
            return removerDoInicio();
        }
        Node<T> atual = inicio;
        while (atual.getProximo() != null && !atual.getProximo().getValor().equals(valor)) {
            atual = atual.getProximo();
        }
        if (atual.getProximo() == null) {
            return null;
        }
        T valorRemovido = atual.getProximo().getValor();
        atual.setProximo(atual.getProximo().getProximo());
        tamanho--;
        return valorRemovido;
    }

    public T buscar(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        Node<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual.getValor();
    }

    public int buscarPosicao(T valor) {
        Node<T> atual = inicio;
        int posicao = 0;
        while (atual != null) {
            if (atual.getValor().equals(valor)) {
                return posicao;
            }
            atual = atual.getProximo();
            posicao++;
        }
        return -1;
    }

    public void atualizar(int posicao, T novoValor) {
        if (posicao < 0 || posicao >= tamanho) {
            throw new IndexOutOfBoundsException("Posição inválida");
        }
        Node<T> atual = inicio;
        for (int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        atual.setValor(novoValor);
    }

    public int tamanho() {
        return tamanho;
    }

    public boolean estaVazia() {
        return tamanho == 0;
    }

    public void limpar() {
        inicio = null;
        tamanho = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> atual = inicio;
        while (atual != null) {
            sb.append(atual.getValor()).append(" -> ");
            atual = atual.getProximo();
        }
        sb.append("null");
        return sb.toString();
    }
}
