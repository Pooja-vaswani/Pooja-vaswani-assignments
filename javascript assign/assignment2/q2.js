
function compose(f1,f2) {
    function f3(x){
        document.write("value" +f1(f2(x)));
       
    }
     return f3;
    
}
function f1(x)
{
    return x*x;
}

function f2(x)
{
    return x*2;
}
compose(f1,f2)(10)