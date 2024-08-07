// @ts-check

//super helpful: https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Regular_expressions
//https://regex101.com/

export function isValidCommand(command) {
  //^ asserts the position at the start of the string.
  return /^Chatbot/i.test(command);
}

export function removeEmoji(message) {
  const regex = new RegExp("emoji\\d+", "g");
  //for constructor format, don't use '//' that are normally used to delimit regex in standard format - also need to escape the "\d+" because it has special meaning - otherwise it would try to match a numeric character (\d means digit)
  return message.replace(regex, "");
}

export function checkPhoneNumber(number) {
  //required format: (+##) ###-###-###
  // let bool = /^(+\\d) (\\d*{3}-\\d*{3}-\\d*{3})/.test(number); - my attempt, pretty good but the "+" needs escaping and the asterisks removed (I thought they meant multiply, but the bracketed 3 is the thing that determines repetition of the \d)
  let regex = /^\(\+\d{2}\) \d{3}-\d{3}-\d{3}$/;
  let bool = regex.test(number);

  if (bool == true) {
    return "Thanks! You can now download me to your phone.";
  } else {
    return `Oops, it seems like I can't reach out to ${number}`;
  }
}

export function getURL(userInput) {
  //let regex = /([a-z]+)\.{1}([a-z]+)/igm;
  return userInput.match(/(\w+)\.{1}(\w+)/gim);
}

export function niceToMeetYou(fullName) {
  //first attempt - but non-capture groups dont work like I think apparently
  //explained here: https://stackoverflow.com/questions/18178597/non-capture-group-still-showing-in-match
  // let lastName = fullName.match(/(\w+)(?:\,{1})/igm);
  // let firstName = fullName.match(/(?:\,{1}\s)\w*/igm);
  //returns "nice to meet you, , Pablo Sanz,"
  //2nd attempt - This solution passes tests, but without the replacement method (which is part of the exercise)
  //we don't want non-capture group, but rather the "match prefix but exclude" group: (?<=) and "match suffix but exlude" group: (?=)
  let lastName = fullName.match(/(\w+)(?=\,{1})/gim);
  let firstName = fullName.match(/(?<=\,{1}\s)\w*/gim);
  return `Nice to meet you, ${firstName + " " + lastName}`;

  
  //AI-assisted solution - passes tests and fulfills requirements of exercise to use .replace()
  // let formattedName = fullName.replace(/(\w+),\s*(\w+)/, '$2 $1');
  //.replace(pattern, replacement) - in this case, we're replacing with a string using named capture groups(named based on index - $2 is the first name)
  //cap group 1 is a string with any char, then comma and space are not part of a capture group, and then  capture group two is a string with any char.
  //note that "+" matches anything between 1 and unlimited times, but '*' matches anything between 0 and unlimited times.
  // return `Nice to meet you, ${formattedName}`;
}
