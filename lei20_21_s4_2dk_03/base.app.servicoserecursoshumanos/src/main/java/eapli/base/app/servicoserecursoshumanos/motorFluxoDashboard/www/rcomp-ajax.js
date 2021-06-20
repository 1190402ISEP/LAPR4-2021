// IMPORTANT: notice the next request is scheduled only after the
//            previous request is fully processed either successfully
//	      or not.


function refreshColab() {
    var request = new XMLHttpRequest();
    var vBoard = document.getElementById("InformacaoColab");
    request.onload = function () {
        vBoard.innerHTML = this.responseText;
        vBoard.style.color = "white";
        console.log(this.responseText);
        setTimeout(refreshColab, 2000);
    };

    request.ontimeout = function () {
        vBoard.innerHTML = "Server timeout, still trying ...";
        vBoard.style.color = "red";
        setTimeout(refreshColab, 100);
    };

    request.onerror = function () {
        vBoard.innerHTML = "No server reply, still trying ...";
        vBoard.style.color = "red";
        setTimeout(refreshColab, 5000);
    };
    request.open("GET", "/InformacaoColab", true);
    request.timeout = 5000;
    request.send();
}

function voteFor(option) {
    var request = new XMLHttpRequest();
    request.open("PUT", "/votes/" + option, true);
    request.send();
    var vBoard = document.getElementById("votes");
    vBoard.innerHTML = vBoard.innerHTML + "<p>Casting your vote ... Please wait.";

}

function refreshMotorFluxo() {
    var request = new XMLHttpRequest();
    var vBoard = document.getElementById("InformacaoMotorFluxo");
    request.onload = function () {
        vBoard.innerHTML = this.responseText;
        vBoard.style.color = "white";
        console.log(this.responseText);
        setTimeout(refreshMotorFluxo, 2000);
    };

    request.ontimeout = function () {
        vBoard.innerHTML = "Server timeout, still trying ...";
        vBoard.style.color = "red";
        setTimeout(refreshMotorFluxo, 100);
    };

    request.onerror = function () {
        vBoard.innerHTML = "No server reply, still trying ...";
        vBoard.style.color = "red";
        setTimeout(refreshMotorFluxo, 5000);
    };
    request.open("GET", "/InformacaoMotorFluxo", true);
    request.timeout = 5000;
    request.send();
}