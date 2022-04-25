package unit5c3q1;

public class SocialMediaContext {

    Strategy s;
   public void setSocialmediaStrategy(Strategy s){
       this.s=s;

   }
   public void connect(String name){
       s.print(name);


   }


}
