/* <dependency>
  <groupId>org.jsoup</groupId>
  <artifactId>jsoup</artifactId>
  <version>1.14.3</version>
</dependency>
 */

 import org.jsoup.Jsoup;
 import org.jsoup.nodes.Document;
 
 public class A4jsoup
  {
     public static void main(String[] args) throws Exception {
         String url = "https://github.com/";
         Document doc = Jsoup.connect(url).get();
         String title = doc.title();
         System.out.println("Title: " + title);
     }
 }