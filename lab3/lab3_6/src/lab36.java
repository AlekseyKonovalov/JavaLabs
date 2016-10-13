import java.math.BigDecimal;

public class lab36 {
    public static void main(String[] args) {
        float sum = 500; // 500 руб. на счете
        float percent = 0.00000001f; // 0.000001% ежемесячно

        sum *= 1 + percent*12;// Считаем проценты за год

        System.out.println("Сумма на счете через год: " + sum);

        BigDecimal sumBD = new BigDecimal("500"); // 500 руб. на счете
        BigDecimal percentBD = new BigDecimal("0.00000001");  // 0.000001% ежемесячно

        // Считаем проценты за год
        for(int i = 1; i <= 12; i++) {
            sumBD = sumBD.add(sumBD.multiply(percentBD));
        }
        System.out.println("Сумма на счете через год: " + sumBD);


    }

}
