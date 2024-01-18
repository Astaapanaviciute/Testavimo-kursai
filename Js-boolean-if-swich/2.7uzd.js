window.onload = function() {
    let x = +prompt("Pirma koordinate: ");
    let y = +prompt("Antra koordinate: ");
    let s = 2;
    let z = Math.sqrt((Math.pow(x, s)) + (Math.pow(y, s)));
    alert(z);
}
