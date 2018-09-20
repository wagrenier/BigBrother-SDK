package AppSettingsHandlerTest;

import org.junit.Assert;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Code taken from https://www.petrikainulainen.net/programming/testing/junit-5-tutorial-writing-our-first-test-class/
 * This class is simply to create a dummy test and set an example for other members
 */

@DisplayName("Tests for the AppSettingsHandler Package")
public class AppSettingsTest {
  @BeforeAll
  static void beforeAll(){
    System.out.println("Before all test methods");
  }

  @BeforeEach
  void beforeEach(){
    System.out.println("Before each test methods");
  }

  @AfterEach
  void afterEach() {
    System.out.println("After each test method");
  }

  @AfterAll
  static void afterAll() {
    System.out.println("After all test methods");
  }

  @Test
  @DisplayName("First test")
  void firstTest() {
    // Assign
    int expected = 1;

    // Act
    int actual = 0 + 1;

    // Assert
    System.out.println("First test method");
    Assert.assertEquals("Description of the values, what expected, obtained value. This message shows only " +
        "when the test fails.", expected, actual);
  }

  /*
   * Each test must be split in 3 sections: Assign, Act, Assert
   */

  @Test
  @DisplayName("Second test")
  void secondTest() {
    // Assign
    int expected = 1;

    // Act
    int actual = 0 + 1;

    // Assert
    System.out.println("Second test method");
    Assert.assertEquals("Description of the values, what expected, obtained value. This message shows only " +
        "when the test fails.", expected, actual);
  }
}
