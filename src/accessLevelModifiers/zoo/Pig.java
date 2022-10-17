package accessLevelModifiers.zoo;

import accessLevelModifiers.animal.Bird;

public class Pig {
    public void welcome(Bird b) {
        b.makeSound(); //호출가능
        //b.makeHappy(); //호출불가능
    }
}
