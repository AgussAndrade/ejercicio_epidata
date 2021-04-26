import java.util.ArrayList;
import java.util.PriorityQueue;

public class main {
    public ArrayList<Integer> ordenarLista(ArrayList<Integer> lista){
        PriorityQueue<Integer> heapImpares = new PriorityQueue<>();
        PriorityQueue<Integer> heapPares = new PriorityQueue<>();
        ArrayList<Integer> listaFinal = new ArrayList<>();

        for (Integer integer : lista) {
            if (integer % 2 == 0) {
                heapPares.add(integer);
            } else {
                heapImpares.add(integer);
            }
        }

        while(!heapImpares.isEmpty() || !heapPares.isEmpty()){
            if(!heapImpares.isEmpty()){
                listaFinal.add(heapImpares.remove());
            }
            else{
                listaFinal.add(heapPares.remove());
            }
        }
        return listaFinal;

    }
}
