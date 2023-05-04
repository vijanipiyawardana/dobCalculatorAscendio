import java.util.Scanner;

public class PrintPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter height of the pyramid: ");
        int height = input.nextInt();
        int i,j;
        for(i=0; i<=height; i++){
            for(j=height; j>i; j--){
                System.out.print(" ");
            }
            for(j=0; j<i; j++){
                System.out.print("# ");
            }

            System.out.println();
        }

    }
}
