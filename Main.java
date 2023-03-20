import java.util.Random;



public class Main{
  public static void main (String[]args){
    System.out.println ("This is a random number : ");



      int result = getRandomNumberithinTheRange (40, 51);
      System.out.println(result);
  }
     // create a method for generating random number within a range:
    public static int getRandomNumberithinTheRange(int min, int max){
  	    Random randomNumber = new Random ();
		    return randomNumber.nextInt(max - min)+ min;
		}
}
