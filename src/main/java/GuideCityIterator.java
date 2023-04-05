import java.util.List;

public class GuideCityIterator implements CityIterator {

    CityCollection collection;
    int currentPosition;

    public GuideCityIterator(CityCollection collection) {
        this.collection = collection;
    }

    @Override
    public String getNext(int currentPosition) {
        List<String> cities = collection.getCities();
        if (currentPosition != cities.size()) {
            int guideRandomPosition = (int) (Math.random() * (cities.size() - 1));
            return String.format("Guide: You currentPosition is %d. Your next city is %s",
                    currentPosition, cities.get(guideRandomPosition));
        }
        return "Guide: This is the last city in the guide's list! Trip is over!";
    }

    @Override
    public boolean hasMore(int currentPosition) {
        List<String> cities = collection.getCities();
        return currentPosition < (cities.size() - 1);
    }

}
