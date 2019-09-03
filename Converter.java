import java.util.Hashtable;

public class Converter {

    private Hashtable<Integer,String> frenchTranslations=new Hashtable<>();
    private Hashtable<Integer,String> germanTranslations=new Hashtable<>();

    public void initializeTranslations(){
        frenchTranslations.put(1, "Un");
        frenchTranslations.put(2, "Deux");
        germanTranslations.put(1, "Einz");
        germanTranslations.put(2, "Zwei");    
    }

    public String convert(int number, String language){
       String translated=null;
        if (language.equals("french")){
            translated=frenchTranslations.get(number);
        }
        else if (language.equals("german")){
            translated=germanTranslations.get(number);
        }
        
        return translated;
    }


}