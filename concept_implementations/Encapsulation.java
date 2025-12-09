package concept_implementations;

class BookEncapsulation {
    private String title;

    public String getName(){
        return title;
    }

    public void setName(String title){
        this.title=title;        
    }
    public static void main(String[] args) {
        BookEncapsulation b=new BookEncapsulation();
        b.setName("Java");
        System.out.println(b.getName());
    }
}

