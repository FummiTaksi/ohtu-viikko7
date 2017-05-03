package ohtu.kivipaperisakset;

import java.util.Scanner;


public class IO {

  private Scanner scanner;

  public IO() {
    this.scanner = new Scanner(System.in);
  }

  public String readLine() {
   return scanner.nextLine();
 }

  public void print(String prompt) {
    System.out.println(prompt);
  }
}
