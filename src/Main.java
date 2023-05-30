import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
    String[] array = {"apple", "banana", "apple", "orange", "banana", "grape"};// Создаем множество для хранения уникальных строк
    Set<String> uniqueSet = new HashSet<>();// Создаем список для хранения уникальных строк в порядке следования
    List<String> uniqueList = new ArrayList<>();// Проходим по массиву строк
        for(String str : array){ // Если строка еще не содержится в множестве, добавляем ее в список и множество
            if (!uniqueSet.contains(str)) {
            uniqueSet.add(str);
            uniqueList.add(str);
        }
    }// Объединяем строки из списка в одну

    String result = String.join(" ", uniqueList);

        System.out.println(result);
    }
}