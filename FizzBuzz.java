import java.util.ArrayList;
import java.util.List;

class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                al.add("FizzBuzz");
            }else if(i%3==0){
                al.add("Fizz");
            }else if(i%5==0){
                al.add("Buzz");
            }else{
                String s=Integer.toString(i);
                al.add(s);
            }

        }    
        return al;
    }
    public static void main(String[] args) {
        System.out.println(fizzBuzz(3));
    }
}