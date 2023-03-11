package EasyLevel;

import java.util.HashMap;

public class ValidAnangrams {
        public boolean isAnagram(String s, String t) {
            if(s.length()!=t.length()){
                return false;
            }
            int res=0;
            HashMap<Character,Integer> map=new HashMap<>();
            for(int i=0;i<s.length();i++){
                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                    res++;
                }else{
                    map.put(s.charAt(i),1);
                    res++;
                }
            }
            for(int i=0;i<t.length();i++){
                if(map.containsKey(t.charAt(i)) && map.get(t.charAt(i))>0){
                    map.put(t.charAt(i),map.get(t.charAt(i))-1);
                    res--;
                }
            }
           
                     if(res==0){
                         return true;
                     }else{
                          return false;
                     }    
        }
    }
