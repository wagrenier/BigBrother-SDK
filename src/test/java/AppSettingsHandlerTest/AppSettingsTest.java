package AppSettingsHandlerTest;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import AppSettingsHandler.AppSettings;
import FileReader.JsonReader;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@DisplayName("AppSettings Tests")
public class AppSettingsTest {

  @Mock
  JsonReader jsonReaderMock;

  @Mock
  JSONObject jsonObject;

  private AppSettings target;

  @BeforeEach
  void beforeEach(){
    MockitoAnnotations.initMocks(this);
    when(jsonObject.get(any())).thenReturn("AppSettingKeyTest");
    when(jsonReaderMock.getCurrentWorkingPath()).thenReturn("DummyPath");
    when(jsonReaderMock.findFile(any())).thenReturn("DummyPathWithFileExtension");
    when(jsonReaderMock.openFile(any())).thenReturn(jsonObject);
    when(jsonReaderMock.getValue(any(), any())).thenReturn("AppSettingsTest");

    target = new AppSettings(jsonReaderMock);
  }

  @Test
  @DisplayName("When AppSettings Returns AppSettings As File Name When GetFileName Is Called")
  void WhenAppSettingsReturnsAppSettingsAsFileNameWhenGetFileNameIsCalled() {
    // Act & Assert
    String actual = this.target.getFileName();
    Assert.assertEquals(String.format("AppSettings was the expected value, but instead was %s",
        actual), "AppSettings", actual);
  }

  @Test
  @DisplayName("AppSettings Return Value When Called")
  void AppSettingsReturnValueWhenCalled() {
    // Act & Assert
    String actual = (String) this.target.getValue("DummyValue");
    Assert.assertEquals(String.format("AppSettings was the expected value, but instead was %s",
            actual), "AppSettingsTest", actual);
  }

}
