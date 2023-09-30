/*===================================
class Node{

    constructor(data,next){
        this.data  = data;
        this.next = next;
    }

    Node(data){
        this.data = data;
    }
}

n = new Node();
nodea = n.Node.Node(3);
nodeb = n.Node.Node(4);
nodec = n.Node.Node(6);
noded = n.Node.Node(0);
nodef = n.Node.Node(10);
nodea.next = nodeb;
nodeb.next = nodec;
nodec.next = noded;

console.log(nodea.next);

const n1 = {
    data:200
}

const n2 ={
    data:340
}

n1.next = n2;
console.log(n1);
================================*/


class Node{
    constructor(data,next = null){
        this.data = data;
        this.next = next;
    }
}
class LinkedList{
    constructor(){
        this.head = null;
        this.size = 0;
    }

    //insert first node
    insertFirst(data){
        this.head = new Node(data,this.next)
    }

    //insert last node

    //insert at index

    //get at index

    //remove at index

    //print list data
}

/*
const n1 = new Node(200);
const n2 = new Node(340,n1);
const n3 = new Node(900,n2);
const n4 = new Node(40,n3);
console.log(n3);*/

const ll = new LinkedList();
ll.insertFirst(200);
ll.insertFirst(470);

console.log(ll);
console.log(0.5 + 0.1 === 0.6)
console.log(0.2 + 0.1 === 0.3)