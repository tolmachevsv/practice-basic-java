package com.tolmachevsv.examples;

import java.util.*;

public class ArrayExample {

    int[] intArray1 = new int[5];
    static int[] intArray2 = new int[]{1, 3, 5, 7};
    String[] stringArray = {"foo", "bar"};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(intArray2));

        List<String> stringList = new ArrayList<>();

        stringList.add("Hello");
        stringList.add("it's");
        stringList.add("me");
        stringList.add("world");
        stringList.remove("world");
        stringList.remove(2);

        System.out.println(stringList);

        List<Integer> intList = new ArrayList<>();

        intList.add(0);
        intList.add(4);
        intList.add(7);
        intList.add(3);
        intList.add(5);
        System.out.println("Source list: " + intList);

        intList.add(4,1);
        System.out.println("Added value 1 to 4 index: " + intList);

        // удаляем по индексу
        intList.remove(0);
        // удаляем по значению
        intList.remove(Integer.valueOf(7));
        System.out.println("After 2 deletes: " + intList);

        // asList
        List<String> stringsList = Arrays.asList("foo", "bar");
        System.out.println(stringsList);
        List<Integer> integersList = Arrays.asList(0, 4, 2, 6, 7);
        System.out.println(integersList);

        // список с одним элементом
        List<Integer> singletonIntegerList = Collections.singletonList(6);
        System.out.println(singletonIntegerList);
        List<String> singletonStringList = Collections.singletonList("foo");
        System.out.println(singletonStringList);

        List<String> strings = new ArrayList<>(List.of("foo", "bar"));
        System.out.println(strings);
        // чтобы модифицировать лист, нужно преобразовать его в ArrayList (строка 55)
        strings.add("sda");
        System.out.println(strings); // [foo, bar, sda]

        Collections.emptyList(); // пустой список

        // Множества
        Set<String> stringSet = new HashSet<>(); // неупорядоченное и неотсортированное хранение данных
        stringSet.add("foo");
        stringSet.add("foobar");
        stringSet.add("bar");
        stringSet.add("first");
        System.out.println(stringSet); // [bar, foobar, foo, first]

        // сохраняет последовательность добавления
        Set<String> linkedStringSet = new LinkedHashSet<>();

        Set<String> treeStringSet = new TreeSet<>();

        // map имеет ключ-значение
        Map<Integer, String> aMap = new HashMap<>();
        aMap.put(1, "first");
        aMap.put(2, "second");

        String getValue = aMap.get(1);
        System.out.println(getValue);

        System.out.println(aMap.containsKey(1)); // true - содержит ли мапа данный ключ

        System.out.println(aMap.size()); // 2 - размер мапы

        Collection<String> values = aMap.values();
        System.out.println(values); // [first, second] - все значения мапы

        Set<Map.Entry<Integer, String>> entries = aMap.entrySet();
        System.out.println(entries); // [1=first, 2=second] все пары ключ-значение мапы

        Set<Integer> keySet = aMap.keySet();
        System.out.println(keySet); // [1, 2] - все ключи мапы
    }
}
