package lesson12.exception_handling_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<String> files = List.of("log1.txt", "log2.txt");


        System.out.println(
                files.stream()
                        .map(File::new)//data -> new File(data)
                        .flatMap(Main::readFileContent)//Stream<String
                        .filter(data -> data.contains("ERROR"))
                        .count()
        );
    }

    private static Stream<String> readFileContent(File file) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return bufferedReader.lines();
    }

}
