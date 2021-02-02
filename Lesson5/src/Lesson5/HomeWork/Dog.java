package Lesson5.HomeWork;


public class Dog extends Animal{

    String name;

    // Constructor
    protected Dog(float borderDistanceRun , float borderDistanceSwim , float borderDistanceJump, String name){
        super(borderDistanceRun ,borderDistanceSwim ,borderDistanceJump);
        this.name = name;
    }

   // Methods
   public void animalRun(float distanceRun){
       if (distanceRun<=this.getLongOfDistanceRun() && distanceRun>=0) {
           System.out.println("Dog ran " + distanceRun);
       } else System.out.println( distanceRun + " This run is too far for this dog");
       System.out.println();
   }

    @Override
    public void animalSwim(float distanceSwim){
       if (distanceSwim <=this.getLongOfDistanceSwim() && distanceSwim>=0) {
           System.out.println("Dog swam " + distanceSwim);
       } else System.out.println( distanceSwim + "This swim is too far for this dog");
        System.out.println();
    }

    public void animalJump(float distanceJump){
       if (distanceJump <= this.getHighOfJump() && distanceJump >= 0){
        System.out.println("Dog jumped " + distanceJump);
       } else System.out.println(distanceJump + "This jump is too high for this dog");
        System.out.println();
    }



}
