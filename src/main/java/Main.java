import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        String fileName = "numbers.txt";
        try {
            Map<Integer, Integer> mapFromFile = NumbersReader.getListFromFile(fileName);
            NumbersReader.printStats(mapFromFile);

        } catch (FileNotFoundException e) {
            System.out.println("Nie udało się wczytać pliku");
        }
    }
}
