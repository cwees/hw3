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
        int numb = 5000;

        for(int i =0;i<5;i++){
            
            startTime = System.currentTimeMillis();
            addInOrder(arra,numb);
            endTime = System.currentTimeMillis();
            long durationarrorder = endTime - startTime;
            arra.clear();            

            startTime = System.currentTimeMillis();
            addInOrder(link,numb);
            endTime = System.currentTimeMillis();
            long durationlinkorder = endTime - startTime;
            link.clear();

            startTime = System.currentTimeMillis();
            addInReverseOrder(arra,numb);
            endTime = System.currentTimeMillis();
            long durationarrayrev = endTime - startTime;
            arra.clear();

            startTime = System.currentTimeMillis();
            addInReverseOrder(link,numb);
            endTime = System.currentTimeMillis();
            long durationlinkrev = endTime - startTime;
            link.clear();

            startTime = System.currentTimeMillis();
            addInReverseOrder(arra,numb);
            endTime = System.currentTimeMillis();
            long durationarrayrand = endTime - startTime;
            arra.clear();

            startTime = System.currentTimeMillis();
            addInReverseOrder(link,numb);
            endTime = System.currentTimeMillis();
            long durationlinkrand = endTime - startTime;
            link.clear();

            System.out.println("For number: "+numb);
            System.out.println("durationarrayorder: "+durationarrorder+"ms | durationarrayrev: "+
            durationarrayrev+"ms | durationarrayrand: "+durationarrayrand+"ms |");
            System.out.println("durationlinkorder: "+durationlinkorder+"ms | durationlinkrev: "+
            durationlinkrev+"ms | durationlinkrand: "+durationlinkrand+"ms |");
            numb=numb*2;
        }



/*        in.close(); */
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
            int index = Collections.binarySearch(numbers, i);
            index=indexFixer(index);
            numbers.add(index,i);
        }
    }
    public static void addInReverseOrder(List<Integer> numbers, int n){
        for(int i = n;i>-1;i--){
            int index = Collections.binarySearch(numbers,i);
            int indextest = indexFixer(index);
            numbers.add(indextest,i);
        }
    }

    public static void addInRandomOrder(List<Integer> numbers, int n){
        ArrayList<Integer> random = new ArrayList<Integer>();
        for(int i =0; i<n+1;i++){
            random.add(i);
        }
        Collections.shuffle(random);

        for(int i =0; i<random.size();i++){
            int numb = random.get(i);
            int index=Collections.binarySearch(numbers,numb);
            int indextest=indexFixer(index);
            numbers.add(indextest,numb);
        }
    }
    
}