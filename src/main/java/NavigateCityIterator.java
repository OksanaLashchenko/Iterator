import java.util.List;

public class NavigateCityIterator implements CityIterator {

    CityCollection collection;

    public NavigateCityIterator(CityCollection collection) {
        this.collection = collection;
    }

    @Override
    public String getNext(int currentPosition) {
        List<String> cities = collection.getCities();
        if (currentPosition != cities.size()) {
            int navigatorRandomPosition = (int) (Math.random() * (cities.size() - 1));
            return String.format("Navigator: You currentPosition is %d. Your next city is %s",
            currentPosition, cities.get(navigatorRandomPosition));
        }
        return "Navigator: This is the last city in the navigator's list! Trip is over!";
    }

    @Override
    public boolean hasMore(int currentPosition) {
        List<String> cities = collection.getCities();
        return currentPosition < (cities.size() - 1);
    }

}
