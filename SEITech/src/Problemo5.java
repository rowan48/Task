import java.util.*;

public class Problemo5 {
       HashMap<String,Integer> map = new HashMap<String, Integer>();
    ArrayList<String> arrayList = new ArrayList<String>();

    Iterator<Map.Entry<String, Integer>> itr = map.entrySet().iterator();

        public ArrayList<String> get_unique(String[] arr){
            for(int i=0;i< arr.length;i++){
                Integer val = map.get(arr[i]);
                if(val==null){
                    map.put(arr[i],0);
                }else{
                    map.replace(arr[i],++val);
                }

            }


            while(itr.hasNext())
            {
                Map.Entry<String, Integer> entry = itr.next();
                if(entry.getValue()==0){
                    arrayList.add(entry.getKey());
                }

            }

            return arrayList;

        }
}
