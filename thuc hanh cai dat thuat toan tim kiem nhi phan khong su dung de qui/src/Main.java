import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myArr= new int[]{2,5,6,32,2,236,23,232,275,38,425,2722,8535};

        int findValue=32;
        Arrays.sort(myArr);
        int findResut=binaryAlgo(myArr,findValue);
        if(findResut!=-1){
            System.out.println("Found "+myArr[findResut] + " at "+findResut );
        }else{
            System.out.println("can't found"+findValue);
        }
    }
    public static int binaryAlgo(int[] myArr,int findValue){
        int left= 0;
        int right=myArr.length;
        while(right >= left){
            int mid =(right + left)/2;

            if(myArr[mid] == findValue)
                return mid;

            if(findValue < myArr[mid])
                right = mid -1;
            else if(findValue > myArr[mid])
                left= mid+1;
        }

        return -1;
    }
}
