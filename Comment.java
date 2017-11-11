/*Sebelum program kita jadi lebih rumit, kita akan lihat cara untuk letak comment pada code kita.
Comment ialah teks yang kita letak pada code untuk menerangkan kepada orang lain mengenai apa, 
mengapa, dan bagaimana kita tulis code tersebut.
Sebelum kita tulis comment, kita kena terlebih dahulu beritahu
kepada komputer bahawa teks tersebut ialah comment. 
Caranya adalah dengan menggunakan simbol //. 
Semua teks yang berada selepas // akan menjadi comment.
Sebagai alternatif jika comment kita terlalu panjang, 
kita juga boleh menggunakan simbol /* dan */.
//Semua teks yang berada di antara dua simbol tersebut akan menjadi comment
//Contoh comment yang kita boleh letak pada HelloWorld:

/*
 * Program ini akan memaparkan Hello, World!
 * di command line interface.
 */
public class HelloWorld {

  // Mula-mula sekali, komputer akan cari main()
  public static void main(String[] args) {
    System.out.println("Hello, World!"); // Paparkan teks tersebut
  }
}