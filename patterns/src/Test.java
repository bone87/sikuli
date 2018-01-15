import Abstract_Factory.UnitFactory;
import Abstract_Factory.UnitsCreator;
import Adapter.VectorAdapterFromRaster;
import Adapter.VectorAdapterFromRasterWithComposition;
import Adapter.VectorGraphics;
import Bridge.HatchBack;
import Bridge.Honda;
import Bridge.Mersedes;
import Bridge.Sedan;
import Builder.AppleComputerBuilder;
import Builder.AsusComputerBuilder;
import Builder.Director;
import BuilderSimple.Car;
import BuilderSimple.CarBuilder;
import BuilderSimple.Transmission;
import BuilderWithDirector.FordMondeoBuilder;
import BuilderWithDirector.SubaruImprezzaBuilder;
import ChainOfResponsibility.FileLogger;
import ChainOfResponsibility.LogLevel;
import ChainOfResponsibility.Logger;
import ChainOfResponsibility.SmsLogger;
import Composite.Composite;
import Composite.IShape;
import Composite.SquareCom;
import Composite.CircleCom;
import Decorator.*;
import Delegate.Line;
import Delegate.Painter;
import Delegate.Square;
import Facade.Computer;
import Factory_Method.FactoryMethod;
import Flyweight.Shape;
import Flyweight.ShapeFactory;
import Iterator.Iterator;
import Iterator.Tasks;
import MVC.Controller;
import Multiton.Multiton;
import ObjectPool.ObjectPool;
import Observer.ConsoleObserver;
import Observer.FileObserver;
import Observer.MeteoStation;
import Prototype.Human;
import Proxy.ProxyPicture;
import Proxy.RealPicture;
import Singleton.Singleton;
import Strategy.BubbleSorting;
import Strategy.InsertingSorting;
import Strategy.StrategyClient;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import Multiton.MultitonType;
public class Test {
    public static void main(String[] args) {
//SINGLETON
//    Test.singleton();

//FACTORY METHOD
//    Test.factory_method();

//ABSTRACT FACTORY
//    abstract_factory();

//BUILDER
//    builder();

//BUILDER_SIMPLE
//    builderSimple();

//BUILDER_WITH_DIRECTOR
//    builderWithDirector();
//ADAPTER
//    adapter();

//DELEGATE
//    delegate();

//FACADE
//    facade();
        
//PROTOTYPE
//    prototype();

//COMPOSITE
//    composite();

//DECORATOR
//    decorator();

//CHAINOFRESPONSIBILITY
//    chainOfResponsibility();

//OBSERVER
//    observer();

//STRATEGY
//    strategy();

//ITERATOR
//    iterator();

//PROXY
//    proxy();

//FLYWEIGHT
//    flyweight();

//BRIDGE
//    bridge();

//OBJECT_POOL
//    objectPool();

//MVC
//    mvc();

//MULTITON
    multiton();
    }

