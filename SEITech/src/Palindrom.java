public class Palindrom {

    boolean is_palindrome=true;
    public  boolean palindrome(String data){
        if (data.length()%2 == 0){
            char [] arr1= new  char[data.length()/2];
            char [] arr2= new  char[data.length()/2];
            for (int i =0;i<(data.length()/2);i++){
                arr1[i]= data.charAt(i);
            }
            int count =0;
            for(int z = data.length()-1 ;z>(data.length()/2)-1;z--){

                arr2[count]=data.charAt(z);
                count++;
            }
            for (int y =0;y<data.length()/2;y++){
                if(arr1[y]!=arr2[y]){
                    is_palindrome=false;
                    break;
                }
            }

        }
        else {
            char [] arr1= new  char[(data.length()-1)/2];
            char [] arr2= new  char[(data.length()-1)/2];
            for (int i =0;i<((data.length()-1)/2);i++){
                arr1[i]= data.charAt(i);
            }
            int count =0;
            for(int z = data.length()-1 ;z>((data.length()-1)/2);z--){
                arr2[count]=data.charAt(z);
                count++;
            }
            for (int y =0;y<(data.length()-1)/2;y++){
                if(arr1[y]!=arr2[y]){
                    is_palindrome=false;
                    break;
                }
            }

        }
        return  is_palindrome;
    }
}
