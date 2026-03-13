// let div = document.querySelector("div");
// console.log(div);

// let id = div.getAttribute("id");
// console.log(id);

// let name = div.getAttribute("name");
// console.log(name);



// let newBtn = document.createElement("buttons")
// newBtn.innerText = ("click me");
// console.log(newBtn);
// newBtn.style.color = "white";
// newBtn.style.backgroundColor = "red";

// document.querySelector("body").prepend(newBtn);

// let div = document.querySelector("div");
// div.append(newBtn);


let newHeading = document.querySelector("h1");
newHeading.innerHTML = "<i>Hi, I am new!</i>";

document.querySelector("body").prepend(newHeading);

let para = document.querySelector("p");
para.remove();