package task1;

public enum Animals {

    DOG(5),CAT(3), LION(5);

    int age;

    Animals(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return this.name() + ", age = " + age;
    }
}
