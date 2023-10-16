package Generics;

import java.util.List;

public class Main {
    public static void main(String[] args){
    Box<String> stringBox =new Box<>("Generic Class");
    System.out.println("String Box Content :"+stringBox.getContent());
    System.out.println();
    Box<Integer> intBox =new Box<>(42);
    System.out.println("Integer Box Content :"+stringBox.getContent());
    System.out.println();
    String[] stringArray ={"Java","C#"};
    Utils.printArray(stringArray);
    System.out.println("-----Generic Bounds---");
    Pair<Integer> integerPair = new Pair<>(10,5);
    System.out.println("Sum of integer : "+integerPair.sum());
    Pair<Double> doublePair =new Pair<>(3.4,2.6);
    System.out.println("Sum of double : "+doublePair.sum());
    System.out.println("-----Generic WildCard---");
    List<String> stringList = List.of("Java", "C", "Python");
    List<Integer> intList = List.of(1, 2, 3, 4, 5);
    Printer.printList(stringList);
    Printer.printList(intList);
    }
}
