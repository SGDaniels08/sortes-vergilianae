import { fetchRandomLineFromAllLines } from "./api-helper.js"
import { renderLot } from "./component/render-lot.js"

fetchRandomLineFromAllLines().then((result)=> console.log(result));

renderLot();