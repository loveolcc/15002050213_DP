package week6.personcmp;

public class PersonCmpByHeight  extends AbstarctPersonCmp{
    @Override
    protected int compare(Person p1, Person p2) {
        return p1.getHeight() - p2.getHeight();
    }
}
