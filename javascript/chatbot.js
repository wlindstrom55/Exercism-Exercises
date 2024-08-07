// @ts-check

 

export function isValidCommand(command) {
    //^ asserts the position at the start of the string.
    return /^Chatbot/i.test(command);
  }

export function removeEmoji(message) {
  const regex = new RegExp('emoji\\d+', 'g');
  //for constructor format, don't use '//' that are normally used to delimit regex in standard format - also need to escape the "\d+" because it has special meaning - otherwise it would try to match a numeric character (\d means digit)
   return message.replace(regex, '');
  }
  
   
  
  export function checkPhoneNumber(number) {
    //required format: (+##) ###-###-###
    // let bool = /^(+\\d) (\\d*{3}-\\d*{3}-\\d*{3})/.test(number); - first attempt
    let regex = /^\(\+\d{2}\) \d{3}-\d{3}-\d{3}$/;
    let bool = regex.test(number);
  
    if(bool == true) {
      return "Thanks! You can now download me to your phone.";
    } else {
      return `Oops, it seems like I can't reach out to ${number}`;
    }
  }
   
  export function getURL(userInput) {
    // let regex = /(?<!\w)\.\w/igm;
    let regex = /(?<!\w)(\w+)\.(\w+)/igm;
    return userInput.split(regex);
  }

  export function niceToMeetYou(fullName) {
    return `Nice to meet you, ${fullName}`;
  }