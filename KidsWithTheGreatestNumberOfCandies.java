import java.util.ArrayList;
import java.util.List;

class GreatestNumberOfCandiesSolution {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int largestCandy = 0;
        List<Boolean> booleanList = new ArrayList<>();
        for(int c : candies ) {
            if(c > largestCandy) {
                largestCandy = c;
            }
        }
        for(int i = 0; i<=candies.length - 1;i++) {
            if(candies[i] + extraCandies > largestCandy || candies[i] + extraCandies == largestCandy) {
                booleanList.add(true);
            } else {
                booleanList.add(false);
            }
        }
        return booleanList;
    }

}

public class KidsWithTheGreatestNumberOfCandies {

    public static void main(String[] args) {
        GreatestNumberOfCandiesSolution test = new GreatestNumberOfCandiesSolution();
        System.out.println(test.kidsWithCandies(new int[]{2,3,5,1,3}, 3));
    }

}
