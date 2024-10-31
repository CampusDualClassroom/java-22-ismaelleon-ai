package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Exercise22 {

    public static List<String> createArrayList() {
        List<String> arryList = new ArrayList<>();
        populateList(arryList);
        return arryList;
    }

    public static void printElementsAndIndex(List<String> customList) {

        for (int i = 0; i < customList.size(); i++) {
            System.out.println("Indice "+ i +": "+ customList.get(i));

        }
    }

    public static boolean addElementToList(List<String> customList, String element) {
        return customList.add(element);
    }

    public static void populateList (List<String> list) {

        list.add("GKFFD");
        list.add("TNANA");
        list.add("MPMSL");
        list.add("PSWME");
        list.add("LZMLF");
        list.add("JYEBV");
        list.add("YELNT");
        list.add("JSNKR");
        list.add("JFESF");
        list.add("TMJLL");
    }

    public static void main(String[] args) {
        List<String> arrayList = createArrayList();
        System.out.println("ArrayList:");
        printElementsAndIndex(arrayList);

        System.out.println("\nAñadiendo AAAAA a ArrayList: " + addElementToList(arrayList, "AAAAA"));
        System.out.println("ArrayList actualizado");
        printElementsAndIndex(arrayList);

    }
}
