package Components;

public class Tyres {

    private String type;
    private String tyreSize;

    public Tyres(String type, String tyreSize){
        this.type = type;
        this.tyreSize = tyreSize;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTyreSize() {
        return tyreSize;
    }

    public void setTyreSize(String tyreSize) {
        this.tyreSize = tyreSize;
    }
}
