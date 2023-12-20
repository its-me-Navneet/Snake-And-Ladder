import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladder game ");  


        int pos =0; 
        int cnt =0 ;
        while(pos<100){ 
        int value = new Random().nextInt(6) + 1; 

        int option =new Random().nextInt(3) - 1 ;  
     
         if(pos+ option*value <=100 ) pos += option*value ; 
         pos=Math.max(0,pos) ;
         cnt++ ;
        }
        System.out.println("Number of times the dice was played to win is "+ cnt);
    }
}
