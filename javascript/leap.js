export const isLeap = (inputY) => {
    let ans;

    inputY % 4 == 0 ?
      (inputY % 100 == 0 ?
          (inputY % 400 == 0 ? ans = true : ans = false)
      : ans = true)
    : ans = false;

    return ans;
  };