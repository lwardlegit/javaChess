public class Tile {
    public int color;
    public Object piece;

    public Tile( int color){
        this.color = color;
        this.piece = null;
    }

    /*  we don't need to remove or add pieces
    *   instead we set the initial value to null
    *   then whenever we want to change the piece
    *   we call the piece constructor and make a new piece
    *   then we place it on the tile
    */
    public void changePiece(String type){
        this.piece = new Piece(type);
    }
}