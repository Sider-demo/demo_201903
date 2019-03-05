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
    }
}
