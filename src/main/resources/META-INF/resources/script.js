var arr = document.querySelector("#array").innerText;
var splited = arr.replaceAll("[","").replaceAll("]]","").split("], ");
var step = 0;

for (step = 0; step < splited.length; step++) {
    splited[step] = splited[step].split(", ")
}

let tbody = document.getElementById('tbody')
for(let x = 0; x < splited.length; x++){
    if(splited[x][0] != 'null' && splited[x][1] != 'null' && splited[x][2] != 'null' && splited[x][3] != 'null') {
        let tr = tbody.insertRow();
        let td_name = tr.insertCell();
        let td_age = tr.insertCell();
        let td_email = tr.insertCell();
        let td_game = tr.insertCell();
        td_name.innerText = this.splited[x][0];
        td_age.innerText = this.splited[x][1];
        td_email.innerText = this.splited[x][2];
        if (this.splited[x][3] == 'lol'){
            td_game.innerText = 'League of Legends';
        }
        else if (this.splited[x][3] == 'csgo'){
            td_game.innerText = 'Counter Strike: Global Offensive';
        }
        else if (this.splited[x][3] == 'valorant'){
            td_game.innerText = 'Valorant';
        }
        else {
            td_game.innerText = 'Outro jogo';
        }

    }
}

