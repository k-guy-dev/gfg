package pepQue.Level1.basicsOfProgramming;

class printz {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 4) {
                    System.out.print('*');
                } else {
                    if (j == (4 - i)) {
                        System.out.print('*');
                    } else if (j != (4 - i)) {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}