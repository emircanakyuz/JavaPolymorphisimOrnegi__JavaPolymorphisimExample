public class CustomerManager {
    BaseLogger logger;

    public CustomerManager(BaseLogger logger) {
        this.logger = logger;
    }

    public void add() {
        System.out.println("Müşteri Eklendi ");
        this.logger.log("Loglandı");
    }
}
