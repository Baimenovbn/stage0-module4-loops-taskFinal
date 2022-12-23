package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = 1; j <= cathetusLength; j++) {
                if (j > cathetusLength - i) {
                    System.out.print(cathetusLength - j + 1);

                    if (cathetusLength - j + 1 == 1) {
                        for (int k = 2; k <= i; k++) {
                            System.out.print(k);
                        }
                    }
                } else {
                    System.out.print(' ');
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
