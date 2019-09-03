import org.junit.Test;

public class ConverterTest{

private Converter converter;

@Before
public void setup(){
converter=new Converter();
converter.initializeTranslations();
}



@Test
public void convert_with1inGerman_shouldreturnEinz() {
    Converter converter=new Converter();
    convert.initializeTranslations();
    String translated=converter.convert(number: 1, language: "german");
    assertEquals(message: "1 is not giving Einz in german", expected: "Einz",translated);
}

@Test
public void convert_with18inGerman_shouldreturnAchtzehn() {
    Converter converter=new Converter();
    convert.initializeTranslations();
    String translated=converter.convert(number: 18, language: "german");
    assertEquals(message: "18 is not giving Achtzehn in german", expected: "Achtzehn",translated);
}
 //30 in german: Dreißig
}