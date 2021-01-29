package Lesson4.HomeWork;

public class Worker {

    private String fio;
    private String position;
    private String phoneNumber;
    private int salary;
    private int workerAge;
    private int idWorker;
    private static int iCount = 0;

    public Worker(String fio, String position, String phoneNumber, int salary, int workerAge){

        this.fio = fio;
        this.position = position;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.workerAge = workerAge;
        this.idWorker = workerId();

    }

    public String getFio(){
        return this.fio;
    }

    public String getPosition(){
        return this.position;
    }

    public String getPhoneNumber(){
        return this.phoneNumber;
    }

    public int getSalary(){
        return this.salary;
    }

    public int getWorkerAge(){
        return this.workerAge;
    }

    public int getIdWorker(){ return this.idWorker;}

    public void setWorkerSalary(int workerSalary){
        this.salary = workerSalary;
    }

    private static int workerId(){
        iCount++;
        return iCount;
    }

}
