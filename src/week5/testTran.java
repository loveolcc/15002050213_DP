package week5;

public class testTran {
    public static void main(String[] args) {
        PersonService personService = new PersonServiceProxy(new PersonServicempl());
        personService.save();
        personService.update();
        personService.list();
    }
}
