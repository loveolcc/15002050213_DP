package week5;

public class PersonServiceProxy implements PersonService {

    private PersonService personService;
    public PersonServiceProxy(PersonService personService){
        this.personService=personService;
    }
    @Override
    public void save() {
        TransactionManger.begin();
        personService.save();
        TransactionManger.commit();
    }

    @Override
    public void update() {
        TransactionManger.begin();
        personService.update();
        TransactionManger.commit();
    }

    @Override
    public void delete() {
        TransactionManger.begin();
        personService.delete();
        TransactionManger.commit();
    }

    @Override
    public void list() {
        personService.list();
    }
}
