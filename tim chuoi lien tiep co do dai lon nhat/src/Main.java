import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        String myString = "abcabcdefgabc";
        ArrayList<String> storeString=new ArrayList<>();

        int i=0;

        while(i < myString.length()){
            String a= String.valueOf(myString.charAt(i));
            String mySequence=a;
            int j=i+1;

            while (j < myString.length()-1){

                String b=String.valueOf(myString.charAt(j));
                if(a.compareTo(b) <0){
                    mySequence=mySequence+b;

                }else{
                    if(!mySequence.equals("")){
                        storeString.add(mySequence);
                    }

                    mySequence="";
                }
                j++;
            }

            i++;
        }
        
        int maxIndex=0;
        for (int k =0 ;k<storeString.size();k++){
            for (int z=k;z<storeString.size()-1;z++){
                if (storeString.get(maxIndex).length() < storeString.get(z).length() ){
                    maxIndex =z;
                }
            }
        }

        System.out.println("Chuỗi có độ dài lớn nhất là: "+storeString.get(maxIndex));
    }
}
