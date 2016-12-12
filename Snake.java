public class Snake{

   String species = "snake";
   int y = 10;
   int x = 10;
   
   public void move()
   {
      y = y-1;
      x = x-1; 
      tellPosition();
   }
   
   public String tellPosition()
   { 
       System.out.println("I am the " + species + ", i am now standing on square " + x + ", " + y);
   }
   
   public void kill()
   {
      System.out.println("Ahhrrrrrr im eating you ha ha!");
   }

}