import java.util.Scanner;

public class Run {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        StringBuffer sb = new StringBuffer();
        String tmp;
        while (scanner.hasNextLine()) {
            tmp = scanner.nextLine();
            if (tmp.isEmpty()) {
                break;
            }
            sb.append(tmp);
        }

        String input = sb.toString();

        String result = Main.calc(input);
        System.out.println(result);
    }
}
