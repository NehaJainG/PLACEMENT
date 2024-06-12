package hashing;

import java.util.HashMap;

//solution 2: use of map
public class FrequencyOfElementHashing {

    //HashMap<Integer,Integer>
    //HashMap<int,int>

    static HashMap<Integer,Integer> findFrequencyOfElement(int arr[] , int n){
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i = 0; i < n; i++){
            if(freq.containsKey(arr[i])){
                // int temp = freq.get(arr[i]);  //cant apply increment or decrement on freq.get(arr[i])
                // freq.put(arr[i], temp++);

                //else use thi method:
                freq.put(arr[i], freq.get(arr[i]) + 1);
            }else{
                freq.put(arr[i], 1);
            }
        }
        return freq;
    }

    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        HashMap<Integer,Integer> result = findFrequencyOfElement(arr,arr.length);


        //Question1: print the frequency
        for(Integer key : result.keySet()){
            System.out.println(key+" "+result.get(key));
        }

        /*
          // Traverse through map and print frequencies
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
         */

        //find the highest or lowest frequent element
        int maxE = 0, maxV=0;
        for(Integer key: result.keySet() ){
            if(maxV < result.get(key)){
                maxE = key;
                maxV = result.get(key);
            }
        }

        System.out.println("High frequent element: "+ maxE + " "+ maxV);
    }
    
}
