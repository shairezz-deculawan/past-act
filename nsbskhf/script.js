const form = document.getElementById("form");

form.addEventListener("submit", (event) => {
    event.preventDefault();

    const name = document.getElementById("name").value;
    const email = document.getElementById("email").value;

    if (name === "" || email === "") {
        alert("Please fill out all fields");
        return;
    }

    document.getElementById("preview").innerHTML =
        "<h2>Student Information Preview</h2>" +
        "Student Name: " + name + "<br>Email: " + email;
});