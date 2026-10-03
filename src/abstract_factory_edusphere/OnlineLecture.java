package abstract_factory_edusphere;

// Concrete Product for Online Lecture
class OnlineLecture implements Lecture {

    @Override
    public void deliverLecture() {
        System.out.println(
                "Delivering lecture via live video session"
        );
    }

    @Override
    public void shareMaterials() {
        System.out.println(
                "Uploading recording and slides to the course portal"
        );
    }
}
