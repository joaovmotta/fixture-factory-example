package templates;

import br.com.six2six.fixturefactory.Fixture;
import br.com.six2six.fixturefactory.Rule;
import br.com.six2six.fixturefactory.loader.TemplateLoader;
import entity.Address;

public class AdressTemplateLoader implements TemplateLoader {

    @Override
    public void load() {
        Fixture.of(Address.class).addTemplate("fromBrazil", new Rule(){{
            //You can usa uniqueRandom method to not repeat the sorted values (will repeat only if all values were sorted)
            //add("street", uniqueRandom("Paulista Avenue", "Ibirapuera Avenue"))
            add("street", random("Paulista Avenue", "Ibirapuera Avenue"));
            add("city", "São Paulo");
            add("state", "Matão");
            add("country", "Brazil");
            add("zipCode", random(Long.class, range(15990000L, 162000000L)));
        }});
    }
}
