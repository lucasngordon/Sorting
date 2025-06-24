package estruturasa3;

public class EstruturasA3 {
    
    
    public static void main(String[] args) {
        Algoritmos funcao = new Algoritmos();
        //Teste 3 ordens de listas: ordenada em ordem crescente, ordenada em ordem decrescente e desordenada com números aleatórios. As listas podem ter duplicidade ou não. 
        //Para cada um dos 3 tipos de ordenações você deve testar vetores de 5 tamanhos diferentes: cem, mil, dez mil, cem mil e um milhão.
        
        int[] tamanhos = {100, 1000, 10000, 100000, 1000000};
        
       funcao.linha();
       System.out.println("BubbleSort com lista desordenada com numeros aleatorios: ");
       System.out.println();
       
        for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirAleatorio(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.bubbleSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
        
       funcao.linha();
       System.out.println("BubbleSort com lista ordenada crescente:");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirCrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.bubbleSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("BubbleSort com lista ordenada decrescente");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirDecrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.bubbleSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("SelectionSort com lista desordenada com numeros aleatorios: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirAleatorio(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.selectionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("SelectionSort com lista ordenada crescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirCrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.selectionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("SelectionSort com lista ordenada decrescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirDecrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.selectionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
     
       funcao.linha();
       System.out.println("InsertionSort com lista desordenada com numeros aleatorios: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirAleatorio(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.insertionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("InsertionSort com lista ordenada crescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirCrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.insertionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
        
       funcao.linha();
       System.out.println("InsertionSort com lista ordenada decrescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirDecrescente(vetor);
            System.out.println("Vetor  de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.insertionSort(vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Tempo: " + tempo + "ms");
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("QuickSort com lista desordenada com numeros aleatorios: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirAleatorio(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.quickSort(0, vetor.length - 1, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompQuick());
            System.out.println("Numero de trocas: " + funcao.getTrocaQuick());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaQuick(0);
            funcao.setCompQuick(0);
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("QuickSort com lista ordenada crescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirCrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.quickSort(0, vetor.length - 1, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompQuick());
            System.out.println("Numero de trocas: " + funcao.getTrocaQuick());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaQuick(0);
            funcao.setCompQuick(0);
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("QuickSort com lista ordenada decrescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirDecrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.quickSort(0, vetor.length - 1, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompQuick());
            System.out.println("Numero de trocas: " + funcao.getTrocaQuick());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaQuick(0);
            funcao.setCompQuick(0);
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("MergeSort com lista desordenada com numeros aleatorios: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirAleatorio(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.mergeSort(0, vetor.length, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompMerge());
            System.out.println("Numero de trocas: " + funcao.getTrocaMerge());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaMerge(0);
            funcao.setCompMerge(0);
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("MergeSort com lista ordenada crescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirCrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.mergeSort(0, vetor.length, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompMerge());
            System.out.println("Numero de trocas: " + funcao.getTrocaMerge());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaMerge(0);
            funcao.setCompMerge(0);
            System.out.println();
        }
       
       funcao.linha();
       System.out.println("MergeSort com lista ordenada decrescente: ");
       System.out.println();
       
       for (int tamanho : tamanhos) {
            int[] vetor = new int[tamanho];
            funcao.inserirDecrescente(vetor);
            System.out.println("Vetor de tamanho " + tamanho + ": ");
            long inicio = System.currentTimeMillis();
            funcao.mergeSort(0, vetor.length, vetor);
            long fim = System.currentTimeMillis();
            long tempo = fim - inicio;
            System.out.println("Numero de comparacoes: " + funcao.getCompMerge());
            System.out.println("Numero de trocas: " + funcao.getTrocaMerge());
            System.out.println("Tempo: " + tempo + "ms");
            funcao.setTrocaMerge(0);
            funcao.setCompMerge(0);
            System.out.println();
        }
       funcao.linha();
    }
}
