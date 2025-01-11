public class Main {

    public static void main(String[] args) {
        // Player player = new Player();
        // player.name = "Tim";
        // player.health = 20;
        // player.weapon = "Sword";

        // int damage = 10;
        // player.loseHealth(damage);
        // System.out.println("Remaining health = " + player.health);
        // player.health = 200;
        // player.loseHealth(11);
        // System.out.println("Remaining health = " + player.health);

        EnhancedPlayer tim = new EnhancedPlayer("Tim", 100, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }
}
