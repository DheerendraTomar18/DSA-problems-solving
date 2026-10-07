
/* 
  *********************************BUBBLE SORT*****************************************************
import java.util.*;
public class main {
    public static void bubbleSort(int num[]){
        for(int turn=0;turn<num.length-1;turn++){
            for(int j=0;j<num.length-1-turn;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j];
                    num[j]=num[j+1];
                    num[j+1]=temp;
                }
            }
        }
    }
        public static void printArr(int num[]){
              for(int i=0;i<num.length;i++){
                System.out.print(num[i]+" ");
              }System.out.println();
        }
    
    public static void main(String args[]){
        int num[] = {5,4,1,3,2};   
        bubbleSort(num);
        printArr(num);
     }
    
}
****************************************Selection Sort***************************************************************
import java.util.*;
public class main{
       public static void SelectionSort(int num[]){
        for(int i=0;i<num.length-1;i++){
            int minpos=i;
            for(int j=i+1;j<num.length;j++){
                if(num[minpos]>num[j]){
                    minpos=j;
                }
            }
            int temp=num[minpos];
            num[minpos]=num[i];
            num[i]=temp;
        }
    }
    public static void printarr(int num[]){
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]+" ");
        }System.out.println();
    }
    public static void main(String args[]){
      int num[]={5,4,1,3,2};
      SelectionSort(num);
      printarr(num);
    }

} */
