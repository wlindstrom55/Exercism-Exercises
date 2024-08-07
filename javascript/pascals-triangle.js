export const rows = (numRow) => {
    let triangle = [[1]];
    if(numRow <= 0) return [];
    //start at 1 in loops since we already have initial row
    for(let i = 1; i < numRow; i++) {
      let newRow = [1];
      for(let p = 1; p < i; p++) {
        newRow[p] = triangle[i - 1][p - 1] + triangle[i - 1][p];
        //for current row, adds previous # stored in triangle to next #
      }
      newRow.push(1);
      triangle.push(newRow);
    }
    return triangle;
  };