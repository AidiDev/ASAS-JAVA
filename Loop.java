/*
Loop ialah kaedah untuk mengulangi sesuatu proses.
Contohnya, jika kita mahu menulis sesuatu sebanyak 100 kali. 
Satu cara adalah dengan menulis System.out.println() sebanyak 100 kali,
tapi apakan daya, kita manusia biasa. 
Jadi, kita boleh beritahu program untuk System.out.println() sebanyak 100 kali.
Ada tiga cara untuk menulis loop, iaitu: while loop, for loop, dan do while loop.
Semuanya lakukan benda yang sama iaitu untuk mengulangi sesuatu.
*/

//While loop
//Program untuk menulis sesuatu berkali-kali:
public class ContohWhileLoop {
    public static void main(String[] args) {
        int count = 0; // variable untuk mengira

        while (count < 100) { // bermaksud selagi count kurang daripada 100

            System.out.println("Cikgu suka main bola, hari-hari cikgu main bola.");
            count++; // tambah satu setelah menulis sesuatu pada terminal
        }
    }
}
//Kurungan selepas while ialah syarat yang kita tetapkan untuk mengulang.
//Jadi, code tersebut bermaksud:
//[1]Tulis Cikgu suka main bola, hari-hari cikgu main bola.
//[2]Tambah satu pada count.
//[3]Ulang dengan syarat count kurang daripada 100.
//[4]Loop akan berhenti apabila count sudah menjadi 100 kerana sudah melanggar syarat.

//For loop
//Program yang sama tetapi menggunakan for loop:
public class ContohForLoop {
    public static void main(String[] args) {
        for (int count = 0; count < 100; count++) {
            System.out.println("Cikgu suka main bola, hari-hari cikgu main bola.");
        }
    }
}
//Kurungan selepas for diletakkan tiga benda sama yang ada pada while loop:
//[1]Variable count untuk mengira.
//[2]Syarat untuk mengulang, count < 100.
//[3]Penambahan kepada variable count.

//Do while loop
//Program yang sama tetapi menggunakan do while loop:
public class ContohDoWhileLoop {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println("Cikgu suka main bola, hari-hari cikgu main bola.");
            count++;
        } while (count < 100);
    }
}

//While loop vs do while loop
/*
Beza antara dua loop ini ialah kedudukan syarat untuk mengulang.
Untuk while loop diletakkan pada awal code,
dan untuk do while loop diletakkan pada akhir code.
Kesannya,
do while loop mesti akan execute code tersebut paling kurang sekali.
*/
//Sebagai bukti, kita boleh execute dua program menggunakan syarat count < 0:
public class WhileVsDoWhile {
    public static void main(String[] args) {
        int count = 0;

        while (count < 0) {
            System.out.println("Cikgu suka main bola, hari-hari cikgu main bola.");
            count++;
        }
    }
}

public class WhileVsDoWhile {
    public static void main(String[] args) {
        int count = 0;

        do {
            System.out.println("Cikgu suka main bola, hari-hari cikgu main bola.");
            count++;
        } while (count < 0);
    }
}

//Hasilnya, hanya string dari do while loop yang dipaparkan.