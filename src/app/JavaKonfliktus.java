package app;

public class JavaKonfliktus {

    public static void main(String[] args) {
        kever();

    

        case 2:
            for(int i = 1;i<7;i++)  {
                uj[i+7]=pakli[19-(i-1)*3];
                uj[i]=pakli[20-(i-1)*3];
                uj[i+14]=pakli[21-(i-1)*3];  
            }
            break;
        case 3:
            for (int i = 1; i < 7; i++) {
                uj[i+7]=pakli[19-(i-1)*3];
                uj[i+14]=pakli[21-(i-1)*3];
                uj[i]=pakli[20-(i-1)*3];     
                }
                break;

    }

    private static void kever() {
        String[] uj = new String[22];
        int index = 1;

        for (int i = 1; i <= 3; i++) {

            if (i != oszlop) {

                for (int j = 0; j < 7; j++) {
                    uj[index] = pakli[i + j * 3];
                    index++;
                }
            }
        }

        for (int j = 0; j < 7; j++) {
            uj[index] = pakli[oszlop + j * 3];
            index++;
        }

        pakli = uj;
    }

}
