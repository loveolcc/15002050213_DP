package week7;

public class PersonProxy implements PersonInterface {
    private PersonInterface person;
    public PersonProxy(PersonInterface person) {
        this.person = person;
    }
    @Override
    public void save() {
        TransactionManager.begin();
        person.save();
        TransactionManager.commit();
    }

    @Override
    public void update() {
        TransactionManager.begin();
        person.update();
        TransactionManager.commit();
    }

    @Override
    public void delete() {
        TransactionManager.begin();
        person.delete();
        TransactionManager.commit();
    }
}
