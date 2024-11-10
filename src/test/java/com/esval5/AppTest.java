package com.esval5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;

public class AppTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testAppMainOutput() {
        App.main(new String[]{});

        String output = outputStreamCaptor.toString().trim();

        assertThat(output, containsString("Person 1:"));
        assertThat(output, containsString("Nombre: Mike"));
        assertThat(output, containsString("Apellido: Wazowski"));
        assertThat(output, containsString("Número de documento de identidad: 1111111111"));
        assertThat(output, containsString("Año de Nacimiento: 1980"));
        assertThat(output, containsString("País de Nacimiento: Neverland"));
        assertThat(output, containsString("Género: H"));

        assertThat(output, containsString("Person 2:"));
        assertThat(output, containsString("Nombre: Sully"));
        assertThat(output, containsString("Apellido: Salt"));
        assertThat(output, containsString("Número de documento de identidad: 2222222222"));
        assertThat(output, containsString("Año de Nacimiento: 1983"));
        assertThat(output, containsString("País de Nacimiento: Neverland"));
        assertThat(output, containsString("Género: H"));
    }
}