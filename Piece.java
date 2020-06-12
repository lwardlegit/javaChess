

//in abstract classes, you cant create an instance of Piece
// but a class instance can inherit Piece and register these values
// upon construction

public class Piece {
    public int x,y;
    public String name;
    public int xmove;
    public int ymove;

    
    public Piece(int x, int y, String name, int xmove, int ymove){
        this.x = x;
        this.y = y;
        this.name = name;
        this.xmove = xmove;
        this.ymove = ymove;
    
    }
}