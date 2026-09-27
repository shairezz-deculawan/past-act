// --- SECTION SWITCHING ---
function showSection(id) {
    const sections = ['home', 'features', 'dashboard', 'exercises'];
    sections.forEach(s => document.getElementById(s).classList.add('hidden'));
    document.getElementById(id).classList.remove('hidden');
}

// --- EXERCISE TOGGLE ---
function toggleEx(id) {
    document.getElementById('ex2-container').classList.add('hidden');
    document.getElementById('ex3-container').classList.add('hidden');
    document.getElementById(id + '-container').classList.remove('hidden');
}

/* ================= EXERCISE 2 LOGIC ================= */
const c1 = document.getElementById("content1");


function ex2_act1() {
    const c1 = document.getElementById("content1");

    // Directly display the result
    c1.innerHTML = `
        <h2>Activity 1: Welcome Message</h2>
        <p>Welcome to JavaScript!</p>
        <p>This is my first JS program.</p>
    `;
}

function ex2_act2() {
    c1.innerHTML = `
        <h2>Activity 2</h2>
        <input type="text" id="nameInput" placeholder="Enter your name">
        <input type="number" id="ageInput" placeholder="Enter your age">
        <button class="action-btn" onclick="generateInfo()">Submit</button>
        <div id="result"></div>
    `;
}

function generateInfo() {
    let name = document.getElementById("nameInput").value;
    let age = document.getElementById("ageInput").value;

    document.getElementById("result").innerHTML = `
        <p>Name: ${name}</p>
        <p>Age: ${age}</p>
        <p>My name is ${name}, I am ${age} years old.</p>
    `;
}

function ex2_act3() {
    c1.innerHTML = `
        <h2>Activity 3</h2>
        <input type="number" id="num1" placeholder="Enter first number">
        <input type="number" id="num2" placeholder="Enter second number">
        <button class="action-btn" onclick="calculate()">Calculate</button>
        <div id="calcResult"></div>
    `;
}

function calculate() {
    let a = Number(document.getElementById("num1").value);
    let b = Number(document.getElementById("num2").value);

    if (isNaN(a) || isNaN(b)) {
        alert("Please enter valid numbers.");
        return;
    }

    document.getElementById("calcResult").innerHTML = `
        <p><strong>Sum:</strong> ${a + b}</p>
        <p><strong>Difference:</strong> ${a - b}</p>
        <p><strong>Product:</strong> ${a * b}</p>
        <p><strong>Quotient:</strong> ${b !== 0 ? a / b : "Cannot divide by zero"}</p>
    `;
}

function ex2_act4() {
    c1.innerHTML = `
        <h2>Activity 4</h2>
        <input type="text" id="nameInput4" placeholder="Enter your name">
        <input type="number" id="favNumber" placeholder="Enter your favorite number">
        <button class="action-btn" onclick="sayHello()">Submit</button>
        <div id="greetResult"></div>
    `;
}

function sayHello() {
    let name = document.getElementById("nameInput4").value.trim();
    let number = document.getElementById("favNumber").value;

    if (!name || !number) {
        alert("Please fill in both fields.");
        return;
    }

    document.getElementById("greetResult").innerHTML = `
        <p>Hello ${name}! Your favorite number is ${number}.</p>
    `;
}
function ex2_act5() {
    c1.innerHTML = `
        <h2>Activity 5</h2>
        <input type="number" id="ageInput5" placeholder="Enter your age">
        <button class="action-btn" onclick="checkEligibility()">Check</button>
        <div id="eligResult"></div>
    `;
}

function checkEligibility() {
    let age = Number(document.getElementById("ageInput5").value);

    if (isNaN(age)) {
        alert("Please enter a valid age.");
        return;
    }

    document.getElementById("eligResult").innerHTML = `
        <p>${age >= 20 ? "Eligible" : "Not Eligible"}</p>
    `;
}

function ex2_act6() {
    c1.innerHTML = `
        <h2>Activity 6</h2>
        <input type="number" id="countLimit" placeholder="Enter a number">
        <button class="action-btn" onclick="countNumbers()">Generate</button>
        <div id="countResult"></div>
    `;
}

function countNumbers() {
    let limit = Number(document.getElementById("countLimit").value);
    if (isNaN(limit) || limit <= 0) {
        alert("Please enter a valid positive number.");
        return;
    }

    let out = "";
    let rev = "";

    for (let i = 1; i <= limit; i++) out += i + " ";
    for (let j = limit; j >= 1; j--) rev += j + " ";

    document.getElementById("countResult").innerHTML = `
        <p><strong>For Loop:</strong> ${out}</p>
        <p><strong>While Loop:</strong> ${rev}</p>
    `;
}

function ex2_act7() {
    const c1 = document.getElementById("content1");

    c1.innerHTML = `
        <h2>Activity 7</h2>
        <button class="action-btn" id="act7Btn">Click Me</button>
        <div id="act7Result" style="margin-top:10px;"></div>
    `;

    // When button is clicked, show the result below
    document.getElementById("act7Btn").onclick = () => {
        document.getElementById("act7Result").innerHTML = `
            <p>Button Clicked!</p>
        `;
    };
}


