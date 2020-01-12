package chapter_19.c_19_2.c_19_2_1;

public enum SpaceShip {


//    覆盖toString方法

//     以我们想要的方式来生成字符串描述信息


    SCOUT, CARGO, TRANSPORT, CRUISER, BATTLESHIP, MOTHERSHIP;
    public String toString() {
        String id = name();
        String lower = id.substring(1).toLowerCase();
        return id.charAt(0) + lower;
    }
    public static void main(String[] args) {
        for(SpaceShip s : values()) {
            System.out.println(s);
        }
    }


}
