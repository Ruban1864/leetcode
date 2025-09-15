class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int row = 0 , col = 0 ;
        for(String move : commands){
            switch(move){
                case "LEFT": col--; break;
                case "RIGHT": col++; break;
                case "UP": row--; break;
                case "DOWN": row++; break;
            }
        }
        return (row * n ) + col ;
    }
}