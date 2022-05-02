import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuckTest {
   String name = "Hulu";
   Duck underTest;

    @BeforeEach
    void  setup(){
        underTest = new Duck(name);
    }

    @Test
    @DisplayName("Check for Valid String")
    void getStringName() {
        assertEquals("Hulu",underTest.getName());
    }
}