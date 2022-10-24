import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Analysis{
    
    private List<Integer> count= new ArrayList<Integer>();

    public Analysis(int n){
        for(int i =0; i<n;i++){
            count.add(i);
        }

    }
    

    /*
    for each item to add
        find the spot to add it to using binary search
        add the item to the list */

    public static void addInOrder(List<Integer> numbers, int n){
        for(int i =0; i<n;i++){
            int index = Collections.binarySearch(count, i);
            numbers.add(index,i);
        }
    }

    public static void addInReverseOrder(List<Integer> numbers, int n){
        for(int i =n; i>0;i--){
            int index = Collections.binarySearch(numbers, i);
            numbers.add(index,i);
        }
    }

    public static void addInRandomOrder(List<Integer> numbers, int n){
        Collections.shuffle(numbs);
        for(int i = 0;i<numbs.size();i++){
            int number = numbs.get(i);

        }
    }

}