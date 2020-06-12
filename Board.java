
public class Board {
    public Object[][] board;
    public int size;


    public Board (){
        this.size = 8;
        this.board = makeboard();

    }

    public Object[][] makeboard(){
        int count = 0;
        for(int i = 0; i < this.size; i++){
            for(int j = 0; j < this.size; j++){
                   
                if(count % 2 == 0){ 
                    this.board[i][j] = new Tile(0);
                }else{
                    this.board[i][j] = new Tile(1);
                }    
            }
            count = count +1;
        }
        return this.board;
        
    }

    /*  make player moves into an attack
    *   the player will send in 2 coordines 
    *   the first will be their piece (1,2)
    *   the second will be the square to attack (3,4)
    */  
    public void makeMove(String selectedPiece, String attackSquare){

        int x = Character.getNumericValue(selectedPiece.charAt(0));
        int y = Character.getNumericValue(selectedPiece.charAt(2));
      
        int atkX = Character.getNumericValue(attackSquare.charAt(0));
        int atkY = Character.getNumericValue(attackSquare.charAt(2));
        this.board[atkX][atkY].changePiece(x,y,this.board[x][y].piece);
    }


    /* 
    * look to see if any king is in check
    * the easiest way to do this is to check the whole board
    * look at every piece, check the piece type and see what moves it can do in one turn
    * if any of these moves could land on the king's square
    * and if the king and the piece colors arent the same
    * the player with the kings color is in check
    */ 

    public boolean checkKing(){
       return true;
    }
}
