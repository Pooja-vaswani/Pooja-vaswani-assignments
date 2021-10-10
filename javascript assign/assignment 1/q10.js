
fibo();
function fibo()
{
    var a=1, b=1 , c;
    for(i=0;i<100;i++)
    {
        document.write(a + "<br>");
        c =a+b;
        a=b;
        b=c;
    }
}