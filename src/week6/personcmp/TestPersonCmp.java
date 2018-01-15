package week6.personcmp;

import java.util.Random;

public class TestPersonCmp {
    public static void main(String[] args) {
        Person[] personArray = new Person[10];
        Random rdm =new Random();
        for (int i = 0; i <personArray.length ; i++) {
            personArray[i] = new Person("Person"+i, rdm.nextInt(200),rdm.nextInt(100));
        }
        for (int i = 0; i <personArray.length ; i++) {
            System.out.println(personArray[i].getName()+":" +personArray[i].getHeight());
        }

        AbstarctPersonCmp cmp =new PersonCmpByHeight();
        cmp.sort(personArray);

//        System.out.println("排序后：");
//        for (int i = 0; i <personArray.length ; i++) {
//            System.out.println(personArray[i].getName()+":" +personArray[i].getHeight());
//        }
//                System.out.println("排序后：");



    }
}
