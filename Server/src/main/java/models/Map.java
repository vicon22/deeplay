package models;

import java.util.Arrays;

public class Map{

     private final short[] map;

    {
        map = new short[64];
        map[27] = 1; // '1' - это белые
        map[28] = 2; // '2' - это черные
        map[35] = 2;
        map[36] = 1;
    }

    public void doMove(String coordinates, int color) {
        map[Integer.parseInt(coordinates)] = (short) color;
    }

    public short[] getMap() {
        return Arrays.copyOf(map, 64);
    }

    private void rollCheckers(int coordinates){

    }


    public void showMap(){
        for (int i = 0; i < 64; i++) {
            if (i % 8 == 7){
                System.out.println(map[i]);
            }else{
                System.out.print(map[i]);
            }

        }
    }

    public static void main(String[] args) {
        Map map = new Map();

        map.doMove("17",1);
        map.showMap();

    }
}
