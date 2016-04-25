
public class Sederhana {
    private int pembilang, penyebut;
    public Sederhana(int pem, int peny){
        pembilang = pem;
        penyebut = peny;
    }
    public static int Tambah(int a, int b) {
        return a + b;
    }
    public static int Kurang(int a, int b) {
        return a - b;
    }
    public int Kali(int a, int b) {
        return a * b;
    }
    public double Bagi(double a, double b) {
        return a / b;
    }
    public void Sederhana() {
        int temp, A, B;
        if (penyebut == 0) {
            return;
        }
        A = (pembilang < penyebut) ? penyebut : pembilang;
        B = (pembilang < penyebut) ? pembilang : penyebut;
        while (B != 0) {
            temp = A % B;
            A = B;
            B = temp;
        }
        pembilang /= A;
        penyebut /= A;
        System.out.println(pembilang+"/"+penyebut);
    }
}


