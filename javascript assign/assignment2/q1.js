
function composedValue(square,double,x){

    document.write("value :" +square(double(x)));
    
}
function square(x)
{
    return(x*x);
}
function double(x)
{
    return(x*2);
}
composedValue(square,double,5);