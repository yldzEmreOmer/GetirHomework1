import java.util.Arrays;
import java.util.List;

public class HouseRepository {

    public List<House> getHouseList() {
        return Arrays.asList(
                new House(1_000_000, 120, 3, 1),
                new House(1_500_000, 150, 4, 1),
                new House(800_000, 100, 2, 1));
    }

    public List<Villa> getVillaList() {
        return Arrays.asList(
                new Villa(3_000_000, 300, 5, 2),
                new Villa(3_500_000, 350, 6, 2),
                new Villa(2_800_000, 280, 5, 1));
    }

    public List<SummerHouse> getSummerHouseList() {
        return Arrays.asList(
                new SummerHouse(2_000_000, 180, 4, 1),
                new SummerHouse(2_200_000, 200, 4, 2),
                new SummerHouse(1_800_000, 160, 3, 1));
    }
}
