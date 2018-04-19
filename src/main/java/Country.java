import java.util.Map;

public class Country {
    private String name;
    private Map<Piece, Integer> army;

    public Country(String name, Map<Piece, Integer> army) {
        this.name = name;
        this.army = army;
    }

    public String getName() {
        return name;
    }

    public int getInfantry(){
        return this.army.get(Piece.INFANTRY);
    }

    public int getCavalry(){
       return this.army.get(Piece.CAVALRY);
    }

    public int getArtillery(){
        return this.army.get(Piece.ARTILLERY);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Piece, Integer> getArmy() {
        return army;
    }

    public void setArmy(Map<Piece, Integer> army) {
        this.army = army;
    }
}
