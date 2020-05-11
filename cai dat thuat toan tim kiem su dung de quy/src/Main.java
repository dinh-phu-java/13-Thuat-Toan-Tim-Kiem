import java.util.Arrays;
import java.util.Comparator;public class Main {
    public static void main(String[] args) {
        int[] myArr=new int[]{2,15,6,3,34,733,34,2,6,43,7,36,6,8,235,432,957};
        Arrays.sort(myArr);
        System.out.printf(Arrays.toString(myArr));
        System.out.println();
        int findIndex=binaryAlgo(myArr,0,myArr.length-1,432);
        if(findIndex != -1){
            System.out.println("Found key at "+findIndex );
        }else{
            System.out.println("Can't found key");
        }

    }
    public static int binaryAlgo(int[] myArr,int left,int right,int key){

        if(right >= left){
            int mid = left + (right-left)/2;

            if(myArr[mid]==key)
                return mid;

            if(key > myArr[mid])
                return binaryAlgo(myArr,mid+1,right,key);
            if(key < myArr[mid])
                return binaryAlgo(myArr,left,mid-1,key);
        }
        return -1;
    }
}
