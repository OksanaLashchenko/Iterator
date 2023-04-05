import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> cities = List.of("Київ", "Львів", "Харків", "Одеса");
        IterableCityCollection cityCollection = new CityCollection(cities);

        CityIterator guideCityIterator = cityCollection.createGuideCityIterator();
        CityIterator touristCityIterator = cityCollection.createTouristCityIterator();
        CityIterator navigateCityIterator = cityCollection.createNavigateCityIterator();

        for (int i = 0; i < 4; i++) {
            if (guideCityIterator.hasMore(i)) {
                System.out.println(guideCityIterator.getNext(i));
            } else {
                System.out.println("Guide: current position is " + i + " - there is no more cities left in your list");
            }
        }

        for (int i = 0; i < 4; i++) {
            if (touristCityIterator.hasMore(i)) {
                System.out.println(touristCityIterator.getNext(i));
            } else {
                System.out.println("Tourist: current position is " + i + " - there is no more cities left in your list");
            }
        }

        for (int i = 0; i < 4; i++) {
            if (navigateCityIterator.hasMore(i)) {
                System.out.println(navigateCityIterator.getNext(i));
            } else {
                System.out.println("Navigator: current position is " + i + " - there is no more cities left in your list");
            }
        }
    }

}
