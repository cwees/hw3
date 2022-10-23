import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AnalysisDriver {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in); // creates new Scanner object
		System.out.println("Enter the inital list size:"); // user prompt
		String snumb = in.nextLine(); 
		int numb = Integer.valueOf(snumb);
        int numb2 =numb*2;
        int numb4 = numb*4;
        int numb8= numb*8;
        int numb16 = numb*16;

        List<Integer> arra = new ArrayList<Integer>(numb16);
        //List<Integer> link = new LinkedList<Integer>(numb16);

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
            numbers.add(index,i);
        }
    }
}
