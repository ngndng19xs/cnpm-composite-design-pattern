import java.util.List;
import java.util.ArrayList;

public class ComplexPayment implements PaymentComponent {
    private List<PaymentComponent> paymentComponents = new ArrayList<>();

    public void add(PaymentComponent component) {
        paymentComponents.add(component);
    }
    public void remove(PaymentComponent component) {
        paymentComponents.remove(component);
    }

    @Override
    public void pay(Order order) {
        for (PaymentComponent component : paymentComponents) {
            component.pay(order);
        }
    }
}
