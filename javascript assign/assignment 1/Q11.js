reverse();
function reverse()
{
    var arr = [5,15,16,20,23,26];
    var temp, n = arr.length;
    for(i=0;i<n/2; i++)
    {
        temp = arr[n-i-1];
        arr[n-i-1] = arr[i];
        arr[i] = temp;
    }
    document.write(arr);
}