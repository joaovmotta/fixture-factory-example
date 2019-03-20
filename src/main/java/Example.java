import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.loader.FixtureFactoryLoader;
import entity.Person;

import java.util.List;

public class Example {

    public static void main(String[] args) {

        //1# - Load your templates to use

        FixtureFactoryLoader.loadTemplates("templates");

        //2# - Enjoy the framework

        Person person = Fixture.from(Person.class).gimme("MALE");
        List<Person> listFemale = Fixture.from(Person.class).gimme(6, "FEMALE");
        List<Person> listMix = Fixture.from(Person.class).gimme(2, "FEMALE", "MALE");

        System.out.println("Happy");
    }
}
