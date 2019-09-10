package DMtools;
import java.util.Random;

public class DiceRoller {
  // For use in random integer generation
  Random r = new Random();
  
  // Rolls the dice and returns the sum total. Takes the number of each individual type of dice as input
  // I'm sure I could probably refactor this, but the way it's formatted right now is very easy to read.
  public String roll(int d4, int d6, int d8, int d10, int d12, int d20, int d100) {

    // These aren't really used right now, but they're for saving individual rolls in memory if we need them
    // int[] d4s = new int[d4];
    // int[] d6s = new int[d6];
    // int[] d8s = new int[d8];
    // int[] d10s = new int[d10];
    // int[] d12s = new int[d12];
    // int[] d20s = new int[d20];
    // int[] d100s = new int[d100];
    // int[][] dice = {d4s, d6s, d8s, d10s, d12s, d20s, d100s};
    
    // Print the header that says what dice are being rolled
    String outStr = "Rolling";
    if (d4 > 0) {outStr += " " +Integer.toString(d4) + "d4,";}
    if (d6 > 0) {outStr += " " +Integer.toString(d6) + "d6,";}
    if (d8 > 0) {outStr += " " +Integer.toString(d8) + "d8,";}
    if (d10 > 0) {outStr += " " +Integer.toString(d10) + "d10,";}
    if (d12 > 0) {outStr += " " +Integer.toString(d12) + "d12,";}
    if (d20 > 0) {outStr += " " +Integer.toString(d20) + "d20,";}
    if (d100 > 0) {outStr += " " +Integer.toString(d100) + "d100,";}
    /* Please note that trailing commas/spaces are appended differently here and thus the replaceAll is slightly
     * different from those that come later */
    outStr = outStr.replaceAll(",$", "");
    outStr += "\n";
    
    // For tracking the sum total of our rolls
    int finalSum = 0;
    
    // roll d4s
    String res = "d4s:   ";
    // Roll a number of dice equal to the parameter given for that dice
    for (int i = 0; i < d4; i++) {
      // If there are no dice to roll we can skip forwards
      if (d4 < 1) {break;}
      // Roll
      int value = r.nextInt(4) + 1;
      // Add to our running total
      finalSum += value;
      // Save the value in an array. Currently this isn't used, but it  might be useful for future features
      // d4s[i] = value;
      // add our value to the string of rolls
      res += Integer.toString(value) + ", ";
    }
    // Remove trailing commas
    res = res.replaceAll(", $", "");
    // Another precondition check because I didn't want to nest my for loop inside an if. I should probably change this
    if (d4 > 0) {outStr += res + "\n";}
    
    // roll d6s
    res = "d6s:   ";
    for (int i = 0; i < d6; i++) {
      if (d6 < 1) {break;}
      int value = r.nextInt(6) + 1;
      finalSum += value;
      // d6s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d6 > 0) {outStr += res + "\n";}
    
    // roll d8s
    res = "d8s:   ";
    for (int i = 0; i < d8; i++) {
      if (d8 < 1) {break;}
      int value = r.nextInt(8) + 1;
      finalSum += value;
      // d8s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d8 > 0) {outStr += res + "\n";}
    
    // roll d10s
    res = "d10s:  ";
    for (int i = 0; i < d10; i++) {
      if (d10 < 1) {break;}
      int value = r.nextInt(10) + 1;
      finalSum += value;
      // d10s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d10 > 0) {outStr += res + "\n";}
    
    // roll d12s
    res = "d12s:  ";
    for (int i = 0; i < d12; i++) {
      if (d12 < 1) {break;}
      int value = r.nextInt(12) + 1;
      finalSum += value;
      // d12s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d12 > 0) {outStr += res + "\n";}
    
    // roll d20s
    res = "d20s:  ";
    for (int i = 0; i < d20; i++) {
      if (d20 < 1) {break;}
      int value = r.nextInt(20) + 1;
      finalSum += value;
      // d20s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d20 > 0) {outStr += res + "\n";}
    
    // roll d100s
    res = "d100s: ";
    for (int i = 0; i < d100; i++) {
      if (d100 < 1) {break;}
      int value = r.nextInt(100) + 1;
      finalSum += value;
      // d100s[i] = value;
      res += Integer.toString(value) + ", ";
    }
    res = res.replaceAll(", $", "");
    if (d100 > 0) {outStr += res + "\n";}
   
    outStr += "Total: " + Integer.toString(finalSum);
    
    return outStr;
  }
  
  public static void main(String[] args) {
    DiceRoller test = new DiceRoller();
    //                           4  6  8  10 12 20 100
    System.out.println(test.roll(1, 1, 1, 1, 1, 1, 1));
  }
}