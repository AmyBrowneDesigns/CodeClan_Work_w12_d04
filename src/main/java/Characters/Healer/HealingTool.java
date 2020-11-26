package Characters.Healer;

public enum HealingTool {

    POTION(20),
    HERBS(5),
    BALM(15);

    private final int banana;

    HealingTool(int banana){
        this.banana = banana;
    }

    public int getHeal(){
        return this.banana;
    }


}
