
random();
function random()
{
    var a = [5,15,17,65,100,46,1,24,-95,201,-5];
    var max = Math.max(...a);
    var min = Math.min(...a);
    var ev,od,avg,sum=0;
    for(i=0;i<a.length;i++)
    {   
        sum +=a[i];
        if(a[i]%2==0) ev++;
        else od++;
    }
    
    document.write("maximum=" + max  + " <br>minimum=" + min + "<br>sum=" + sum + "<br>average=" + sum/a.length+ "<br>");
    if(ev>od)
    document.write("Even");
    else
    document.write("Odd");
}
