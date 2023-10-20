import java.util.Scanner;

public class Bhavyajava {
    public static void enter(int user, char comp) {
        if ((user == 1 && comp == 'P') || (user == 2 && comp == 'Z') || (user == 3 && comp == 'R')) {
            System.out.println("You lost");
        } else if ((user == 1 && comp == 'Z') || (user == 2 && comp == 'R') || (user == 3 && comp == 'P')) {
            System.out.println("You won");
        } else if (user == comp) {
            System.out.println("game draw");
        }
    }

    public static void main(String[] gandu) {
        Scanner input = new Scanner(System.in);
        int a;
        char comp;
        System.out.println("1)rock\n 2)paper\n 3)Scissor");
        a = input.nextInt();
        double n = Math.random() * 100;
        int m = (int) n;
        if (m < 33.33) {
            comp = 'R'; // rock
        } else if (m < 66.66 && m > 33.34) {
            comp = 'P'; // paper

        } else {
            comp = 'Z'; // scissor
        }

        System.out.println("computer choice " + comp);
        Bhavyajava.enter(a, comp);
    }
}