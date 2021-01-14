package adv.coin_game;


// create coin
// return coin option
public class Coin {
    private String coinOption;
    private String[] coinValue = {"Heads", "Tails"};

    Coin() {
        int randNum = (Math.random() < 0.5) ? 1 : 0;
        coinOption = coinValue[randNum];
    }

    String getCoinOption(){
        return coinOption;
    }
}
