import java.util.Arrays;
import java.util.HashMap;
  
public class Questao_03 {
    public static void main(String[] args) {
        subString("ifailuhkqq");
    }
  
    static void subString(String s){
        HashMap<String, Integer> map= new HashMap<>();
  
        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                char[] valChar = s.substring(i, j+1).toCharArray();
                Arrays.sort(valChar);
                String val = new String(valChar);
                if (map.containsKey(val)) 
                    map.put(val, map.get(val)+1);
                else 
                    map.put(val, 1);
            }
        }
        int anagramPairCount = 0;
        for(String key: map.keySet()){
            int n = map.get(key);
            anagramPairCount += (n * (n-1))/2;
        }
        System.out.println(anagramPairCount);
    }
}