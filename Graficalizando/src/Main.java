// author: @Lucasm
public class Main {
    public static void main(String[] args){

        Grafo Grafo = new Grafo(6); // Tamanho do grafo, tem que corresponder à quantidade de linhas

        Grafo.adicionar(new Node('A')); // Conta como posição 0
        Grafo.adicionar(new Node('B')); // Conta como posição 1
        Grafo.adicionar(new Node('C')); // Conta como posição 2
        Grafo.adicionar(new Node('D')); // Conta como posição 3
        Grafo.adicionar(new Node('E')); // Conta como posição 4
        Grafo.adicionar(new Node('F')); // Conta como posição 5

        Grafo.aresta(0,1);
        Grafo.aresta(1,2);
        Grafo.aresta(2,3);
        Grafo.aresta(2,4);
        Grafo.aresta(4,0);
        Grafo.aresta(4,2);
        Grafo.aresta(5,4);
        Grafo.aresta(4,5);

        Grafo.print();

        System.out.println(Grafo.conferir(4,5)); //Confere se há ligação entre a posição x e y
    }
}