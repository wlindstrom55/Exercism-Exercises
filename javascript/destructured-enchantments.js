/// <reference path="./global.d.ts" />

// @ts-check

//https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Operators/Destructuring_assignment

export function getFirstCard(deck) {
  let [first] = deck;
  //w/ desctructuring assignment, it just takes first array val. If we did let [first, second] = deck; it would assign the second value to 'second'
  return first;
}

export function getSecondCard(deck) {
  let [first, second] = deck;
  return second;
}

export function swapTopTwoCards(deck) {
  let [first, second, ...remainder] = deck;
  return [second, first, ...remainder];
}

export function discardTopCard(deck) {
  // let first = deck.shift();
  let [first, ...remainder] = deck;
  return [first, remainder];
}

const FACE_CARDS = ["jack", "queen", "king"];

export function insertFaceCards(deck) {
  // let first = deck.shift();
  // let retArr = [first, second, third, fourth, ...deck];
  // return retArr;
  let [first, ...remainder] = deck;
  return [first, ...FACE_CARDS, ...remainder];
}
