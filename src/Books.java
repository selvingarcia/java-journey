public class Books {

    private String title;
    private int pages, year;

    public Books(String title, int pages, int year){
            this.title = title;
            this.pages = pages;
            this.year = year;
    }

    public String toString(){
        return title + "," + pages + "," + year;
    }

    public String getTitle() {
        return title;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }
}
