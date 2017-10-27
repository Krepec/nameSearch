import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by laptop on 12.10.17.
 */
public class App {

    public static void main(String [] args) throws IOException {


            Scanner input = new Scanner(System.in);
            System.out.println("Podaj imię: ");
            String name = input.nextLine();
           /* int count = 0;

        System.out.println(mostRepeatWords);*/

        NameSearch nameSearch = new NameSearch();
       nameSearch.searchInFile(name);
       Map mapResoult = nameSearch.takeNamesFromFile();
        System.out.println(mapResoult);
        }


    }





