import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = scanner.nextLine().split(" ");
        for (int i = arr.length - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(Integer.parseInt(arr[i]) + " ");
        }
    }
}
