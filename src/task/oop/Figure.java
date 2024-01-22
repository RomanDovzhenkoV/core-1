package task.oop;

public abstract class Figure {
    abstract double calculatingTheArea();

    abstract double calculationPerimeter();
}

class Circle extends Figure {
    int radius;

    @Override
    public double calculatingTheArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double calculationPerimeter() {
        return 2 * 3.14 * radius;
    }

}
class Rectangle extends Figure {
    int sideFirst;
    int sideSecond;

    @Override
    double calculatingTheArea() {
        return sideFirst * sideSecond;
    }

    @Override
    double calculationPerimeter() {
        return 2 * (sideFirst + sideSecond);
    }
}

class Triangle extends Figure {
    int sideFirst;
    int sideSecond;
    int sideThree;

    @Override
    double calculatingTheArea() {
        int p = sideFirst + sideSecond + sideThree;
        return Math.sqrt(p * (p - sideFirst) * (p - sideSecond) * (p - sideThree));
    }

    @Override
    double calculationPerimeter() {
        return sideFirst + sideSecond + sideThree;
    }
}
