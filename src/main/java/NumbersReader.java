import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class NumbersReader {

    public static Map<Integer, Integer> getListFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        Map<Integer, Integer> numbersMap = new TreeMap<>();
        while (scanner.hasNextInt()) {
            int nextNumber = scanner.nextInt();
            if (numbersMap.containsKey(nextNumber)) {
                Integer frequency = numbersMap.get(nextNumber);
                numbersMap.put(nextNumber, frequency + 1);
            } else {
                numbersMap.put(nextNumber, 1);
            }
        }
        return numbersMap;
    }

    public static void printStats(Map<Integer, Integer> map) {
        Set<Map.Entry<Integer, Integer>> entries = map.entrySet();
        for (Map.Entry<Integer, Integer> entry : entries) {
            System.out.println(entry.getKey() + " - " + "liczba wystąpień " + entry.getValue());
        }
    }
}