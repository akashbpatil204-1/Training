var dish = {//object
    id: 34,
    name:'idli',
    price:'40'
}

console.log(dish);
console.log(dish.name);

var dish =[//array of objects


    {id:1 , name:'a'},{id:2,name:'ss'}
]
console.log(dish[0].name);//how to access
dish[0].name='uo';
console.log(dish[0].name);

for(var i= 0;i<dish.length;i++){
    console.log(dish[i]['name']);
}
let printDishName = function(allDishes){
    console.log(' arguments');

    console.log(arguments);
    for(var i= 0;i<allDishes.length;i++){
        console.log(allDishes[i]['name']);
    }
}

printDishName(dish ,0);