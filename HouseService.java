import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HouseService {

    private final HouseRepository repository;

    public HouseService(HouseRepository repository) {
        this.repository = repository;
    }

    public int getTotalPriceOfHouses() {
        return repository.getHouseList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfVillas() {
        return repository.getVillaList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToInt(House::getPrice).sum();
    }

    public int getTotalPriceOfAllProperties() {
        return Stream.of(
                repository.getHouseList(),
                repository.getVillaList(),
                repository.getSummerHouseList()).flatMap(List::stream).mapToInt(House::getPrice).sum();
    }

    public double getAverageSquareMetersOfHouses() {
        return repository.getHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfVillas() {
        return repository.getVillaList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfSummerHouses() {
        return repository.getSummerHouseList().stream().mapToInt(House::getSquareMeters).average().orElse(0);
    }

    public double getAverageSquareMetersOfAllProperties() {
        return Stream.of(
                repository.getHouseList(),
                repository.getVillaList(),
                repository.getSummerHouseList()).flatMap(List::stream).mapToInt(House::getSquareMeters).average()
                .orElse(0);
    }

    public List<House> filterByRoomAndLivingRoom(int numberOfRooms, int numberOfLivingRooms) {
        return Stream.of(
                repository.getHouseList(),
                repository.getVillaList(),
                repository.getSummerHouseList()).flatMap(List::stream)
                .filter(h -> h.getNumberOfRooms() == numberOfRooms && h.getNumberOfLivingRooms() == numberOfLivingRooms)
                .collect(Collectors.toList());
    }
}
