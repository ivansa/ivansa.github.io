#include<iostream.h>
#include<conio.h>

void main(){
	int angka, i, j;

   cout << "Masukkan angka : ";cin >> angka;
   cout << endl;

   for(i = 1;i <= angka;i++){
		for(j = 1;j <= i; j++){
      	if(j%2 == 0)
      		cout << j << "B ";
      	else
         	cout << j << "A ";               
      }
      cout << endl;                              
   }

   getch();                          

}