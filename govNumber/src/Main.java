import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] letters = {"C", "M", "T", "B", "A", "P", "O", "H", "E", "Y"};
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < letters.length; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 1; k < 199; k++) {
                    String letter = letters[i];
                    String region = String.valueOf(k);
                    String number = String.format("%s%d%d%d%s%s%s", letter, j, j, j, letter, letter, region);
                    list.add(number);
                    if (k < 10) {
                        region = "0" + region;
                    }
                    for (int l = 0; l < list.size(); l++) {
                        System.out.println(list.get(l));
                    }
                    Collections.sort(list);
                    HashSet<String> set = new HashSet<>(list);
                    TreeSet<String> set1 = new TreeSet<>(list);
                    while (true) {
                        Scanner scanner = new Scanner(System.in);
                        String stateNumber = scanner.nextLine();
                        long a = System.nanoTime();
                        if (list.contains(stateNumber)) {
                            System.out.println("Поиск номера занял: " + (System.nanoTime() - a) + "нс");
                        }
                    }

                }


            }
        }
    }
}