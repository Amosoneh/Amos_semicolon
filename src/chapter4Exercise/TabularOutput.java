package chapter4Exercise;

public class TabularOutput {
    public static void main(String[] args) {
        int N2, N3, N4;
        System.out.println("N\t\t"+"N2\t\t"+"N3\t\t"+"N4");

        for(int i = 1; i <= 5; i++){

            N2 = i * i;
            N3 = i * i * i;
            N4 = i * i * i * i;

            //System.out.println(i +"\t\t"+ N2+"\t\t"+ N3 + "\t\t" + N4);
            System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", i,N2,N3,N4);
        }

    }
}
