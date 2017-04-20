package date;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

class BirthdayWithLocalDate implements BirthdayCalculator<LocalDate> {

  @Override
  public LocalDate parseDate(String str) {
    return LocalDate.parse(str, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
  }

  @Override
  public String printMonthAndDay(LocalDate date) {
    int month = date.getMonthValue();
    int day = date.getDayOfMonth();
    return month + ". " + day + ".";
  }

  @Override
  public boolean isAnniversaryToday(LocalDate date) {
    int birthMonth = date.getMonthValue();
    int birthDay = date.getDayOfMonth();
    return (birthMonth == LocalDate.now().getMonthValue() && birthDay == LocalDate.now()
        .getDayOfMonth());
  }

  @Override
  public int calculateAgeInYears(LocalDate birthday) {
    int birthYear = birthday.getYear();
    return LocalDate.now().getYear() - birthYear;
  }

  @Override
  public int calculateDaysToNextAnniversary(LocalDate date) {
    int remainingDays;
    if (LocalDate.now().getDayOfYear() <= date.getDayOfYear()) {
      remainingDays = date.getDayOfYear() - LocalDate.now().getDayOfYear();
    } else {
      remainingDays = date.getDayOfYear() - LocalDate.now().getDayOfYear() + 365;
    }
    return remainingDays;
  }

  public static void main(String[] args) {
    new BirthdayWithLocalDate().run();
  }

  private void run() {

    print("Birthday with java.util.Date.");
    String birthdayStr = readInput("What day were you born (yyyy-mm-dd)?");

    LocalDate birthdayDate = parseDate(birthdayStr);
    print("Your birthday: " + printMonthAndDay(birthdayDate));

    if (isAnniversaryToday(birthdayDate)) {
      int ageInYears = calculateAgeInYears(birthdayDate);
      print("Congratulations! Today is your " + ageInYears + "th birthday!");
    } else {
      int daysLeft = calculateDaysToNextAnniversary(birthdayDate);
      print("You have to wait only " + daysLeft + " days for your next birthday.");
    }
  }

  private void print(String line) {
    System.out.println(line);
  }

  private String readInput(String message) {
    System.out.print(message + ": ");
    return input.nextLine();
  }
  private final Scanner input = new Scanner(System.in, "UTF-8");
}
