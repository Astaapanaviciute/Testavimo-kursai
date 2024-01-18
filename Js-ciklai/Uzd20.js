window.onload = function() {
    let tekstas = "25654865lllll";
   
    skaiciai(tekstas);    
}
function skaiciai(tekstas) {
   let i = 0;
   while ( "0123456789".includes(tekstas[i])) {
    console.log(tekstas[i]);
    i++
   }
}
//Vykdome ciklą, kol to tekstinio kintamojo simbolis yra skaičius, priešingu atveju ciklas baigsis
