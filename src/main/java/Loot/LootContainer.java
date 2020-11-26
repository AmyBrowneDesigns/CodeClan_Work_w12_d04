package Loot;

public class LootContainer {

    private String contents;
    private int value;
    private int size;

    public LootContainer(String contents, int value, int size){
        this.contents = contents;
        this.value = value;
        this.size = size;
    }

    public int getTheValue(){
        return this.value;
    }

    public int getSize(){
        return this.size;
    }

    public void emptyContainer(){
        this.value = 0;
    }



}
