
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Connector connector1 = new Connector();
        Connector connector2 = new Connector();
        Connector connector3 = new Connector();
        File file = new File("product.csv");

        connector1.parcePage("https://allegro.pl/kategoria/akcesoria-gsm-348?bmatch=cl-e2101-d3681-c3682-ele-1-1-0319&p=", file);
        connector2.parcePage("https://allegro.pl/kategoria/dziecko?string=bargain_zone&bmatch=e2101-d3681-c3682-bab-1-1-0319&p=", file);
        connector3.parcePage("https://allegro.pl/kategoria/dom-i-ogrod?string=bargain_zone&bmatch=e2101-d3681-c3682-hou-1-1-0319&p=", file);
    }
}









