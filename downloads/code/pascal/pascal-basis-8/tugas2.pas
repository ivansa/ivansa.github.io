program Ivans2;
uses crt;

 
var 
    i : integer; 
    n : real;
    x: array [0..3] of integer;
    
function pangkat(x,y : integer) : real;
    var hasil : real;
    begin
         hasil := exp( x * ln(y));
         pangkat := hasil;
    end;

begin 
        clrscr; 
        
        x[3] := 4;
        x[2] := 3;
        x[1] := 6;
        x[0] := 7;

        for i:= 3 downto 0 do
            begin
                 n := n + (x[i] * pangkat(i,8));
            end;
         
        write('N = ',n:2:0);   

        readln();
end.