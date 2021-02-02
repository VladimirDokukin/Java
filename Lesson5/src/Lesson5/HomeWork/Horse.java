package Lesson5.HomeWork;

public class Horse extends Animal{

    String name;

    // Constructor
    protected Horse(float borderDistanceRun , float borderDistanceSwim , float borderDistanceJump, String name){
        super(borderDistanceRun ,borderDistanceSwim ,borderDistanceJump);
        this.name = name;
    }

    public void animalRun(float distanceRun){
        if (distanceRun <= this.getLongOfDistanceRun() && distanceRun >= 0) {
            System.out.println("Horse ran " + distanceRun);
        } else System.out.println(distanceRun + " Too far for this horse");
        System.out.println();
    }
    @Override
    public void animalSwim(float distanceSwim){
        if(distanceSwim<=this.getLongOfDistanceSwim() && distanceSwim>=0) {
            System.out.println("Horse swam " + distanceSwim);
        } else System.out.println(distanceSwim + " Too far for this horse");
        System.out.println();
    }

    public void animalJump(float distanceJump){
        if (distanceJump <= this.getHighOfJump() && distanceJump>=0) {
            System.out.println("Horse jumped " + distanceJump);
        } else System.out.println(distanceJump + " Too high for this horse");
        System.out.println();
    }

}
