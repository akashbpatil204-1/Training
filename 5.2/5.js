let vegDishes=['dosa','id','pulav'];
let nonveg = ['biryani','masala egg'];

const dishes = ['asppp','dddd',...vegDishes , ...nonveg]
dishes.forEach(dish=>console.log(dish));

let item ={
    name:'dabba',
    price: 3478,
    details:{
        os:'ch'
    }
}

const props  = {...item}
console.log(props);

let players=['f','v','b','a'];
const [ ,captain , vCaptain,...team]=players;
let player = {
    name:'virat ',
    centuries:23,
    halfCenturies:50,
    matches:350,

}


const {name:pname , centuries, matches,...properties} = player;

console.log(properties);