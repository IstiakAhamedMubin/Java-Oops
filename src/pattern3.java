public class pattern3 {//half pyramid
    public static void main (String[] args) {
        for(int i =1;i<=5;i++) {
            for (int j =1;j<=i;j++) {//jei time e row number joto dukhbe oi time e oitai total column hoe jabe
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
}
