package thread.c2.c_2_1;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: LinZiYu
 * \* Date: 2020/1/17
 * \* Time: 10:28
 * \* Description:
 * \
 */
public class T5 {

    private T5 players;

    public T5(T5 players) {
        this.players = players;
    }

//    public void matchPlayers() throws InterruptedException {
//        try {
//            T5 playerOne, playerTwo;
//            while (true) {
//                playerOne = playerTwo = null;
//                // Wait for two players to arrive and start a new game
////                playerOne = players.waitForPlayer(); // could throw IE
////                playerTwo = players.waitForPlayer(); // could throw IE
////                startNewGame(playerOne, playerTwo);
//            }
//        }

//        有时候需要在传播异常之前进行一些清理工作，在这种情况下，可以捕获InterruptedException，执行清理，然后抛出异常。　　
//        catch (InterruptedException e) {
            // If we got one player and were interrupted, put that player back
//            if (playerOne != null)
//                players.addFirst(playerOne);
//            // Then propagate the exception
//            throw e;
        }




