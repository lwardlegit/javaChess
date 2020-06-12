import java.util.Scanner; 
public class Main {
    public static void main(String[] args) {
        System.out.println("This will be printed");
        Scanner scan = new Scanner(System.in);

        /*
        *   java chess runs when two players are defined 
        *   players take turns against each other
        *   a player wins when the win conditions are met
        */



        /*
        * define the players and their respective colors (white or black)
        * after we get player input we make instances of the players
        */
        System.out.println("player 1 color: ");
        String color = scan.next();
        Player player1 = new Player("player 1",color);

        System.out.println("player 2 color: ");
        color = scan.next();
        Player player2 = new Player("player 2", color);


        /*
        * make an instance of the chess board
        * under the hood the board is creating tiles 
        * then placing the tiles onto the board
        */
        Board board = new Board();
        //board.setPieces()


        /*
        * as long as neither player has been checkmated
        * keep asking for players to move starting with
        * whichever player is white (which will be the first color to go)
        */

        while(player1.getCheckmate() == false && player2.getCheckmate() == false){

            if(player1.getColor() == "white"){
                 //player 1
                 System.out.println("PLAYER 1: ");

                 System.out.println("select a piece to move: ");
                     String piece = scan.next();
                 System.out.println("select a square to attack: ");
                     String attack = scan.next();
                     board.makeMove(piece, attack);
                 
                 //player 2
                     System.out.println("PLAYER 2: ");
 
                 System.out.println("select a piece to move: ");
                     piece = scan.next();
                 System.out.println("select a square to attack: ");
                     attack = scan.next();
                     board.makeMove(piece, attack);

                     
                //check to see if anyone is in check  
                     board.checkKing();
            }else{

                //player 2
                System.out.println("PLAYER 2: ");

                System.out.println("select a piece to move: ");
                    String piece = scan.next();
                System.out.println("select a square to attack: ");
                    String attack = scan.next();
                    board.makeMove(piece, attack);
                
                //player 1
                    System.out.println("PLAYER 1: ");

                System.out.println("select a piece to move: ");
                    piece = scan.next();
                System.out.println("select a square to attack: ");
                    attack = scan.next();
                    board.makeMove(piece, attack);

                //check to see if anyone is in check  
                    board.checkKing();
            }




            
        }

    }
}

