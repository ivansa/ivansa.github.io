uses crt;
type t = object
m1, m2 : array [1..2,1..2] of integer;
lok : array [1..4] of integer;
procedure tampil;
procedure input;
procedure kali;
procedure determinan;
procedure transpose;
end;
var m : t;
i,j,k,pil,b,c : integer;

procedure t.input;
begin
     clrscr;
     writeln ('---Input Matrik I---');
     for i := 1 to 2 do
     begin
          for j := 1 to 2 do
          begin
               write ('Elemen Matrik [',i,',',j,']:');
               readln (m1[i,j]);
          end;
     end;
     gotoxy (35,1) ; writeln('---Input Matriik II---');
     k := 2;
     for i := 1 to 2 do
     begin
          for j :=1 to 2 do
          begin
               gotoxy (35,k);
               inc (k);
               write ('Elemen Matrik [',i,',',j,']:');
               readln (m2[i,j]);
               end;
          end;
     end;

     procedure t.tampil;
     begin
     writeln;
     writeln(***Matrik I ***);
     writeln (m1[1,1]:5,m1[1,2]:5);
     writeln (m1[2,1]:5,m1[2,2]:5);
     gotoxy(35,7);writeln (*** Matrik II ***) ;
     gotoxy (35,8);writeln (m2[1,1]:5,m2[1,2]:5);
     gotoxy (35,9);writeln (m2[2,1]:5,m2[2,2]:5);
     readln;
end;

procedure t.kali;
begin
     gotoxy (26,12); writeln ('---Hasil Perkalian Matrik---');
     lok [1] := m1[1,1]*m2[1,1] + m1[1,2]*m2[2,1];
     lok [2] := m1[1,1]*m2[1,2] + m1[1,2]*m2[2,2];
     lok [3] := m1[2,1]*m2[1,1] + m1[2,2]*m2[2,1];
     lok [4] := m1[2,1]*m2[1,2] + m1[2,2]*m2[2,2];
     gotoxy (30,14);writeln (lok[1]:5,lok[2]:5);
     gotoxy (30,15);writeln  (lok[3]:5,lok[4]:5);
     readln;
end;

procedure t.determinan;
begin
     gotoxy (28,11); writeln ('--Determninan Matrik--');
     writeln;
     lok [1] := m1[1,1] * m1[2,2];
     lok [2] := m1[1,2] * m1[2,1];
     lok [3] := m2[1,1] * m2[2,2];
     lok [4] := m2[1,2] * m2[2,1];
     b:=lok[1] - lok[2];
     c:=lok[3] - lok[4];
     gotoxy (27,12);writeln ('Determinan Matrik I : ',b);
     writeln;
     gotoxy (27,14);writeln ('Determinan Matrik II : ',c);
     readln;
end;

procedure t.transpose;
begin
     gotoxy (6,10);
     writeln('--Hasil Transpose Matrik I--');
     lok [1] := m1[1,1];
     lok [2] := m1[2,1];
     lok [3] := m1[1,2];
     lok [4] := m1[2,1];
     gotoxy (12,12);writeln(lok[1]:5,lok[2]:5);
     gotoxy (12,13);writeln(lok[3]:5,lok[4]:5);
     gotoxy (42,10);writeln ('--Hasil Transpose Matrik II--');
     lok [1] := m2[1,1];
     lok [2] := m2[2,1];
     lok [3] := m2[1,2];
     lok [4] := m2[2,1];
     gotoxy (49,12);writeln(lok[1]:5,lok[2]:5);
     gotoxy (49,13);writeln(lok[3]:5,lok[4]:5);
     readln;
end;

begin
     repeat
     clrscr;
     gotoxy (25,1);writeln('|*****Manu Matrik*****|');
     gotoxy (25,2);writeln('|1. Input Matrik      |');
     gotoxy (25,3);writeln('|2. Perkalian Matrik  |');
     gotoxy (25,4);writeln('|3. Determinan Matrik |');
     gotoxy (25,5);writeln('|4. Transporse Matrik |');
     gotoxy (25,6);writeln('|5. Keluar            |');
     gotoxy (25,7);writeln('|*********************|');
     gotoxy (29,8);write('Pilihan [1..5] : ');readln (pil);
     case pil of
     1 : begin
       m.input;
       m.tampil;
       end;
     2 : m.kali;
     3 : m.determinan;
     4 : m.transpose;
     end;
     until (pil) = 5;
end.



