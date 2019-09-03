/*
import java.util.Scanner;

public class bob{
public static void main(String[ ] args) {

    firstStep();
    checkEnteredNumber(numberToTranslate);  

    //once working try to break it, if breaking it works add it as an issue on github

    //Scanner should be java util or something? is that why the code below doesnt work?


    //function for first step
    firstStep() {
    System.out.println( "Welcome to the Amazing Translator app.");
    System.out.println( "You can choose any number from 1 to 30 to translate into French or German e.g. '1', '18', etc.");
    System.out.println( "What number would you like to translate?");
    Scanner scan=new Scanner(System.in);
    String numberToTranslateInString=scan.nextLine();
    int numberToTranslate=Integer.parseInt(numberToTranslateInString);
    return numberToTranslate;
    }

    //function to check if number to translate is correct
    checkEnteredNumber(enteredNumber) {

    if ((enteredNumber >=1) && (enteredNumber <=30)) {
        System.out.println( "You have entered " +enteredNumber "as the number to translate.");
        System.out.println( "To translate " +enteredNumber "into French, type 'F'.");
        System.out.println( "To translate " +enteredNumber "into German, type 'G'.");
        System.out.println( "To go back to the beginning and choose a different number from 1-30 to translate, type 'B'");
        }
    else {
        System.out.println( "The number to translate must be a whole number between 1 and 30 inclusive, written using digits only.");
        }

    }
//pom.xml???

// below is on board wk 6
/*
*/





import java.util.Hashtable;
import java.util.Scanner;

public class bob
{

    public static void main( String[] args )
    {
        
        System.out.println( "Please enter a number to translate" );
        Scanner scan=new Scanner(System.in);
        String numberAsString = scan.nextLine();
        int numberToTranslate = Integer.parseInt(numberAsString);
        System.out.println( "What is the language (french/german)" );
        String language = scan.nextLine();
        Converter converter = new Converter();
        converter.initializeTranslations();
        String translated = converter.convert(numberToTranslate,language);
        System.out.println("The translated number is " +translated);
        scan.close();

    }
}

/*


    }
}*/