package se.academy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("0\tExit program");
        System.out.println("1\tPlay victory-tune");
        System.out.println("2\tPlay blues-tune (on repeat)");
        System.out.println("3\tPause all tunes, and resume all tunes on pause");
        System.out.println("4\tStop all tunes");
        System.out.println("Default: Play a special effect sound (try smashing ENTER)");

        MP3Player m = new MP3Player();
        boolean again = true;
        do {
            System.out.print("\nCommand >> ");
            String command = sc.nextLine();
            switch (command) {
                case "0":
                    again = false;
                    break;
                case "1":
                    m.play("victory.mp3");
                    break;
                case "2":
                    m.play("Blues-Loop.mp3", true);
                    break;
                case "3":
                    m.pauseAll();
                    break;
                case "4":
                    m.stopAll();
                    break;
                default:
                    m.playFX("button-3.mp3");
                    break;
            }
        } while (again);
    }

}

