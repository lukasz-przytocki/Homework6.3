import java.util.Scanner;
public class SumTableElements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] values = new int[5];

        System.out.println("Wprowadź liczbę: ");
        values[0] = input.nextInt();
        System.out.println("Wprowadź liczbę: ");
        values[1] = input.nextInt();
        System.out.println("Wprowadź liczbę: ");
        values[2] = input.nextInt();
        System.out.println("Wprowadź liczbę: ");
        values[3] = input.nextInt();
        System.out.println("Wprowadź liczbę: ");
        values[4] = input.nextInt();

        System.out.printf("Suma pierwszej: %d, trzeciej: %d, piątej: %d liczy wynosi: %d ", values[0], values[2], values[4],
                ( values[0]+values[2]+values[4]));
    }
}
