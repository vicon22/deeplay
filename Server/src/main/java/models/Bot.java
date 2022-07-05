package models;

import java.util.Set;

public class Bot implements Player{

    private final Map map;
    private final int checkersColor;


    public Bot(Map map, int checkersColor) {
        this.map = map;
        this.checkersColor = checkersColor;
    }

    @Override
    public void doMove() {

        Set<String> zonesForNextMove = Counter.showFreeZoneForNextMoveStrings(checkersColor);
        int i = (int)(Math.random() * (zonesForNextMove.size() + 1));


        map.doMove((String) zonesForNextMove.toArray()[i], checkersColor);




    }

    private int randomNumber(int maxNumber){
        double a = Math.random() * (maxNumber + 1);
        return (int) a;
    }

    public static void main(String[] args) {


        Bot bot = new Bot(null, 1);

        System.out.println(bot.randomNumber(13));
    }
}
