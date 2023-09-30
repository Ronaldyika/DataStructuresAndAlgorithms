let a = [2,4,5,6,7,8,3];

var sum = 0;

for(i=0;i<7; i++){
    sum += i;
    
}

console.log(sum);

//<=========================operations on arrays=====================>

a[2] = 5;
console.log(a);

a.splice(2,0,5);
console.log(a);

a.pop()
console.log(a);


