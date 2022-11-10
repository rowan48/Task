import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Problemo3 {
    HashMap<Character, Integer> map = new HashMap<>();
    int val;
    String mystr="";
    String getMystr="";
    public String runLengthEncode(String str){
        int count =1;

        for(int i =0;i<str.length()-1;i++){
            if(str.charAt(i+1)==str.charAt(i)){
                count++;
            }else{
                mystr+=str.charAt(i);
                mystr+=count;
                count=1;
            }

        }
        mystr+=str.charAt(str.length()-1);
        mystr+=count;
        return mystr;
    }
    public String runLengthDecode(String str){
       char char1=str.charAt(0);
       int z;
       String dummy="";
        for(int i =1;i<str.length();i++){
            if (Character.isDigit(str.charAt(i))){
                dummy+= String.valueOf(str.charAt(i));

            }else{
                for (int y=0;y<Integer.valueOf(dummy);y++){
                    getMystr+=char1;

                }
                char1 = str.charAt(i);
                dummy="";
            }
        }
        for (int y=0;y<Integer.valueOf(dummy);y++){
            getMystr+=char1;

        }

        return getMystr;
    }
}
