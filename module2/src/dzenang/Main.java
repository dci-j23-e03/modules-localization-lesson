package dzenang;

import java.util.Locale;
import java.util.ResourceBundle;
import package1.Name;

public class Main {


  public static void main(String[] args) {
    Name name = new Name();
    System.out.println("Hello " + name.getName());

    ResourceBundle bundle = ResourceBundle.getBundle("localization/messages", Locale.US);
    System.out.println("Greeting in English: " + bundle.getString("greeting"));
    ResourceBundle frenchBundle = ResourceBundle.getBundle("localization/messages_fr_FR", Locale.FRENCH);
    System.out.println("Greeting in French: " + frenchBundle.getString("greeting"));
  }
}