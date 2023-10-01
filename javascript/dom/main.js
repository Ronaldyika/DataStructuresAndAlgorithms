/*
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
*/

//dom queryselector and queryselectorall
/*const topics = document.querySelectorAll('#titles')
topics.forEach(function(item) {
    console.log(item.textContent)
});


//dom traversal

const booklist = document.querySelectorAll('#book-list');
console.log('the parent node is', booklist.parentNode);

//dom events

const eventlistener = document.querySelector('#heading');

addEventListener('mouseover',function(e){
    console.log(e.target);
    console.log(e);
})


*/



const bamenda_welcome = document.querySelector("#js_added h4");

addEventListener('click', function(e){
    console.log(e.target)
})


console.log(document.forms);
const adduser = document.forms['add-book'];

adduser.addEventListener('submit',function(e){
    const vallue = adduser.querySelector('input[type  = "text"]').vallue

console.log(vallue);
})