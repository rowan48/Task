import java.util.HashSet;

public class Problemo8 {
    //Complexity is 0(N);
    int min = -1;
    HashSet<Integer> set = new HashSet<>();
    int index_of_first_duplicate(int[] arr ){
        for(int i=0;i<arr.length;i++){
            if (set.contains(arr[i])){
                return i;
            }
            set.add(arr[i]);
        }
        return min;

    }

}
