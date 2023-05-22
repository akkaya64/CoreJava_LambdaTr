package zoomcalisma.loop;

public class YildizSrou {
    public static void main(String[] args) {

        //         *
        //         * *
        //         * * *
        //         * * * *
        //         * * * * *
        //         * * * *
        //         * * *
        //         * *
        //         *

        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 1; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}
