public class RunRome {
    public static void main(String[] args) {
        int number = 15;
        Rome rome = new Rome();

        String str = rome.convertToRome(number);
        System.out.println(str);

        int arab = rome.convertToArab("VIII");
        System.out.println(arab);
    }
}
