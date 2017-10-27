import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by laptop on 14.10.17.
 */
public class NameSeachTest {

    @org.junit.Test
    public void shouldFindNameInFileAndPrintNublerOfLine() throws IOException {

        //given
        NameSearch nameSearch = new NameSearch();

        //when
        List lineNumber = nameSearch.searchInFile("anna");
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(6);

        //then
       assertEquals(list,lineNumber);
        
    }
    @org.junit.Test
    public void shouldGetCountWords() throws IOException {
        //given
        NameSearch nameSearch = new NameSearch();

        //when
      Map<String, Integer> resoult =  nameSearch.takeNamesFromFile();

        //then
        assert(resoult.get("anna")==4);

    }

}