package MainTest;

import Main.Person;
import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class AssertJTest {

    @Test
    public void checkEquality() {
        Person person = new Person("Barack", "Obama");
        Person personClone = new Person("Barack", "Obama");
        assertThat(person).isEqualTo(personClone);
    }
}
