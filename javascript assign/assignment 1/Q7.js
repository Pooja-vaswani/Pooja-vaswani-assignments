function currency()
{
    var amt = prompt("Enter the value in dollars:");
    document.write((amt*74.28)+" INR (Indian Rupees) <br>" + (amt*109.14)+" Yen (Japanese Yen) <br>" + (amt*0.84) + " Euro (Euro) <br>"
                    + (amt*0.72)+ " Pound sterling (Pound sterling) <br>");
}
currency();