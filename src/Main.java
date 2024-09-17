//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        InfoCard("Simon", 33);
        int total1 = add(3, 4);
        int total2 = add(7,4);
        System.out.println(total1);
        System.out.println("===================");
        System.out.println(total2);

    }

        public static void InfoCard(String name, int age){
        System.out.println(name + " is " + age + " years old! ");
        }

        public  static int add(int x, int y){
            return x + y;
        }
}