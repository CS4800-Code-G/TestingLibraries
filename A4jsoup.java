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
     public static void main(String[] args) throws Exception
      {
         String url = "https://github.com/";
         Document doc = Jsoup.connect(url).get();
         String title = doc.title();
         System.out.println("Title: " + title);
     }
 }

/* 
 Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
log(doc.title());
Elements newsHeadlines = doc.select("#mp-itn b a");
for (Element headline : newsHeadlines) {
  log("%s\n\t%s", 
    headline.attr("title"), headline.absUrl("href"));
} */