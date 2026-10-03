package abstract_factory_edusphere;

// Concrete Factory for Offline Courses
class OfflineCourseFactory implements CourseFactory {

    @Override
    public Lecture createLecture() {
        return new OfflineLecture();
    }

    @Override
    public Assessment createAssessment() {
        return new OfflineAssessment();
    }
}
