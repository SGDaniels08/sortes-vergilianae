import { fetchRandomLineFromAllLines } from "../api-helper.js";


const section = document.querySelector(".sors-vergiliana");
const lineOne = document.createElement("span");
lineOne.classList.add("line1");
const lineTwo = document.createElement("span");
lineTwo.classList.add("line2");

const renderLot = () => {
  fetchRandomLineFromAllLines().then((line1) => {
    lineOne.innerHTML = `${line1.verse}`;
  });

  fetchRandomLineFromAllLines().then((line2) => {
    lineTwo.innerHTML = `${line2.verse}`;
  });

  console.log("Inside renderLot");

  section.prepend(lineOne);
  section.append(lineTwo);
};

export { renderLot };
