package estruturasa3;
import java.util.Arrays;
import java.util.Random;


public class Algoritmos {
    public void bubbleSort(int[] v) {
        long trocas = 0;
        long comp = 0;
        for (int iteracao = 0; iteracao < v.length - 1; iteracao++) {
            for (int i = 0; i < v.length - 1 - iteracao; i++) {
                comp++;
                if (v[i] > v[i + 1]) {
                    int aux = v[i];
                    v[i] = v[i + 1];
                    v[i + 1] = aux;
                    trocas++;
                }
            }
        }
        System.out.println("Numero de comparacoes: " + comp);
        System.out.println("Numero de movimentacoes de trocas: " + trocas);
    }
    
    public void selectionSort(int[] v) {
        long trocas = 0;
        long comp = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int minimo = i;
            for (int j = i + 1; j < v.length; j++) {
                comp++;
                if (v[j] < v[minimo]) {
                    minimo = j;
                }
            }

            if (minimo != i) { 
                int aux = v[minimo];
                v[minimo] = v[i];
                v[i] = aux;
                trocas++;
        }
        }
        System.out.println("Numero de comparacoes: " + comp);
        System.out.println("Numero de movimentacoes de trocas: " + trocas);
    }
    
    public void insertionSort(int[] v) {
        long trocas = 0;
        long comp = 0;
        for (int i = 1; i < v.length; i++) {
            int t = v[i];
            int j = i - 1;

            while (j >= 0) {
                comp++;
                if (v[j] > t) {
                    v[j + 1] = v[j];
                    j--;
                    trocas++;
                }
                else {
                        break;
                        }
            
            }
            v[j + 1] = t;
        }
        System.out.println("Numero de comparacoes: " + comp);
        System.out.println("Numero de movimentacoes de trocas: " + trocas);
    }
   
    private static long trocaQuick = 0;
    private static long compQuick = 0;

    public static long getCompQuick() {
        return compQuick;
    }
    
    public static long getTrocaQuick() {
        return trocaQuick;
    }

    public static void setTrocaQuick(long trocaQuick) {
        Algoritmos.trocaQuick = trocaQuick;
    }

    public static void setCompQuick(long compQuick) {
        Algoritmos.compQuick = compQuick;
    }
    
    
    
   public void quickSort(int e, int d, int[] a) {
        if (e < d) {
            int i = particao(e, d, a);
            quickSort(e, i - 1, a);
            quickSort(i + 1, d, a);
    }
}

    private static int particao(int e, int d, int[] a) {
        int pivo, aux;
        int i, j;
        // pivo é o último elemento
        pivo = a[d];
        i = e - 1;
        j = d;

        do {
            do {
                i = i + 1;
                compQuick++;
            } while (i < d && a[i] < pivo);

            do {
                j = j - 1;
                compQuick++;
            } while (j > 0 && a[j] > pivo);

            if (i < j) {
                aux = a[i];
                a[i] = a[j];
                a[j] = aux;
                trocaQuick++;
            }
        } while (j > i);

        aux = a[i];
        a[i] = a[d];
        a[d] = aux;
        trocaQuick++;

        return i;
    }

    private static long compMerge = 0;
    private static long trocaMerge = 0;

    public static long getCompMerge() {
        return compMerge;
    }

    public static void setCompMerge(long compMerge) {
        Algoritmos.compMerge = compMerge;
    }

    public static long getTrocaMerge() {
        return trocaMerge;
    }

    public static void setTrocaMerge(long trocaMerge) {
        Algoritmos.trocaMerge = trocaMerge;
    }
    

    public static void mergeSort(int inicio, int tamanho, int[] v) {
        if (inicio < tamanho - 1) {
            int meio = (inicio + tamanho) / 2;
            mergeSort(inicio, meio, v);
            mergeSort(meio, tamanho, v);
            intercalar(inicio, meio, tamanho, v);
        }
    }

    private static void intercalar(int inicio, int meio, int tamanho, int[] v) {
        int i, j, k;
        int[] auxiliar = new int[tamanho - inicio];
        i = inicio;
        j = meio;
        k = 0;

        while (i < meio && j < tamanho) {
            compMerge++;
            if (v[i] <= v[j]) {
                auxiliar[k] = v[i];
                k++;
                i++;
            } else {
                auxiliar[k] = v[j];
                k++;
                j++;
                trocaMerge++;
            }
        }

        while (i < meio) {
            auxiliar[k] = v[i];
            k++;
            i++;
        }

        while (j < tamanho) {
            auxiliar[k] = v[j];
            k++;
            j++;
        }

        for (i = inicio; i < tamanho; i++) {
            v[i] = auxiliar[i - inicio];
        }
    }
    
    //Cria lista desordenada
    public void inserirAleatorio(int[] a) {
        Random rd = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = rd.nextInt(1000) + 1;
        }
    }
    
    //Cria lista em ordem crescente
    public void inserirCrescente(int[] a) {
        inserirAleatorio(a);
        Arrays.sort(a);
    }
    
    //Cria lista em ordem descrecente
    public void inserirDecrescente(int[] a) {
        inserirAleatorio(a);
        Arrays.sort(a);
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
    }
}
          
    public void printVetor(int[] v) {
        System.out.println(Arrays.toString(v));
    }
    
    public void linha() {
        System.out.println("=============================================================================================================================");
    }
    
}
