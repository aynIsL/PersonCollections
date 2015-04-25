import kyselov.person.Person;
import org.junit.Test;

import java.util.LinkedList;

public class PersonTest {
    @Test
    public void nullPersonList(){
        LinkedList<Person> myFamily = new LinkedList<Person>();
        if(myFamily.size()>0) {
            throw new AssertionError();
        }
    }

    @Test
    public void addPersonToPersonList(){
        LinkedList<Person> myFamily = new LinkedList<Person>();
        myFamily.add(new Person.Builder().firstName("Someone").eMail("someone@somewhere.com").age(25).build());
        if(myFamily.size()==0) {
            throw new AssertionError();
        }
    }

    @Test
    public void RemovePersonToPersonList(){
        LinkedList<Person> myFamily = new LinkedList<Person>();
        myFamily.add(new Person.Builder().firstName("Someone").eMail("someone@somewhere.com").age(25).build());
        myFamily.remove(0);
        if(myFamily.size()>0) {
            throw new AssertionError();
        }
    }

}
