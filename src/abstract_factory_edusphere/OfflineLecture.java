package abstract_factory_edusphere;

// Concrete Product for Offline Lecture
class OfflineLecture implements Lecture {

    @Override
    public void deliverLecture() {
        System.out.println(
                "Delivering lecture in the classroom"
        );
    }

    @Override
    public void shareMaterials() {
        System.out.println(
                "Distributing printed handouts to students"
        );
    }
}
