import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Item {

    private String item;
    private String date;
    LocalDateTime time = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy : HH:mm:ss");



    public Item(String item){
        this.item = item;
         date = time.format(formatter);
    }

    @Override
    public String toString(){
        return "Name: " + item + " (Created at: " + date+")";
    }


}
