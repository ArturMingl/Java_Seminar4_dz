import java.util.Arrays;
import java.util.LinkedList;

/*
 * Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), который вернет “перевернутый” список.
 */
public class task1{
    public static void main(String[] args) {
        LinkedList<Integer> lnkLs = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(reverse(lnkLs));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> lnkLs) {
        LinkedList<Integer> revList = new LinkedList<>();
        for(int i=lnkLs.size()-1;i>=0;i--){
            revList.add(lnkLs.get(i));
        }
        return revList;

    }

}