package com.example.kdt_cookie.product.productDto;

public class ProductDto {
    private String id;
    private String productname;
    private String thumb;
    private String status;
    private String price;
    private String amount;
    private String summary;
    private String content;
    private String indate;
    private String markettype;
    private String ordernum;

    public ProductDto() {
    }

    public ProductDto(String id, String productname, String thumb, String status, String price,
                      String amount, String summary, String content, String indate, String markettype, String ordernum) {
        this.id = id;
        this.productname = productname;
        this.thumb = thumb;
        this.status = status;
        this.price = price;
        this.amount = amount;
        this.summary = summary;
        this.content = content;
        this.indate = indate;
        this.markettype = markettype;
        this.ordernum = ordernum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getIndate() {
        return indate;
    }

    public void setIndate(String indate) {
        this.indate = indate;
    }

    public String getMarkettype() {
        return markettype;
    }

    public void setMarkettype(String markettype) {
        this.markettype = markettype;
    }

    public String getOrdernum() {
        return ordernum;
    }

    public void setOrdernum(String ordernum) {
        this.ordernum = ordernum;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "id='" + id + '\'' +
                ", productname='" + productname + '\'' +
                ", thumb='" + thumb + '\'' +
                ", status='" + status + '\'' +
                ", price='" + price + '\'' +
                ", amount='" + amount + '\'' +
                ", summary='" + summary + '\'' +
                ", content='" + content + '\'' +
                ", indate='" + indate + '\'' +
                ", markettype='" + markettype + '\'' +
                ", ordernum='" + ordernum + '\'' +
                '}';
    }
}
