// Class Bank
class Bank {

    // Method overloading 1
    void transferUang(int jumlah, String rekeningTujuan) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan);
    }

    // Method overloading 2
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " bank " + bankTujuan);
    }

    // Method overloading 3
    void transferUang(int jumlah, String rekeningTujuan,
                      String bankTujuan, String berita) {
        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " bank " + bankTujuan +
                " dengan berita: " + berita);
    }

    // Method suku bunga
    void sukuBunga() {
        System.out.println("Suku bunga standar adalah 3%");
    }
}

// Class turunan BankBNI
class BankBNI extends Bank {

    // Overriding suku bunga
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BNI adalah 4%");
    }

    // Overriding transfer uang
    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {

        int biayaTransfer = 2500;

        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " bank BNI");
        System.out.println("Biaya transfer: Rp" + biayaTransfer);
    }
}

// Class turunan BankBCA
class BankBCA extends Bank {

    // Overriding suku bunga
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga BCA adalah 4.5%");
    }

    // Overriding transfer uang
    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {

        int biayaTransfer = 6500;

        System.out.println("Transfer Rp" + jumlah +
                " ke rekening " + rekeningTujuan +
                " bank BCA");
        System.out.println("Biaya transfer: Rp" + biayaTransfer);
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {

        // Objek Bank
        Bank bank = new Bank();

        // Method overloading
        bank.transferUang(500000, "123456789");
        bank.transferUang(750000, "987654321", "Mandiri");
        bank.transferUang(1000000, "456789123",
                "BRI", "Bayar Kuliah");

        bank.sukuBunga();

        System.out.println();

        // Objek BankBNI
        BankBNI bni = new BankBNI();
        bni.sukuBunga();
        bni.transferUang(200000, "111222333", "BNI");

        System.out.println();

        // Objek BankBCA
        BankBCA bca = new BankBCA();
        bca.sukuBunga();
        bca.transferUang(300000, "444555666", "BCA");
    }
}