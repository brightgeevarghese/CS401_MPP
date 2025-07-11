package lesson11.reuse_stream_work_around;

import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of("Neymar", "Rodrygo", "Vinícius Júnior", "Endrick", "João Gomes");

        //find names start with E
        findNamesStartWithPrefix(names, "E");
        //find names start with J
        findNamesStartWithPrefix(names, "J");
    }

    private static void findNamesStartWithPrefix(List<String> names, String prefix) {
        create(names).filter(name -> name.startsWith(prefix)).forEach(System.out::println);
    }

    private static Stream<String> create( List<String> names){
        return names.stream();
    }
}
