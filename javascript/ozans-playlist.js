// @ts-check

export function removeDuplicates(playlist) {
    const set = new Set();
    for(let i = 0; i < playlist.length; i++) {  
      set.add(playlist[i]);  
    }  
    // set.add(playlist); would add the whole array at once as one item  
    let noDupes = [];  
    set.forEach((x) => {  
      noDupes.push(x);  
    })  
    return noDupes;  
  }
  
  export function hasTrack(playlist, track) {
    const set = new Set();  
    for(let item of playlist) {  
      set.add(item);  
    }  
    return set.has(track);  
  }
  
  export function addTrack(playlist, track) {
    const set = new Set();  
    for(let i = 0; i < playlist.length; i++) {  
      set.add(playlist[i]);  
    }  
    set.add(track);  
    let newPlaylist = Array.from(set);  
    return newPlaylist;  
  }
  
  export function deleteTrack(playlist, track) {
    const set = new Set();  
    for(let i = 0; i < playlist.length; i++) {  
      set.add(playlist[i]);  
    }  
    set.delete(track);  
    let newPlaylist = Array.from(set);  
    return newPlaylist;  
  }
  
  export function listArtists(playlist) {
    //first attempt: /(?<=\s-\s)(\w*\s*\w*)/igm; - didn't work quite right  
    let regex = /(?<=-\s)(.*)/;  
    let np = [];  
    for(let i = 0; i <= playlist.length; i++) {  
      let match = regex.exec(playlist[i]);  
      if(match) {  
        np.push(match[i]);  
      }  
    }  
    //but we also need to check for duplicates - so  
    const set = new Set(np);  
    let nd = Array.from(set);  
    return nd;  
  }