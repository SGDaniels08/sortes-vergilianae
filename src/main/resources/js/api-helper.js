const fetchRandomLine = ()=> {
    return fetch(`http://localhost:8080/api/sors-line`).then((result)=> result.json());
}