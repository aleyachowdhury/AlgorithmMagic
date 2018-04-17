import java.util.Arrays;

//Implement a bubble sort (or other sort) in Java.
public class BubbleMagic {

    public void bubble_sort(int array[]){
        int n= array.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(array[j]> array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1]=temp;
                }
            }
        }
    }
    public  void printArray(int array[]){
        int n=array.length;
        for(int i=0; i<n; i++){
            System.out.print(array[i]+" ");
        }
    }

public static void main(String[]args){
        BubbleMagic op = new BubbleMagic();
        int array_item[]={22, 34, 56, 70, 8, 9, 12};
        System.out.println("Unsorted :" + Arrays.toString(array_item));
        op.bubble_sort(array_item);
        System.out.println("Bubble Sort Magic");
        op.printArray(array_item);

}
}

