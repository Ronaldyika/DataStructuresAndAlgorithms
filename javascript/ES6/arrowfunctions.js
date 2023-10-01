//arrow functions


const sum =(x,y)=>x+y;

console.log(sum(2,5))


//mutable and immutable objects
//objects that can be change are said to be mutable and imutable are thos that cant be changed

//they handle the way info is stored in your memory

let x = 30;
let y = x;

y = y+1;

console.log(y);

let arr1 = ['men','women','old']

let arr2 = arr1;

arr2.pop();

console.log(arr1);

console.log(arr2);


//spread opretor

//what is spread operator

const users = ['user1','user2'];
//without spread operator

console.log(users);

//with spread



console.log(...users);

//in the absence of the spread , we can use the "concat " to add two arrays together


let team1 = ['Ron','chantal'];

let team2 = ['yika','juli'];

const team = team1.concat(team2);

console.log(team);


console.log("i will use the spread operator here");

console.log(...team1,...team2);