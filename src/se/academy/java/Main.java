package se.academy.java;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        MP3Player m = new MP3Player();

        Scanner sc = new Scanner(System.in);
        boolean again = true;
        System.out.println("0\tExit program");
        System.out.println("1\tPlay victory-tune");
        System.out.println("2\tPlay blues-tune (on repeat)");
        System.out.println("3\tGet repeat mode status for blues-tune");
        System.out.println("4\t(REMOVED, DOES NOT WORK) Turn off repeat mode for blues-tune");
        System.out.println("5\tPause all tunes");
        System.out.println("6\tResume all tunes (song that have not been played before will not be played)");
        System.out.println("7\tStop all tunes");

        System.out.println("Default: Play a special effect sound (try smashing ENTER)");
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
                    System.out.println("Is on repeat?: " + m.isRepeatMode("Blues-Loop.mp3"));
                    break;
                case "4":
                    //m.setRepeatMode("Blues-Loop.mp3", false);
                    System.out.println("This command is remove due to not working properly.");
                case "5":
                    m.pauseAll();
                    break;
                case "6":
                    m.resumeAll();
                    break;
                case "7":
                    m.stopAll();
                    break;
                default:
                    m.playFX("button-3.mp3");
//                    m.playFX("victory.mp3");

                    // if the musics stops while playing too many tunes, try playFXLightThread instead
//                    m.playFXLightThread("button-3.mp3");
//                    m.playFXLightThread("victory.mp3");
                    break;
            }
        } while (again);
    }
}
