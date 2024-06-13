// @ts-check

export function cardTypeCheck(stack, card) {
  let count = 0;
  stack.forEach((x) => x == card ? count++ : undefined);
  return count;
}

export function determineOddEvenCards(stack, type) {
  let countEven = 0, countOdd = 0;

  for (const card of stack) {
    card % 2 === 0 ? countEven++ : countOdd++;
  }
  
  if (type) return countEven;
  else return countOdd;
}
