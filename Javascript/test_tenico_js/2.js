
const fruits = [
    "Apple", "Orange", "Banana", "Strawberry", "Grape", "Mango", "Melon",
    "Pineapple", "Peach", "Peach"
];

const pFruits = fruits.filter(fruit => fruit.toLowerCase().includes('p'));
console.log("Cadenas que contienen la letra 'p':", pFruits);

const grape = fruits.find(fruit => fruit === 'Grape');
console.log("string 'Grape':", grape);

