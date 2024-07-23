package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> num = new ArrayList<>();

        System.out.println("n개의 정수를 입력하세요 (종료 0)");

        while (true){
            int input = sc.nextInt();
            if (input == 0){
                break;
            }
            num.add(input);
        }
        System.out.println("출력");
        for (int i = 0; i < num.size(); i++) {
            System.out.print(num.get(i));
            if (i < num.size() -1){
                System.out.print(", ");
            }
        }
    }
}
