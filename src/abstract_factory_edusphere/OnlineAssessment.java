package abstract_factory_edusphere;

// Concrete Product for Online Assessment
class OnlineAssessment implements Assessment {

    @Override
    public void conductAssessment() {
        System.out.println(
                "Conducting MCQ quiz on the online portal"
        );
    }

    @Override
    public void publishResults() {
        System.out.println(
                "Publishing auto-graded results on student dashboards"
        );
    }
}
