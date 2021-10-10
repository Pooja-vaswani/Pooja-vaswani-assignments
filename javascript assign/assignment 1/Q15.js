sorting();
function sorting()
{
    var a = [32, 50, 62, 57, 96, 47, 38, 54, 84, 37, 46, 35, 22, 41, 8, 18, 94, 54, 70, 10];
    var temp, n=a.length;
    for(i=0;i<n-1;i++)
    {
        for(j=0; j<n-i-1;j++)
        {
            if(a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
        }
    }
    for(i=0;i<n;i++)
    {
        document.write(a[i] + " ");
    }
}
