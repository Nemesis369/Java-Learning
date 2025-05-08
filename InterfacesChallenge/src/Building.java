package InterfacesChallenge.src;

enum Color {
    GREEN, BLACK, BLUE, ORANGE, RED
}

enum PointMarker {
    CIRCLE, TRIANGLE, DIAMOND, STAR, PIN
}

enum UsageType {
    GOVERNMENT, RESIDENTIAL, SPORTS, ENTERTAINMENT
}

enum UtilityType {
    FIBER_OPTIC, ELECTRICAL, GAS, WATER
}

enum LineMarkers {
    DASHED, DOTTED, SOLID
}

public class Building implements Mappable {

    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name + " (" + usage + ")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch (usage) {
            case ENTERTAINMENT -> Color.GREEN + " " + PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " " + PointMarker.STAR;
            case RESIDENTIAL -> Color.BLUE + " " + PointMarker.DIAMOND;
            case SPORTS -> Color.ORANGE + " " + PointMarker.PIN;
            default -> java.awt.Color.BLACK + " " + PointMarker.CIRCLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "usage": "%s" """.formatted(name, usage);
    }

}

class UtilityLine implements Mappable {

    private String name;
    private UtilityType utility;

    public UtilityLine(String name, UtilityType utility) {
        this.utility = utility;
        this.name = name;
    }

    @Override
    public String getLabel() {

        return name + " (" + utility + ")";
    }

    @Override
    public String getMarker() {

        return switch (utility) {
            case ELECTRICAL -> Color.RED + " " + LineMarkers.DASHED;
            case FIBER_OPTIC -> Color.GREEN + " " + LineMarkers.DOTTED;
            case GAS -> Color.ORANGE + " " + LineMarkers.SOLID;
            case WATER -> Color.BLUE + " " + LineMarkers.SOLID;
            default -> Color.BLACK + " " + LineMarkers.SOLID;
        };
    }

    @Override
    public Geometry getShape() {

        return Geometry.LINE;
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """
                , "name": "%s", "utility": "%s" """.formatted(name, utility);
    }
}