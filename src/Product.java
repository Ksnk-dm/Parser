public class Product {
    private String name;
    private String newPrice;
    private String oldPrice;
    private String sale;
    private String priceDelivery;
    private String dayDelivery;

    public Product() {
    }

    public Product(String name, String newPrice, String oldPrice, String sale, String priceDelivery, String dayDelivery) {
        this.name = name;
        this.newPrice = newPrice;
        this.oldPrice = oldPrice;
        this.sale = sale;
        this.priceDelivery = priceDelivery;
        this.dayDelivery = dayDelivery;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice;
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice;
    }

    public String getSale() {
        return sale;
    }

    public void setSale(String sale) {
        this.sale = sale;
    }

    public String getPriceDelivery() {
        return priceDelivery;
    }

    public void setPriceDelivery(String priceDelivery) {
        this.priceDelivery = priceDelivery;
    }

    public String getDayDelivery() {
        return dayDelivery;
    }

    public void setDayDelivery(String dayDelivery) {
        this.dayDelivery = dayDelivery;
    }

    @Override
    public String toString() {
        return name + ';' +
                newPrice + ';' +
                oldPrice + ';' +
                sale + ';' +
                priceDelivery + ';' +
                dayDelivery + ';';
    }
}

