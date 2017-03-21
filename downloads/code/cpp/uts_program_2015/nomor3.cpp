#include <iostream.h>
#include <conio.h>
#include <ctype.h>

void main(){
	char pil;

   cout << "Menu Makan Siang" << endl;
   cout << "--------------------------------" << endl;
   cout << "A. Pizza         C. Nasi Goreng" << endl;
   cout << "B. Siomay        D. Nasi Gila" << endl;
   cout << "Masukkan Kode Menu Makan Siang Anda [A . . D] : ";cin >> pil;
   cout << endl;

   switch(toupper(pil)){
	  case 'A':
      	cout << "Pizza" << endl;
      break;
      case 'B':
      	cout << "Siomay" << endl;
      break;
      case 'C':
      	cout << "Nasi Goreng" << endl;
      break;
      case 'D':
      	cout << "Nasi Gila" << endl;
      break;
      default:
      	cout << "Pilihan Anda Salah" << endl;
      break;
   }

   getch();
                             

}
