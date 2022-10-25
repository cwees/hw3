import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AnalysisNumber {
    public static void main(String[] args){
        long startTime;
        long endTime;
        List<Integer> arra = new ArrayList<Integer>();
        List<Integer> link = new LinkedList<Integer>();
/*         Scanner in = new Scanner(System.in); 
		System.out.println("Enter the Initial list size:");
		String snumb = in.nextLine(); 
		int numb = Integer.valueOf(snumb); */
        int numb = 100;

        addInReverseOrder(arra,numb);
        addInReverseOrder(link,numb);

        arra.clear();



/*        in.close(); */
    }

    public static int binarySearch(List<Integer> numbers, int number){
        int index = Collections.binarySearch(numbers, number);
        index=indexFixer(index);
        return index;
    }
    
    public static int indexFixer(int index){
        if(index<0){
            index=-1*index-1;
        }
        else if(index > 0){
            index=index-1;
        }
        
        return index;
    }
    
    public static void addInOrder(List<Integer> numbers, int n){
        for(int i =0; i<n+1;i++){
            int index = binarySearch(numbers, i);
            numbers.add(index,index);
        }
    }
    
    public static void addInReverseOrder(List<Integer> numbers, int n){

        for(int i = n+1;i>0;i--){
            int index = Collections.binarySearch(numbers,i);
            int indextest = indexFixer(index);
            numbers.add(indextest,indextest);
        }
    }
    public static void addInRandomOrder(List<Integer> numbers, int n){
        ArrayList<Integer> random = new ArrayList<Integer>();
        for(int i =0; i<n+1;i++){
            random.add(i);
        }
        Collections.shuffle(random);
        for(int i=0;i<n+1;i++){
            numbers.add(null);
        }

        for(int i=0;i<n+1;i++){
            int test = random.get(i);
            numbers.set(test,test);
        }

    }

    
}