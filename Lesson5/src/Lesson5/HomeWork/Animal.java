package Lesson5.HomeWork;

public abstract class Animal {

    private float borderDistanceSwim;
    private float borderDistanceRun;
    private float borderDistanceJump;


    // Constructor
    protected Animal(float borderDistanceRun , float borderDistanceSwim , float borderDistanceJump ){
        setDistanceRun(borderDistanceRun);
        setDistanceSwim(borderDistanceSwim);
        setDistanceJump(borderDistanceJump);
    }

    // Methods
    public abstract void animalRun(float distanceRun);

    public abstract void animalJump(float highOfJump);

    public void animalSwim(float distanceSwim){
        if (distanceSwim <=this.getLongOfDistanceSwim() && distanceSwim>=0) {
            System.out.println("Animal swam " + distanceSwim);
        } else System.out.println( distanceSwim + "This swim is too far for this dog");
        System.out.println();
    }


    // Getters
    public float getLongOfDistanceRun() {
        return borderDistanceRun;
    }

    public float getLongOfDistanceSwim(){
        return borderDistanceSwim;
    }

    public float getHighOfJump() {
        return borderDistanceJump;
    }

    // Setters
    public void setDistanceRun(float borderDistanceRun){
        if (borderDistanceRun < 0) {System.out.println("Distance can't be negative");}
        else {this.borderDistanceRun = borderDistanceRun;}
    }

    public void setDistanceSwim(float borderDistanceSwim){
        if (borderDistanceSwim < 0) System.out.println("Distance can't be negative");
        else this.borderDistanceSwim = borderDistanceSwim;
    }

    public void setDistanceJump(float borderDistanceJump){
        if (borderDistanceJump < 0) System.out.println("Distance can't be negative");
        else this.borderDistanceJump = borderDistanceJump;
    }

}
