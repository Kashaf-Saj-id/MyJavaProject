package DesignPatternsPackage;

/**
 * Abstract Factory design pattern provides an interface for creating families of related or dependent objects without specifying their concrete classes.
 */
interface Cary {
    void assemble();
}

interface Doll {
    void assemble();
}

class RedCar implements Cary {
    @Override
    public void assemble() {
        System.out.println("Assembling a Red Car");
    }
}

class RedDoll implements Doll {
    @Override
    public void assemble() {
        System.out.println("Assembling a Red Doll");
    }
}

class BlueCar implements Cary {
    @Override
    public void assemble() {
        System.out.println("Assembling a Blue Car");
    }
}

class BlueDoll implements Doll {
    @Override
    public void assemble() {
        System.out.println("Assembling a Blue Doll");
    }
}

/**
 * Abstract Factory interface for creating families of related objects (Cars and Dolls).
 */
interface ToyFactory {
    Cary createCar();
    Doll createDoll();
}

/**
 * Concrete Factory class that produces Red cars and dolls.
 */
class RedToyFactory implements ToyFactory {
    @Override
    public Cary createCar() {
        return new RedCar();
    }

    @Override
    public Doll createDoll() {
        return new RedDoll();
    }
}

/**
 * Concrete Factory class that produces Blue cars and dolls.
 */
class BlueToyFactory implements ToyFactory {
    @Override
    public Cary createCar() {
        return new BlueCar();
    }

    @Override
    public Doll createDoll() {
        return new BlueDoll();
    }
}
