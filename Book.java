/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    //2.85
    private int pages;
    //2.88
    private String refNumber;
    private String borrowed;
    
   
    public int getPages(int pages)
        {
            return pages;
        }
    
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author    =  bookAuthor;
        title     =  bookTitle;
        pages     =  bookPages;
        refNumber =  "";
    }
    //2.83
    public String getAuthor()
    {
        return author;
    } 
    public String getTitle()
    {
        return title;
    } 
    // 2.84
    public void printAuthor(){
        System.out.println(author);
    }
    public void printTitle(){
        System.out.println(title);
    }
    //2.87, 2.89
    public void printDetails(){
        System.out.println("Title:"+title);
        System.out.println("Author:"+author);
        System.out.println("Pages:"+pages);
        if(refNumber.length()>0)
        System.out.println("Ref: "+refNumber);
        else
        System.out.println("ZZZ");
         
    }
//2.88
    public String getRefNumber(){
        return refNumber;
    }
    //2.90
    public void setRefNumber(String ref){
        if(ref.length()>= 3)
    {refNumber = ref;
    }
    else
    {System.out.println("Ref must be atleast 3 characters.");
    }
    }
}