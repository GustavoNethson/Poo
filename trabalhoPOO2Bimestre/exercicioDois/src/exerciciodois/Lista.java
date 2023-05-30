package exerciciodois;

public class Lista implements Ordenavel {

    @Override
    public void ordenar(int[] array) {
        int num = array.length;
        boolean trocou;

        for (int i = 0; i < num - 1; i++) {
            trocou = false;

            for (int j = 0; j < num - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    trocou = true;
                }
            }
            if (!trocou) {
                break;
            }
        }
    }
}
