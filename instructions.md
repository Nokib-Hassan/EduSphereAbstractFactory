MITE 435: Software Design Pattern

Lab Work Scenario
Suppose IIT recently launched EduSphere, a learning management system that every department uses to
run its courses. When a teacher creates a new course in EduSphere, the system automatically sets up two
essential components for that course: a Lecture component and an Assessment component. The university
offers courses in two delivery modes, Online and Offline, and each mode handles lectures and assessments
in its own way.
The Lecture component is responsible for two things: delivering the class and sharing study materials.
In Online mode, the teacher conducts the class through a live video session. Students join from their laptops
or phones, and the teacher shares slides on screen. After the class, the recording and slides are uploaded to
the course page on the portal so students can review them anytime. The online lecture prints "Delivering
lecture via live video session" when delivering, and "Uploading recording and slides to
the course portal" when sharing materials.
In Offline mode, the teacher conducts the class face to face in a classroom using a whiteboard and projector.
After the class, printed handouts are distributed to the students present, and extra copies are kept at the
department office for anyone who missed the class. The offline lecture prints "Delivering lecture in
the classroom" when delivering, and "Distributing printed handouts to students" when sharing
materials.
The Assessment component is responsible for two things: conducting the assessment and publishing results.
In Online mode, students take a timed MCQ quiz on the online portal. The portal grades the quiz
automatically as soon as it is submitted, and each student can see their marks on their dashboard right away.
The online assessment prints "Conducting MCQ quiz on the online portal" when conducting, and
"Publishing auto-graded results on student dashboards" when publishing results.
In Offline mode, students sit a written exam on paper in the exam hall under the supervision of an
invigilator. The teacher collects the scripts, grades them manually, and the results are posted on the
department notice board. The offline assessment prints "Conducting written exam on paper" when
conducting, and "Posting manually graded results on the notice board" when publishing results.
You have been hired as a developer on the EduSphere team. Your job is to design the part of the system
that creates the lecture and assessment for a course so that these requirements are met.
Your Task
Design and implement this system using the Abstract Factory pattern. Java object-oriented
language is preferable.

Below is a reference pattern give,

“package abstract_factory_2_cars;

// Abstract Product Interface for Cars
interface Car {
    void assemble();
}
”

“package abstract_factory_2_cars;

/* Abstract Factory Interface */
interface CarFactory {
    Car createCar();
    CarSpecification createSpecification();
}
”
“package abstract_factory_2_cars;

public class CarFactoryClientMain {
    public static void main(String[] args)
    {
        // Creating cars for North America
        CarFactory northAmericaFactory
            = new NorthAmericaCarFactory();
        Car northAmericaCar
            = northAmericaFactory.createCar();
        CarSpecification northAmericaSpec
            = northAmericaFactory.createSpecification();

        northAmericaCar.assemble();
        northAmericaSpec.display();

        // Creating cars for Europe
        CarFactory europeFactory = new EuropeCarFactory();
        Car europeCar = europeFactory.createCar();
        CarSpecification europeSpec
            = europeFactory.createSpecification();

        europeCar.assemble();
        europeSpec.display();
    }
}
”
“package abstract_factory_2_cars;
// Abstract Product Interface for Car Specifications
interface CarSpecification {
    void display();
}
”

“package abstract_factory_2_cars;

class EuropeSpecification implements CarSpecification {
    public void display()
    {
        System.out.println(
            "Europe Car Specification: Fuel efficiency and emissions compliant with EU standards.");
    }
}

”
“package abstract_factory_2_cars;

// Concrete Factory for North America Cars
class NorthAmericaCarFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

// Concrete Factory for Europe Cars
class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
”
“package abstract_factory_2_cars;

// Concrete Factory for North America Cars
class NorthAmericaCarFactory implements CarFactory {
    public Car createCar() {
        return new Sedan();
    }

    public CarSpecification createSpecification() {
        return new NorthAmericaSpecification();
    }
}

// Concrete Factory for Europe Cars
class EuropeCarFactory implements CarFactory {
    public Car createCar() {
        return new SUV();
    }

    public CarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
”
“package abstract_factory_2_cars;

class NorthAmericaSpecification
    implements CarSpecification {
    public void display()
    {
        System.out.println(
            "North America Car Specification: Safety features compliant with local regulations.");
    }
}

”
“package abstract_factory_2_cars;

// Concrete Product for Sedan Car
class Sedan implements Car {
    public void assemble()
    {
        System.out.println("Assembling Sedan car.");
    }
}

”
“package abstract_factory_2_cars;

class SUV implements Car {
    public void assemble()
    {
        System.out.println("Assembling Hatchback car.");
    }
}

”