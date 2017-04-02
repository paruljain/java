import com.hotmail.paruljain.units.*;
public class test {
    public static void main(String[] args) {
        Temperature t = new Temperature();
        Distance d = new Distance();

        System.out.println("The temperature in C is " + t.f2c(60));
        System.out.println("1 mile is " + d.miles2km(1) + " km");
    }
}