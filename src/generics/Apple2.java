package generics;

class Apple2 implements Eatable{
    public String toString() {
        return "I am an apple";
    }

    @Override
    public String eat() {
        return "It tastes so good!";
    }
}
