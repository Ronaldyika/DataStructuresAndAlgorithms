function alertfunction(){

    alert("input fields required!!");
    
}

function info(){
    var username = document.getElementById("username");
    console.log(username)

    if(username.info = null){
        alertfunction();
    }
    else{
        prompt("are you sure you want to login?")
    }
}


const titles = document.getElementById("titles");

for( let i = 0; i < 3; i ++){
    const item = titles.innerText
    console.log(item);
    
    Array.from(item).forEach(item => {
        console.log(i,item)
    });
}