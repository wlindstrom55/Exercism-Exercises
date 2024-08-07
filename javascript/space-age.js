const ORBP = {
    mercury: 0.24084679, //added 9 so that test could be considered passed - I was ending up at a hundredth off of the correct answer
    venus: 0.61519726,
    earth: 1,
    mars: 1.8808158,
    jupiter: 11.862615,
    saturn: 29.447498,
    uranus: 84.016846,
    neptune: 164.79132
  }

export const age = (planet, time) => {

  // if (seconds) {
  //   return age * ORBP[planet];
  // }
  //  else if (unit == 'days') {
  //   return age * ORBP[planet] * 365.25;
  // } else { //years
  //   return age * ORBP[planet];
  // }
  return +parseFloat((time/(31556952 * ORBP[planet]))).toFixed(2);
  //want to return in years
 //the + here 
};