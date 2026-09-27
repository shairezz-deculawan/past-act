const form = document.getElementById("studentForm");
const output = document.getElementById("output");
const clearBtn = document.getElementById("clearBtn");

form.addEventListener("submit", (e) => {
    e.preventDefault();

    const name = document.getElementById("name").value;
    const course = document.getElementById("course").value;
    const year = document.getElementById("year").value;
    const section = document.getElementById("section").value;
    const email = document.getElementById("email").value;

    if (!name || !course || !year || !section || !email) {
        alert("Please fill out all fields!");
        return;
    }

    output.innerHTML = `
        <strong>Name:</strong> ${name} <br>
        <strong>Course:</strong> ${course} <br>
        <strong>Year Level:</strong> ${year} <br>
        <strong>Section:</strong> ${section} <br>
        <strong>Email:</strong> ${email}
    `;
});

clearBtn.addEventListener("click", () => {
    form.reset();
    output.innerHTML = "";
});