package task.oop;

public abstract class Employee {
    String name;
    String surname;
    int age;
    String departament;
    double salary;

    public Employee(String name, String surname, int age, String departament, double salary) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.departament = departament;
        this.salary = salary;
    }

    abstract void passedTheCheckpoint();

    abstract void finishedTheJob();
}

class Manager extends Employee {
    public Manager(String name, String surname, int age, String departament, double salary) {
        super(name, surname, age, departament, salary);
    }

    @Override
    void passedTheCheckpoint() {
        System.out.println("Миновал контрольно-пропускной пункт менеджер");
    }

    @Override
    void finishedTheJob() {
        System.out.println("Закончил работу менеджер");
    }
}

class Master extends Employee {
    public Master(String name, String surname, int age, String departament, double salary) {
        super(name, surname, age, departament, salary);
    }

    @Override
    void passedTheCheckpoint() {
        System.out.println("Миновал контрольно-пропускной пункт мастер");
    }

    @Override
    void finishedTheJob() {
        System.out.println("Закончил работу мастер");
    }
}

class CraneOperator extends Employee {
    public CraneOperator(String name, String surname, int age, String departament, double salary) {
        super(name, surname, age, departament, salary);
    }

    @Override
    void passedTheCheckpoint() {
        System.out.println("Миновал контрольно-пропускной пункт крановщик");
    }

    @Override
    void finishedTheJob() {
        System.out.println("Закончил работу крановщик");
    }
}

class Slinger extends Employee {
    public Slinger(String name, String surname, int age, String departament, double salary) {
        super(name, surname, age, departament, salary);
    }

    @Override
    void passedTheCheckpoint() {
        System.out.println("Миновал контрольно-пропускной пункт стропальщик");
    }

    @Override
    void finishedTheJob() {
        System.out.println("Закончил работу стропальщик");
    }
}