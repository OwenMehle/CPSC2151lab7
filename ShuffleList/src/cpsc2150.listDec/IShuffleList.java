package cpsc2150.listDec;
import java.util.List;
import java.util.Random;
import java.util.ArrayList;

public interface IShuffleList <T> extends List <T> {
    IShuffleList<Integer> listy = new ShuffleList<>(new ArrayList<Integer>());    
    default void shuffle(int swaps) {
        Random rand = new Random();
        int rand1 = rand.nextInt();
        int rand2 = rand.nextInt();
        for (int i = 0; i < swaps; i++) {
            swap(rand1, rand2);
            rand1 = rand.nextInt();
            rand2 = rand.nextInt();
        }
    }

    default void swap(int i, int j){
        int temp = listy.get(i);
        listy.set(i, listy.get(j));
        listy.set(j, temp);
    }
}

