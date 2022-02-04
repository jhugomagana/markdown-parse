import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.ArrayList;

// windows MINGW64 bash commands
// javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
// java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile1() throws IOException {
        String contents= Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("https://something.com", "some-page.html");
        assertEquals(MarkdownParse.getLinks(contents), expect);
    }
    
    private String load(String words) throws IOException {
		Path fileName = Path.of(words);
	    String contents = Files.readString(fileName);
        return contents;
    }

    // @Test
    // public void parse() throws IOException {
    //     ArrayList<String>[] list = new ArrayList[8];
    //     list[0] = new ArrayList();
    //     list[1] = new ArrayList();
    //     list[2] = new ArrayList();
    //     list[3] = new ArrayList();
    //     list[4] = new ArrayList();
    //     list[5] = new ArrayList();
    //     list[6] = new ArrayList();
    //     list[7] = new ArrayList();
    //     list[0].add("http://something.com");
    //     list[0].add("http://somemorething.com");
    //     list[1].add("https://something.com");
    //     list[1].add("some-page.html");
    //     list[2].add("www.something.com");
    //     list[2].add("www.something.com");
    //     list[7].add("a link on the first line");

    //     for (int i = 1; i < 8; i++) {
    //         String file = load("test-file" + (i + 1) + ".md");
    //         assertEquals(list[i],MarkdownParse.getLinks(file));
    //     }
    // }

}
