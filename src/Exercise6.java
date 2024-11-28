import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise6 {
    // [Optional] [Bài tập] Crawl tin tức
    public static void main(String[] args) {
        URL url = null;
        try {
            url = new URL("https://dantri.com.vn/the-gioi.htm");
            // open the stream and put it into BufferedReader
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            scanner.useDelimiter("\\Z");
            StringBuilder sb = new StringBuilder();
            while (scanner.hasNext()) {
                sb.append(scanner.nextLine());
            }
            scanner.close();

            String content = sb.toString();

            //// Regex Explain
            // Group 1: Find element with class that contain new header (dt-text-black-mine) and
            // read until start tag close
            // Group 2: Read new header until end tag
            // Group 3: Read end tag
            Pattern pattern = Pattern.compile("(<a class=\"dt-text-black-mine\"[^>]*>)([^<]*)(<\\/a>)");
            Matcher matcher = pattern.matcher(content);

            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
