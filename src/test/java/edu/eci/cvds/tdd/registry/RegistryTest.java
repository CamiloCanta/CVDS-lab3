package edu.eci.cvds.tdd.registry;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegistryTest {
    private Registry registry = new Registry();
    @Test
    public void validateRegistryResult() {
        Person person = new Person("camilo", 001, 21, Gender.MALE, true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.VALID, result);
    }
    @Test
    public void validateRegistryResultInvalidAge() {
        Person person = new Person("XLR8", 002, -21, Gender.UNIDENTIFIED, true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.INVALID_AGE, result);
    }

    @Test
    public void validateRegistryResultDead() {
        Person person = new Person("pepe", 003, 91, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.DEAD, result);
    }

    @Test
    public void validateRegistryResultUnderage() {
        Person person = new Person("juanita", 004, 17, Gender.FEMALE, true);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.UNDERAGE, result);
    }

    @Test
    public void validateRegistryResultDuplicate() {
        Person person = new Person("sancho", 005, 21, Gender.MALE, false);

        RegisterResult result = registry.registerVoter(person);

        assertEquals(RegisterResult.DEAD, result);
    }




}
