package ir.ac.kntu;

public abstract class Animal implements Movable {
    protected Integer age;

    public Animal(Integer age) {
        this.age = age;
    }

    abstract void eatFood();

    void sleep() {
        System.out.println("Sleeping...zzz");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
