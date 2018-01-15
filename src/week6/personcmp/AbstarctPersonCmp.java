package week6.personcmp;

public abstract class AbstarctPersonCmp {
    protected abstract int compare(Person p1, Person p2);
    public void sort(Person[] personArray){
        for (int i = 0; i <personArray.length-1 ; i++) {
            for (int j = 0; j <personArray.length ; j++) {
                if (compare(personArray[i],personArray[j]) < 0){
                    Person tmp =personArray[i];
                    personArray[i]=personArray[j];
                    personArray[j]=tmp;
                }
            }
        }
    }
}
