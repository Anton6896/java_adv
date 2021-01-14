package adv.coin_game;

// crete player
// create player choice
// assign to other player other choice
// check if player is winner


public class Player {
    private String name = "";
    private String coinOption = "";
    private String[] coinValue = {"Heads", "Tails"};

    Player(String newName) {
        name = newName;
    }

    void setCoinOptionOpposite(String option) {
        // will set the opposite coin option to player choice
        coinOption = (option == "Heads") ? "Tails" : "Heads";
    }

    String getRandomCoinOption() {
        int randNum = (Math.random() < 0.5) ? 1 : 0;
        coinOption = coinValue[randNum];
        return coinValue[randNum];
    }

    void didPlayerWin(String winFlip) {
        if ((coinOption.equals(winFlip))) {
            System.out.println(name + " winner");
        } else {
            System.out.println(name + " loose game");
        }
    }

}
