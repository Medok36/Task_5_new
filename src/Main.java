import java.util.Scanner;

public class Main {

    private static void drawing(int w){
        int s = 1;
        for (int i = 0; i < ((w - 1) / 2 + 1) ; i++){
            for (int j = 0; j < w; j++){
                if (i == 0){
                    System.out.print('*');
                }
                else {
                    if ((j < ((w - s) / 2)) || (j >= ((w - s) / 2 + s))){
                        System.out.print('*');
                    }
                    else{
                        System.out.print(' ');
                    }
                }
            }
            if (i != 0){
                s += 2;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите нечётное значение w(больше 2): ");
        int w = in.nextInt();

        while ((w < 2) || ((w % 2) == 0)){
            System.out.println("Недопустимое значение w. Введите нечётное значение больше или равное трём");
            w = in.nextInt();
        }
        in.close();
        drawing(w);
    }
}