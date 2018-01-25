public class Rabbit{

   private String species = "Rabbit";
   private int y = 1;
   private int x = 1;
   
   public void move()
   {

       if (this.x <= 9 || this.y <=9) {
            y = y+1;
            x = x+1;
        }
        else {
            System.out.println("Invalid move Rabbit");
        }

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