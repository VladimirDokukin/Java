package Lesson4.HomeWork;

public class Main {

    public static Worker[] workersArray = new Worker[7];

    public static void main(String[] args) {

        workersArray[0] = new Worker("Vasek", "Bugalter","+7(953)6137788",10000, 50);
        workersArray[1] = new Worker("Vanek", "Stroitel","+7(953)6136788",14000, 35);
        workersArray[2] = new Worker("Den", "Voditel","+7(953)6137788",26000, 42);
        workersArray[3] = new Worker("Yan", "Vrach","+7(953)6135388",15500, 28);
        workersArray[4] = new Worker("Sergey", "Brat Bugaltera","+7(953)6137238",52000, 31);
        workersArray[5] = new Worker("Ivan", "Prodavec","+7(953)6135188",34000, 41);
        workersArray[6] = new Worker("Petr", "Prosto hodit po ofisy","+7(953)6137488",20000, 40);

        workersSort(workersArray);
        workerAddSalary(workersArray);
        setWorkersList(workersArray);

    }

    private static void workersSort(Worker[] arrayOfWorkers){
        for (Worker x:arrayOfWorkers){
            if (x.getWorkerAge()>40) System.out.println(x.getFio() +" "+ x.getPosition() +" "+ x.getPhoneNumber() +" "+ x.getSalary() +" "+ x.getWorkerAge() +" "+ x.getIdWorker());
        }
        System.out.println();
    }

    private static void workerAddSalary(Worker[] arrayOfWorkers){
        for (Worker x:arrayOfWorkers){
            if (x.getWorkerAge()>35) {
                x.setWorkerSalary(x.getSalary() + 10000);
                System.out.println(x.getFio() +" "+ x.getPosition() +" "+ x.getPhoneNumber() +" "+ x.getSalary() +" "+ x.getWorkerAge() +" "+ x.getIdWorker());
            }
        }
        System.out.println();
    }

    private static void setWorkersList(Worker[] arrayOfWorkers){
        for (Worker x:arrayOfWorkers){
            System.out.println(x.getFio() +" "+ x.getPosition() +" "+ x.getPhoneNumber() +" "+ x.getSalary() +" "+ x.getWorkerAge() +" "+ x.getIdWorker());
        }
        System.out.println();
    }

}
