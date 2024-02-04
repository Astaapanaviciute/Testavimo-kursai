window.onload = function() {
    let x = +prompt("Įveskite šimtabalės sistemos balus :");
    
}
function balas(grade) {
    switch(grade) {
        case x >= 90:
            alert("A");
        case 80:
            return "B";
        case 70:
            return "C";
        case 60:
            return "D";
        case 40:
            return "E";
        case 40:
            return "F";
        default:
            return "Netinkamai ivestas balas";
    }
}