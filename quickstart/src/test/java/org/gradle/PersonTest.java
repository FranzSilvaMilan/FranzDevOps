package org.gradle;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.assertEquals;

public class PersonTest {
    private Person person;

    /**
     * Initialize the person object.
     */
    @Before
    public void initialize() {
        person = new Person("franz", 25, "6666666", 2.0, 90.0,
                "78547", "Av. ave", "male",
                "franz@gmail.com", "Bolivian", "");
    }

    /**
     * this method verifies the name of the person.
     */
    @Test
    public void testThePersonName() {
        assertEquals("franz", person.getName());
    }

    /**
     * this method verifies the age of the person.
     */
    @Test
    public void testThePersonAge() {
        assertEquals(25, person.getAge());
    }

    /**
     * this method verifies the CI of the person.
     */
    @Test
    public void testThePersonCI() {
        assertEquals("6666666", person.getCI());
    }

    /**
     * this method verifies the height of the person.
     */
    @Test
    public void testThePersonHeight() {
        assertEquals(2.0, person.getHeightMts(), 0.0);
    }

    /**
     * this method verifies the weight of the person.
     */
    @Test
    public void testThePersonWeight() {
        assertEquals(90.0, person.getWeightKg(), 0.0);
    }

    /**
     * this method verifies the body mass index of the person.
     */
    @Test
    public void testPersonBodyMass() {
        assertEquals(22.5, person.getBodyMassIndex(), 0.0);
    }

    /**
     * this method verifies the phone number of the person.
     */
    @Test
    public void testPersonPhoneNumber() {
        assertEquals("78547", person.getPhoneNumber());
    }

    /**
     * this method verifies the address of the person.
     */
    @Test
    public void testPersonAddress() {
        assertEquals("Av. ave", person.getAddress());
    }

    /**
     * this method verifies the gender of the person.
     */
    @Test
    public void testPersonGender() {
        assertEquals("male", person.getGender());
    }

    /**
     * this method verifies the email of the person
     */
    @Test
    public void testPersonEmail() {
        assertEquals("franz@gmail.com", person.getEmail());
    }

    /**
     * this method verifies the nationality of the person
     */
    @Test
    public void testPersonNationality() {
        assertEquals("Bolivian", person.getNationality());
    }

    /**
     * this method verifies the civil status of the person
     */
    @Test
    public void testPersonCivilStatus() {
        assertEquals("", person.getCivilStatus());
    }
}
