package cpsc2150.listDec;
import java.util.List;
import java.util.Random;

public interface IShuffleList <T> extends List <T> {
    default void shuffle(int swaps) {
        Random rand = new Random();
        int rand1 = rand.nextInt(myList.sizeOf());
        int rand2 = rand.nextInt(myList.sizeOf());
        for (int i = 0; i < swaps; i++) {
            swap(rand1, rand2);
            rand1 = rand.nextInt(myList.sizeOf());
            rand2 = rand.nextInt(myList.sizeOf());
        }
        
    }
    default void swap(int i, int j){

    }
}
