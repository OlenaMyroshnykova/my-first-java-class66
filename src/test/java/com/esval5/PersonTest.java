package com.esval5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PersonTest {
    private Person person;

    @BeforeEach
    void setUp() {
        person = new Person("Juan", "Pérez", "3333333333", 1990, "España", 'H');
    }

    @Test
    void testNombre() {
        assertThat("El nombre no coincide", person.getFirstName(), is("Juan"));
    }

    @Test
    void testApellido() {
        assertThat("El apellido no coincide", person.getLastName(), is("Pérez"));
    }

    @Test
    void testNumeroDeIdentificacion() {
        assertThat("El número de identificación no coincide", person.getIdNumber(), is("12345678"));
    }

    @Test
    void testAnoDeNacimiento() {
        assertThat("El año de nacimiento no coincide", person.getBirthYear(), is(1990));
    }

    @Test
    void testPaisDeNacimiento() {
        assertThat("El país de nacimiento no coincide", person.getCountryOfBirth(), is("España"));
    }

    @Test
    void testGenero() {
        assertThat("El género no coincide", person.getGender(), is('H'));
    }

    @Test
    void testImprimirAtributos() {
        assertThat("El método printAttributes lanza una excepción", person.printAttributes(), is(notNullValue()));
    }
}

