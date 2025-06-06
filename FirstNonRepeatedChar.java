import java.util.LinkedHashMap;
import java.util.Map;

public class Main
{
    public static char getFirstNonRepeatedChar(String str)    {
        Map<Character, Integer> counts = new LinkedHashMap<>(str.length());
    
    
    for(char c : str.toCharArray()){
        counts.put(c , counts.containsKey(c) ? counts.get(c) + 1 : 1 );
    }
    
    for(Map.Entry<Character, Integer> entry : counts.entrySet()){
        if(entry.getValue() == 1){
            return entry.getKey();
        }
    }
    
    throw new RuntimeException(" Didn't find any non repeated Character");
    
    }
	public static void main(String[] args) {
	    
	    String s = "GeeksForGeeks";
	    char c = getFirstNonRepeatedChar(s);
		System.out.println(c);
	}
}
