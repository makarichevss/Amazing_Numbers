import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> collect = Arrays
                .stream(scanner.nextLine().split(" "))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
