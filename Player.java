
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

// import java.io.FileReader;
// import java.io.FileWriter;

// public class FileReaderTest {

//     public static void main(String[] args) {
//         FileReader fr = null;
//         FileWriter fw = null;
//         try {
//             // FileReader fr1 = new FileReader("D:\\files\\Friday (1995) [1080p] [BluRay]
//             // [5.1] [YTS.MX]\\Friday.1995.720p.BluRay.x264.[YTS.MX]-English.srt");

//             // printStream(fr1);
//             // fr1.close();

//             fr = new FileReader("input.txt");
//             fw = new FileWriter("output.txt");

//             int ch;

//             while ((ch = fr.read()) != -1) {
//                 fw.write(ch);
//             }
//         } catch (Exception e) {
//             System.out.println(e.getMessage());
//         } finally {
//             try {
//                 fr.close();
//                 fw.close();
//             } catch (Exception e) {
//             }
//         }
//     }
// }

// public class FamilyInfo extends JFrame implements ActionListener {

//     private JButton fatherButton, motherButton;
//     private JLabel nameLabel, ageLabel, designationLabel;

//     public FamilyInfo() {

//         setTitle("Family Info");
//         setSize(400, 250);
//         setDefaultCloseOperation(EXIT_ON_CLOSE);
//         setLayout(new GridLayout());

//         fatherButton = new JButton("Father");
//         motherButton = new JButton("Mother");

//         nameLabel = new JLabel("Name:");
//         ageLabel = new JLabel("Age:");
//         designationLabel = new JLabel("Designation:");

//         fatherButton.addActionListener(this);
//         motherButton.addActionListener(this);

//         add(fatherButton);
//         add(motherButton);
//         add(nameLabel);
//         add(ageLabel);
//         add(designationLabel);

//         setVisible(true);
//     }

//     @Override
//     public void actionPerformed(ActionEvent e) {
//         if (e.getSource() == fatherButton) {
//             nameLabel.setText("Name: John Doe");
//             ageLabel.setText("Age: 45");
//             designationLabel.setText("Designation: Engineer");
//         } else if (e.getSource() == motherButton) {
//             nameLabel.setText("Name: Jane Doe");
//             ageLabel.setText("Age: 42");
//             designationLabel.setText("Designation: Doctor");
//         }
//     }

//     public static void main(String[] args) {
//         new FamilyInfo();
//     }
// }

public class Player {
    // write code here

    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        weapon = "Sword";
    }

    // getters
    public String getName() {
        return this.name;
    }

    public String getWeapon() {
        return this.weapon;
    }

    public int getHitPoints() {
        return this.hitPoints;
    }

    public int getStrength() {
        return this.strength;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public List<String> write() {
        return java.util.List.of(
                name,
                Integer.toString(hitPoints),
                Integer.toString(strength),
                weapon);
    }

    @Override
    public String toString() {
        return "Player{name='" + name + "', " +
                "hitPoints=" + hitPoints + ", " +
                "strength=" + strength + ", " +
                "weapon='" + weapon + "'}";
    }
}

class Monster {

    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }
    public int getHitPoints() {
        return this.hitPoints;
    }
    public int getStrength() {
        return this.strength;
    }

    @Override
    public String toString() {
        return "Monster{name='" + name + "', " +
                "hitPoints=" + hitPoints + ", " +
                "strength=" + strength + "}";
    }
}