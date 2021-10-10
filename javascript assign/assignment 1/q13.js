loop();
function loop()
{
    var a = [9,10,11,15,20,25];
    var s1=0,s2=0, s3=0, b =a.length;
    for(i=0; i<b ; i++)
    {
        s1+=a[i];
    }
    i=0;
    while(i<b){
        s2+=a[i];
        i++;
    }
    i=0;
    do{
        s3+=a[i];
        i++;
    } while(i<b);
    document.write("For loop:" + s1 + "<br>" + "while loop:" + s2 + "<br>" + "do while loop:" + s3 + "<br>");
}