    private static void singleton() {
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton);
        System.out.println(singleton2);
    }

    private static void factory_method() {
        File file = new File("file");
        String tempString = "string";
        new FactoryMethod().getWriter(file).write();
        new FactoryMethod().getWriter(tempString).write();
    }

    private static void abstract_factory() {
        UnitFactory humanFactory = UnitsCreator.createUnits("Elf");
        humanFactory.createArcher().shoot();
        humanFactory.createMage().cast();
        humanFactory.createWarrior().attack();
        UnitFactory elfFactory = UnitsCreator.createUnits("Human");
        elfFactory.createWarrior().attack();
        elfFactory.createMage().cast();
        elfFactory.createArcher().shoot();
    }

    private static void builder() {
        Director director = new Director();
        director.setComputerBuilder(new AsusComputerBuilder());
        director.constructComputer();
        System.out.println(director.getComputer());
        director.setComputerBuilder(new AppleComputerBuilder());
        director.constructComputer();
        System.out.println(director.getComputer());
    }

    private static void builderSimple() {
        Car car = new CarBuilder().setMake("HONDA")
                                  .setTransmission(Transmission.AUTO)
                                  .setSpeed(190).buildCar();
        System.out.println(car);
    }

    private static void builderWithDirector() {
        BuilderWithDirector.Director director = new BuilderWithDirector.Director();
        director.setCarBuilder(new FordMondeoBuilder());
        System.out.println(director.buildCar());
        director.setCarBuilder(new SubaruImprezzaBuilder());
        System.out.println(director.buildCar());

    }

    private static void adapter() {
        VectorGraphics graphics = new VectorAdapterFromRaster();
        graphics.drawLine();
        graphics.drawSquare();
//    composition
        VectorGraphics graphics2 = new VectorAdapterFromRasterWithComposition();
        graphics2.drawLine();
        graphics2.drawSquare();
    }

    private static void delegate() {
        Painter painter = new Painter();
        painter.setGraphics(new Square());
        painter.draw();
        painter.setGraphics(new Line());
        painter.draw();
    }

    private static void facade() {
        Computer computer = new Computer();
        computer.copy();
    }

    private static void prototype() {
        Human original = new Human("Vasya", 25);
        System.out.println(original);
        Human copy = (Human)original.copy();
        System.out.println(copy);
    }

    private static void composite() {
        Composite composite = new Composite();
        IShape square1 = new SquareCom();
        IShape square2 = new SquareCom();
        composite.addComponent(square1);
        composite.addComponent(square2);
        Composite composite2 = new Composite();
        composite2.addComponent(new CircleCom());
        composite2.addComponent(new CircleCom());
        composite.addComponent(composite2);
        composite.draw();
    }

    private static void decorator() {
        Printer quotesDecorator = new QuotesDecorator(new LeftBracketDecorator(new RightBracketDecorator(new MyPrinter())));
        quotesDecorator.print();
    }

    private static void chainOfResponsibility() {
        Logger smsLogger = new SmsLogger(2);
        smsLogger.setNext(new FileLogger(3));
        smsLogger.logMessage("Ffff", LogLevel.INFO);
    }

    private static void observer() {
        MeteoStation meteoStation = new MeteoStation();
        meteoStation.addObserver(new ConsoleObserver());
        meteoStation.setMeasuremts(20, 745);
        System.out.println("===============================");
        meteoStation.addObserver(new FileObserver());
        meteoStation.setMeasuremts(10, 720);
    }

    private static void strategy() {
        int[] arr = {1,2,3,4,1};
        StrategyClient strategyClient = new StrategyClient(new BubbleSorting());
        strategyClient.executeStrategy(arr);
        strategyClient.setSortingStrategy(new InsertingSorting());
        strategyClient.executeStrategy(arr);
    }

    private static void iterator() {
        Tasks tasks = new Tasks();
        Iterator it = tasks.getIterator();
        while (it.hasNext()) System.out.println(it.next());
    }

    private static void proxy() {
        RealPicture realPicture = new RealPicture("path");
        realPicture.draw();
        ProxyPicture proxyPicture = new ProxyPicture("path");
        proxyPicture.draw();
    }

    private static void flyweight() {
        ShapeFactory shapeFactory = new ShapeFactory();
        List<Shape> shapes = new ArrayList<>();
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Square"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Circle"));
        shapes.add(shapeFactory.getShape("Line"));
        shapes.add(shapeFactory.getShape("Line"));
        shapes.add(shapeFactory.getShape("Line"));

        Random random = new Random();
        for (Shape shape: shapes) {
            int x = random.nextInt(90) + 10;
            int y = random.nextInt(90) + 10;
            shape.draw(x,y);
        }
    }

    private static void bridge() {
        Bridge.Car car = new HatchBack();
        car.setMake(new Mersedes());
        Bridge.Car car2 = new Sedan();
        car2.setMake(new Honda());
        car.getCarDetails();
        car2.getCarDetails();
    }

    private static void objectPool() {
        ObjectPool objectPool = new ObjectPool();
        System.out.println("FREE: " + Arrays.toString(objectPool.getFree().toArray()));
        System.out.println("USER: " + Arrays.toString(objectPool.getUser().toArray()));
        Car car = objectPool.getObject();
        System.out.println(car);
        System.out.println("FREE: " + Arrays.toString(objectPool.getFree().toArray()));
        System.out.println("USER: " + Arrays.toString(objectPool.getUser().toArray()));
        objectPool.releaseObject(car);
        System.out.println("FREE: " + Arrays.toString(objectPool.getFree().toArray()));
        System.out.println("USER: " + Arrays.toString(objectPool.getUser().toArray()));
    }

    private static void mvc() {
        Controller controller = new Controller();
        controller.execure();
    }

    private static void multiton() {
        Multiton m1 = Multiton.getInstance(MultitonType.ZERO);
        Multiton m2 = Multiton.getInstance(MultitonType.ONE);
        Multiton m3 = Multiton.getInstance(MultitonType.TWO);
        Multiton m4 = Multiton.getInstance(MultitonType.TWO);

        System.out.println(m1);
        System.out.println(m2);
        System.out.println(m3);
        System.out.println(m4);
    }

}
