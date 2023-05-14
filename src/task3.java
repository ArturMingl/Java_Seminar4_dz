import java.util.LinkedList;
import java.util.Scanner;

/*
 * В калькулятор добавьте возможность отменить последнюю операцию.
Пример
1
+
2
ответ:3
+
4
ответ:7
+
2
ответ:9
-
1
Ответ 8
Отмена -> 9
Отмена -> 7
Отмена -> 3
+
2
Ответ 5
 */

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "Cp866");
        LinkedList<Integer> results = new LinkedList<>();
        int first;
        int second;
        String zn;
        String cancel = "q";
        String stop = "s";
        boolean firtsInput = true;
        while(true){
            if (firtsInput==true){
                System.out.print("Ввод числа ->");
                first = sc.nextInt();
                sc.nextLine();
                firtsInput = false;
            }
            else {
                first = results.getLast();
            }
            System.out.print("Ввод знака + - * / (q - отмена, s - стоп) ->");
            zn = sc.nextLine();
            if(zn.equalsIgnoreCase(cancel)){
                results.removeLast();
                System.out.println(results.getLast());
                if(results.size()==0) firtsInput=true;
                continue;
            }
            if(zn.equalsIgnoreCase(stop)) break;
            System.out.print("Ввод числа ->");
            second = sc.nextInt();
            sc.nextLine();
            if (zn.equals("+")) {
                System.out.println((first+second));
                results.add(first+second);
            }
            else if (zn.equals("-")){
                System.out.println(first-second);
                results.add(first-second);
            }
            else if (zn.equals("*")) {
                System.out.println(first*second);
                results.add(first*second);
            }
            else if (zn.equals("/")) {
                System.out.println(first/second);
                results.add(first-second);
            }
        }
        sc.close();
    }
}