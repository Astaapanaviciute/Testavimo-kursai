window.onload = function() {
    let pastraipa1 = document.getElementById("pastraipa1");
    console.log(pastraipa1);
    innerHTML = "Šiandien yra sekmadienis";
    document.getElementById("pastraipa1").style.color = 'blue';
     
    let pastraipa2 = document.getElementById("pastraipa2");
    console.log(pastraipa2);
    document.getElementById("pastraipa2").style.border = "2px solid green";
    document.getElementById("pastraipa2").style.padding = "0.5em";

    let pastraipa3 = document.getElementById("pastraipa3");
    console.log(pastraipa3);
    document.getElementById("pastraipa3").style.backgroundColor = 'aqua';
    document.getElementById("pastraipa3").style.width = "50%";

    alert(innerHTML = "Šiandien yra sekmadienis");
    
}
