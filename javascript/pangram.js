export const isPangram = (sentence) => {
    const alphabet = [
      'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    ];
    const lowerCaseSentence = sentence.toLowerCase();
    //could do this with filter:
    // let bool;
    // let check = alphabet.filter((letter) => {
    //   sentence.includes(letter);
    // });
  
    //but then that requires additional checking of the array to see if all 26 letters of the alphabet are used:
    // check.length == 26 ? bool = true : bool = false;
    // return bool;
  
    //instead we should use every(), which apparently works better for booleans...need to look up differences exactly so that's more clear. I was under the impression that's exactly what filter() did.
    //for some reason half the tests only pass when the "{}" brackets are removed from this arrow function...why would that be?
    let check = alphabet.every((letter) => lowerCaseSentence.includes(letter));
    
    return check;

  };