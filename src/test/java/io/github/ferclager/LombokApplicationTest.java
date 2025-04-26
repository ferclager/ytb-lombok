package io.github.ferclager;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class LombokApplicationTest {

    @Test
    void shouldThrowRuntimeException_whenFilenameIsNull() {
        Executable executable = () -> {
            LombokApplication.getData(null);
        };
        assertThrows(RuntimeException.class, executable);
    }

    @Test
    void shouldThrowIOException_whenNoJsonFileFound() {
        Executable executable = () -> {
            LombokApplication.getData("otherfile.json");
        };
        assertThrows(IllegalArgumentException.class, executable);
    }

    @Test
    void shouldNotThrowException_whenFileIsDataJson() {
        assertDoesNotThrow(() -> LombokApplication.getData("data.json"));
    }
}