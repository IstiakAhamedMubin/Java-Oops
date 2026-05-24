public class GraduateStudent6 extends Student6 {
    private String thesisTopic;

    public GraduateStudent6(String name, int id, double cgpa, String thesisTopic) {
        super(name, id, cgpa);
        this.thesisTopic = thesisTopic;
    }

    public String getThesisTopic() {
        return thesisTopic;
    }

    public void setThesisTopic(String thesisTopic) {
        this.thesisTopic = thesisTopic;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("Thesis Topic: " + thesisTopic);
    }
}