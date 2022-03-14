import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
//import java.util.List;
import java.util.ArrayList;

// windows MINGW64 bash commands
// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    // @Test
    // public void testFile1() throws IOException {
    //     String contents= Files.readString(Path.of("./test-file.md"));
    //     List<String> expect = List.of("https://something.com", "some-page.html");
    //     assertEquals(MarkdownParse.getLinks(contents), expect);
    // }
    
    private String load(String words) throws IOException {
		String contents= Files.readString(Path.of(words));
        return contents;
    }

    @Test
    public void parse() throws IOException {
        ArrayList<ArrayList<String> > list = new ArrayList<ArrayList<String> >(8);
        ArrayList<String> file1 = new ArrayList<String>();
        file1.add("https://something.com");
        file1.add("some-page.html");
        ArrayList<String> file2 = new ArrayList<String>();
        file2.add("https://something.com");
        file2.add("some-page.html");
        ArrayList<String> file5 = new ArrayList<String>();
        //file5.add("page.com");
        ArrayList<String> file8 = new ArrayList<String>();
        file8.add("a link on the first line");
        ArrayList<String> file3 = new ArrayList<String>();
        ArrayList<String> file4 = new ArrayList<String>();
        ArrayList<String> file6 = new ArrayList<String>();
        ArrayList<String> file7 = new ArrayList<String>();
        list.add(file1);
        list.add(file2);
        list.add(file3);
        list.add(file4);
        list.add(file5);
        list.add(file6);
        list.add(file7);
        list.add(file8);

        for (int i = 0; i < 8; i++) {
            int filenum = 1 + i;
            String file = load("test-file" + (filenum) + ".md");
            assertEquals("Test: " + filenum, MarkdownParse.getLinks(file), list.get(i));
        }
    }

}
