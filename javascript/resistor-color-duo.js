export const decodedValue = (x) => {

  //split by spaces, if input were a string. But in this case it's an array
  // let string = x.split(' ');
  let color1 = x[0];
  let color2 = x[1];

  let val1 = COLORS[color1];
  let val2 = COLORS[color2];
 
  let ret = `${val1}${val2}`; //probably a better way to concat these.

  return +ret;
  //the '+' unary operator converts the string to a number which we need for out output.

};

const COLORS = {
  black: 0,
  brown: 1,
  red: 2,
  orange: 3,
  yellow: 4,
  green: 5,
  blue: 6,
  violet: 7,
  grey: 8,
  white: 9
}
