import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayList::new));

        int number = scanner.nextInt();

        List<Integer> newNumbers = numbers
                .stream()
                .map(integer -> Math.abs(integer - number))
                .collect(Collectors.toCollection(ArrayList::new));

        int minNum = Collections.min(newNumbers);
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < numbers.size(); i++) {
            int integer = newNumbers.get(i);

            if (integer == minNum) {
                res.add(numbers.get(i));
            }
        }

        Collections.sort(res);
        res.forEach(integer -> System.out.print(integer + " "));
    }
}
