#include<conio.h>
#include<iostream.h>

void main(){
	int nilai;
   char huruf;

   cout << "Masukan angka : ";cin >> nilai;
   cout << endl;

   for(int i = 1;i <= ((nilai/2)+1);i ++ ){
      huruf = 'a';
   	for(int j = 1; j <= i; j++){
      	cout << " " << huruf << " ";
         huruf ++;
      }
   	cout << endl;
   }
   for(int i = ((nilai/2));i >= 1;i -- ){
   	huruf = 'a';
   	for(int j = 1; j <= i; j++){
      	cout << " " << huruf << " ";
         huruf ++;
      }
   	cout << endl;
   }

   getch();
}