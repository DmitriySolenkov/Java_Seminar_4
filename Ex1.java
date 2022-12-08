import java.util.LinkedList;
import java.util.Scanner;

public class Ex1 {

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        int count = 5;
        String print = "print";
        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < count; index++) {
            System.out.println("Пользователь, введите строку в формате text~num:");
            String str = scanner.nextLine();
            String[] arr = str.split("~");
            int num = Integer.parseInt(arr[1]);
            if (arr[0].equals(print)) {
                System.out.println(list.get(num));
                list.remove(num);
            } else {
                if (num <= list.size()) {
                    list.add(num, arr[0]);
                } else {
                    list.add(arr[0]);
                }

            }
        }
        scanner.close();
        System.out.println(list);
    }

}