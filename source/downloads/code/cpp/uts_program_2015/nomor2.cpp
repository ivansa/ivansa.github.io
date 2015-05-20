#include<iostream.h>
#include<conio.h>

void main(){
	int angka;

   cout << "Masukkan angka : ";cin >> angka;

   if(angka%2 == 0){
   	cout << "Angka " << angka << " habis dibagi 2" << endl;
		cout << "Jadi angka adalah angka genap";
   }else{
      cout << "Angka " << angka << " tidak habis dibagi 2" << endl;
		cout << "Jadi angka adalah angka ganjil";
   }

   getch();

}