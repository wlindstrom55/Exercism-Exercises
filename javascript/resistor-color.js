//
// This is only a SKELETON file for the 'Resistor Color' exercise. It's been provided as a
// convenience to get you started writing code faster.
//

export const colorCode = (color) => {
  // return COLORS[color]; - if you wanted to do object notation instead of array
  return COLORS.indexOf(color);
};

export const COLORS = [
  'black', 'brown', 'red', 'orange', 'yellow', 'green', 'blue', 'violet', 'grey', 'white'
];

//alternative object notation:
// {
//   black : 0,
//   brown: 1,
//   red: 2,
//   orange: 3,
//   yellow: 4,
//   green: 5,
//   blue: 6,
//   violet: 7,
//   grey: 8,
//   white: 9
// };
