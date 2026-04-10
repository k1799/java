import java.util.Scanner;

public class SpotifyApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("SPOTIFY WELCOMES YOU");
        System.out.println("1. A.R. RAHMAN");
        System.out.println("2. ANIRUDH");
        System.out.println("3. HARRIS JEYARAJ");
        System.out.println("4. ILLAIYARAJA");
        System.out.println("5. U1");

        System.out.print("Select Composer (1-5): ");
        int composer = sc.nextInt();

        System.out.println("\nSelect Category:");
        System.out.println("1. Melody");
        System.out.println("2. Kuthu");
        System.out.println("3. Motivational");
        System.out.println("4. Sad");

        System.out.print("Enter your choice: ");
        int category = sc.nextInt();

        switch (composer) {
            case 1: // AR Rahman
                switch (category) {
                    case 1:
                        System.out.println("Playing: Ennavale Adi Ennavale 🎶");
                        System.out.println("Lyrics: Ennavale adi ennavale...");
                        break;
                    case 2:
                        System.out.println("Playing: Mukkala Mukkabala 🔥");
                        System.out.println("Lyrics: Mukkala mukkabala...");
                        break;
                    case 3:
                        System.out.println("Playing: Vande Mataram 💪");
                        System.out.println("Lyrics: Vande mataram...");
                        break;
                    case 4:
                        System.out.println("Playing: Poongatrile 💔");
                        System.out.println("Lyrics: Poongatrile un swasathai...");
                        break;
                }
                break;

            case 2: // Anirudh
                switch (category) {
                    case 1:
                        System.out.println("Playing: Nee Partha Vizhigal 🎶");
                        break;
                    case 2:
                        System.out.println("Playing: Vaathi Raid 🔥");
                        break;
                    case 3:
                        System.out.println("Playing: Ethir Neechal 💪");
                        break;
                    case 4:
                        System.out.println("Playing: Kanave Kanave 💔");
                        break;
                }
                break;

            case 3: // Harris Jayaraj
                switch (category) {
                    case 1:
                        System.out.println("Playing: Vaseegara 🎶");
                        break;
                    case 2:
                        System.out.println("Playing: Soda Bottle 🔥");
                        break;
                    case 3:
                        System.out.println("No motivational songs listed");
                        break;
                    case 4:
                        System.out.println("Playing: Yamma Yamma 💔");
                        break;
                }
                break;

            case 4: // Ilaiyaraja
                switch (category) {
                    case 1:
                        System.out.println("Playing: Raja Raja Cholan 🎶");
                        break;
                    case 2:
                        System.out.println("Playing: Aasai Nooruvagai 🔥");
                        break;
                    case 3:
                        System.out.println("No motivational songs listed");
                        break;
                    case 4:
                        System.out.println("Playing: Kanne Kalaimane 💔");
                        break;
                }
                break;

            case 5: // U1
                switch (category) {
                    case 1:
                        System.out.println("Playing: Aathadi Manasudhan 🎶");
                        break;
                    case 2:
                        System.out.println("Playing: Machi Open The Bottle 🔥");
                        break;
                    case 3:
                        System.out.println("Playing: Nimirnthu Nil 💪");
                        break;
                    case 4:
                        System.out.println("Playing: Pogadhe 💔");
                        break;
                }
                break;

            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}