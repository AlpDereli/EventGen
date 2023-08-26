import java.util.Scanner;
public class Events {
    public static void main(String[] args) {
        System.out.println("Please enter weather: ");
        Scanner take = new Scanner(System.in);
        int i = take.nextInt();
        if(i<5)
        {
            System.out.println("Skiing");
        } else if (i<15)
        {
            System.out.println("Cinema");
        } else if (i<25) {
            System.out.println("Picnic");
        }
        else
        {
            System.out.println("Swimming");
        }
    }
}
