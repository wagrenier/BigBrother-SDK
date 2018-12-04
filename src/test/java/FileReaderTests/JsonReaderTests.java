package FileReaderTests;

import FileReader.JsonReader;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

import java.io.FileNotFoundException;

public class JsonReaderTests {

    private JsonReader target = new JsonReader();

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @BeforeEach
    void beforeEach(){

    }

    @Test
    @DisplayName("Json Reader Return Current Working Path")
    void JsonReaderReturnCurrentWorkingPath() {
        // Act & Assert
        String actual = target.getCurrentWorkingPath();
        Assert.assertEquals(String.format("The current working path was the expected value, but instead was %s",
                actual), System.getProperty("user.dir"), actual);
    }

    @Test
    @DisplayName("Json Reader Return File Extension Type")
    void JsonReaderReturnFileExtensionType() {
        // Act & Assert
        String actual = target.getTypeExtension();
        Assert.assertEquals(String.format("The extension type .json was the expected value, but instead was %s",
                actual), ".json", actual);
    }

    @Test
    @DisplayName("Json Reader Return Null When GetValue Receives Null Values")
    void JsonReaderReturnNullWhenGetValueReceivesNullValues() {
        // Act & Assert
        Object actual = target.getValue(null, "DummyKey");
        Assert.assertEquals(String.format("Null was the expected value, but instead was %s",
                actual), null, actual);
    }

    @Test
    @DisplayName("Json Reader Return Null When GetValue Receives Null Values With Null Key")
    void JsonReaderReturnNullWhenGetValueReceivesNullValuesWithNullKey() {
        // Act & Assert
        Object actual = target.getValue(null, null);
        Assert.assertEquals(String.format("Null was the expected value, but instead was %s",
                actual), null, actual);
    }

    @Test
    @DisplayName("Json Reader Open File Fails When Null Is Sent As Path No File Is Not Found")
    void JsonReaderOpenFileFailsWhenNullIsSentAsPathNoFileIsNotFound() {
        // Act & Assert
        Object actual = target.openFile(null);
        Assert.assertEquals(String.format("Null was the expected value, but instead was %s",
                actual), null, actual);
    }

    @Test
    @DisplayName("Json Reader Open File Fails When No File Is Not Found")
    void JsonReaderOpenFileFailsWhenNoFileIsNotFound() {
        // Assign
        thrown.expect(FileNotFoundException.class);
        // Act & Assert
        Object actual = target.openFile("DummyPath");
        Assert.assertEquals(String.format("Null was the expected value, but instead was %s",
                actual), null, actual);
    }

}
