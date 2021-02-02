package Lesson5.HomeWork;

public class Bird extends Animal{

    String name;

    // Constructor
    protected Bird(float borderDistanceRun , float borderDistanceSwim , float borderDistanceJump, String name){
        super(borderDistanceRun ,borderDistanceSwim ,borderDistanceJump);
        this.name = name;
    }

    //Methods

    public void animalRun(float distanceRun){
        if (distanceRun <= this.getLongOfDistanceRun() && distanceRun>=0){
        System.out.println("Bird ran " + distanceRun);
        } else System.out.println(distanceRun + " Too far for this bird");
        System.out.println();
    }
    @Override
    public void animalSwim(float distanceSwim){
        System.out.println("Bird can't swim");
        System.out.println();
    }

    public void animalJump(float distanceJump){
        if (distanceJump <= this.getHighOfJump() && distanceJump>=0) {
            System.out.println("Bird jumped " + distanceJump);
        } else System.out.println(distanceJump + " Too high for this bird");
        System.out.println();
    }


}
