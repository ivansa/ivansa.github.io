program Ivans1;
uses crt;

var a,s : integer; 

begin 
        clrscr; 
        
        s := 0;
        a := 3;

        while a <= 403 do
            begin
                 s := s + a;
                 a := a + 4;
            end;
            
        write('s = ',s);

        readln();
end.