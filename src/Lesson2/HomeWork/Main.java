package Lesson2.HomeWork;

public class Main {

    private static byte [] byteMass = new byte[]{0,1,0,1,1,1,0,0,0,1};
    private static int [] secondTaskMass = new int[8];
    private static int [] thirdTaskMass = new int[]{1,5,3,2,11,4,5,2,4,8,9,1};
    private static int [] fourthTaskMass = new int[]{1,5,3,2,11,4,5,2,-4,8,9,1,20,4,16,8,13,17,-9};
    private static int [][] fifthTaskMass = new int[7][7];
    private static int [] sixTaskMass = new int[]{1,2,3,4,5};
    static int sixTaskKey = 2;


    public static void main(String[] args) {

        zeroToOne(byteMass);
        printMas(byteMass);

        secondTask(secondTaskMass);
        printMas(secondTaskMass);

        thirdTask(thirdTaskMass);
        printMas(thirdTaskMass);

        System.out.println(fourthTaskHigh(fourthTaskMass));
        System.out.println(fourthTaskLow(fourthTaskMass));

        fifthTask(fifthTaskMass);
        printMasMas(fifthTaskMass);

        sixTask(sixTaskMass, sixTaskKey);
        printMas(sixTaskMass);

    }

    public static byte[] zeroToOne(byte[] arrayOfNumb) {


        for (int i = 0; i < arrayOfNumb.length; i++) {
            arrayOfNumb[i] = (byte) (arrayOfNumb[i] == 0 ? 1 : 0);   //просто попробовал тернарный оператор почему попросило привидение типа не совсем ясно
        }
        return arrayOfNumb;
    }

    public static int[] secondTask(int[] arrayOfNumb){

        int c =1;

        for (int i = 0; i<arrayOfNumb.length; i++)
        {
            arrayOfNumb[i] = c;
            c = c+3;
        }
        return arrayOfNumb;
    }

    public static int[] thirdTask(int[] arrayOfNumb){

        for (int i =0; i<arrayOfNumb.length; i++){
            if (arrayOfNumb[i] < 6) arrayOfNumb[i] = arrayOfNumb[i] * 2;
        }
        return arrayOfNumb;
    }

    public static int fourthTaskHigh(int[] arrayOfNubm){
        int c = 0;
        for (int i = 0; i<arrayOfNubm.length; i++){
            if (c<arrayOfNubm[i]) c = arrayOfNubm[i];
        }
        return c;
    }

    public static int fourthTaskLow(int[] arrayOfNubm){
        int c = 0;
        for (int i = 0; i<arrayOfNubm.length; i++) if (c>arrayOfNubm[i]) c = arrayOfNubm[i];   // попробовал другой вариант записи
        return c;
    }

    public static int[][] fifthTask(int[][] arrayOfNumb){
        int i,j,c;
        for ( i = 0; i<arrayOfNumb.length; i++){
            for ( j = 0; j<arrayOfNumb.length;j++){
                if (i==j) {arrayOfNumb[i][j] = 1;}
            }
            c =arrayOfNumb.length - 1;
            c -= i;
            arrayOfNumb[i][c] = 1;
        }
        return arrayOfNumb;
    }

    public static int [] sixTask(int [] arrayOfNumb , int key){
        int c,b,xC;
        c = arrayOfNumb.length - 1;

        if (key > 0) {
            while (key != 0)       //по значению на которое надо сместить
            {
                  b = arrayOfNumb[c];
                  xC = c;
                  while (xC != 0){                       // сдвигаю массив
                      arrayOfNumb[xC] = arrayOfNumb[xC - 1];
                      xC--;
                  }
                  arrayOfNumb[0] = b;
                key--;
            }
        }

        else {

            while (key != 0)   //по значению на которое надо сместить
            {
                b = arrayOfNumb[0];
                xC =0;
                while (c != xC){                        // сдвигаю массив
                    arrayOfNumb[xC] = arrayOfNumb[xC + 1];
                    xC++;
                }
                arrayOfNumb[c] = b;
                key++;
            }
        }


        return arrayOfNumb;
    }

    // попробовал перегрузку

    public static void printMas(byte[] arrayOfNumb){

        for (int i=0; i<arrayOfNumb.length; i++ )
        {
            System.out.print(arrayOfNumb[i] + " ");
        }
        System.out.println();

    }

    public static void printMas(int[] arrayOfNumb){

        for (int i=0; i<arrayOfNumb.length; i++ )
        {
            System.out.print(arrayOfNumb[i] + " ");
        }
        System.out.println();
    }

    public static void printMasMas(int[][] arrayOfNumb){

        for (int i = 0; i<arrayOfNumb.length; i++){
            for (int j = 0; j<arrayOfNumb.length;j++){
                System.out.print(arrayOfNumb[i][j]);
            }
            System.out.println();
        }
    }

}
