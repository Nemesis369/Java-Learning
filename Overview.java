
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Overview {

    public static void main(String[] args) {
        // JFrame frame = new JFrame("JFrame example");
        // JPanel panel = new JPanel();
        // panel.setBounds(40, 80, 200, 200);
        // panel.setBackground(Color.gray);
        // JButton button1 = new JButton("Button1");
        // button1.setBounds(50, 100, 80, 30);
        // JButton button2 = new JButton("Button2");
        // button1.setBackground(Color.green);
        // button2.setBackground(Color.green);
        // panel.add(button1);
        // panel.add(button2);
        // frame.add(panel);
        // frame.setSize(200, 300);
        // frame.setLocationRelativeTo(null);
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // frame.setVisible(true);

        // try {
        // // Create an HttpClient instance
        // HttpClient client = HttpClient.newHttpClient();

        // // Define the request
        // HttpRequest request = HttpRequest.newBuilder()
        // .uri(URI.create("https://nptel.ac.in/course.php"))
        // .GET() // HTTP GET request
        // .build();

        // // Send the request and get the response
        // HttpResponse<String> response = client.send(request,
        // HttpResponse.BodyHandlers.ofString());

        // // Print the response body
        // System.out.println(response.body());

        // } catch (IOException | InterruptedException e) {
        // System.out.println("Error: " + e.getMessage());
        // }

        // try {
        // InetAddress ip = InetAddress.getByName("www.leetcode.com");
        // System.out.println("Host name: " + ip.getHostName());
        // System.out.println("Host address: " + ip.getHostAddress());
        // // URL url = new URL("https://theuselessweb.com/");
        // // HttpURLConnection huc = (HttpURLConnection) url.openConnection();
        // // for(int i = 0; i <= 11; i++) {
        // // System.out.println(huc.getHeaderFieldKey(i) + " = " +
        // huc.getHeaderField(i));
        // // }
        // // huc.disconnect();
        // } catch (Exception e) {
        // System.out.println(e);
        // }

        try {
            DatagramSocket ds = new DatagramSocket();
            InetAddress ip = InetAddress.getLocalHost();
            byte[] buf = null;

            Scanner sc = new Scanner(System.in);

            while (true) {
                String inp = sc.nextLine();
                buf = inp.getBytes();
                DatagramPacket dp = new DatagramPacket(buf, buf.length, ip, 1234);

                ds.send(dp);

                if (inp.equals("bye")) {
                    break;
                }
            }
        } catch (Exception e) {
        }
    }
}
