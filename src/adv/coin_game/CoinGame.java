package adv.coin_game;

public class CoinGame {
    Player[] players = new Player[2];
    Coin coin = new Coin();

    CoinGame(String name1, String name2) {
        players[0] = new Player(name1);
        players[1] = new Player(name2);
    }

    void startGame() {

        // get first player choice
        int randIndex = (Math.random() < 0.5) ? 1 : 0;
        String playerPick = players[randIndex].getRandomCoinOption();

        // adjust other player choice
        int oponentIdx = (randIndex == 0) ? 1 : 0;
        players[oponentIdx].setCoinOptionOpposite(playerPick);

        // see the coin flip option
        String winFlip = coin.getCoinOption();

        // compare player choice with coin flip
        players[0].didPlayerWin(winFlip);
        players[1].didPlayerWin(winFlip);
    }

}
