
package hjsschool;


public class ReportGenerator {
    private ReportStrategy strategy;

    public ReportGenerator(ReportStrategy strategy) {
        this.strategy = strategy;
    }

    public void generateReport() {
        strategy.generateReport();
    }
}