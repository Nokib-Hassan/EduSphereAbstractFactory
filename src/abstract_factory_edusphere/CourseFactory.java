package abstract_factory_edusphere;

// Abstract Factory Interface
interface CourseFactory {

    Lecture createLecture();

    Assessment createAssessment();
}
