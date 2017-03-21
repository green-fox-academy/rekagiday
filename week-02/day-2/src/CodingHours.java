/**
 * Created by User on 2017. 03. 21..
 */
public class CodingHours {
    public static void main(String[] args) {
        // An average Green Fox attendee codes 6 hours daily
        int dailyCodingHours = 6;
        int weeklyCodingHours = dailyCodingHours * 5;

        // The semester is 17 weeks long
        int semesterLength = 17;

        // Print how many hours is spent with coding in a semester by an attendee, if the attendee only codes on workdays.
        int semesterCodingHours = dailyCodingHours * 5 * semesterLength;
        System.out.println("Hours spent coding in a semester: " + semesterCodingHours);

        // Print the percentage of the coding hours in the semester if the average work hours weekly is 52
        float codingWorkHourPercentage = 30 * 100 /52;
        System.out.println("Percentage of work hours spent with coding: " + codingWorkHourPercentage + "%");

    }
}
