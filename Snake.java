public class Snake{

   private String species = "snake";
   private int y = 10;
   private int x = 10;
   
   public void move()
   {
        if (this.x >= 0 || this.y >= 0) {
            y = y-1;
            x = x-1; 
        }
        else {
            System.out.println("Invalid move");
        }
    
      tellPosition();
   }
   
   public void tellPosition()
   { 
       System.out.println("I am the " + species + ", i am now standing on square " + x + ", " + y);
   }
   
   public void kill()
   {
      System.out.println("Ahhrrrrrr im eating you ha ha!");
   }

}