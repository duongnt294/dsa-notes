import java.util.HashMap;
import java.util.Scanner;

public class ValidAnagram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String t = sc.next();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        boolean ok = true;

        for (char c : t.toCharArray()) {

            if (!map.containsKey(c)) {
                ok = false;
                break;
            }

            map.put(c, map.get(c) - 1);
        }

        if (ok) {
            for (int d : map.values()) {
                if (d != 0) {
                    ok = false;
                    break;
                }
            }
        }

        System.out.println(ok);
    }
}
