import java.util.Scanner;

public class SumSeconds{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFirst = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());

        int totalTime = timeFirst + timeSecond + timeThird;

        int minutes = totalTime / 60;
        int seconds=totalTime % 60;

        if (seconds < 10){
            System.out.println(minutes + ":0" + seconds);
        }else {
            System.out.println(minutes + ":" + seconds);
        }
    }
}