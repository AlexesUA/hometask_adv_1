package ua.edu.cbs.lms.hometask_adv_1.task2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random rndNumbers = new Random();

        List<Integer> listInt = new ArrayList<>();

        for (int i=0; i<10; i++){
            listInt.add(rndNumbers.nextInt(0, 100));
        }

        ListIterator<Integer> iterInt = listInt.listIterator();

        while (iterInt.hasNext()){
            System.out.print(iterInt.next() + "; ");
        }
        System.out.println();

        String[] tempStr = {"Наталя", "Ігор", "Ольга", "Володимир", "Юлія", "Василь", "Тетяна", "Олексій", "Юрій", "Людмила"};

        Set<String> setString = new TreeSet<>(List.of(tempStr));
        //setString.addAll(Arrays.stream(tempStr).toList());

        Iterator<String> iterStr = setString.iterator();

        while (iterStr.hasNext()){
            System.out.print(iterStr.next() + "; ");
        }
        System.out.println();

    }
}
