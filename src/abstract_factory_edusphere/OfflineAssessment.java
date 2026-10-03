package abstract_factory_edusphere;

// Concrete Product for Offline Assessment
class OfflineAssessment implements Assessment {

    @Override
    public void conductAssessment() {
        System.out.println(
                "Conducting written exam on paper"
        );
    }

    @Override
    public void publishResults() {
        System.out.println(
                "Posting manually graded results on the notice board"
        );
    }
}
