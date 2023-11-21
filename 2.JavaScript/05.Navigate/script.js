const move = document.querySelector("ol");


const a = move.children[0]
const e = move.children[4]

move.insertBefore(e, a)

//-----------------------------------------------------------------------------------------------

// const moveTitle = document.querySelector('main')

// const section2 = moveTitle.children[1]
// const section3 = moveTitle.children[2]

// moveTitle.appendChild(section2)

// const main = document.querySelector('main');

//------------------------------------------------------------------------------------------------

// focus the main children
const secondSection = document.querySelector('main').children[1]
const thirdSection = document.querySelector('main').children[2]
// focus the section children
const pSecond = secondSection.children[1]
const pThird = thirdSection.children[1]

const h2Third = secondSection.children[0]
const divThird = thirdSection.children[0]
const h2Second = divThird.children[0]

secondSection.insertBefore(h2Second, pSecond)
thirdSection.insertBefore(h2Third, pThird)

// 3
// console.log(thirdSection);
// thirdSection.remove()






