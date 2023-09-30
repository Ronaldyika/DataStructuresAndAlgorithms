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
================================*/
const n1 = {
    data:200
}

const n2 ={
    data:340
}

n1.next = n2;
console.log(n1);