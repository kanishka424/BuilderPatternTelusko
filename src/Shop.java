public class Shop {
    public static void main(String[] args) {

        Phone p=new PhoneBuilder().setOs("Android").setBattery(80)
                .setRam(4).getPhone();


        System.out.println(p);
    }
}
