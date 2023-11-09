import java.util.ArrayList;

public class Grafo {

    ArrayList<Node> nodes;
    int [][] matrix;
    Grafo (int tamanho){
        nodes = new ArrayList<>();
        matrix = new int [tamanho][tamanho];
    }

    public void adicionar (Node node) {
        nodes.add(node);
    }

    public void aresta (int src, int dst){
        matrix[src][dst] = 1;
    }

    public boolean conferir (int src, int dst){
        if(matrix [src][dst] == 1){
        return true;
        }
    return false;
    }

    public void print(){
    System.out.print("  ");

    for(Node node : nodes) {
    System.out.print(node.dados+ " ");              // Cabeçalho
    }
    System.out.println();

    for(int i =0; i < matrix.length; i++){          // variável i é somente um contador
        System.out.print(nodes.get(i).dados+ " ");  // print nodes pegando dados correspondentes a i
        for(int j = 0; j < matrix[i].length; j++){  // contador j é comparado com o contador i
            System.out.print(matrix[i][j] + " ");   // print do int matrix com os parametros correspondentes a i e j
            }
        System.out.println(); // linha extra
        }
    }
}
