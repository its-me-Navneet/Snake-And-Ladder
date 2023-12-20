import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to snake and ladder game ");  

        int turn =1 ;
        int user1 =0 ,user2 =0 ;
        // int cnt =0 ;
        while(user1 < 100 && user2 < 100){  

        int value = new Random().nextInt(6) + 1; 

        int option =new Random().nextInt(3) - 1 ;  
          
        if(turn==1){ 
         if(user1+ option*value <=100 ) user1 += option*value ; 
          user1=Math.max(0,user1) ;  
        }
        else{
             if(user2+ option*value <=100 ) user2 += option*value ; 
             user2=Math.max(0,user2) ; 
        }
        if(option != 1){
            turn = turn ^ 1;      // alter the user 
        }
        //    cnt++ ;
        }
          if(user1 == 100) System.out.println("User1 Won");
          else System.out.println("User2 won");
        }
       
    
}
