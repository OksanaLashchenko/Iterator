import java.util.List;

public class CityCollection implements IterableCityCollection {

    private final List<String> cities;

    public List<String> getCities() {
        return cities;
    }

    public CityCollection(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public CityIterator createTouristCityIterator() {
        CityCollection cityCollection = new CityCollection(cities);
        return new TouristCityIterator(cityCollection);
    }

    @Override
    public CityIterator createGuideCityIterator() {
        CityCollection cityCollection = new CityCollection(cities);
        return new GuideCityIterator(cityCollection);
    }

    @Override
    public CityIterator createNavigateCityIterator() {
        CityCollection cityCollection = new CityCollection(cities);
        return new NavigateCityIterator(cityCollection);
    }

}
