import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {
    private Animal dog;

    @BeforeEach
    void setUp() {
        dog = new Animal("Bello", 3, "Dog", "Wuff");
    }

    @Test
    @DisplayName("Test Konstruktor")
    void testAgeSmallerThan0(){
        Animal cat = new Animal("Minky", -1, "cat", "miau");
        assertEquals("Minky", cat.getName());
        assertEquals(0, cat.getAge());
        assertEquals("cat", cat.getSpecies());
        assertEquals("miau", cat.getAnimalLoud());
    }

    @Test
    void giveAnimalLoud() {
        String expected = "Wuff";
        String actual = dog.giveAnimalLoud();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void getNameAndAge() {
        String expected = "Name: Bello, Alter: 3";
        Assertions.assertEquals(expected, dog.getNameAndAge());
    }

    @Test
    void ageCategory() {
        String expected = "young animal";
        Assertions.assertEquals(expected, dog.AgeCategory());

        dog.setAge(8);
        assertEquals("old animal", dog.AgeCategory());

        dog.setAge(1);
        assertEquals("baby animal", dog.AgeCategory());
    }

    @Test
    void isABabyAnimal() {
        Animal cat = new Animal("Minky", -1, "cat", "miau");
        assertTrue(cat.isABabyAnimal());

        dog = new Animal("Bello", 3, "Dog", "Wuff");
        assertFalse(dog.isABabyAnimal());
    }
    @Test
    void isNotABabyAnimal(){
        dog = new Animal("Bello", 3, "Dog", "Wuff");
        assertFalse(dog.isABabyAnimal());
    }
}