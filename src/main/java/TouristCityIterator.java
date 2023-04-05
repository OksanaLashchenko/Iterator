import java.util.List;

public class TouristCityIterator implements CityIterator {

    CityCollection collection;
    int currentPosition;

    public TouristCityIterator(CityCollection collection) {
        this.collection = collection;
    }

    @Override
    public String getNext(int currentPosition) {
        List<String> cities = collection.getCities();
        if (currentPosition != cities.size()) {
            int touristRandomPosition = (int) (Math.random() * (cities.size() - 1));
            return String.format("Tourist: You currentPosition is %d. Your next city is %s",
                    currentPosition, cities.get(touristRandomPosition));
        }
        return "Tourist: This is the last city in the tourist's list! Trip is over!";
    }

    @Override
    public boolean hasMore(int currentPosition) {
        List<String> cities = collection.getCities();
        return currentPosition < (cities.size() - 1);
    }

}
