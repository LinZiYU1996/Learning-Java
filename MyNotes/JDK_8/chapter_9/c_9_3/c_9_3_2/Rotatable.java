package JDK_8.chapter_9.c_9_3.c_9_3_2;

public interface Rotatable {

    void setRotationAngle(int angleInDegrees);


    int getRotationAngle();


    default void rotateBy(int angleInDegrees){
        setRotationAngle((getRotationAngle () + angleInDegrees) % 360);
    }


}
