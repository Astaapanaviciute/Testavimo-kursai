window.onload = function() {
    let a = +prompt("Įveskite pirmą skaičių: ");
    let b = +prompt("Įveskite antrą skaičių: ");
    alert("Galutine suma yra: " + rezultatas(a, b));

    
    alert("antradienis" + " " + "antradienis" + " " + "antradienis");
}

function rezultatas(a, b) {
    return (a * b) / (a + b);
}