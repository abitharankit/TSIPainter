

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String thanks = "Thank you,";
        String name = "miguel!";
        String order  = "Your order number is #";
        int previousOrder = 715;
        System.out.println(thanks + " " + name.toUpperCase());
        System.out.println(order + ++previousOrder);
        }
    }
