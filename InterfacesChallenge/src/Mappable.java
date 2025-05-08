package InterfacesChallenge.src;

enum Geometry {
    POINT, LINE, POLYGON
}

public interface Mappable {

    String JSON_PROPERTY = """
            "properties": {%s}
            """;

    String getLabel();

    Geometry getShape();

    String getMarker();

    default String toJSON() {
        return """
        "type": "%s", "label": "%s", "marker": "%s" """.formatted(getShape(), getLabel(), getMarker());
    }

    public static void mapIt(Mappable map) {
        System.out.println(JSON_PROPERTY.formatted(map.toJSON()));
    }
}
