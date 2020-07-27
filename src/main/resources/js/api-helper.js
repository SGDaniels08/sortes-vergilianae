const fetchRandomLineFromBook = (bookNum)=> {
    return fetch(`http://localhost:8080/api/books/${bookNum}/line`).then((result)=> result.json());
}

const fetchRandomLineFromAllLines = ()=> {
    return fetch(`http://localhost:8080/api/lines/random`).then((result)=> result.json());
}

export { fetchRandomLineFromAllLines }