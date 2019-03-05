import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
      String foo = "foo";
      String bar = "bar";
      String empty = "";
      String nullMessage = null;
      
      if (foo.equals(bar)) {
        System.out.println("fooとbarは一緒です。");
      } else {
        System.out.println("fooとbarは違います。");
      }

      if (empty.equals("")) {
        System.out.println("emptyは空文字です。");
      } else {
        System.out.println("emptyは空文字ではありません。");
      }
      
      System.out.println("Hello world!");
      
      List<Integer> list = new LinkedList<>(Arrays.asList(0, 3, 1, 4, 1, 5, 9, 2, 6));

      Iterator<Integer> iterator = list.iterator();
      while (iterator.hasNext()) {
        int num = iterator.next();
        if (num == 0) {
          // 0 は削除
          iterator.remove();
        }
      }

      System.out.println(list); // -> [3, 1, 4, 1, 5, 9, 2, 6]
    }
}
