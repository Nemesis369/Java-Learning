
import java.io.CharArrayReader;

// import java.io.DataInputStream;
// import java.io.DataOutputStream;
// import java.io.FileInputStream;
// import java.io.FileOutputStream;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.StringTokenizer;

// public class Inventory {
//     static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//     static StringTokenizer st;

//     public static void main(String[] args) throws IOException {
//         DataOutputStream dos = new DataOutputStream(new FileOutputStream("output.txt"));
//         System.out.println("Enter code number:");
//         st = new StringTokenizer(br.readLine());
//         int code = Integer.parseInt(st.nextToken());
//         System.out.println("Enter number of items:");
//         st = new StringTokenizer(br.readLine());
//         int items = Integer.parseInt(st.nextToken());
//         System.out.println("Enter cost: ");
//         st = new StringTokenizer(br.readLine());
//         double cost = Double.parseDouble(st.nextToken());

//         dos.writeInt(code);
//         dos.writeInt(items);
//         dos.writeDouble(cost);
//         dos.close();

//         DataInputStream dis = new DataInputStream(new FileInputStream("output.txt"));
//         int codeNum = dis.readInt();
//         int totalItem = dis.readInt();
//         double itemCost = dis.readDouble();

//         double totalCost = totalItem * itemCost;
//         System.out.println(codeNum);
//         System.out.println(totalItem);
//         System.out.println(itemCost);
//         System.out.println(totalCost);
//     }
// }

public class Inventory {
    public static void main(String[] args) {
        String obj = "abcdefgh";
        int length = obj.length();
        char c[] = new char[length];
        obj.getChars(0, length, c, 0);
        CharArrayReader input1 = new CharArrayReader(c);
        CharArrayReader input2 = new CharArrayReader(c, 1, 4);
        int i, j;
        try {
            while ((i = input1.read()) == (j = input2.read())) {
                System.out.println((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}