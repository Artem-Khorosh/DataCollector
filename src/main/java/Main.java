import org.json.simple.JSONObject;

public class Main {
    public static void main(String[] args) {
        String pathMapMoscow = "data/map.json";
        String pathStationsInfo = "data/stations.json";

        JsonMap mapMoscow = new JsonMap();
        JsonStationsInfo stationsInfo = new JsonStationsInfo();

        JSONObject objMapMoscow = mapMoscow.getMainObject();
        JSONObject objStationsInfo = stationsInfo.getMainObject();

        JsonWriter.writer(objMapMoscow, pathMapMoscow);
        JsonWriter.writer(objStationsInfo, pathStationsInfo);
    }
}