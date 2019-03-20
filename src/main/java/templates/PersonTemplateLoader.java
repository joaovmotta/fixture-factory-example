package templates;

import br.com.six2six.bfgex.Gender;
import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import entity.Person;
import org.apache.commons.lang.RandomStringUtils;

import java.text.SimpleDateFormat;

public class PersonTemplateLoader implements TemplateLoader {

    private static final String MALE = "MALE";
    private static final String FEMALE = "FEMALE";
    private static final String PERSON = "PERSON";

    @Override
    public void load() {

        basePersonTemplate();
        malePersonTemplate();
        femalePersonTemplate();
    }

    private void basePersonTemplate(){
        Fixture.of(Person.class).addTemplate(PERSON, new Rule(){{
            add("lastName", lastName());
            add("inscriptionCode", random(Long.class, range(10000L, 99999L)));
            add("nickname", "best${lastName}bad${firstName}");
            add("phoneNumber", regex("(16) 9(\\d{4})-(\\d{4})"));
            add("secretPassword", RandomStringUtils.randomAlphanumeric(13));
            add("birthday", randomDate("1996-08-20", "2019-11-07", new SimpleDateFormat("yyyy-MM-dd")));
        }});
    }

    private void malePersonTemplate(){
        Fixture.of(Person.class).addTemplate(MALE).inherits(PERSON, new Rule() {{
            add("firstName", firstName(Gender.MALE));
        }});
    }

    private void femalePersonTemplate(){
        Fixture.of(Person.class).addTemplate(FEMALE).inherits(PERSON, new Rule(){{
            add("firstName", firstName(Gender.FEMALE));
        }});
    }
}
