package geekbrains.homework2_1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int j;
        int arrLength = 3;
        Scanner scanner = new Scanner(System.in);
        Wall[] wall = new Wall[arrLength];
        Track[] track = new Track[arrLength];

        for (j = 0; j < arrLength; j++) {
            wall[j] = new Wall();
            System.out.println("Введите высоту препятствия " + (j + 1));
            int h = scanner.nextInt();
            wall[j].setH(h);

            track[j] = new Track();
            System.out.println("Введите длину трека " + (j + 1));
            int d = scanner.nextInt();
            track[j].setD(d);

            System.out.println("высота препятствия" + (j + 1) + " : " + wall[j].getH() + "м");
            System.out.println("Длина трека" + (j + 1) + " : " + track[j].getD() + "м");

            Competition a1 = new Human();
            Competition a2 = new Animal();
            Competition a3 = new Robot();
            a1.jump("Petya", 1);
            a2.jump("Persik", 10);
            a3.jump("Verter", 50);
            a1.run("Petya", 500);
            a2.run("Persik", 1500);
            a3.run("Verter", 10000);
            System.out.println();
        }
    }
}
