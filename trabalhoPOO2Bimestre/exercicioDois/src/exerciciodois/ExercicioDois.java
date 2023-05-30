/* 2 - Crie uma interface chamada "Ordenavel" com um método "ordenar()" que recebe um
array de inteiros e o ordena em ordem crescente. Em seguida, implemente essa
interface em uma classe chamada "BubbleSort" que impplementa o algoritmo de
ordenação Bubble Sort.*/
package exerciciodois;

public class ExercicioDois {

    public static void main(String[] args) {
        int[] array = {7,4,1,2,5,8,9,6,3};
        
        Ordenavel lista = new Lista();
        lista.ordenar(array);
        
        System.out.println("Array Ordenado");
        for (int num : array){
            System.out.print(num+", ");
        }
        
    } 
}
