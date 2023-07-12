package codingPractice;

public class FindIndex {

    public static int checkIndex(int myArray[],int value){
        if (myArray == null) return -1;
        int length = myArray.length;
        int count =0;
        while (count<length){
            if(myArray[count]==value)return count;
            else count=count+1;
        }
        return -1;
    }

    public static void checkDuplicate(int myArray[]){
        for(int count=0;count<myArray.length-1;count++){
            for (int index =count+1;index<myArray.length;index++){
                if(myArray[count]==myArray[index]&&count!=index){
                    System.out.println(myArray[index]);
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] myArray = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        System.out.println("Index position of 25 is: " + checkIndex(myArray, 25));
        System.out.println("Index position of 77 is: " + checkIndex(myArray, 77));
        System.out.println("Duplicate Element in given Array is :");
        checkDuplicate(myArray);
    }
}