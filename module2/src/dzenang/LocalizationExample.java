package dzenang;

import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalizationExample {

  public static void main(String[] args) throws ParseException {

    Locale locale = Locale.getDefault();
    System.out.println(locale);

    System.out.println(Locale.GERMANY);
    System.out.println(new Locale("en", "US"));
    System.out.println(new Locale("en", "UK"));

    Locale english = new Locale.Builder().setLanguage("en").build();
    System.out.println(english);

    // formatting numbers
    double number = 1234567.89;
    System.out.println("Default format: " + number);
    int intNumber = 12345567;
    NumberFormat formatter = NumberFormat.getNumberInstance(new Locale("bs", "BA"));
    System.out.println(formatter.format(number));
    System.out.println(formatter.format(intNumber));

    NumberFormat usFormatter = NumberFormat.getNumberInstance(Locale.US);
    System.out.println(usFormatter.format(number));
    System.out.println(usFormatter.format(intNumber));

    double number2 = (double) formatter.parse("1.234.567,89");
    System.out.println(number2);

    // date and time
    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MMMM.yy", Locale.US);
    LocalDateTime current = LocalDateTime.now();
    System.out.println(dateTimeFormatter.format(current));

  }

}
