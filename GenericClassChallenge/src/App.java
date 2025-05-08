package GenericClassChallenge.src;

public class App {
    public static void main(String[] args) throws Exception {

        var nationalUSParks = new Park[] {
                new Park("Yellowstone", "44.48, -110.59"),
                new Park("Grand Canyon", "36.10, -112.09"),
                new Park("Yosemite", "37.88, -119.53")
        };

        Layer<Park> parkLayer = new Layer<>(nationalUSParks);
        parkLayer.renderLayer();

        var majorUSRivers = new River[] {
                new River("Mississippi", "47.21, -95.23", "29.15, -89.24", "35.15, -90.06"),
                new River("Missouri", "45.92, -111.49", "38.81, -90.12")
        };

        Layer<River> riverLayer = new Layer<>(majorUSRivers);
        riverLayer.addElement(
                new River("Colorado", "40.47, -105.82", "31.78, -114.77"),
                new River("Delaware", "42.20, -75.00", "39.49, -75.55"));
        riverLayer.renderLayer();
    }
}
