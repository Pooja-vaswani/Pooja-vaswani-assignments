var a = [1,3,5,4,2];
find(a,test);
function find(a,test)
{   
    for(i=0;i<a.length; i++)
    {
        if(test(a[i]) == true)
        {
            document.write(a[i]);
            break;
        }
    }
    
}

function test(n){
    if( n%2==0)
        return true;
    else 
        return false;
}