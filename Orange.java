package Lesson1;

public class Orange extends Fruit {
    public Orange(float weight) {
        super(weight);
    }

    @Override
    float getWeight() {
        return 1.5f;
    }
}
