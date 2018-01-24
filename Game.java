public class Game{

   public static void main(String[] args)
   {  
        Rabbit r = new Rabbit();
        Snake s = new Snake();

        r.move();
        s.move();
        
        r.move();
        s.move();
        
        r.move();
        s.move();
        
        r.move();
        s.move();

        r.beeg();

        s.move();
        s.kill();
   }
}