package com.esval5;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PersonTest {
    private Person person;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        person = new Person("Juan", "Pérez", "3333333333", 1990, "España", 'H');
        System.setOut(new PrintStream(outputStreamCaptor));
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
        assertThat("El número de identificación no coincide", person.getIdNumber(), is("3333333333"));
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
    public void testPrintAttributes() {
        person.printAttributes();

        String output = outputStreamCaptor.toString().trim();
        assertThat(output, containsString("Nombre: Juan"));
        assertThat(output, containsString("Apellido: Pérez"));
        assertThat(output, containsString("Número de documento de identidad: 3333333333"));
        assertThat(output, containsString("Año de Nacimiento: 1990"));
        assertThat(output, containsString("País de Nacimiento: España"));
        assertThat(output, containsString("Género: H"));
    }
}

