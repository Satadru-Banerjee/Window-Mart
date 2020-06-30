public class Product
{
    private int pid;
    private String pname;
    private String pcategory;
    private int pprice;
    private int pqty;
    private int pdelTime;
    private String pdesc;
    private String pimg;
    public Product()
    {
        pid=0;
        pname="";
        pcategory="";
        pprice=0;
        pqty=0;
        pdelTime=0;
        pdesc="";
        pimg="img/generic.jpg";
    }
    public Product(int prodId, String prodName, String cat, int pr, int quant, int delivery, String des, String image)
    {
        pid=prodId;
        pname=prodName;
        pcategory=cat;
        pprice=pr;
        pqty=quant;
        pdelTime=delivery;
        pdesc=des;
        pimg=image;
    }
}