class CanPlaceFlowersSolution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for(int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 0 && (i ==0 || flowerbed[i-1] == 0 ) && (i == flowerbed.length - 1 || flowerbed[i+1] ==0)) {
                flowerbed[i] =1;
                count++;
            }
            if (count >=n) {
                return true;
            }
        }
        return false;
    }

}

public class CanPlaceFlowers {
    public static void main(String[] args) {
        CanPlaceFlowersSolution test = new CanPlaceFlowersSolution();
        System.out.println(test.canPlaceFlowers(new int[]{1,0,0,0,0,0,1},3));
    }
}
