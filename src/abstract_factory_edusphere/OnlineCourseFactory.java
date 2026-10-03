package abstract_factory_edusphere;

// Concrete Factory for Online Courses
class OnlineCourseFactory implements CourseFactory {

    @Override
    public Lecture createLecture() {
        return new OnlineLecture();
    }

    @Override
    public Assessment createAssessment() {
        return new OnlineAssessment();
    }
}
