import java.util.Scanner;

class Book{
    public String title;
    public String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    public void displayInfo(){
        System.out.println("The title is: "+this.title);
        System.out.println("The author is: "+this.author);

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter title and author of book");
        String title=sc.nextLine();
        String author=sc.nextLine();

        Book b =new Book(title,author);
        b.displayInfo();
    }
}