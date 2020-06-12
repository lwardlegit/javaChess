public class Player {
    public String name;
    public int captures;
    public String color;
    public int graveyard;
    public boolean checked;
    public boolean checkmate;

    public Player(String name, String color){
        this.name = name;
        this.color = color;
        this.captures = 0;
        this.graveyard = 0;
        this.checked = false;
        this.checkmate = false;
    }

    public boolean getCheckmate(){
        return this.checkmate;
    }
    public String getColor(){
        return this.color;
    }
}