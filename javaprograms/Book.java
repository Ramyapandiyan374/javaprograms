class LibraryItem 
{
    private int id;
    private double price;
    LibraryItem(int id,double price)
    {
        //l.i;
        this.id=id;
        this.price=price;
    }
    public int getId()
    {
        return id;
    }
    public double getPrice()
    {
        return price;
    }
    public void setId(int id)
    {
        this.id=id;
    }
    public void setPrice(double price)
    {
        this.price=price;
    }


}
class Book extends LibraryItem 
{
    private String author;
    private int  pages;
    private Book(int id,double price,String author,int pages)
    {
        super(id,price);
        //l.i;
        this.author=author;
        this.pages=pages;
    }
    public static Book giveBook(int id1,double price1,String author1,int pages1)
    {
        return new Book(id1,price1,author1,pages1);
    }
    public static Book giveBook1(int id2,double price2,String author2,int pages2)
    {
        return new Book(id2,price2,author2,pages2);
    }
    public static Book giveBook2(int id3,double price3,String author3,int pages3)
    {
        return new Book(id3,price3,author3,pages3);
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPages()
    {
        return pages;
    }
    public void setAuthor(String author)
    {
        this.author=author;
    }
    public void setPages(int pages)
    {
        this.pages=pages;
    }

}
