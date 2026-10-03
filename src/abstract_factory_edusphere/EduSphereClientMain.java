package abstract_factory_edusphere;

public class EduSphereClientMain {

    public static void main(String[] args) {

        // ====================================
        // Creating components for Online Course
        // ====================================

        CourseFactory onlineFactory =
                new OnlineCourseFactory();

        Lecture onlineLecture =
                onlineFactory.createLecture();

        Assessment onlineAssessment =
                onlineFactory.createAssessment();

        System.out.println("=== Online Course ===");

        onlineLecture.deliverLecture();
        onlineLecture.shareMaterials();

        onlineAssessment.conductAssessment();
        onlineAssessment.publishResults();


        System.out.println();


        // =====================================
        // Creating components for Offline Course
        // =====================================

        CourseFactory offlineFactory =
                new OfflineCourseFactory();

        Lecture offlineLecture =
                offlineFactory.createLecture();

        Assessment offlineAssessment =
                offlineFactory.createAssessment();

        System.out.println("=== Offline Course ===");

        offlineLecture.deliverLecture();
        offlineLecture.shareMaterials();

        offlineAssessment.conductAssessment();
        offlineAssessment.publishResults();
    }
}
