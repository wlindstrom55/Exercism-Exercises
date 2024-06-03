export const gigasecond = (timeObject) => {
  //this code exercism isn't good. I think it should just tell you to work in milliseconds instead of seconds, instead of trying to convert like I did for a few hours. I found the README instructions to be poor.
  return new Date(timeObject.getTime() + 1000000000000);
};