/* ================= EXERCISE 3 LOGIC ================= */
const c2 = document.getElementById("content2");

function ex3_act1() {
    c2.innerHTML = `
        <h2>Activity 1: Background Changer</h2>
        <button id="bgB" class="action-btn">Next Color</button>
    `;

    // Define your colors
    const colors = ["#008080", "#ADD8E6", "#D2B48C", "#E6E6FA"]; 
    // Teal, Light Blue, Light Brown (Tan), Lavender
    let i = 0;

    document.getElementById("bgB").onclick = () => {
        document.body.style.backgroundColor = colors[i];
        i = (i + 1) % colors.length; // loop back to start
    };
}

function ex3_act2() {
    c2.innerHTML = `
        <h2>Dark Mode</h2>
        <p id="mT">Light Mode is Active</p>
        <button id="dB" class="action-btn">Toggle Dark Mode</button>
    `;

    document.getElementById("dB").onclick = () => {
        document.body.classList.toggle("dark-mode");
        let isD = document.body.classList.contains("dark-mode");
        document.getElementById("mT").innerText = 
            isD ? "Dark Mode is Active" : "Light Mode is Active";
    };
}

function ex3_act3() {
    c2.innerHTML = `
        <h2>Activity 3: Dynamic List Builder</h2>
        <input type="text" id="itemInput" placeholder="Enter an item">
        <button id="addI" class="action-btn">Add Item</button>
        <ul id="list"></ul>
    `;

    document.getElementById("addI").onclick = () => {
        let item = document.getElementById("itemInput").value.trim();
        if (!item) {
            alert("Please type an item.");
            return;
        }

        let li = document.createElement("li");
        li.textContent = item;
        document.getElementById("list").appendChild(li);

        document.getElementById("itemInput").value = ""; // clear input
    };
}

function ex3_act4() {
    c2.innerHTML = `
        <h2>Activity 4: Paragraph Manager</h2>
        <input type="text" id="paraInput" placeholder="Type your paragraph here">
        <button id="addParaBtn" class="action-btn">Add Paragraph</button>
        <div id="paraContainer" style="margin-top:15px;"></div>
    `;

    document.getElementById("addParaBtn").onclick = () => {
        let text = document.getElementById("paraInput").value.trim();
        if (!text) {
            alert("Please type something.");
            return;
        }

        // create paragraph
        let p = document.createElement("p");
        p.textContent = text;
        p.style.position = "relative";

        // create remove button
        let removeBtn = document.createElement("button");
        removeBtn.textContent = "Remove";
        removeBtn.className = "action-btn";
        removeBtn.style.marginLeft = "10px";
        removeBtn.onclick = () => p.remove();

        p.appendChild(removeBtn);
        document.getElementById("paraContainer").appendChild(p);

        document.getElementById("paraInput").value = ""; // clear input
    };
}

function ex3_act5() {
    c2.innerHTML = `
        <h2>Counter</h2>
        <input type="text" id="iT" placeholder="Type...">
        <p>Count: <span id="cnt">0</span></p>
    `;

    document.getElementById("iT").onkeyup = function () {
        document.getElementById("cnt").textContent = this.value.length;
    };
}

function ex3_act6() {
    c2.innerHTML = `
        <h2>Adder</h2>
        <input type="number" id="n1">
        <input type="number" id="n2">
        <button id="sB" class="action-btn">Add</button>
        <p id="res"></p>
    `;

    document.getElementById("sB").onclick = () => {
        let n1 = Number(document.getElementById("n1").value);
        let n2 = Number(document.getElementById("n2").value);
        document.getElementById("res").innerText = n1 + n2;
    };
}

function ex3_act7() {
    // Injecting the Image Switcher into the display area
    c2.innerHTML = `
        <h3>Image Switcher</h3>
        <button class="action-btn" id="sb">Swap Image</button>
        <br>
        <img id="targetImg" src="images/1.PNG" style="width:250px; margin-top:15px; border: 5px solid var(--navy); box-shadow: 8px 8px 0 var(--baby-blue);">
    `;

    document.getElementById("sb").onclick = () => {
        let img = document.getElementById("targetImg");
        
        
        if (img.src.includes("1.PNG")) {
            img.src = "images/2.PNG";
        } else {
            img.src = "images/1.PNG";
        }
    };

}
function ex3_act8() {
    c2.innerHTML = `
        <h2>Tasks</h2>
        <input id="tI" placeholder="Task...">
        <button id="tB" class="action-btn">Add</button>
        <ul id="tL"></ul>
    `;

    document.getElementById("tB").onclick = () => {
        let v = document.getElementById("tI").value;
        if (v) {
            let li = document.createElement("li");
            li.innerText = v;
            document.getElementById("tL").appendChild(li);
            document.getElementById("tI").value = "";
        }
    };
}
