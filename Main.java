import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PlEASE ENTER THE SİZE OF NUMBERS YOU WANTED TO SORT: ");
        int length = scan.nextInt();

        //Want the value of array from user
        int arr[];
        arr = new int[length];
        for (int i = 0; i < length; i++){
            arr[i] = scan.nextInt();
        }

        //write the unsorted variables of array
        System.out.println("Your Unsorted Numbers: ");
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i] + " \n");
        }

        //sort the numbers of array
        for (int i = 0; i < length; i++) {
            int min =0 ;
            for (int j = i+1; j < length; j++) {
                if(arr[i]>arr[j]){
                min=arr[i];
                arr[i]=arr[j];
                arr[j]=min;
            }
            }
        }


        //write the sorted numbers of array
        System.out.println("Sorted Numbers : ");
        int i=0 ;

        for(i=0; i<length; i++){
            System.out.println(arr[i] + " ");

        }

        System.out.println("ALL NUMBERS OF ARRAY ARE SORTED : ");
    }
}