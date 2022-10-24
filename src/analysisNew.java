import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class analysisNew{

    private List<Integer> count= new ArrayList<Integer>();

    public analysisNew(int n){
        for(int i =0; i<n;i++){
            count.add(i);
        }
    }
/*
    for each item to add
        find the spot to add it to using binary search
        add the item to the list */

    public int binarySearch(int number){
        int index = Collections.binarySearch(count, number);
        return index;
    }

    public static void addInOrder(List<Integer> numbers, int n){
        for(int i = 0; i<n;i++){
            int index = binarySearch(i);
        }
    }







}