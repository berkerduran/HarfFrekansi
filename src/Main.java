import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kelime girişi al
        System.out.print("Kelimeyi giriniz: ");
        String kelime = scanner.nextLine();

        // Harf frekanslarını saklayacak HashMap
        Map<Character, Integer> frekans = new HashMap<>();

        // Kelimeyi küçük harfe çevir
        kelime = kelime.toLowerCase();

        // Harfleri dolaş
        for (char ch : kelime.toCharArray()) {
            if (Character.isLetter(ch)) { // sadece harfleri say
                frekans.put(ch, frekans.getOrDefault(ch, 0) + 1);
            }
        }

        // Sonuçları yazdır
        for (Map.Entry<Character, Integer> entry : frekans.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
