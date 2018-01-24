public class Rabbit{

   String species = "Rabbit";
   int y = 1;
   int x = 1;
   
   public void move()
   {
      y = y+1;
      x = x+1; 
      tellPosition();
   }
   
   public void tellPosition()
   {
       System.out.println("I am the " + species + ", i am now standing on square " + x + ", " + y);
   }

   public void beeg()
   {
      System.out.println("Nooooo Please don´t eat me!!");
   }
}