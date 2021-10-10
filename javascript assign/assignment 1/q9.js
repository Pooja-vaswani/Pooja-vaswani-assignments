altcon();
function altcon()
{
    var str1 = ['a','b','c'];
    var str2 = [1,2,3];
    var str = [];
    var j=0,k=0;
    for(i=0; i<str1.length+str2.length; i++)
    {
        if(i%2==0)
        {
            str[i] = str1[j];
            j++;
        }
        else{
            str[i] = str2[k];
            k++;
        }
    }
    document.write(str);

}