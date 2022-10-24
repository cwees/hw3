import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AnalysisDriver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); 
		System.out.println("Enter the inital list size:");
		String snumb = in.nextLine(); 
		int numb = Integer.valueOf(snumb);

        //int numb16 = numb*16;

        List<Integer> arra = new ArrayList<Integer>(numb*16);
        List<Integer> link = new LinkedList<Integer>();

        long startTime = System.currentTimeMillis();
        addInOrder(arra,numb);
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        //addInReverseOrder(arra,numb);
        
        System.out.println(duration);








        in.close();
    }

    public static void addInOrder(List<Integer> numbers, int n){
        for(int i =1; i<n;i++){
            int index = Collections.binarySearch(numbers, i);
            numbers.add(index1,i);
        }
    }
}
