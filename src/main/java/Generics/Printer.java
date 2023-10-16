package Generics;

import java.util.List;

public class Printer {
    public static  void printList(List<?> list)
    {
        for (Object item :list)
        {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
