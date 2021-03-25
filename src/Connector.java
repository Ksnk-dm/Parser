import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


import java.io.*;


public class Connector {
    private int count = 0;

    private Document connect(String url) throws IOException, InterruptedException {
        Document doc = Jsoup.connect(url)
                .userAgent("Mozilla/5.0 (Windows NT 6.3; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/48.0.2564.48 Safari/537.36")
                .get();
        Thread.sleep(10000);
        return doc;
    }

    private void saveToFile(Element element, File file) throws IOException, InterruptedException {
        for (int i = 1; i <= 20; i++) {
            Element element1 = element.getElementsByClass("mpof_ki mqen_m6 mp7g_oh mh36_0 mvrt_0 mg9e_8 mj7a_8 m7er_k4 _1y62o _9c44d_1I1gg ").get(i);
            try (PrintWriter pw = new PrintWriter(new FileWriter(file, true))) {
                Elements sale = element1.getElementsByClass("_9c44d_1uHr2");
                Elements name = element1.getElementsByClass("mgn2_14 m9qz_yp mqu1_16 mp4t_0 m3h2_0 mryx_0 munh_0");
                Elements price = element1.getElementsByClass("msa3_z4 _9c44d_2K6FN");
                Elements oldPrice = element1.getElementsByClass("mpof_uk mqu1_ae _9c44d_18kEF m9qz_yp _9c44d_2BSa0  _9c44d_KrRuv");
                Elements priceDelivery = element1.getElementsByClass("mqu1_g3");
                Elements dayDelivery = element1.getElementsByClass("mpof_uk mqu1_ae _9c44d_18kEF _9c44d_3gH36 m9qz_yq ");
                if (sale.text().length() == 4) {
                    pw.println(new Product(name.text(), price.text(), oldPrice.text(), sale.text(), priceDelivery.text(), dayDelivery.text()));
                    count++;
                    System.out.println(count + " " + name.text() + " sale: " + sale.text() + " price:" + price.text() + " oldprice: " + oldPrice.text());

                }
                if (count == 100) {
                    break;
                }
            }
        }
    }

    public void parcePage(String url, File file) throws IOException, InterruptedException {
        for (int i = 1; i <= 100; i++) {
            Element fullPage1 = connect(url + i);
            Thread.sleep(3000);
            saveToFile(fullPage1, file);
        }
    }
}












