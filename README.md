# Implementação de uma Lista Encadeada em Java

Este projeto implementa uma lista encadeada simples em Java, com todos os métodos essenciais para a manipulação da lista, incluindo inserção, remoção, busca, atualização e outros métodos auxiliares.

## Classe `Node<T>`

A classe `Node` é responsável por representar cada elemento da lista encadeada. Cada nó contém dois atributos principais:

- `T valor`: Armazena o valor do nó.
- `Node<T> proximo`: Referência para o próximo nó na lista.

Além disso, a classe possui métodos de acesso (`get` e `set`) para manipular esses atributos.

## Classe `ListaEncadeada<T>`

A classe `ListaEncadeada` gerencia a lista encadeada como um todo. Ela contém:

- `Node<T> inicio`: Referência para o primeiro nó da lista.
- `int tamanho`: Contador que armazena o número de elementos na lista.

### Métodos de Inserção

- `adicionarNoInicio(T valor)`: Insere um novo nó no início da lista.
- `adicionarNoFim(T valor)`: Insere um novo nó no final da lista.
- `adicionarNaPosicao(int posicao, T valor)`: Insere um novo nó em uma posição específica da lista.

### Métodos de Remoção

- `removerDoInicio()`: Remove o primeiro nó da lista e retorna seu valor.
- `removerDoFim()`: Remove o último nó da lista e retorna seu valor.
- `removerDaPosicao(int posicao)`: Remove o nó de uma posição específica e retorna seu valor.
- `removerPorValor(T valor)`: Remove o nó que contém o valor especificado e retorna seu valor.

### Métodos de Busca

- `buscar(int posicao)`: Retorna o valor do nó em uma posição específica.
- `buscarPosicao(T valor)`: Retorna a posição do nó que contém o valor especificado, ou -1 se não for encontrado.

### Métodos de Atualização

- `atualizar(int posicao, T novoValor)`: Atualiza o valor de um nó em uma posição específica.

### Outros Métodos

- `tamanho()`: Retorna o número de elementos na lista.
- `estaVazia()`: Verifica se a lista está vazia.
- `limpar()`: Remove todos os elementos da lista.
- `toString()`: Retorna uma representação textual da lista, exibindo os valores dos nós.

## Classe `Main` para Testes

A classe `Main` contém um método `main` que cria uma instância da `ListaEncadeada` e testa suas funcionalidades, como adicionar, remover, buscar e atualizar elementos na lista.