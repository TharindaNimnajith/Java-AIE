package library;

public class Media {
    String name;
    int id;
    boolean status;  // 1(true) = lendable , 0(false) = reference only
    
    public Media() {
        name = "";
        id = 0;
        status = false;
    }
    
    public Media(String name, int id, boolean status) {
        this.name = name;
        this.id = id;
        this.status = status;
    }
}
