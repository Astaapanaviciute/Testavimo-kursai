window.onload = function() {
    const masyvas = [5, 6, 8, 10];
    console.log(masyvoSuma(masyvas));
    console.log(vidurkis(masyvas));
    
    
}
function masyvoSuma(masyvas) {
    let suma = 0;
    for (let i = 0; i < masyvas.length; i++) {
        suma += masyvas[i];
    }
    return suma;
}
function vidurkis(masyvas) {
    let suma = masyvoSuma(masyvas);
    return suma /= 4;
}





