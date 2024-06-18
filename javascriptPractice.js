'use strict';

let hasDriversLicense = false;
const passTest = true;

if (passTest) hasDriversLicense = true;
if (hasDriversLicense) console.log('I can drive!');

function logger() {
  console.log('My name is Austin');
}

// calling the function / running / invoking
logger();

function fruitProcesser(apples, oranges) {
  const juice = `Juice with ${apples} apples and ${oranges} oranges.`;
  return juice;
}

const appleJuice = fruitProcesser(5, 0);
console.log(appleJuice);

function describeCountry(country,population,capitalCity) {
  return `${country} has a population of ${population}, and it's capital city is ${capitalCity}.`;
}

const cityDescription = describeCountry('USA', 500, 'Washington DC');
console.log(cityDescription);


// REMEMBER THESE FUNCTION "FORMULAS"! lines 34 to 76

// Function Declaration (this one seems better!)
function calcAge1(birthYear) {
  return 2037 - birthYear;
}

console.log(calcAge1(1991));

// end of declaration

// Function Expression
const calcAge2 = function(birthYear){
  return 2037 - birthYear;
}
const age2 = calcAge2(1991);
console.log(age2);

// Arrow Function (shorter and faster to write)
const calcAge3 = birthYear => 2037 - birthYear;
const age3 = calcAge3(1991);
console.log(age3);

// calculate world population exercise

//declaration
function percentageOfWorld1(population) {
  return (population / 7900) * 100;
}
const world1 = percentageOfWorld1(100000);
console.log(world1);
console.log(percentageOfWorld1(100000));

//expression
const percentageOfWorld2 = function(population){
  return (population / 7900) * 100;
}
const world2 = percentageOfWorld2(100000);
console.log(world2);
console.log(percentageOfWorld2(100000));

//arrow form
const world3Pop = population => (population / 7900) * 100;
const world3 = world3Pop(100000);
console.log(world3);

// continuing with function practice
const yearsUntilRetirement = (birthYear, firstName) => {
  const age = 2024 - birthYear
  const retirement = 65 - age;
  return `${firstName} retires in ${retirement} years.`
}

console.log(yearsUntilRetirement(1988, 'Austin'));

// new practice part - functions with functions
function cutFruitPieces(fruit) {
  return fruit * 4;
}

function fruitProcesser(apples, oranges) {
  const applePieces = cutFruitPieces(apples);
  const orangePieces = cutFruitPieces(oranges);

  const juice = `Juice with ${applePieces} apples slices and ${orangePieces} oranges slices.`;
  return juice;
}

console.log(fruitProcesser(2,3));

// Coding Exercise 5 CHALLENGE #1
const calcAverage = (score1, score2, score3) => (score1 + score2 + score3) / 3;
  //return average;

const scoreDolphins = calcAverage(44, 23, 71);
const scoreKoalas = calcAverage(65, 54, 49);
console.log(scoreDolphins, scoreKoalas);

const checkWinner = function(avgDolphins, avgKoalas) {
  if (avgDolphins >= 2 * avgKoalas) {
    console.log('Dolphins Win!')
  } else if (avgKoalas >= 2 * avgDolphins) {
    console.log('Koalas Win!');
  } else {
    console.log('No one wins...');
  }
}

checkWinner(scoreDolphins, scoreKoalas);
// end of challenge

const countrypop = [1500, 2000, 2500, 3000];
if (countrypop.length >= 4)
  {
    console.log('True');
  } else {
    console.log('False');
  } 

  console.log(countrypop.length === 4);
  console.log(countrypop.length);
  console.log(countrypop[3]);

  console.log(countrypop.indexOf(2000));
  console.log(countrypop.includes(2000));
  console.log(countrypop.includes(200220));

  const calcTip = function(bill) {
    return bill >= 50 && bill <= 300 ? bill * 0.15 : bill * 0.2;
  }

  const bills = [125, 555, 44];
  const tips = [calcTip(bills[0]), calcTip(bills[1]), calcTip(bills[2])];
  const totals = [bills[0] + tips[0], bills[0] + tips[0], bills[0] + tips[0]];

  console.log(bills, tips, totals);

  const jonas = {
    firstName: 'Jonas',
    lastName: 'Schmedtman',
    birthYear: 1991,
    job: 'teacher',
    friends: ['Michael', 'Peter', 'Steven'],
    hasDriversLicense: true,

    calcAge: function () {
      this.age = 2024 - this.birthYear;
      return this.age;
    },

    getSummary: function() {
      return `${jonas.firstName} is a ${jonas.age} year old ${jonas.job}, and he ${jonas.hasDriversLicense ? "has a" : "doesn't have a" } driver's license.`
    },

    getSummary2: function() {
      return `${this.firstName} is a ${this.age} year old ${this.job}, and he ${this.hasDriversLicense ? "has a" : "doesn't have a" } driver's license.`
    }
    }

  console.log(jonas.calcAge());
  console.log(jonas.age);

// console.log(`${jonas.firstName} is a ${jonas.age} year old ${jonas.job}, and he ${jonas.hasDriversLicense ? "has a" : "doesn't have a" } driver's license.`)
console.log(jonas.getSummary())
console.log(jonas.getSummary2())

const mark = {
  fullName: 'Mark Miller',
  mass: 78,
  height: 1.69,
  
  calcBMI: function() {
      this.bmi = this.mass / (this.height * this.height);
      return this.bmi;
  }
}

const john = {
  fullName: 'John Smith',
  mass: 92,
  height: 1.95,
  
  calcBMI: function() {
      this.bmi = this.mass / (this.height * this.height);
      //return this.bmi;
  }
}

mark.calcBMI();
john.calcBMI();

console.log(`${mark.fullName} weighs ${mark.mass} and is ${mark.height} tall. His BMI is ${mark.bmi}. ${john.fullName} weighs ${john.mass} and is ${john.height} tall. His BMI is ${john.bmi}.`)

// array

const jonasArray = [
  'Jonas',
  'Schmedtmann',
  2037 - 1991,
  'teacher',
  ['Michael', 'Peter', 'Steven'],
  true
];

for (let i = 0; i < jonasArray.length; i++) {
  console.log(jonasArray[i], typeof jonasArray[i]);
}
*/

const years = [1991, 2007, 1969, 2020];
const ages = [];

for (let i = 0; i < years.length; i++) {
  ages.push(2037 - years[i]); 
}
console.log(ages);

/// new

const jonas = [
  'Jonas',
  'Schmedtmann',
  2037 - 1991,
  'Teacher',
  ['Michael', 'Peter', 'Steven'],
  true
];

for (let i = jonas.length - 1; i >= 0; i--) {
  console.log(i, jonas[i]);
}

// new one

for (let exercise = 1; exercise < 4; exercise++ ) {
  console.log(`--- Starting Exercise ${exercise} ---`);

  for (let rep = 1; rep < 6; rep++) {
    console.log(`Lifting weights repitition ${rep}`);
  }
}

*/

for (let rep = 1; rep <= 10; rep++) {
  // console.log(`FOR LOOP Lifting weights repitition ${rep}`);
}

let rep = 1;
while (rep <= 10) {
  // console.log(`WHILE LOOP Lifting weights repitition ${rep}`);
  rep++;
}


let dice = Math.trunc(Math.random() * 6) + 1;

while (dice !== 6) {
  console.log(`You rolled a ${dice}`);
  dice = Math.trunc(Math.random() * 6) + 1;
  if (dice === 6) console.log('Loop ended...');
}

