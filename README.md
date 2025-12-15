# UKL-Yusuf-Aulia-Mumtazzam-X-RPL3

import java.util.Scanner; // Mengimpor class Scanner untuk input dari user


public class Prima { // Membuat class bernama Prima
public static void main(String[] args) { // Method utama program
Scanner sc = new Scanner(System.in); // Membuat objek Scanner
System.out.print("Masukkan bilangan: "); // Menampilkan perintah input
int n = sc.nextInt(); // Menyimpan input bilangan ke variabel n
boolean prima = true; // Variabel untuk menandai bilangan prima atau tidak


if (n <= 1) { // Mengecek jika bilangan kurang dari atau sama dengan 1
prima = false; // Maka bukan bilangan prima
} else {
for (int i = 2; i <= Math.sqrt(n); i++) { // Perulangan dari 2 sampai akar n
if (n % i == 0) { // Mengecek apakah n habis dibagi i
prima = false; // Jika ya, bukan bilangan prima
break; // Menghentikan perulangan
}
}
}


if (prima) // Jika variabel prima bernilai true
System.out.println(n + " adalah bilangan prima"); // Tampilkan prima
else
System.out.println(n + " bukan bilangan prima"); // Tampilkan bukan prima
