package Lesson5.HomeWork;


public class Cat extends Animal{

    protected String name;

    // Constructor
    protected Cat(float borderDistanceRun , float borderDistanceSwim , float borderDistanceJump , String name){
        super(borderDistanceRun ,borderDistanceSwim ,borderDistanceJump);
        this.name = name;
    }

     // Methods

    public void animalRun(float distanceRun){
        if (distanceRun<=this.getLongOfDistanceRun() && distanceRun>=0) {
            System.out.println("Cat ran " + distanceRun);
        } else System.out.println(distanceRun + " This run is too far for this cat");
        System.out.println();
    }

    @Override
     public void animalSwim(float distanceSwim){
         System.out.println("Cat can't swim");
         System.out.println();
     }

     public void animalJump(float distanceJump){
         if (distanceJump<=this.getHighOfJump() && distanceJump>=0) {
        System.out.println("Cat jumped " + distanceJump);}
         else System.out.println(distanceJump + " This jump is too high for this cat");
        System.out.println();
     }


}
