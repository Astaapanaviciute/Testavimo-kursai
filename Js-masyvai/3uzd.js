window.onload = function() {
    const belenkas = [5, 6, 8, 10];
    let masSandauga = masyvoSandauga(belenkas);
    console.log("Masyvo sandauga yra: " + masSandauga);
    
}
function masyvoSandauga(masyvas) {
    let sandauga = 1;
    for (let i = 0; i < masyvas.length; i++) {
        sandauga *= masyvas[i];
    }
    return sandauga;
}
