import java.util.Arrays;
        import java.util.Scanner;

public class Cities_Task6 {
    public static void main(String[] args) {
        System.out.print("Print city names with a space: ");
        String citiesNames = new Scanner(System.in).nextLine();

        String[] sortedNames = citiesNames.split("\\s+");

        Arrays.sort(sortedNames);
        System.out.println("Sorted alphabetically cities names: " + Arrays.toString(sortedNames));
    }
}


