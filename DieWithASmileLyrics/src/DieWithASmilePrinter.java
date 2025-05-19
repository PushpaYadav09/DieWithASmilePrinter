import java.util.*;
public class DieWithASmilePrinter {
    public static void main(String[] args) throws InterruptedException {
        // Lyrics and corresponding delay after each full line
        String[] lines = {
                "So I'ma love you every night like it's the last night",
                "Like it's the last night",
                "If the world was ending",
                "I'd wanna be next to you",
                "If the party was over",
                "And our time on Earth was through",
                "I'd wanna hold you just for a while",
                "And die with a smile",
                "If the world was ending",
                "I'd wanna be next to you",
                "Right next to you"
        };

        // Delay between words in milliseconds (adjust as you like)
        long wordDelayMs = 300;

        // Delay after each line in milliseconds
        long[] lineDelays = {
                600, 700, 1000, 4600, 1000, 3400, 1200, 2000, 600, 1400, 600
        };

        for (int i = 0; i < lines.length; i++) {
            String[] words = lines[i].split(" ");
            for (String word : words) {
                System.out.print(word + " ");
                System.out.flush();
                Thread.sleep(wordDelayMs);
            }
            System.out.println(); // Move to next line
            Thread.sleep(lineDelays[i]); // Line delay
        }

        System.out.println("\n--- End of Lyrics ---");
    }
}
