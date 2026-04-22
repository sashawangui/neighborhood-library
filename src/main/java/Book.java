public class Book {
    //variable declaration
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckout;
    private String checkedOutTo;

    public Book(int id, String title, String isbn){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckout = false;
        this.checkedOutTo = "";

    }

    //method to assign a checkout to an individual and remove book from library
    public void checkOut(String name){
        if(!isCheckout){
            this.isCheckout = true;
            this.checkedOutTo = name;
        }
    }

    public void checkIn(){
        if(isCheckout){
            this.isCheckout = false;
            this.checkedOutTo = "";
        }
    }

    //setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //getters
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isCheckout(){
        return isCheckout;
    }

}
